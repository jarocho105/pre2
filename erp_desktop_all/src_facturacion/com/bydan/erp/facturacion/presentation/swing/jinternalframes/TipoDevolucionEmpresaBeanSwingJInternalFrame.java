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

import com.bydan.erp.facturacion.util.TipoDevolucionEmpresaConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDevolucionEmpresaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDevolucionEmpresaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoDevolucionEmpresaBean;
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
public class TipoDevolucionEmpresaBeanSwingJInternalFrame extends TipoDevolucionEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDevolucionEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDevolucionEmpresa> tipodevolucionempresaValidator = new ClassValidator<TipoDevolucionEmpresa>(TipoDevolucionEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDevolucionEmpresa tipodevolucionempresa;	
	public TipoDevolucionEmpresa tipodevolucionempresaAux;
	public TipoDevolucionEmpresa tipodevolucionempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDevolucionEmpresa tipodevolucionempresaTotales;
	public Long idTipoDevolucionEmpresaActual;
	public Long iIdNuevoTipoDevolucionEmpresa=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetaNotaCreditoSoli=false;

	public Boolean getIsTienePermisosDetaNotaCreditoSoli() {
		return isTienePermisosDetaNotaCreditoSoli;
	}

	public void setIsTienePermisosDetaNotaCreditoSoli(Boolean isTienePermisosDetaNotaCreditoSoli) {
		this.isTienePermisosDetaNotaCreditoSoli= isTienePermisosDetaNotaCreditoSoli;
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
	
	public Boolean isPermisoTodoTipoDevolucionEmpresa;
	public Boolean isPermisoNuevoTipoDevolucionEmpresa;
	public Boolean isPermisoActualizarTipoDevolucionEmpresa;
	public Boolean isPermisoActualizarOriginalTipoDevolucionEmpresa;
	public Boolean isPermisoEliminarTipoDevolucionEmpresa;
	public Boolean isPermisoGuardarCambiosTipoDevolucionEmpresa;
	public Boolean isPermisoConsultaTipoDevolucionEmpresa;
	public Boolean isPermisoBusquedaTipoDevolucionEmpresa;
	public Boolean isPermisoReporteTipoDevolucionEmpresa;
	public Boolean isPermisoPaginacionMedioTipoDevolucionEmpresa;
	public Boolean isPermisoPaginacionAltoTipoDevolucionEmpresa;
	public Boolean isPermisoPaginacionTodoTipoDevolucionEmpresa;
	public Boolean isPermisoCopiarTipoDevolucionEmpresa;
	public Boolean isPermisoVerFormTipoDevolucionEmpresa;
	public Boolean isPermisoDuplicarTipoDevolucionEmpresa;
	public Boolean isPermisoOrdenTipoDevolucionEmpresa;
	
	
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
	
	public TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaReturnGeneral;
	public TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaParameterGeneral;
	
	

	public DetaNotaCreditoSoliLogic detanotacreditosoliLogic=null;

	public DetaNotaCreditoSoliLogic getDetaNotaCreditoSoliLogic() {
		return detanotacreditosoliLogic;
	}

	public void setDetaNotaCreditoSoliLogic(DetaNotaCreditoSoliLogic detanotacreditosoliLogic) {
		this.detanotacreditosoliLogic = detanotacreditosoliLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDevolucionEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoDevolucionEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDevolucionEmpresaSessionBeanAdditional tipodevolucionempresaSessionBeanAdditional=null;
	
	public TipoDevolucionEmpresaSessionBeanAdditional getTipoDevolucionEmpresaSessionBeanAdditional() {
		return this.tipodevolucionempresaSessionBeanAdditional;
	}
	
	public void setTipoDevolucionEmpresaSessionBeanAdditional(TipoDevolucionEmpresaSessionBeanAdditional tipodevolucionempresaSessionBeanAdditional) {
		try {
			this.tipodevolucionempresaSessionBeanAdditional=tipodevolucionempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional tipodevolucionempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoDevolucionEmpresaBeanSwingJInternalFrame
	
	public TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional getTipoDevolucionEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipodevolucionempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDevolucionEmpresaBeanSwingJInternalFrameAdditional(TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional tipodevolucionempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodevolucionempresaBeanSwingJInternalFrameAdditional=tipodevolucionempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDevolucionEmpresaLogic tipodevolucionempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDevolucionEmpresa tipodevolucionempresaBean;
	public TipoDevolucionEmpresaConstantesFunciones tipodevolucionempresaConstantesFunciones;
	//public TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDevolucionEmpresa> tipodevolucionempresas;	
	//public List<TipoDevolucionEmpresa> tipodevolucionempresasEliminados;
	//public List<TipoDevolucionEmpresa> tipodevolucionempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDevolucionEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoDevolucionEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoDevolucionEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoDevolucionEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoDevolucionEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDevolucionEmpresa() {
		return this.iIdNuevoTipoDevolucionEmpresa;
	}

	public void setiIdNuevoTipoDevolucionEmpresa(Long iIdNuevoTipoDevolucionEmpresa) {
		this.iIdNuevoTipoDevolucionEmpresa = iIdNuevoTipoDevolucionEmpresa;
	}
	
	public Long getidTipoDevolucionEmpresaActual() {
		return this.idTipoDevolucionEmpresaActual;
	}

	public void setidTipoDevolucionEmpresaActual(Long idTipoDevolucionEmpresaActual) {
		this.idTipoDevolucionEmpresaActual = idTipoDevolucionEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDevolucionEmpresa gettipodevolucionempresa() {
		return this.tipodevolucionempresa;
	}

	public void settipodevolucionempresa(TipoDevolucionEmpresa tipodevolucionempresa) {
		this.tipodevolucionempresa = tipodevolucionempresa;
	}
	
	public TipoDevolucionEmpresa gettipodevolucionempresaAux() {
		return this.tipodevolucionempresaAux;
	}

	public void settipodevolucionempresaAux(TipoDevolucionEmpresa tipodevolucionempresaAux) {
		this.tipodevolucionempresaAux = tipodevolucionempresaAux;
	}				
	
	public TipoDevolucionEmpresa gettipodevolucionempresaAnterior() {
		return this.tipodevolucionempresaAnterior;
	}

	public void settipodevolucionempresaAnterior(TipoDevolucionEmpresa tipodevolucionempresaAnterior) {
		this.tipodevolucionempresaAnterior = tipodevolucionempresaAnterior;
	}	
	
	public TipoDevolucionEmpresa gettipodevolucionempresaTotales() {
		return this.tipodevolucionempresaTotales;
	}

	public void settipodevolucionempresaTotales(TipoDevolucionEmpresa tipodevolucionempresaTotales) {
		this.tipodevolucionempresaTotales = tipodevolucionempresaTotales;
	}	
	
	public TipoDevolucionEmpresa gettipodevolucionempresaBean() {
		return this.tipodevolucionempresaBean;
	}

	public void settipodevolucionempresaBean(TipoDevolucionEmpresa tipodevolucionempresaBean) {
		this.tipodevolucionempresaBean = tipodevolucionempresaBean;
	}	
	
	public TipoDevolucionEmpresaParameterReturnGeneral gettipodevolucionempresaReturnGeneral() {
		return this.tipodevolucionempresaReturnGeneral;
	}

	public void settipodevolucionempresaReturnGeneral(TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaReturnGeneral) {
		this.tipodevolucionempresaReturnGeneral = tipodevolucionempresaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDevolucionEmpresaLogic getTipoDevolucionEmpresaLogic()	{		
		return tipodevolucionempresaLogic;
	}

	public void setTipoDevolucionEmpresaLogic(TipoDevolucionEmpresaLogic tipodevolucionempresaLogic) {
		this.tipodevolucionempresaLogic = tipodevolucionempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoDevolucionEmpresa() {
		return isEsNuevoTipoDevolucionEmpresa;
	}

	public void setIsEsNuevoTipoDevolucionEmpresa(Boolean isEsNuevoTipoDevolucionEmpresa) {
		this.isEsNuevoTipoDevolucionEmpresa = isEsNuevoTipoDevolucionEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDevolucionEmpresa() {
		return esParaAccionDesdeFormularioTipoDevolucionEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDevolucionEmpresa(Boolean esParaAccionDesdeFormularioTipoDevolucionEmpresa) {
		this.esParaAccionDesdeFormularioTipoDevolucionEmpresa = esParaAccionDesdeFormularioTipoDevolucionEmpresa;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.tipodevolucionempresaSessionBean==null) {
				this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
			}

			if(!this.tipodevolucionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(tipodevolucionempresaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.tipodevolucionempresa!=null) {
						this.tipodevolucionempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDevolucionEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTipoDevolucionEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDevolucionEmpresaGenerico!=null && jComboBoxid_empresaTipoDevolucionEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDevolucionEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDevolucionEmpresa tipodevolucionempresa,JComboBox jComboBoxid_empresaTipoDevolucionEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDevolucionEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDevolucionEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodevolucionempresa.setid_empresa(empresaAux.getId());
				tipodevolucionempresa.setempresa_descripcion(TipoDevolucionEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodevolucionempresa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { 
					}

					if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoDevolucionEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDevolucionEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDevolucionEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa(this.tipodevolucionempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodevolucionempresaLogic.setTipoDevolucionEmpresas(this.tipodevolucionempresas);
			tipodevolucionempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDevolucionEmpresaParameterReturnGeneral getTipoDevolucionEmpresaParameterGeneral() {
		return this.tipodevolucionempresaParameterGeneral;
	}
	
	public void setTipoDevolucionEmpresaParameterGeneral(TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaParameterGeneral) {
		this.tipodevolucionempresaParameterGeneral = tipodevolucionempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDevolucionEmpresa() {
		return isPermisoTodoTipoDevolucionEmpresa;
	}

	public void setIsPermisoTodoTipoDevolucionEmpresa(Boolean isPermisoTodoTipoDevolucionEmpresa) {
		this.isPermisoTodoTipoDevolucionEmpresa = isPermisoTodoTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoDevolucionEmpresa() {
		return isPermisoNuevoTipoDevolucionEmpresa;
	}

	public void setIsPermisoNuevoTipoDevolucionEmpresa(Boolean isPermisoNuevoTipoDevolucionEmpresa) {
		this.isPermisoNuevoTipoDevolucionEmpresa = isPermisoNuevoTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoDevolucionEmpresa() {
		return isPermisoActualizarTipoDevolucionEmpresa;
	}

	public void setIsPermisoActualizarTipoDevolucionEmpresa(Boolean isPermisoActualizarTipoDevolucionEmpresa) {
		this.isPermisoActualizarTipoDevolucionEmpresa = isPermisoActualizarTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoDevolucionEmpresa() {
		return isPermisoEliminarTipoDevolucionEmpresa;
	}

	public void setIsPermisoEliminarTipoDevolucionEmpresa(Boolean isPermisoEliminarTipoDevolucionEmpresa) {
		this.isPermisoEliminarTipoDevolucionEmpresa = isPermisoEliminarTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDevolucionEmpresa() {
		return isPermisoGuardarCambiosTipoDevolucionEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoDevolucionEmpresa(Boolean isPermisoGuardarCambiosTipoDevolucionEmpresa) {
		this.isPermisoGuardarCambiosTipoDevolucionEmpresa = isPermisoGuardarCambiosTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoDevolucionEmpresa() {
		return isPermisoConsultaTipoDevolucionEmpresa;
	}

	public void setIsPermisoConsultaTipoDevolucionEmpresa(Boolean isPermisoConsultaTipoDevolucionEmpresa) {
		this.isPermisoConsultaTipoDevolucionEmpresa = isPermisoConsultaTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoDevolucionEmpresa() {
		return isPermisoBusquedaTipoDevolucionEmpresa;
	}

	public void setIsPermisoBusquedaTipoDevolucionEmpresa(Boolean isPermisoBusquedaTipoDevolucionEmpresa) {
		this.isPermisoBusquedaTipoDevolucionEmpresa = isPermisoBusquedaTipoDevolucionEmpresa;
	}

	public Boolean getIsPermisoReporteTipoDevolucionEmpresa() {
		return isPermisoReporteTipoDevolucionEmpresa;
	}

	public void setIsPermisoReporteTipoDevolucionEmpresa(Boolean isPermisoReporteTipoDevolucionEmpresa) {
		this.isPermisoReporteTipoDevolucionEmpresa = isPermisoReporteTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDevolucionEmpresa() {
		return isPermisoPaginacionMedioTipoDevolucionEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoDevolucionEmpresa(Boolean isPermisoPaginacionMedioTipoDevolucionEmpresa) {
		this.isPermisoPaginacionMedioTipoDevolucionEmpresa = isPermisoPaginacionMedioTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDevolucionEmpresa() {
		return isPermisoPaginacionTodoTipoDevolucionEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoDevolucionEmpresa(Boolean isPermisoPaginacionTodoTipoDevolucionEmpresa) {
		this.isPermisoPaginacionTodoTipoDevolucionEmpresa = isPermisoPaginacionTodoTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDevolucionEmpresa() {
		return isPermisoPaginacionAltoTipoDevolucionEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoDevolucionEmpresa(Boolean isPermisoPaginacionAltoTipoDevolucionEmpresa) {
		this.isPermisoPaginacionAltoTipoDevolucionEmpresa = isPermisoPaginacionAltoTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoDevolucionEmpresa() {
		return isPermisoCopiarTipoDevolucionEmpresa;
	}

	public void setIsPermisoCopiarTipoDevolucionEmpresa(Boolean isPermisoCopiarTipoDevolucionEmpresa) {
		this.isPermisoCopiarTipoDevolucionEmpresa = isPermisoCopiarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoDevolucionEmpresa() {
		return isPermisoVerFormTipoDevolucionEmpresa;
	}

	public void setIsPermisoVerFormTipoDevolucionEmpresa(Boolean isPermisoVerFormTipoDevolucionEmpresa) {
		this.isPermisoVerFormTipoDevolucionEmpresa = isPermisoVerFormTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoDevolucionEmpresa() {
		return isPermisoDuplicarTipoDevolucionEmpresa;
	}

	public void setIsPermisoDuplicarTipoDevolucionEmpresa(Boolean isPermisoDuplicarTipoDevolucionEmpresa) {
		this.isPermisoDuplicarTipoDevolucionEmpresa = isPermisoDuplicarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoDevolucionEmpresa() {
		return isPermisoOrdenTipoDevolucionEmpresa;
	}

	public void setIsPermisoOrdenTipoDevolucionEmpresa(Boolean isPermisoOrdenTipoDevolucionEmpresa) {
		this.isPermisoOrdenTipoDevolucionEmpresa = isPermisoOrdenTipoDevolucionEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDevolucionEmpresa() {
		return isVisibilidadCeldaNuevoTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoDevolucionEmpresa(Boolean isVisibilidadCeldaNuevoTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa = isVisibilidadCeldaNuevoTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaDuplicarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaDuplicarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa = isVisibilidadCeldaDuplicarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaCopiarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaCopiarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa = isVisibilidadCeldaCopiarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDevolucionEmpresa() {
		return isVisibilidadCeldaVerFormTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoDevolucionEmpresa(Boolean isVisibilidadCeldaVerFormTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa = isVisibilidadCeldaVerFormTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDevolucionEmpresa() {
		return isVisibilidadCeldaOrdenTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoDevolucionEmpresa(Boolean isVisibilidadCeldaOrdenTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa = isVisibilidadCeldaOrdenTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa = isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaModificarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaModificarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaModificarTipoDevolucionEmpresa = isVisibilidadCeldaModificarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaActualizarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaActualizarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa = isVisibilidadCeldaActualizarTipoDevolucionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaEliminarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaEliminarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa = isVisibilidadCeldaEliminarTipoDevolucionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaCancelarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaCancelarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa = isVisibilidadCeldaCancelarTipoDevolucionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDevolucionEmpresa() {
		return isVisibilidadCeldaGuardarTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoDevolucionEmpresa(Boolean isVisibilidadCeldaGuardarTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa = isVisibilidadCeldaGuardarTipoDevolucionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa = isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa;
	}
		
	public TipoDevolucionEmpresaSessionBean gettipodevolucionempresaSessionBean() {
		return this.tipodevolucionempresaSessionBean;
	}
	
	public void settipodevolucionempresaSessionBean(TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean) {
		this.tipodevolucionempresaSessionBean=tipodevolucionempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodevolucionempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoDevolucionEmpresa tipodevolucionempresa,TipoDevolucionEmpresa tipodevolucionempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDevolucionEmpresa(tipodevolucionempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodevolucionempresaAux.setId(tipodevolucionempresa.getId());
		tipodevolucionempresaAux.setVersionRow(tipodevolucionempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDevolucionEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodevolucionempresaValidator.getInvalidValues(this.tipodevolucionempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodevolucionempresaLogic.setDatosCliente(datosCliente);
			tipodevolucionempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodevolucionempresaAux=new  TipoDevolucionEmpresa();
				
				tipodevolucionempresaAux.setIsNew(true);
				tipodevolucionempresaAux.setIsChanged(true);
				
				tipodevolucionempresaAux.setTipoDevolucionEmpresaOriginal(this.tipodevolucionempresa);
				
				tipodevolucionempresaAux.setId(this.tipodevolucionempresa.getId());	
				tipodevolucionempresaAux.setVersionRow(this.tipodevolucionempresa.getVersionRow());	
				tipodevolucionempresaAux.setid_empresa(this.tipodevolucionempresa.getid_empresa());	
				tipodevolucionempresaAux.setcodigo(this.tipodevolucionempresa.getcodigo());	
				tipodevolucionempresaAux.setnombre(this.tipodevolucionempresa.getnombre());	
				tipodevolucionempresaAux.setesta_activo(this.tipodevolucionempresa.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.saveTipoDevolucionEmpresas();//WithConnection
						//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodevolucionempresaLogic.saveTipoDevolucionEmpresaRelaciones(tipodevolucionempresaAux,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());//WithConnection
								//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodevolucionempresaAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodevolucionempresaAux=new  TipoDevolucionEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() && this.tipodevolucionempresa.getId()>=0)) {
						
					tipodevolucionempresaAux.setIsNew(false);
				}
				
				tipodevolucionempresaAux.setIsDeleted(false);
			
				tipodevolucionempresaAux.setId(this.tipodevolucionempresa.getId());	
				tipodevolucionempresaAux.setVersionRow(this.tipodevolucionempresa.getVersionRow());	
				tipodevolucionempresaAux.setid_empresa(this.tipodevolucionempresa.getid_empresa());	
				tipodevolucionempresaAux.setcodigo(this.tipodevolucionempresa.getcodigo());	
				tipodevolucionempresaAux.setnombre(this.tipodevolucionempresa.getnombre());	
				tipodevolucionempresaAux.setesta_activo(this.tipodevolucionempresa.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.saveTipoDevolucionEmpresas();//WithConnection
						//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodevolucionempresaLogic.saveTipoDevolucionEmpresaRelaciones(tipodevolucionempresaAux,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());//WithConnection
								//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodevolucionempresaAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodevolucionempresa,tipodevolucionempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodevolucionempresaAux=new  TipoDevolucionEmpresa();
				
				tipodevolucionempresaAux.setIsNew(false);
				tipodevolucionempresaAux.setIsChanged(false);
				
				tipodevolucionempresaAux.setIsDeleted(true);
				
				tipodevolucionempresaAux.setId(this.tipodevolucionempresa.getId());	
				tipodevolucionempresaAux.setVersionRow(this.tipodevolucionempresa.getVersionRow());	
				tipodevolucionempresaAux.setid_empresa(this.tipodevolucionempresa.getid_empresa());	
				tipodevolucionempresaAux.setcodigo(this.tipodevolucionempresa.getcodigo());	
				tipodevolucionempresaAux.setnombre(this.tipodevolucionempresa.getnombre());	
				tipodevolucionempresaAux.setesta_activo(this.tipodevolucionempresa.getesta_activo());	
				
				if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodevolucionempresaAux.getId()>=0) {	
						this.tipodevolucionempresasEliminados.add(tipodevolucionempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.saveTipoDevolucionEmpresas();//WithConnection
						//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis().addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis.addAll(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodevolucionempresaLogic.saveTipoDevolucionEmpresaRelaciones(tipodevolucionempresaAux,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());//WithConnection
								//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(new ArrayList<DetaNotaCreditoSoli>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis= new ArrayList<DetaNotaCreditoSoli>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodevolucionempresaAux.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodevolucionempresaAux,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodevolucionempresaAux,tipodevolucionempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().addAll(this.tipodevolucionempresasEliminados);
					
					tipodevolucionempresaLogic.saveTipoDevolucionEmpresas();//WithConnection
					//tipodevolucionempresaLogic.getSetVersionRowTipoDevolucionEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa();
				
				this.tipodevolucionempresasEliminados= new ArrayList<TipoDevolucionEmpresa>();		
			}
			
			if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Devolucion Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodevolucionempresa=tipodevolucionempresaAux;
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
      		//this.finishProcessTipoDevolucionEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDevolucionEmpresa tipodevolucionempresaLocal) throws Exception {
		
		if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodevolucionempresaLocal.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
			
			} else {
			
				tipodevolucionempresaLocal.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosolis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDevolucionEmpresa tipodevolucionempresaLocal) throws Exception {	
		if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodevolucionempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDevolucionEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodevolucionempresaValidator.getInvalidValues(this.tipodevolucionempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDevolucionEmpresa tipodevolucionempresa,List<TipoDevolucionEmpresa> tipodevolucionempresas) throws Exception {
		try	{		
			TipoDevolucionEmpresaConstantesFunciones.actualizarLista(tipodevolucionempresa,tipodevolucionempresas,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDevolucionEmpresa tipodevolucionempresa,List<TipoDevolucionEmpresa> tipodevolucionempresas) throws Exception {
		try	{			
			TipoDevolucionEmpresaConstantesFunciones.actualizarSelectedLista(tipodevolucionempresa,tipodevolucionempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDevolucionEmpresa> tipodevolucionempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodevolucionempresasLocal=this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodevolucionempresasLocal=this.tipodevolucionempresas;
			}
			//ARCHITECTURE
		
			for(TipoDevolucionEmpresa tipodevolucionempresaLocal:tipodevolucionempresasLocal) {
				if(this.permiteMantenimiento(tipodevolucionempresaLocal) && tipodevolucionempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDevolucionEmpresaConstantesFunciones.getTipoDevolucionEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDevolucionEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelid_empresaTipoDevolucionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDevolucionEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelcodigoTipoDevolucionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDevolucionEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelnombreTipoDevolucionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDevolucionEmpresaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelesta_activoTipoDevolucionEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelid_empresaTipoDevolucionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelcodigoTipoDevolucionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelnombreTipoDevolucionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelesta_activoTipoDevolucionEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetaNotaCreditoSoli")) {
			if(this.tipodevolucionempresa==null) {
				this.tipodevolucionempresa= new TipoDevolucionEmpresa();
			}

			if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDevolucionEmpresa
				this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);

				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.getdetanotacreditosoli().setTipoDevolucionEmpresa(this.tipodevolucionempresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDevolucionEmpresa--;	
		
		
		this.tipodevolucionempresaAux=new TipoDevolucionEmpresa();
		
		this.tipodevolucionempresaAux.setId(this.iIdNuevoTipoDevolucionEmpresa);
		this.tipodevolucionempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(this.tipodevolucionempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodevolucionempresas.add(this.tipodevolucionempresaAux);
		}
		//ARCHITECTURE
		
		this.tipodevolucionempresa=this.tipodevolucionempresaAux;
		
		if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucionEmpresa(this.tipodevolucionempresa);
		}
				
		//this.setDefaultControlesTipoDevolucionEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDevolucionEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDevolucionEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucionEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresaBean,this.tipodevolucionempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoDevolucionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDevolucionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.procesarEventosTipoDevolucionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this.tipodevolucionempresa,this.tipodevolucionempresaParameterGeneral,this.isEsNuevoTipoDevolucionEmpresa,classes);//this.tipodevolucionempresaLogic.getTipoDevolucionEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral,this.tipodevolucionempresaBean,false);
		
		if(this.tipodevolucionempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa());
		}
		
		if(this.tipodevolucionempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa(),classes);//this.tipodevolucionempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDevolucionEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDevolucionEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoDevolucionEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
						
			if(tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado() && DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaNotaCreditoSoliActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoDevolucionEmpresa();
			
			this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucionEmpresa(), this.getIndiceNuevoTipoDevolucionEmpresa());
			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDevolucionEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setEnabled(isHabilitar && this.tipodevolucionempresaConstantesFunciones.activarcodigoTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setEnabled(isHabilitar && this.tipodevolucionempresaConstantesFunciones.activarnombreTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setEnabled(isHabilitar && this.tipodevolucionempresaConstantesFunciones.activaresta_activoTipoDevolucionEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setEnabled(isHabilitar && this.tipodevolucionempresaConstantesFunciones.activarid_empresaTipoDevolucionEmpresa);
	};
	
	public void setDefaultControlesTipoDevolucionEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDevolucionEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipodevolucionempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipodevolucionempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDevolucionEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				if(tipodevolucionempresaAux.getId().equals(this.iIdNuevoTipoDevolucionEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresas) {
				if(tipodevolucionempresaAux.getId().equals(this.iIdNuevoTipoDevolucionEmpresa)) {
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
	
	public int getIndiceActualTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				if(tipodevolucionempresaAux.getId().equals(tipodevolucionempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresas) {
				if(tipodevolucionempresaAux.getId().equals(tipodevolucionempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				if(tipodevolucionempresaAux.getTipoDevolucionEmpresaOriginal().getId().equals(tipodevolucionempresaOriginal.getId())) {
					existe=true;
					tipodevolucionempresaOriginal.setId(tipodevolucionempresaAux.getId());
					tipodevolucionempresaOriginal.setVersionRow(tipodevolucionempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresas) {
				if(tipodevolucionempresaAux.getTipoDevolucionEmpresaOriginal().getId().equals(tipodevolucionempresaOriginal.getId())) {
					existe=true;
					tipodevolucionempresaOriginal.setId(tipodevolucionempresaAux.getId());
					tipodevolucionempresaOriginal.setVersionRow(tipodevolucionempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDevolucionEmpresa(Boolean esParaCancelar) throws Exception {
		tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
		tipodevolucionempresaAux=new TipoDevolucionEmpresa();
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
					if(tipodevolucionempresaAux.getId()<0) {
						tipodevolucionempresasAux.add(tipodevolucionempresaAux);
					}		
				}
				this.iIdNuevoTipoDevolucionEmpresa=0L;
				this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().removeAll(tipodevolucionempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresas) {
					if(tipodevolucionempresaAux.getId()<0) {
						tipodevolucionempresasAux.add(tipodevolucionempresaAux);
					}		
				}
				this.iIdNuevoTipoDevolucionEmpresa=0L;
				this.tipodevolucionempresas.removeAll(tipodevolucionempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDevolucionEmpresa 
					&& this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()>0
					) {
					tipodevolucionempresaAux=this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().get(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size() - 1);
				
					if(tipodevolucionempresaAux.getId()<0) {
						this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().remove(tipodevolucionempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDevolucionEmpresa && this.tipodevolucionempresas.size()>0) {
					tipodevolucionempresaAux=this.tipodevolucionempresas.get(this.tipodevolucionempresas.size() - 1);
				
					if(tipodevolucionempresaAux.getId()<0) {
						this.tipodevolucionempresas.remove(tipodevolucionempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDevolucionEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodevolucionempresa.getId()<0) {
				this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().remove(this.tipodevolucionempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodevolucionempresa.getId()<0) {
				this.tipodevolucionempresas.remove(this.tipodevolucionempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDevolucionEmpresa(List<TipoDevolucionEmpresa> tipodevolucionempresasAux) throws Exception {
		TipoDevolucionEmpresaConstantesFunciones.setEstadosInicialesTipoDevolucionEmpresa(tipodevolucionempresasAux);
	}
	
	public void setEstadosInicialesTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresaAux) throws Exception {
		TipoDevolucionEmpresaConstantesFunciones.setEstadosInicialesTipoDevolucionEmpresa(tipodevolucionempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDevolucionEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDevolucionEmpresaActual()) {
				if(!this.isEsNuevoTipoDevolucionEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDevolucionEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDevolucionEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Devolucion Empresa ?", "MANTENIMIENTO DE Tipo Devolucion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDevolucionEmpresa tipodevolucionempresa) throws Exception {
		TipoDevolucionEmpresaConstantesFunciones.seleccionarAsignar(this.tipodevolucionempresa,tipodevolucionempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDevolucionEmpresa=this.isPermisoActualizarOriginalTipoDevolucionEmpresa;
			
			
			this.seleccionarAsignar(tipodevolucionempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDevolucionEmpresaConstantesFunciones.quitarEspaciosTipoDevolucionEmpresa(this.tipodevolucionempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodevolucionempresaSessionBean.setsFuncionBusquedaRapida(this.tipodevolucionempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDevolucionEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDevolucionEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoDevolucionEmpresa(esParaCancelar);								
			}
			
			this.tipodevolucionempresa=new TipoDevolucionEmpresa();
			
			this.inicializarTipoDevolucionEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDevolucionEmpresa() throws Exception {
		try {
			TipoDevolucionEmpresaConstantesFunciones.inicializarTipoDevolucionEmpresa(this.tipodevolucionempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDevolucionEmpresas(String sAccionBusqueda,List<TipoDevolucionEmpresa> tipodevolucionempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDevolucionEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDevolucionEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDevolucionEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDevolucionEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Devolucion Empresas");		
		parameters.put("busquedapor", TipoDevolucionEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetaNotaCreditoSoli.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDevolucionEmpresaLogic tipodevolucionempresaLogicAuxiliar=new TipoDevolucionEmpresaLogic();
					tipodevolucionempresaLogicAuxiliar.setDatosCliente(tipodevolucionempresaLogic.getDatosCliente());				
					tipodevolucionempresaLogicAuxiliar.setTipoDevolucionEmpresas(tipodevolucionempresasParaReportes);
					
					tipodevolucionempresaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDevolucionEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodevolucionempresasParaReportes=tipodevolucionempresaLogicAuxiliar.getTipoDevolucionEmpresas();
					
					//tipodevolucionempresaLogic.getNewConnexionToDeep();
					
					//for (TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresasParaReportes) {
					//	tipodevolucionempresaLogic.deepLoad(tipodevolucionempresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodevolucionempresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetaNotaCreditoSoli = AuxiliarReportes.class.getResourceAsStream("DetaNotaCreditoSoliDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detanotacreditosoli", reportFileDetaNotaCreditoSoli);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDevolucionEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDevolucionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDevolucionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDevolucionEmpresa=new JRBeanArrayDataSource(TipoDevolucionEmpresaJInternalFrame.TraerTipoDevolucionEmpresaBeans(tipodevolucionempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDevolucionEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDevolucionEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDevolucionEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDevolucionEmpresaBean.TraerTipoDevolucionEmpresaBeans(tipodevolucionempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDevolucionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDevolucionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucionEmpresa> tipodevolucionempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucionEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDevolucionEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDevolucionEmpresa tipodevolucionempresa : tipodevolucionempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDevolucionEmpresaConstantesFunciones.generarExcelReporteDataTipoDevolucionEmpresa("NORMAL",row,workbook,tipodevolucionempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDevolucionEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoDevolucionEmpresaConstantesFunciones.generarExcelReporteHeaderTipoDevolucionEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDevolucionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucionEmpresa> tipodevolucionempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucionEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDevolucionEmpresa tipodevolucionempresa : tipodevolucionempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.getTipoDevolucionEmpresaDescripcion(tipodevolucionempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodevolucionempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodevolucionempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodevolucionempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipodevolucionempresa.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDevolucionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucionEmpresa> tipodevolucionempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDevolucionEmpresa> tipodevolucionempresasRespaldo=null;
		
		classes=TipoDevolucionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDevolucionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodevolucionempresaLogic.setDatosCliente(this.datosCliente);
		this.tipodevolucionempresaLogic.setDatosDeep(this.datosDeep);
		this.tipodevolucionempresaLogic.setIsConDeep(true);
		
		tipodevolucionempresasRespaldo=this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas();
		
		this.tipodevolucionempresaLogic.setTipoDevolucionEmpresas(tipodevolucionempresasParaReportes);	
		this.tipodevolucionempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodevolucionempresasParaReportes=this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas();
		this.tipodevolucionempresaLogic.setTipoDevolucionEmpresas(tipodevolucionempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucionEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDevolucionEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDevolucionEmpresa tipodevolucionempresa : tipodevolucionempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDevolucionEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDevolucionEmpresaConstantesFunciones.generarExcelReporteDataTipoDevolucionEmpresa("NORMAL",row,workbook,tipodevolucionempresa,cellStyleDataAux);
		
			
			


				//DetaNotaCreditoSoli
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodevolucionempresa.getDetaNotaCreditoSolis()!=null && tipodevolucionempresa.getDetaNotaCreditoSolis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetaNotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderDetaNotaCreditoSoli("RELACIONADO",row,workbook);
				}

				if(tipodevolucionempresa.getDetaNotaCreditoSolis()!=null) {
					i2=0;
					for(DetaNotaCreditoSoli detanotacreditosoli : tipodevolucionempresa.getDetaNotaCreditoSolis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetaNotaCreditoSoliConstantesFunciones.generarExcelReporteDataDetaNotaCreditoSoli("RELACIONADO",row,workbook,detanotacreditosoli,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.getTipoDevolucionEmpresaDescripcion(tipodevolucionempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDevolucionEmpresa() throws Exception {		
		this.startProcessTipoDevolucionEmpresa(true);
	}
	
	public void startProcessTipoDevolucionEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDevolucionEmpresa ,this.jPanelParametrosReportesTipoDevolucionEmpresa, this.jScrollPanelDatosTipoDevolucionEmpresa,this.jPanelPaginacionTipoDevolucionEmpresa, this.jScrollPanelDatosEdicionTipoDevolucionEmpresa, this.jPanelAccionesTipoDevolucionEmpresa,this.jPanelAccionesFormularioTipoDevolucionEmpresa,this.jmenuBarTipoDevolucionEmpresa,this.jmenuBarDetalleTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDevolucionEmpresa=this.jTabbedPaneBusquedasTipoDevolucionEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoDevolucionEmpresa=this.jPanelParametrosReportesTipoDevolucionEmpresa;
		//final JScrollPane jScrollPanelDatosTipoDevolucionEmpresa=this.jScrollPanelDatosTipoDevolucionEmpresa;
		final JTable jTableDatosTipoDevolucionEmpresa=this.jTableDatosTipoDevolucionEmpresa;		
		final JPanel jPanelPaginacionTipoDevolucionEmpresa=this.jPanelPaginacionTipoDevolucionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoDevolucionEmpresa=this.jScrollPanelDatosEdicionTipoDevolucionEmpresa;
		final JPanel jPanelAccionesTipoDevolucionEmpresa=this.jPanelAccionesTipoDevolucionEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoDevolucionEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			jPanelCamposAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelCamposTipoDevolucionEmpresa;
			jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelAccionesFormularioTipoDevolucionEmpresa;
		}
		
		final JPanel jPanelCamposTipoDevolucionEmpresa=jPanelCamposAuxiliarTipoDevolucionEmpresa;
		final JPanel jPanelAccionesFormularioTipoDevolucionEmpresa=jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa;
		
		
		final JMenuBar jmenuBarTipoDevolucionEmpresa=this.jmenuBarTipoDevolucionEmpresa;
		final JToolBar jTtoolBarTipoDevolucionEmpresa=this.jTtoolBarTipoDevolucionEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDevolucionEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jmenuBarDetalleTipoDevolucionEmpresa;
			jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTtoolBarDetalleTipoDevolucionEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoDevolucionEmpresa=jmenuBarDetalleAuxiliarTipoDevolucionEmpresa;
		final JToolBar jTtoolBarDetalleTipoDevolucionEmpresa=jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDevolucionEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDevolucionEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoDevolucionEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoDevolucionEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDevolucionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDevolucionEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDevolucionEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDevolucionEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDevolucionEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoDevolucionEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDevolucionEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDevolucionEmpresa ,jPanelParametrosReportesTipoDevolucionEmpresa,jTableDatosTipoDevolucionEmpresa, /*jScrollPanelDatosTipoDevolucionEmpresa,*/jPanelCamposTipoDevolucionEmpresa,jPanelPaginacionTipoDevolucionEmpresa, /*jScrollPanelDatosEdicionTipoDevolucionEmpresa,*/ jPanelAccionesTipoDevolucionEmpresa,jPanelAccionesFormularioTipoDevolucionEmpresa,jmenuBarTipoDevolucionEmpresa,jmenuBarDetalleTipoDevolucionEmpresa,jTtoolBarTipoDevolucionEmpresa,jTtoolBarDetalleTipoDevolucionEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDevolucionEmpresa ,jPanelParametrosReportesTipoDevolucionEmpresa, jScrollPanelDatosTipoDevolucionEmpresa,jPanelPaginacionTipoDevolucionEmpresa, jScrollPanelDatosEdicionTipoDevolucionEmpresa, jPanelAccionesTipoDevolucionEmpresa,jPanelAccionesFormularioTipoDevolucionEmpresa,jmenuBarTipoDevolucionEmpresa,jmenuBarDetalleTipoDevolucionEmpresa,jTtoolBarTipoDevolucionEmpresa,jTtoolBarDetalleTipoDevolucionEmpresa);
						
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
	
	public void finishProcessTipoDevolucionEmpresa() {// throws Exception 
		this.finishProcessTipoDevolucionEmpresa(true);
	}
	
	public void finishProcessTipoDevolucionEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDevolucionEmpresa ,this.jPanelParametrosReportesTipoDevolucionEmpresa, this.jScrollPanelDatosTipoDevolucionEmpresa,this.jPanelPaginacionTipoDevolucionEmpresa, this.jScrollPanelDatosEdicionTipoDevolucionEmpresa, this.jPanelAccionesTipoDevolucionEmpresa,this.jPanelAccionesFormularioTipoDevolucionEmpresa,this.jmenuBarTipoDevolucionEmpresa,this.jmenuBarDetalleTipoDevolucionEmpresa,this.jTtoolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDevolucionEmpresa=this.jTabbedPaneBusquedasTipoDevolucionEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoDevolucionEmpresa=this.jPanelParametrosReportesTipoDevolucionEmpresa;
		//final JScrollPane jScrollPanelDatosTipoDevolucionEmpresa=this.jScrollPanelDatosTipoDevolucionEmpresa;
		final JTable jTableDatosTipoDevolucionEmpresa=this.jTableDatosTipoDevolucionEmpresa;		
		final JPanel jPanelPaginacionTipoDevolucionEmpresa=this.jPanelPaginacionTipoDevolucionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoDevolucionEmpresa=this.jScrollPanelDatosEdicionTipoDevolucionEmpresa;
		final JPanel jPanelAccionesTipoDevolucionEmpresa=this.jPanelAccionesTipoDevolucionEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoDevolucionEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			jPanelCamposAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelCamposTipoDevolucionEmpresa;
			jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelAccionesFormularioTipoDevolucionEmpresa;
		}
		
		final JPanel jPanelCamposTipoDevolucionEmpresa=jPanelCamposAuxiliarTipoDevolucionEmpresa;
		final JPanel jPanelAccionesFormularioTipoDevolucionEmpresa=jPanelAccionesFormularioAuxiliarTipoDevolucionEmpresa;
		
		
		final JMenuBar jmenuBarTipoDevolucionEmpresa=this.jmenuBarTipoDevolucionEmpresa;		
		final JToolBar jTtoolBarTipoDevolucionEmpresa=this.jTtoolBarTipoDevolucionEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDevolucionEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jmenuBarDetalleTipoDevolucionEmpresa;
			jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTtoolBarDetalleTipoDevolucionEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDevolucionEmpresa=jmenuBarDetalleAuxiliarTipoDevolucionEmpresa;
		final JToolBar jTtoolBarDetalleTipoDevolucionEmpresa=jTtoolBarDetalleAuxiliarTipoDevolucionEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDevolucionEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDevolucionEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoDevolucionEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoDevolucionEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDevolucionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDevolucionEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDevolucionEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDevolucionEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDevolucionEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoDevolucionEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDevolucionEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDevolucionEmpresa ,jPanelParametrosReportesTipoDevolucionEmpresa, jTableDatosTipoDevolucionEmpresa,/*jScrollPanelDatosTipoDevolucionEmpresa,*/jPanelCamposTipoDevolucionEmpresa,jPanelPaginacionTipoDevolucionEmpresa, /*jScrollPanelDatosEdicionTipoDevolucionEmpresa,*/ jPanelAccionesTipoDevolucionEmpresa,jPanelAccionesFormularioTipoDevolucionEmpresa,jmenuBarTipoDevolucionEmpresa,jmenuBarDetalleTipoDevolucionEmpresa,jTtoolBarTipoDevolucionEmpresa,jTtoolBarDetalleTipoDevolucionEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDevolucionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDevolucionEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDevolucionEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDevolucionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDevolucionEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDevolucionEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDevolucionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDevolucionEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDevolucionEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodevolucionempresaConstantesFunciones.getsFinalQueryTipoDevolucionEmpresa();
		String  finalQueryPaginacionTodos=this.tipodevolucionempresaConstantesFunciones.getsFinalQueryTipoDevolucionEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDevolucionEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoDevolucionEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDevolucionEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoDevolucionEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDevolucionEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodevolucionempresasEliminados= new ArrayList<TipoDevolucionEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDevolucionEmpresa();
		
				///*TipoDevolucionEmpresaSessionBean*/this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
			
			if(this.tipodevolucionempresaSessionBean==null) {
				this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoDevolucionEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDevolucionEmpresaConstantesFunciones.getClassesForeignKeysOfTipoDevolucionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodevolucionempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodevolucionempresasAux= new ArrayList<TipoDevolucionEmpresa>();
			
				
			tipodevolucionempresaLogic.setDatosCliente(this.datosCliente);
			tipodevolucionempresaLogic.setDatosDeep(this.datosDeep);
			tipodevolucionempresaLogic.setIsConDeep(true);
			
			
			tipodevolucionempresaLogic.getTipoDevolucionEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodevolucionempresaLogic.getTodosTipoDevolucionEmpresas(finalQueryGlobal,pagination);
					
					//tipodevolucionempresaLogic.getTodosTipoDevolucionEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodevolucionempresaLogic.getTipoDevolucionEmpresas()==null|| tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionempresasAux= new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresasAux.addAll(tipodevolucionempresaLogic.getTipoDevolucionEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresasAux= new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresasAux.addAll(tipodevolucionempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionempresaLogic.getTodosTipoDevolucionEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipodevolucionempresaLogic.getTodosTipoDevolucionEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresaLogic.getTipoDevolucionEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionempresaLogic.setTipoDevolucionEmpresas(new ArrayList<TipoDevolucionEmpresa>());					
							tipodevolucionempresaLogic.getTipoDevolucionEmpresas().addAll(tipodevolucionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresas.addAll(tipodevolucionempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDevolucionEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDevolucionEmpresa=this.idActual;
				
				} else if(this.idTipoDevolucionEmpresaActual!=null && this.idTipoDevolucionEmpresaActual!=0L) {
					idTipoDevolucionEmpresa=idTipoDevolucionEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoDevolucionEmpresa);
				
				this.tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodevolucionempresaLogic.getEntity(idTipoDevolucionEmpresa);
					
					//tipodevolucionempresaLogic.getEntityWithConnection(idTipoDevolucionEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.setTipoDevolucionEmpresas(new ArrayList<TipoDevolucionEmpresa>());
					tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(tipodevolucionempresaLogic.getTipoDevolucionEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
					this.tipodevolucionempresas.add(tipodevolucionempresa);
				}
				
				if(tipodevolucionempresaLogic.getTipoDevolucionEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodevolucionempresaLogic.getTipoDevolucionEmpresas()==null||tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodevolucionempresas==null|| tipodevolucionempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
						tipodevolucionempresasAux.addAll(tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresasAux.addAll(tipodevolucionempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDevolucionEmpresas("BusquedaPorCodigo",tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDevolucionEmpresas("BusquedaPorCodigo",tipodevolucionempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.setTipoDevolucionEmpresas(new ArrayList<TipoDevolucionEmpresa>());
						tipodevolucionempresaLogic.getTipoDevolucionEmpresas().addAll(tipodevolucionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresas.addAll(tipodevolucionempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodevolucionempresaLogic.getTipoDevolucionEmpresas()==null||tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodevolucionempresas==null|| tipodevolucionempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
						tipodevolucionempresasAux.addAll(tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresasAux.addAll(tipodevolucionempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDevolucionEmpresas("BusquedaPorNombre",tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDevolucionEmpresas("BusquedaPorNombre",tipodevolucionempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.setTipoDevolucionEmpresas(new ArrayList<TipoDevolucionEmpresa>());
						tipodevolucionempresaLogic.getTipoDevolucionEmpresas().addAll(tipodevolucionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresas.addAll(tipodevolucionempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodevolucionempresaLogic.getTipoDevolucionEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodevolucionempresaLogic.getTipoDevolucionEmpresas()==null||tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodevolucionempresas==null|| tipodevolucionempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
						tipodevolucionempresasAux.addAll(tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresasAux=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresasAux.addAll(tipodevolucionempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodevolucionempresaLogic.getTipoDevolucionEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDevolucionEmpresas("FK_IdEmpresa",tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDevolucionEmpresas("FK_IdEmpresa",tipodevolucionempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaLogic.setTipoDevolucionEmpresas(new ArrayList<TipoDevolucionEmpresa>());
						tipodevolucionempresaLogic.getTipoDevolucionEmpresas().addAll(tipodevolucionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
							tipodevolucionempresas.addAll(tipodevolucionempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDevolucionEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDevolucionEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucionempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucionempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDevolucionEmpresa tipodevolucionempresa) {
		Boolean permite=true;
		
		if(this.tipodevolucionempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDevolucionEmpresaConstantesFunciones.getOrderByListaTipoDevolucionEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDevolucionEmpresaConstantesFunciones.getOrderByListaTipoDevolucionEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				if(tipodevolucionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionempresaTotales=tipodevolucionempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucionEmpresa tipodevolucionempresa:this.tipodevolucionempresas) {
				if(tipodevolucionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionempresaTotales=tipodevolucionempresa;
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
			this.tipodevolucionempresaAux=new TipoDevolucionEmpresa();
			this.tipodevolucionempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipodevolucionempresaAux.setIsNew(false);
			this.tipodevolucionempresaAux.setIsChanged(false);
			this.tipodevolucionempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDevolucionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDevolucionEmpresa(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this.tipodevolucionempresaAux);
				
				this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(this.tipodevolucionempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDevolucionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDevolucionEmpresa(this.tipodevolucionempresas,this.tipodevolucionempresaAux);
				
				this.tipodevolucionempresas.add(this.tipodevolucionempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodevolucionempresaTotales=new TipoDevolucionEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().remove(tipodevolucionempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodevolucionempresas.remove(tipodevolucionempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodevolucionempresaTotales=new TipoDevolucionEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				if(tipodevolucionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionempresaTotales=tipodevolucionempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDevolucionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDevolucionEmpresa(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),tipodevolucionempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucionEmpresa tipodevolucionempresa:this.tipodevolucionempresas) {
				if(tipodevolucionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionempresaTotales=tipodevolucionempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDevolucionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDevolucionEmpresa(this.tipodevolucionempresas,tipodevolucionempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDevolucionEmpresasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDevolucionEmpresasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDevolucionEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDevolucionEmpresasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDevolucionEmpresasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.getTipoDevolucionEmpresasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDevolucionEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.getTipoDevolucionEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDevolucionEmpresa() {
		this.isPermisoTodoTipoDevolucionEmpresa=false;
		this.isPermisoNuevoTipoDevolucionEmpresa=false;
		this.isPermisoActualizarTipoDevolucionEmpresa=false;
		this.isPermisoActualizarOriginalTipoDevolucionEmpresa=false;
		this.isPermisoEliminarTipoDevolucionEmpresa=false;
		this.isPermisoGuardarCambiosTipoDevolucionEmpresa=false;
		this.isPermisoConsultaTipoDevolucionEmpresa=false;
		this.isPermisoBusquedaTipoDevolucionEmpresa=false;
		this.isPermisoReporteTipoDevolucionEmpresa=false;		
		this.isPermisoOrdenTipoDevolucionEmpresa=false;		
		this.isPermisoPaginacionMedioTipoDevolucionEmpresa=false;		
		this.isPermisoPaginacionAltoTipoDevolucionEmpresa=false;
		this.isPermisoPaginacionTodoTipoDevolucionEmpresa=false;
		this.isPermisoCopiarTipoDevolucionEmpresa=false;		
		this.isPermisoVerFormTipoDevolucionEmpresa=false;		
		this.isPermisoDuplicarTipoDevolucionEmpresa=false;		
		this.isPermisoOrdenTipoDevolucionEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoDevolucionEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoDevolucionEmpresa=isPermiso;
		this.isPermisoNuevoTipoDevolucionEmpresa=isPermiso;
		this.isPermisoActualizarTipoDevolucionEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoDevolucionEmpresa=isPermiso;
		this.isPermisoEliminarTipoDevolucionEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoDevolucionEmpresa=isPermiso;
		this.isPermisoConsultaTipoDevolucionEmpresa=isPermiso;
		this.isPermisoBusquedaTipoDevolucionEmpresa=isPermiso;
		this.isPermisoReporteTipoDevolucionEmpresa=isPermiso;
		this.isPermisoOrdenTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoCopiarTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoVerFormTipoDevolucionEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoDevolucionEmpresa=isPermiso;
		this.isPermisoOrdenTipoDevolucionEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDevolucionEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoDevolucionEmpresa=isPermiso;
		this.isPermisoNuevoTipoDevolucionEmpresa=isPermiso;
		this.isPermisoActualizarTipoDevolucionEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoDevolucionEmpresa=isPermiso;
		this.isPermisoEliminarTipoDevolucionEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoDevolucionEmpresa=isPermiso;
		//this.isPermisoConsultaTipoDevolucionEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoDevolucionEmpresa=isPermiso;
		//this.isPermisoReporteTipoDevolucionEmpresa=isPermiso;
		//this.isPermisoOrdenTipoDevolucionEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDevolucionEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDevolucionEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDevolucionEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoDevolucionEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoDevolucionEmpresa=isPermiso;
		//this.isPermisoOrdenTipoDevolucionEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDevolucionEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDevolucionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetaNotaCreditoSoli=false;
		this.isTienePermisosDetaNotaCreditoSoli=this.verificarGetPermisosUsuarioOpcionTipoDevolucionEmpresaClaseRelacionada(this.opcionsRelacionadas,DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDevolucionEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDevolucionEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetaNotaCreditoSoli=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDevolucionEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDevolucionEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDevolucionEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetaNotaCreditoSoli && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.remove(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDevolucionEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDevolucionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDevolucionEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDevolucionEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDevolucionEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDevolucionEmpresa=this.isPermisoActualizarTipoDevolucionEmpresa;
			this.isPermisoEliminarTipoDevolucionEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDevolucionEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDevolucionEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDevolucionEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDevolucionEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDevolucionEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDevolucionEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDevolucionEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDevolucionEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDevolucionEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDevolucionEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDevolucionEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDevolucionEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDevolucionEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDevolucionEmpresa.setToolTipText(this.jTableDatosTipoDevolucionEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDevolucionEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDevolucionEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDevolucionEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetaNotaCreditoSoli && this.tipodevolucionempresaConstantesFunciones.mostrarDetaNotaCreditoSoliTipoDevolucionEmpresa && !TipoDevolucionEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle  Solicitud Nota Credit");
			reporte.setsDescripcion("Detalle  Solicitud Nota Credit");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoDevolucionEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDevolucionEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDevolucionEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDevolucionEmpresaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoDevolucionEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaReturnGeneral=new TipoDevolucionEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodevolucionempresaConstantesFunciones.cargarid_empresaTipoDevolucionEmpresa)
					 || (this.esRecargarFks && this.tipodevolucionempresaConstantesFunciones.cargarid_empresaTipoDevolucionEmpresa)) {

					if(!this.tipodevolucionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodevolucionempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.cargarCombosLoteForeignKeyTipoDevolucionEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodevolucionempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDevolucionEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodevolucionempresaSessionBean==null) {
				this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
			}

			if(!this.tipodevolucionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoDevolucionEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDevolucionEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDevolucionEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucionEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDevolucionEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucionEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDevolucionEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDevolucionEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDevolucionEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDevolucionEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDevolucionEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDevolucionEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDevolucionEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDevolucionEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDevolucionEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean(); 
		this.tipodevolucionempresaConstantesFunciones=new TipoDevolucionEmpresaConstantesFunciones(); 
		this.tipodevolucionempresaBean=new TipoDevolucionEmpresa();//(this.tipodevolucionempresaConstantesFunciones); 		
		this.tipodevolucionempresaReturnGeneral=new TipoDevolucionEmpresaParameterReturnGeneral(); 
		
		this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDevolucionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDevolucionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDevolucionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDevolucionEmpresa(true);
			
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
			
			this.tipodevolucionempresaConstantesFunciones=new TipoDevolucionEmpresaConstantesFunciones(); 
			this.tipodevolucionempresaBean=new TipoDevolucionEmpresa();//this.tipodevolucionempresaConstantesFunciones); 			
			this.tipodevolucionempresaReturnGeneral=new TipoDevolucionEmpresaParameterReturnGeneral(); 
		
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Devolucion Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodevolucionempresa=new TipoDevolucionEmpresa();
			this.tipodevolucionempresas = new ArrayList<TipoDevolucionEmpresa>();
			this.tipodevolucionempresasAux = new ArrayList<TipoDevolucionEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic=new TipoDevolucionEmpresaLogic();
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodevolucionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDevolucionEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoDevolucionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDevolucionEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDevolucionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDevolucionEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDevolucionEmpresa);
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa);
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDevolucionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDevolucionEmpresa);
					this.jInternalFrameImportacionTipoDevolucionEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoDevolucionEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDevolucionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDevolucionEmpresa);
					this.jInternalFrameOrderByTipoDevolucionEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoDevolucionEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDevolucionEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDevolucionEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodevolucionempresaReturnGeneral=new TipoDevolucionEmpresaParameterReturnGeneral();
			
			this.tipodevolucionempresaParameterGeneral=new TipoDevolucionEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodevolucionempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetaNotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDevolucionEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado(),this.tipodevolucionempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDevolucionEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado(),this.tipodevolucionempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDevolucionEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDevolucionEmpresa(false);
			
			this.setPermisosUsuarioTipoDevolucionEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() && this.tipodevolucionempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDevolucionEmpresaClasesRelacionadas();
			}
			
			if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDevolucionEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDevolucionEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDevolucionEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoDevolucionEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDevolucionEmpresa,this.isPermisoPaginacionMedioTipoDevolucionEmpresa,this.isPermisoPaginacionTodoTipoDevolucionEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDevolucionEmpresaConstantesFunciones.getTiposSeleccionarTipoDevolucionEmpresa());
				
				this.tiposColumnasSelect=TipoDevolucionEmpresaConstantesFunciones.getTiposSeleccionarTipoDevolucionEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDevolucionEmpresa();				
				//this.tiposRelacionesSelect=TipoDevolucionEmpresaConstantesFunciones.getTiposRelacionesTipoDevolucionEmpresa(true);
				
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
			//if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDevolucionEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDevolucionEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDevolucionEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucionEmpresa() ;
			
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
			
			
			this.detanotacreditosoliLogic=new DetaNotaCreditoSoliLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodevolucionempresaImplementable= (TipoDevolucionEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDevolucionEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodevolucionempresaImplementableHome= (TipoDevolucionEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDevolucionEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodevolucionempresas= new ArrayList<TipoDevolucionEmpresa>();
			this.tipodevolucionempresasEliminados= new ArrayList<TipoDevolucionEmpresa>();
						
			this.isEsNuevoTipoDevolucionEmpresa=false;
			this.esParaAccionDesdeFormularioTipoDevolucionEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDevolucionEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDevolucionEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDevolucionEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDevolucionEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDevolucionEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDevolucionEmpresa();
			}
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDevolucionEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDevolucionEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDevolucionEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDevolucionEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle  Solicitud Nota Credits")) {
					if(!DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDevolucionEmpresa();

						this.cargarParteTabPanelRelacionadaDetaNotaCreditoSoli(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDevolucionEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetaNotaCreditoSoli(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(false,true,iIndex);
		this.jButtonDetaNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli();

		//this.jTabbedPaneRelacionesTipoDevolucionEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoDevolucionEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetaNotaCreditoSoli")) {
				int row=this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
				jButtonDetaNotaCreditoSoliActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle  Solicitud Nota Credit")) {

					if(this.isTienePermisosDetaNotaCreditoSoli && this.tipodevolucionempresaConstantesFunciones.mostrarDetaNotaCreditoSoliTipoDevolucionEmpresa && !TipoDevolucionEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle  Solicitud Nota Credits"+"("+DetaNotaCreditoSoliConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle  Solicitud Nota Credits");

						if(tipodevolucionempresaConstantesFunciones.resaltarDetaNotaCreditoSoliTipoDevolucionEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodevolucionempresaConstantesFunciones.resaltarDetaNotaCreditoSoliTipoDevolucionEmpresa);
						}

						jmenuItem.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarDetaNotaCreditoSoliTipoDevolucionEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetaNotaCreditoSoli"));

						

						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jmenuDetalleTipoDevolucionEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDevolucionEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDevolucionEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDevolucionEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDevolucionEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDevolucionEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoDevolucionEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDevolucionEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDevolucionEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoDevolucionEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			
			if(jTableDatosTipoDevolucionEmpresa.getRowCount()>=1) {
				jTableDatosTipoDevolucionEmpresa.removeRowSelectionInterval(0, jTableDatosTipoDevolucionEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDevolucionEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDevolucionEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(true);			
			//this.tipodevolucionempresa=new TipoDevolucionEmpresa();
			//this.tipodevolucionempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa() ;
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucionEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodevolucionempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);				
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDevolucionEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDevolucionEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDevolucionEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDevolucionEmpresa.getSelectedRows().length;			
			}
			
			tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDevolucionEmpresa--;			
				//TipoDevolucionEmpresa tipodevolucionempresaAux= new TipoDevolucionEmpresa();			
				//tipodevolucionempresaAux.setId(this.iIdNuevoTipoDevolucionEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDevolucionEmpresa tipodevolucionempresaOrigen=new TipoDevolucionEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDevolucionEmpresa tipodevolucionempresaOrigen : tipodevolucionempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodevolucionempresaOrigen =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionempresaOrigen =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDevolucionEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodevolucionempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDevolucionEmpresa(tipodevolucionempresaOrigen,this.tipodevolucionempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(this.tipodevolucionempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresas.add(this.tipodevolucionempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
				
				this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucionEmpresa(), this.getIndiceNuevoTipoDevolucionEmpresa());
				
				int iLastRow =  this.jTableDatosTipoDevolucionEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDevolucionEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDevolucionEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();									
		
			TipoDevolucionEmpresa tipodevolucionempresaOrigen=new TipoDevolucionEmpresa();
			TipoDevolucionEmpresa tipodevolucionempresaDestino=new TipoDevolucionEmpresa();
				
			tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDevolucionEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodevolucionempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDevolucionEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaOrigen =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodevolucionempresaOrigen =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionempresaDestino =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodevolucionempresaDestino =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodevolucionempresaOrigen =tipodevolucionempresasSeleccionados.get(0);
				tipodevolucionempresaDestino =tipodevolucionempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDevolucionEmpresa(tipodevolucionempresaOrigen,tipodevolucionempresaDestino,true,false);
				
				tipodevolucionempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodevolucionempresaDestino,tipodevolucionempresaLogic.getTipoDevolucionEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionempresaDestino,tipodevolucionempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
				
				//this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucionEmpresa(), this.getIndiceNuevoTipoDevolucionEmpresa());
				
				int iLastRow =  this.jTableDatosTipoDevolucionEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDevolucionEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDevolucionEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDevolucionEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoDevolucionEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDevolucionEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDevolucionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDevolucionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDevolucionEmpresa();
			
			this.abrirFrameOrderByTipoDevolucionEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDevolucionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDevolucionEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDevolucionEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSize(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDevolucionEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDevolucionEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jContentPaneDetalleTipoDevolucionEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jContentPaneDetalleTipoDevolucionEmpresa.getWidth(),TipoDevolucionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jContentPaneDetalleTipoDevolucionEmpresa.getWidth(),TipoDevolucionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jContentPaneDetalleTipoDevolucionEmpresa.getWidth(),TipoDevolucionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDevolucionEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDevolucionEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDevolucionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucionEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoDevolucionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucionEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDevolucionEmpresa);
				this.jInternalFrameOrderByTipoDevolucionEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoDevolucionEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoDevolucionEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDevolucionEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDevolucionEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDevolucionEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDevolucionEmpresa==null) {
				
				this.jInternalFrameImportacionTipoDevolucionEmpresa=new ImportacionJInternalFrame(TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDevolucionEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDevolucionEmpresa);
				this.jInternalFrameImportacionTipoDevolucionEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoDevolucionEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDevolucionEmpresa"));
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDevolucionEmpresa"));
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDevolucionEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDevolucionEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa=new ReporteDinamicoJInternalFrame(TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa);
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucionEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucionEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetaNotaCreditoSoli() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jContentPaneDetalleTipoDevolucionEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDevolucionEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDevolucionEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoDevolucionEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDevolucionEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDevolucionEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDevolucionEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoDevolucionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDevolucionEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoDevolucionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDevolucionEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDevolucionEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoDevolucionEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDevolucionEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDevolucionEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDevolucionEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoDevolucionEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDevolucionEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDevolucionEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(true);
			//this.isEsNuevoTipoDevolucionEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false) ;
			
			if(tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado() && DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetaNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucionEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDevolucionEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDevolucionEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(true);
			//this.isEsNuevoTipoDevolucionEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodevolucionempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false) ;
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucionEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDevolucionEmpresa(false);
			
			//if(!this.isEsNuevoTipoDevolucionEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipodevolucionempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDevolucionEmpresa=true;
					this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
					this.isEsNuevoTipoDevolucionEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDevolucionEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDevolucionEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(false);
			
												
				
				if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDevolucionEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,tipodevolucionempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDevolucionEmpresa(this.tipodevolucionempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodevolucionempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodevolucionempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipodevolucionempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipodevolucionempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodevolucionempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDevolucionEmpresaModel) this.jTableDatosTipoDevolucionEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDevolucionEmpresa=true;
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
				this.isEsNuevoTipoDevolucionEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(false);
				
				
				
				if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDevolucionEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDevolucionEmpresa.getRowCount()>=1) {
				jTableDatosTipoDevolucionEmpresa.removeRowSelectionInterval(0, jTableDatosTipoDevolucionEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDevolucionEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(false) ;
			
			this.isEsNuevoTipoDevolucionEmpresa=false;
			
			if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDevolucionEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				
				//SI ES MANUAL
				if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDevolucionEmpresa--;			
			//TipoDevolucionEmpresa tipodevolucionempresaAux= new TipoDevolucionEmpresa();			
			//tipodevolucionempresaAux.setId(this.iIdNuevoTipoDevolucionEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDevolucionEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
			
			this.tipodevolucionempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().add(this.tipodevolucionempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodevolucionempresas.add(this.tipodevolucionempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			
			this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucionEmpresa(), this.getIndiceNuevoTipoDevolucionEmpresa());
			
			int iLastRow =  this.jTableDatosTipoDevolucionEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDevolucionEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDevolucionEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();
			}
			
			//this.abrirFrameTreeTipoDevolucionEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Devolucion EmpresaS ?", "MANTENIMIENTO DE Tipo Devolucion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDevolucionEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDevolucionEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.procesarImportacionTipoDevolucionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodevolucionempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDevolucionEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDevolucionEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDevolucionEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoDevolucionEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDevolucionEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDevolucionEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		

		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDevolucionEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDevolucionEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDevolucionEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucionempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucionempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucionempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(TipoDevolucionEmpresa tipodevolucionempresa:tipodevolucionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucionempresa.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelTipoDevolucionEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDevolucionEmpresa(tipodevolucionempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDevolucionEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDevolucionEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDevolucionEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDevolucionEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDevolucionEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDevolucionEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDevolucionEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDevolucionEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDevolucionEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDevolucionEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDevolucionEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDevolucionEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDevolucionEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucionEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDevolucionEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDevolucionEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDevolucionEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDevolucionEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucionEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucionEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucionEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDevolucionEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDevolucionEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucionEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucionEmpresa() throws Exception {
		try	{
			if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDevolucionEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDevolucionEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDevolucionEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDevolucionEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDevolucionEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDevolucionEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDevolucionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDevolucionEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucionEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucionEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDevolucionEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDevolucionEmpresa.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDevolucionEmpresa.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDevolucionEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDevolucionEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDevolucionEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDevolucionEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDevolucionEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDevolucionEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodevolucionempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDevolucionEmpresa.setModel(new TipoDevolucionEmpresaModel(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDevolucionEmpresa.setModel(new TipoDevolucionEmpresaModel(this.tipodevolucionempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDevolucionEmpresa!=null && this.jInternalFrameOrderByTipoDevolucionEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDevolucionEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,tipodevolucionempresaConstantesFunciones.resaltarSeleccionarTipoDevolucionEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO,tipodevolucionempresaConstantesFunciones.resaltarSeleccionarTipoDevolucionEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,TipoDevolucionEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipodevolucionempresaConstantesFunciones.mostraridTipoDevolucionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodevolucionempresaConstantesFunciones.resaltaridTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activaridTipoDevolucionEmpresa,this,true,"idTipoDevolucionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodevolucionempresaConstantesFunciones.resaltaridTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activaridTipoDevolucionEmpresa,this,true,"idTipoDevolucionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodevolucionempresaConstantesFunciones.mostrarid_empresaTipoDevolucionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodevolucionempresaConstantesFunciones.resaltarid_empresaTipoDevolucionEmpresa,this,this.tipodevolucionempresaConstantesFunciones.activarid_empresaTipoDevolucionEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodevolucionempresaConstantesFunciones.resaltarid_empresaTipoDevolucionEmpresa,this,this.tipodevolucionempresaConstantesFunciones.activarid_empresaTipoDevolucionEmpresa,false,"id_empresaTipoDevolucionEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipodevolucionempresaConstantesFunciones.mostrarcodigoTipoDevolucionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodevolucionempresaConstantesFunciones.resaltarcodigoTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activarcodigoTipoDevolucionEmpresa,this,true,"codigoTipoDevolucionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodevolucionempresaConstantesFunciones.resaltarcodigoTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activarcodigoTipoDevolucionEmpresa,this,true,"codigoTipoDevolucionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodevolucionempresaConstantesFunciones.mostrarnombreTipoDevolucionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodevolucionempresaConstantesFunciones.resaltarnombreTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activarnombreTipoDevolucionEmpresa,this,true,"nombreTipoDevolucionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodevolucionempresaConstantesFunciones.resaltarnombreTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activarnombreTipoDevolucionEmpresa,this,true,"nombreTipoDevolucionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.tipodevolucionempresaConstantesFunciones.mostraresta_activoTipoDevolucionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipodevolucionempresaConstantesFunciones.resaltaresta_activoTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activaresta_activoTipoDevolucionEmpresa));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipodevolucionempresaConstantesFunciones.resaltaresta_activoTipoDevolucionEmpresa,this.tipodevolucionempresaConstantesFunciones.activaresta_activoTipoDevolucionEmpresa,this,true,"esta_activoTipoDevolucionEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDevolucionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetaNotaCreditoSoli && this.tipodevolucionempresaConstantesFunciones.mostrarDetaNotaCreditoSoliTipoDevolucionEmpresa && !TipoDevolucionEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle  Solicitud Nota Credits");
				tableColumn.setHeaderValue("Detalle  Solicitud Nota Credits");
				tableColumn.setCellRenderer(new DetaNotaCreditoSoliTableCell(tipodevolucionempresaConstantesFunciones.resaltarDetaNotaCreditoSoliTipoDevolucionEmpresa,this,this.tipodevolucionempresaConstantesFunciones.activarDetaNotaCreditoSoliTipoDevolucionEmpresa));
				tableColumn.setCellEditor(new DetaNotaCreditoSoliTableCell(tipodevolucionempresaConstantesFunciones.resaltarDetaNotaCreditoSoliTipoDevolucionEmpresa,this,this.tipodevolucionempresaConstantesFunciones.activarDetaNotaCreditoSoliTipoDevolucionEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDevolucionEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDevolucionEmpresa.moveColumn(this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDevolucionEmpresa.moveColumn(this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDevolucionEmpresa.moveColumn(this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDevolucionEmpresa.moveColumn(this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDevolucionEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDevolucionEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDevolucionEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDevolucionEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDevolucionEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDevolucionEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodevolucionempresaLogic.getTipoDevolucionEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodevolucionempresas.size()-1;
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
		//this.jTableDatosTipoDevolucionEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDevolucionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDevolucionEmpresa();
			
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
				
				//this.isEsNuevoTipoDevolucionEmpresa=false;
					
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
				if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDevolucionEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodevolucionempresa.getsType().equals("DUPLICADO")
				   || this.tipodevolucionempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDevolucionEmpresa=true;
				
				} else {
					this.isEsNuevoTipoDevolucionEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodevolucionempresa.getId()>=0 && !this.tipodevolucionempresa.getIsNew()) {						
						this.isEsNuevoTipoDevolucionEmpresa=false;
						
					} else {
						this.isEsNuevoTipoDevolucionEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDevolucionEmpresa(esRelaciones);						
				
				this.seleccionarTipoDevolucionEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodevolucionempresa.getId()<0) {
					this.isEsNuevoTipoDevolucionEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDevolucionEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDevolucionEmpresa(evt,rowIndex);
				}	
				
				if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDevolucionEmpresa: " + this.dDif); 
					}
				}								
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDevolucionEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodevolucionempresa)) {
					if(this.tipodevolucionempresa.getId()>0) {
						this.tipodevolucionempresa.setIsDeleted(true);
						
						this.tipodevolucionempresasEliminados.add(this.tipodevolucionempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().remove(this.tipodevolucionempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresas.remove(this.tipodevolucionempresa);				
					}
					
					
					((TipoDevolucionEmpresaModel) this.jTableDatosTipoDevolucionEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDevolucionEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDevolucionEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDevolucionEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodevolucionempresaConstantesFunciones.cargarid_empresaTipoDevolucionEmpresa || this.tipodevolucionempresaConstantesFunciones.event_dependid_empresaTipoDevolucionEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodevolucionempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodevolucionempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodevolucionempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodevolucionempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDevolucionEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDevolucionEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDevolucionEmpresa(tipodevolucionempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(tipodevolucionempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDevolucionEmpresa(tipodevolucionempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucionEmpresa(tipodevolucionempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setText(tipodevolucionempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setText(tipodevolucionempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setText(tipodevolucionempresa.getnombre());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setSelected(tipodevolucionempresa.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDevolucionEmpresa tipodevolucionempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodevolucionempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDevolucionEmpresa tipodevolucionempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodevolucionempresaLocal=this.tipodevolucionempresa;
			} else {
				tipodevolucionempresaLocal=this.tipodevolucionempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodevolucionempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDevolucionEmpresa(tipodevolucionempresaLocal,true);
					
					if(tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodevolucionempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodevolucionempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(tipodevolucionempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(tipodevolucionempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(tipodevolucionempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setText("0");
			}

			if(conColumnasBase) {tipodevolucionempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelIdTipoDevolucionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodevolucionempresa.setcodigo(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelcodigoTipoDevolucionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodevolucionempresa.setnombre(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelnombreTipoDevolucionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodevolucionempresa.setesta_activo(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelesta_activoTipoDevolucionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresaBean,TipoDevolucionEmpresa tipodevolucionempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresaOrigen,TipoDevolucionEmpresa tipodevolucionempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodevolucionempresaOrigen.getId()!=null && !tipodevolucionempresaOrigen.getId().equals(0L))) {tipodevolucionempresa.setId(tipodevolucionempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipodevolucionempresaOrigen.getcodigo()!=null && !tipodevolucionempresaOrigen.getcodigo().equals(""))) {tipodevolucionempresa.setcodigo(tipodevolucionempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodevolucionempresaOrigen.getnombre()!=null && !tipodevolucionempresaOrigen.getnombre().equals(""))) {tipodevolucionempresa.setnombre(tipodevolucionempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipodevolucionempresaOrigen.getesta_activo()!=null && !tipodevolucionempresaOrigen.getesta_activo().equals(false))) {tipodevolucionempresa.setesta_activo(tipodevolucionempresaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setText(tipodevolucionempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setText(tipodevolucionempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setText(tipodevolucionempresa.getnombre());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setSelected(tipodevolucionempresa.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDevolucionEmpresa(TipoDevolucionEmpresaBean tipodevolucionempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setText(tipodevolucionempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setText(tipodevolucionempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setText(tipodevolucionempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setSelected(tipodevolucionempresaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDevolucionEmpresa(TipoDevolucionEmpresaParameterReturnGeneral tipodevolucionempresaReturnGeneral,TipoDevolucionEmpresaBean tipodevolucionempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoDevolucionEmpresa tipodevolucionempresaLocal=new TipoDevolucionEmpresa();
			
			tipodevolucionempresaLocal=tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodevolucionempresaLocal.getId()!=null && !tipodevolucionempresaLocal.getId().equals(0L))) {tipodevolucionempresaBean.setId(tipodevolucionempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipodevolucionempresaLocal.getcodigo()!=null && !tipodevolucionempresaLocal.getcodigo().equals(""))) {tipodevolucionempresaBean.setcodigo(tipodevolucionempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodevolucionempresaLocal.getnombre()!=null && !tipodevolucionempresaLocal.getnombre().equals(""))) {tipodevolucionempresaBean.setnombre(tipodevolucionempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipodevolucionempresaLocal.getesta_activo()!=null && !tipodevolucionempresaLocal.getesta_activo().equals(false))) {tipodevolucionempresaBean.setesta_activo(tipodevolucionempresaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDevolucionEmpresaGenerico(Long idTipoDevolucionEmpresaSeleccionado,JComboBox jComboBoxTipoDevolucionEmpresa,List<TipoDevolucionEmpresa> tipodevolucionempresasLocal)throws Exception {
		try {
			TipoDevolucionEmpresa  tipodevolucionempresaTemp=null;

			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasLocal) {
				if(tipodevolucionempresaAux.getId()!=null && tipodevolucionempresaAux.getId().equals(idTipoDevolucionEmpresaSeleccionado)) {
					tipodevolucionempresaTemp=tipodevolucionempresaAux;
					break;
				}
			}

			jComboBoxTipoDevolucionEmpresa.setSelectedItem(tipodevolucionempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDevolucionEmpresaGenerico(JComboBox jComboBoxTipoDevolucionEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDevolucionEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDevolucionEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDevolucionEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDevolucionEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetaNotaCreditoSoli")) {
			jButtonDetaNotaCreditoSoliActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucionempresa=(TipoDevolucionEmpresa) tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodevolucionempresa =(TipoDevolucionEmpresa) tipodevolucionempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodevolucionempresa.getIsNew() && !tipodevolucionempresa.getIsChanged() && !tipodevolucionempresa.getIsDeleted()) {
				sDescripcion=tipodevolucionempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodevolucionempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDevolucionEmpresa tipodevolucionempresaRow=new TipoDevolucionEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucionempresaRow=(TipoDevolucionEmpresa) tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodevolucionempresaRow=(TipoDevolucionEmpresa) tipodevolucionempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetaNotaCreditoSoliActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDevolucionEmpresa tipodevolucionempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa = (TipoDevolucionEmpresa)this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodevolucionempresa = (TipoDevolucionEmpresa)this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodevolucionempresa!=null) {
						this.tipodevolucionempresa = tipodevolucionempresa;
					} else {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}
				}

				if(this.isTienePermisosDetaNotaCreditoSoli && this.permiteMantenimiento(this.tipodevolucionempresa)) {
					DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup=new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detanotacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup;
					} else {
						detanotacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame;
					}

					List<TipoDevolucionEmpresa> tipodevolucionempresas=new ArrayList<TipoDevolucionEmpresa>();
					tipodevolucionempresas.add(this.tipodevolucionempresa);
					if(!esRelacionado) {
						//detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setConGuardarRelaciones(false);
						//detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detanotacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.cargarDetaNotaCreditoSoliBeanSwingJInternalFrame(tipodevolucionempresas,this.tipodevolucionempresa,detanotacreditosoliBeanSwingJInternalFrame,/*conInicializar,*/detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getConGuardarRelaciones(),detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
					detanotacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("no_relacionado");

						detanotacreditosoliBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetaNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA + (DetaNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA/2));

						detanotacreditosoliBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDevolucionEmpresa=(TitledBorder)this.jScrollPanelDatosTipoDevolucionEmpresa.getBorder();
						TitledBorder titledBorderDetaNotaCreditoSoli=(TitledBorder)detanotacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosDetaNotaCreditoSoli.getBorder();

						titledBorderDetaNotaCreditoSoli.setTitle(titledBorderTipoDevolucionEmpresa.getTitle() + " -> Detalle  Solicitud Nota Credit");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detanotacreditosoliBeanSwingJInternalFrame);
						}

						detanotacreditosoliBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detanotacreditosoliBeanSwingJInternalFrame);

						detanotacreditosoliBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle  Solicitud Nota Credit",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));			
			this.jButtonDuplicarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa && this.isPermisoDuplicarTipoDevolucionEmpresa));			
			this.jButtonCopiarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa && this.isPermisoCopiarTipoDevolucionEmpresa));
			this.jButtonVerFormTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa && this.isPermisoVerFormTipoDevolucionEmpresa));
			
			this.jButtonAbrirOrderByTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));			
			
			this.jButtonNuevoRelacionesTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDevolucionEmpresa && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa && this.isPermisoEliminarTipoDevolucionEmpresa));
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa);							
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));						
			this.jButtonDuplicarToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa && this.isPermisoDuplicarTipoDevolucionEmpresa));						
			this.jButtonCopiarToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa && this.isPermisoCopiarTipoDevolucionEmpresa));			
			this.jButtonVerFormToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa && this.isPermisoVerFormTipoDevolucionEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDevolucionEmpresa && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa  && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa && this.isPermisoEliminarTipoDevolucionEmpresa));
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarToolBarTipoDevolucionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa);				
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));			
			this.jMenuItemDuplicarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa && this.isPermisoDuplicarTipoDevolucionEmpresa));			
			this.jMenuItemCopiarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa && this.isPermisoCopiarTipoDevolucionEmpresa));			
			this.jMenuItemVerFormTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa && this.isPermisoVerFormTipoDevolucionEmpresa));			
			this.jMenuItemAbrirOrderByTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));			
			//this.jMenuItemMostrarOcultarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa && this.isPermisoOrdenTipoDevolucionEmpresa));			
			this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa && this.isPermisoNuevoTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemModificarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDevolucionEmpresa && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemActualizarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa && this.isPermisoActualizarTipoDevolucionEmpresa));	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemEliminarTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa && this.isPermisoEliminarTipoDevolucionEmpresa));
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemCancelarTipoDevolucionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=this.jButtonNuevoTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa=this.jButtonDuplicarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa=this.jButtonCopiarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa=this.jButtonVerFormTipoDevolucionEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDevolucionEmpresa=this.jButtonAbrirOrderByTipoDevolucionEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=this.jButtonNuevoRelacionesTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=this.jButtonModificarTipoDevolucionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=this.jButtonNuevoToolBarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarToolBarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarToolBarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarToolBarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarToolBarTipoDevolucionEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=this.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=this.jMenuItemNuevoTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemModificarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemActualizarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemEliminarTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemCancelarTipoDevolucionEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDevolucionEmpresa(Boolean esInicializar) {
		if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDevolucionEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDevolucionEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDevolucionEmpresa() {
		this.jButtonNuevoTipoDevolucionEmpresa.setVisible(this.isPermisoNuevoTipoDevolucionEmpresa);			
		this.jButtonDuplicarTipoDevolucionEmpresa.setVisible(this.isPermisoDuplicarTipoDevolucionEmpresa);			
		this.jButtonCopiarTipoDevolucionEmpresa.setVisible(this.isPermisoCopiarTipoDevolucionEmpresa);			
		this.jButtonVerFormTipoDevolucionEmpresa.setVisible(this.isPermisoVerFormTipoDevolucionEmpresa);			
		
		this.jButtonAbrirOrderByTipoDevolucionEmpresa.setVisible(this.isPermisoOrdenTipoDevolucionEmpresa);					
		
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.setVisible(this.isPermisoNuevoTipoDevolucionEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarTipoDevolucionEmpresa.setVisible(this.isPermisoActualizarTipoDevolucionEmpresa);	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.setVisible(this.isPermisoActualizarTipoDevolucionEmpresa);	
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.setVisible(this.isPermisoEliminarTipoDevolucionEmpresa);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa);						
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.setVisible(this.isPermisoGuardarCambiosTipoDevolucionEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setVisible(this.isPermisoActualizarTipoDevolucionEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDevolucionEmpresa() {
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarTipoDevolucionEmpresa.setVisible(this.isPermisoActualizarTipoDevolucionEmpresa);	
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.setVisible(this.isPermisoActualizarTipoDevolucionEmpresa);	
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.setVisible(this.isPermisoEliminarTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa);							
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa && this.isPermisoGuardarCambiosTipoDevolucionEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDevolucionEmpresa() {
		if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDevolucionEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDevolucionEmpresa() {
	}
	
	public void jTableDatosTipoDevolucionEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDevolucionEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDevolucionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucionempresa==null) {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}

				if(this.tipodevolucionempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodevolucionempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDevolucionEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDevolucionEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDevolucionEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDevolucionEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodevolucionempresaLogic.getConnexion());

				if(this.tipodevolucionempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodevolucionempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDevolucionEmpresa=(TitledBorder)this.jScrollPanelDatosTipoDevolucionEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDevolucionEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDevolucionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucionempresa==null) {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}

				if(this.tipodevolucionempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodevolucionempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDevolucionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucionempresa==null) {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}

				if(this.tipodevolucionempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodevolucionempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDevolucionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucionempresa==null) {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}

				if(this.tipodevolucionempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodevolucionempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoTipoDevolucionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.gettipodevolucionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucionempresa==null) {
						this.tipodevolucionempresa = new TipoDevolucionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);
				}

				if(this.tipodevolucionempresa.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.tipodevolucionempresa.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);

			this.getTipoDevolucionEmpresasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);

			//if(TipoDevolucionEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);

			this.getTipoDevolucionEmpresasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);

			//if(TipoDevolucionEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoDevolucionEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);

			this.getTipoDevolucionEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);

			//if(TipoDevolucionEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDevolucionEmpresa() {
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoDevolucionEmpresa!=null) {
			this.jInternalFrameImportacionTipoDevolucionEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDevolucionEmpresa.dispose();
			this.jInternalFrameImportacionTipoDevolucionEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDevolucionEmpresa();
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDevolucionEmpresa")) {
				jButtonDuplicarTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDevolucionEmpresa")) {
				jButtonCopiarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDevolucionEmpresa")) {
				jButtonVerFormTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDevolucionEmpresa")) {
				jButtonDuplicarTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDevolucionEmpresa")) {
				jButtonDuplicarTipoDevolucionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDevolucionEmpresa")) {
				jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDevolucionEmpresa")) {
				jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDevolucionEmpresa")) {
				jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDevolucionEmpresa")) {
				jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDevolucionEmpresa")) {
				jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDevolucionEmpresa")) {
				jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDevolucionEmpresa")) {
				jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDevolucionEmpresa")) {
				jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDevolucionEmpresa")) {
				jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDevolucionEmpresa")) {
				jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDevolucionEmpresa")) {
				jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDevolucionEmpresa")) {
				jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDevolucionEmpresa")) {
				jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDevolucionEmpresa")) {
				jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDevolucionEmpresa")) {
				jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDevolucionEmpresa")) {
				jButtonMostrarOcultarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDevolucionEmpresa")) {
				jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDevolucionEmpresa")) {
				jButtonCopiarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDevolucionEmpresa")) {
				jButtonVerFormTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDevolucionEmpresa")) {
				jButtonCopiarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDevolucionEmpresa")) {
				jButtonVerFormTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDevolucionEmpresa")) {
				jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDevolucionEmpresa")) {
				jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDevolucionEmpresa")) {
				jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDevolucionEmpresa")) {
				jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDevolucionEmpresa")) {
				jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDevolucionEmpresa")) {
				jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDevolucionEmpresa")) {
				jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDevolucionEmpresa")) {
				jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDevolucionEmpresa")) {
				jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDevolucionEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDevolucionEmpresa")) {
				jButtonAbrirOrderByTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDevolucionEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDevolucionEmpresa")) {
				jButtonMostrarOcultarTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDevolucionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDevolucionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDevolucionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDevolucionEmpresa")) {
				jButtonCerrarReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDevolucionEmpresa")) {
				jButtonGenerarReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDevolucionEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDevolucionEmpresa")) {
				jButtonCerrarImportacionTipoDevolucionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDevolucionEmpresa")) {
				
				jButtonGenerarImportacionTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDevolucionEmpresa")) {
				
				jButtonAbrirImportacionTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDevolucionEmpresa")) {
				jComboBoxTiposAccionesTipoDevolucionEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDevolucionEmpresa")) {
				jComboBoxTiposRelacionesTipoDevolucionEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDevolucionEmpresa")) {
				jComboBoxTiposAccionesTipoDevolucionEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDevolucionEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoDevolucionEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDevolucionEmpresa")) {
				jTextFieldValorCampoGeneralTipoDevolucionEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDevolucionEmpresa")) {
				jButtonAbrirOrderByTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDevolucionEmpresa")) {
				jButtonAbrirOrderByTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDevolucionEmpresa")) {
				jButtonCerrarOrderByTipoDevolucionEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDevolucionEmpresaBusqueda")) {
				this.jButtonidTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDevolucionEmpresaUpdate")) {
				this.jButtonid_empresaTipoDevolucionEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDevolucionEmpresaBusqueda")) {
				this.jButtonid_empresaTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDevolucionEmpresaBusqueda")) {
				this.jButtoncodigoTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDevolucionEmpresaBusqueda")) {
				this.jButtonnombreTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoDevolucionEmpresaBusqueda")) {
				this.jButtonesta_activoTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDevolucionEmpresa")) {
				this.jButtonBusquedaPorCodigoTipoDevolucionEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDevolucionEmpresa")) {
				this.jButtonBusquedaPorNombreTipoDevolucionEmpresaActionPerformed(evt);
			}
			
			;
			
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDevolucionEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDevolucionEmpresa tipodevolucionempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodevolucionempresaLocal=this.tipodevolucionempresa;
			} else {
				tipodevolucionempresaLocal=this.tipodevolucionempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
							
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
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
			
			


			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
								
						
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
								
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
							
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
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
			
			


			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
								
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDevolucionEmpresa")) {
					jCheckBoxSeleccionarTodosTipoDevolucionEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDevolucionEmpresa")) {
					jCheckBoxSeleccionadosTipoDevolucionEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDevolucionEmpresa")) {
					
				}
				
				


				
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
												
				
				


				
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
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
			
			


			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucionempresa);
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
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
				
				


				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucionEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionempresaAnterior =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDevolucionEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDevolucionEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDevolucionEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodevolucionempresa =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodevolucionempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDevolucionEmpresa")) {
				
				}
				
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDevolucionEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDevolucionEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDevolucionEmpresa")) {
			
			}
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDevolucionEmpresa();
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDevolucionEmpresa")) {
				jButtonDuplicarTipoDevolucionEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDevolucionEmpresa")) {
				jButtonCopiarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDevolucionEmpresa")) {
				jButtonVerFormTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDevolucionEmpresa")) {
				jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDevolucionEmpresa")) {
				jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDevolucionEmpresa")) {
				jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDevolucionEmpresa")) {
				jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDevolucionEmpresa")) {
				jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDevolucionEmpresa")) {
				jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDevolucionEmpresa")) {
				jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDevolucionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDevolucionEmpresa")) {
				jButtonAbrirOrderByTipoDevolucionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDevolucionEmpresa")) {
				jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDevolucionEmpresa")) {
				jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDevolucionEmpresa")) {
				jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDevolucionEmpresaBusqueda")) {
				this.jButtonidTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDevolucionEmpresaUpdate")) {
				this.jButtonid_empresaTipoDevolucionEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDevolucionEmpresaBusqueda")) {
				this.jButtonid_empresaTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDevolucionEmpresaBusqueda")) {
				this.jButtoncodigoTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDevolucionEmpresaBusqueda")) {
				this.jButtonnombreTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoDevolucionEmpresaBusqueda")) {
				this.jButtonesta_activoTipoDevolucionEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDevolucionEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDevolucionEmpresa")) {
				closingInternalFrameTipoDevolucionEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoDevolucionEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDevolucionEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDevolucionEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoDevolucionEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDevolucionEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDevolucionEmpresaActionPerformed(null);
			}
			
			TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodevolucionempresa,new Object(),this.tipodevolucionempresaParameterGeneral,this.tipodevolucionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDevolucionEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDevolucionEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDevolucionEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodevolucionempresa)) {
			if(!esControlTabla) {
				if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);			
				}
				
				if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.procesarEventosTipoDevolucionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this.tipodevolucionempresa,this.tipodevolucionempresaParameterGeneral,this.isEsNuevoTipoDevolucionEmpresa,classes);//this.tipodevolucionempresaLogic.getTipoDevolucionEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral,this.tipodevolucionempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDevolucionEmpresa(classes,this.tipodevolucionempresaReturnGeneral,this.tipodevolucionempresaBean,false);
					}
						
					if(this.tipodevolucionempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa());	
					}
						
					if(this.tipodevolucionempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa(),classes);//this.tipodevolucionempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucionEmpresa(this.tipodevolucionempresa,classes);//this.tipodevolucionempresaBean);									
				}
			
				if(TipoDevolucionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDevolucionEmpresa(this.tipodevolucionempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucionEmpresa(this.tipodevolucionempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodevolucionempresaAnterior!=null) {
						this.tipodevolucionempresa=this.tipodevolucionempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.procesarEventosTipoDevolucionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this.tipodevolucionempresa,this.tipodevolucionempresaParameterGeneral,this.isEsNuevoTipoDevolucionEmpresa,classes);//this.tipodevolucionempresaLogic.getTipoDevolucionEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa(),tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa(),this.tipodevolucionempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDevolucionEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDevolucionEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDevolucionEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDevolucionEmpresa() throws Exception {
		
		TipoDevolucionEmpresaModel tipodevolucionempresaModel=(TipoDevolucionEmpresaModel)this.jTableDatosTipoDevolucionEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucionempresaModel.tipodevolucionempresas=this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodevolucionempresaModel.tipodevolucionempresas=this.tipodevolucionempresas;
		}
		
		
		((TipoDevolucionEmpresaModel) this.jTableDatosTipoDevolucionEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDevolucionEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodevolucionempresaAnterior(),this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodevolucionempresaAnterior(),this.tipodevolucionempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDevolucionEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(tipodevolucionempresa.getDetaNotaCreditoSolis());
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionempresa,new Object(),generalEntityParameterGeneral,this.tipodevolucionempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDevolucionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDevolucionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDevolucionEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDevolucionEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDevolucionEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionempresa,new Object(),generalEntityParameterGeneral,this.tipodevolucionempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDevolucionEmpresa(TipoDevolucionEmpresaBean tipodevolucionempresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.setDetaNotaCreditoSolis(tipodevolucionempresa.getDetaNotaCreditoSolis());
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDevolucionEmpresa(ArrayList<Classe> classes,TipoDevolucionEmpresaReturnGeneral tipodevolucionempresaReturnGeneral,TipoDevolucionEmpresaBean tipodevolucionempresaBean,Boolean conDefault) throws Exception {
		
			this.tipodevolucionempresaBean.setDetaNotaCreditoSolis(tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa().getDetaNotaCreditoSolis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetaNotaCreditoSoli.class)) {
					tipodevolucionempresa.setDetaNotaCreditoSolis(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliLogic.getDetaNotaCreditoSolis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipodevolucionempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa = new TipoDevolucionEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipodevolucionempresaSessionBean.getConGuardarRelaciones(),this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.tipodevolucionempresaLogic=this.tipodevolucionempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoDevolucionEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDevolucionEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDevolucionEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDevolucionEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDevolucionEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDevolucionEmpresa"));
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoDevolucionEmpresa"));

		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDevolucionEmpresa"));
					
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemModificarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDevolucionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoDevolucionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDevolucionEmpresa"));
						
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemActualizarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDevolucionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoDevolucionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDevolucionEmpresa"));
								
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemEliminarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDevolucionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoDevolucionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDevolucionEmpresa"));
					
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemCancelarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDevolucionEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemDetalleCerrarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDevolucionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucionEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucionEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDevolucionEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonidTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtoncodigoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonnombreTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonesta_activoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoDevolucionEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDevolucionEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDevolucionEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDevolucionEmpresa"));
		}
		
		this.jTableDatosTipoDevolucionEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDevolucionEmpresa"));
		
		this.jTableDatosTipoDevolucionEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDevolucionEmpresa"));
		
		this.jButtonNuevoTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoDevolucionEmpresa"));
		
		this.jButtonDuplicarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoDevolucionEmpresa"));
		
		this.jButtonCopiarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoDevolucionEmpresa"));
		
		this.jButtonVerFormTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoDevolucionEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDevolucionEmpresa"));
			
		this.jButtonDuplicarToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemNuevoTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDevolucionEmpresa"));
			
		this.jMenuItemDuplicarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDevolucionEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDevolucionEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDevolucionEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoDevolucionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonModificarToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDevolucionEmpresa"));
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemModificarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDevolucionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoDevolucionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonActualizarToolBarTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDevolucionEmpresa"));
				
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemActualizarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDevolucionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoDevolucionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonEliminarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDevolucionEmpresa"));
						
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemEliminarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDevolucionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoDevolucionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonCancelarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDevolucionEmpresa"));
			
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemCancelarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDevolucionEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDevolucionEmpresa"));		
		
		
		this.jButtonCerrarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoDevolucionEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemCerrarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDevolucionEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jMenuItemDetalleCerrarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDevolucionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDevolucionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucionEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDevolucionEmpresa"));
			
		this.jButtonVerFormToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDevolucionEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDevolucionEmpresa"));
			
		this.jMenuItemCopiarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDevolucionEmpresa"));		
		
		this.jMenuItemVerFormTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDevolucionEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDevolucionEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDevolucionEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDevolucionEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDevolucionEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDevolucionEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoDevolucionEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDevolucionEmpresa"));
		
		this.jMenuItemAnterioresTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDevolucionEmpresa"));		
		
		
		this.jButtonSiguientesTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoDevolucionEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemSiguientesTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDevolucionEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDevolucionEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDevolucionEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDevolucionEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDevolucionEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDevolucionEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDevolucionEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDevolucionEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDevolucionEmpresa"));

		this.jCheckBoxSeleccionadosTipoDevolucionEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDevolucionEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDevolucionEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDevolucionEmpresa"));
			
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDevolucionEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDevolucionEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDevolucionEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonidTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtoncodigoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonnombreTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonesta_activoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoDevolucionEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDevolucionEmpresa"));

			this.jButtonBusquedaPorNombreTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDevolucionEmpresa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDevolucionEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucionEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucionEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucionEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucionEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDevolucionEmpresa!=null) {
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDevolucionEmpresa"));
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDevolucionEmpresa"));
				this.jInternalFrameImportacionTipoDevolucionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDevolucionEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDevolucionEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoDevolucionEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDevolucionEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoDevolucionEmpresa!=null) {
				this.jInternalFrameOrderByTipoDevolucionEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDevolucionEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTabbedPaneRelacionesTipoDevolucionEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDevolucionEmpresa"));
		
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
            		closingInternalFrameTipoDevolucionEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDevolucionEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoDevolucionEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoDevolucionEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDevolucionEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDevolucionEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDevolucionEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDevolucionEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDevolucionEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDevolucionEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDevolucionEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDevolucionEmpresa";
		inputMap = this.jButtonModificarTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDevolucionEmpresa";
		inputMap = this.jButtonActualizarTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDevolucionEmpresa";
		inputMap = this.jButtonEliminarTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDevolucionEmpresa";
		inputMap = this.jButtonCancelarTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDevolucionEmpresa";
		inputMap = this.jButtonCerrarTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDevolucionEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonGuardarCambiosTipoDevolucionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDevolucionEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDevolucionEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDevolucionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDevolucionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDevolucionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonidTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonid_empresaTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtoncodigoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonnombreTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jButtonesta_activoTipoDevolucionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoDevolucionEmpresaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDevolucionEmpresa"));

		this.jButtonBusquedaPorNombreTipoDevolucionEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDevolucionEmpresa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDevolucionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDevolucionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDevolucionEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDevolucionEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDevolucionEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
					tipodevolucionempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresas) {
					tipodevolucionempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDevolucionEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
						tipodevolucionempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresas) {
						tipodevolucionempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
					
						if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipodevolucionempresaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresas) {
						
						if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipodevolucionempresaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDevolucionEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDevolucionEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDevolucionEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDevolucionEmpresa.getSelectedRows();
			
			TipoDevolucionEmpresa tipodevolucionempresaLocal=new TipoDevolucionEmpresa();
			
			//this.seleccionarTodosTipoDevolucionEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLocal =(TipoDevolucionEmpresa) this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas().toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodevolucionempresaLocal =(TipoDevolucionEmpresa) this.tipodevolucionempresas.toArray()[this.jTableDatosTipoDevolucionEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodevolucionempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
						tipodevolucionempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresas) {
						tipodevolucionempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDevolucionEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDevolucionEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDevolucionEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDevolucionEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDevolucionEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDevolucionEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodevolucionempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodevolucionempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresas) {
					
						if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodevolucionempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodevolucionempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDevolucionEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDevolucionEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDevolucionEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDevolucionEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDevolucionEmpresa(conSplash);
				
					this.generarReporteTipoDevolucionEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDevolucionEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDevolucionEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDevolucionEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDevolucionEmpresa();
				
				this.exportarTipoDevolucionEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDevolucionEmpresas();
				//this.importarTipoDevolucionEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDevolucionEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDevolucionEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Devolucion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDevolucionEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDevolucionEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDevolucionEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDevolucionEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDevolucionEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDevolucionEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoDevolucionEmpresa();
						
						this.generarReporteProcesoAccionTipoDevolucionEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Devolucion EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Devolucion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDevolucionEmpresa();
				
						this.actualizarParametrosGeneralTipoDevolucionEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodevolucionempresaReturnGeneral=tipodevolucionempresaLogic.procesarAccionTipoDevolucionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas(),this.tipodevolucionempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDevolucionEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDevolucionEmpresa();
					
					TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDevolucionEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDevolucionEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDevolucionEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDevolucionEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
			TipoDevolucionEmpresa tipodevolucionempresa=new TipoDevolucionEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDevolucionEmpresa.getSelectedItem();
			
			
			
			
			tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodevolucionempresasSeleccionados.size()==1) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
					tipodevolucionempresa=tipodevolucionempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle  Solicitud Nota Credit")) {
					jButtonDetaNotaCreditoSoliActionPerformed(null,rowIndex,true,false,tipodevolucionempresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDevolucionEmpresa();
			
      		//this.finishProcessTipoDevolucionEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDevolucionEmpresaReturnGeneral() throws Exception {
		if(this.tipodevolucionempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodevolucionempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodevolucionempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodevolucionempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodevolucionempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodevolucionempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
		}
		
		if(this.tipodevolucionempresaReturnGeneral.getConRetornoLista() || this.tipodevolucionempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodevolucionempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodevolucionempresaLogic.setTipoDevolucionEmpresas(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodevolucionempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodevolucionempresaLogic.setTipoDevolucionEmpresa(this.tipodevolucionempresaReturnGeneral.getTipoDevolucionEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDevolucionEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDevolucionEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoDevolucionEmpresa> getTipoDevolucionEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDevolucionEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresaLogic.getTipoDevolucionEmpresas()) {
					if(tipodevolucionempresaAux.getIsSelected()) {
						tipodevolucionempresasSeleccionados.add(tipodevolucionempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucionEmpresa tipodevolucionempresaAux:this.tipodevolucionempresas) {
					if(tipodevolucionempresaAux.getIsSelected()) {
						tipodevolucionempresasSeleccionados.add(tipodevolucionempresaAux);				
					}
				}
			}
			
			if(tipodevolucionempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodevolucionempresasSeleccionados.addAll(this.tipodevolucionempresaLogic.getTipoDevolucionEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodevolucionempresasSeleccionados.addAll(this.tipodevolucionempresas);				
					}
				}
			}
		} else {
			tipodevolucionempresasSeleccionados.add(this.tipodevolucionempresa);
		}
		
		return tipodevolucionempresasSeleccionados;
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
	
	public void generarReporteTipoDevolucionEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDevolucionEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDevolucionEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDevolucionEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDevolucionEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDevolucionEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Devolucion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDevolucionEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDevolucionEmpresa();
		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDevolucionEmpresa();
		
		
		//this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados ,tipodevolucionempresaImplementable,tipodevolucionempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoDevolucionEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDevolucionEmpresa();
		
		this.abrirFrameImportacionTipoDevolucionEmpresa();		
		
			
		//this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados ,tipodevolucionempresaImplementable,tipodevolucionempresaImplementableHome);
	}
	
	public void importarTipoDevolucionEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoDevolucionEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDevolucionEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDevolucionEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDevolucionEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Devolucion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDevolucionEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDevolucionEmpresa(tipodevolucionempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodevolucionempresaAux.setsDetalleGeneralEntityReporte(tipodevolucionempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDevolucionEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodevolucionempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucionempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucionempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucionempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucionempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucionempresa.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDevolucionEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDevolucionEmpresa(row);				
				iRow++;
			}				
			
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDevolucionEmpresa(tipodevolucionempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDevolucionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();		
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucionempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodevolucionempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodevolucionempresa");
			//elementRoot.appendChild(element);
		
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
				element = document.createElement("tipodevolucionempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDevolucionEmpresa(tipodevolucionempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDevolucionEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucionempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucionempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucionempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucionempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucionempresa.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlTipoDevolucionEmpresa(TipoDevolucionEmpresa tipodevolucionempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDevolucionEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodevolucionempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDevolucionEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodevolucionempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDevolucionEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodevolucionempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDevolucionEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodevolucionempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDevolucionEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodevolucionempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementesta_activo = document.createElement(TipoDevolucionEmpresaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(tipodevolucionempresa.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoTipoDevolucionEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados=new ArrayList<TipoDevolucionEmpresa>();
		
		tipodevolucionempresasSeleccionados=this.getTipoDevolucionEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDevolucionEmpresa(tipodevolucionempresasSeleccionados);
		
		this.generarReporteTipoDevolucionEmpresas("Todos",tipodevolucionempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDevolucionEmpresa(ArrayList<TipoDevolucionEmpresa> tipodevolucionempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasSeleccionados) {
				tipodevolucionempresaAux.setsDetalleGeneralEntityReporte(tipodevolucionempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodevolucionempresaAux.setsDescripcionGeneralEntityReporte1(tipodevolucionempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodevolucionempresaAux.setsDescripcionGeneralEntityReporte1(tipodevolucionempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodevolucionempresaAux.setsDescripcionGeneralEntityReporte1(tipodevolucionempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					tipodevolucionempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipodevolucionempresaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDevolucionEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDevolucionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucionEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoDevolucionEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDevolucionEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoDevolucionEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;												
			}
			
			this.jButtonCerrarTipoDevolucionEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucionEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodevolucionempresa)) {
			this.isVisibilidadCeldaActualizarTipoDevolucionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDevolucionEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDevolucionEmpresa() {
		this.isVisibilidadCeldaNuevoTipoDevolucionEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDevolucionEmpresa=false;
	}
	
	public void actualizarEstadoPanelsTipoDevolucionEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucionEmpresa!=null) {
				this.jScrollPanelDatosTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucionEmpresa!=null) {
				this.jPanelPaginacionTipoDevolucionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDevolucionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDevolucionEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDevolucionEmpresa.remove(jPanelBusquedaPorCodigoTipoDevolucionEmpresa);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDevolucionEmpresa.remove(jPanelBusquedaPorNombreTipoDevolucionEmpresa);}
		}
		
	}
	
	

	public String registrarSesionTipoDevolucionEmpresaParaDetaNotaCreditoSolis() throws Exception {
		Boolean isPaginaPopupDetaNotaCreditoSoli=false;

		try {

			if(this.tipodevolucionempresaSessionBean==null) {
				this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setsPathNavegacionActual(tipodevolucionempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetaNotaCreditoSoli=this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetaNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetaNotaCreditoSoli(TipoDevolucionEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa(true);
			this.jInternalFrameDetalleFormTipoDevolucionEmpresa.detanotacreditosoliSessionBean.setlidTipoDevolucionEmpresaActual(this.idTipoDevolucionEmpresaActual);

			tipodevolucionempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDevolucionEmpresa(true);
			tipodevolucionempresaSessionBean.setlIdTipoDevolucionEmpresaActualForeignKey(this.idTipoDevolucionEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		
		if(this.tipodevolucionempresaSessionBean==null) {
			this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		}
		
		this.tipodevolucionempresaSessionBean.setsUltimaBusquedaTipoDevolucionEmpresa(this.getsAccionBusqueda());
		this.tipodevolucionempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodevolucionempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodevolucionempresaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodevolucionempresaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodevolucionempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		
		if(this.tipodevolucionempresaSessionBean==null) {
			this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		}
		
		if(this.tipodevolucionempresaSessionBean.getsUltimaBusquedaTipoDevolucionEmpresa()!=null&&!this.tipodevolucionempresaSessionBean.getsUltimaBusquedaTipoDevolucionEmpresa().equals("")) {
			this.setsAccionBusqueda(tipodevolucionempresaSessionBean.getsUltimaBusquedaTipoDevolucionEmpresa());
			this.setiNumeroPaginacion(tipodevolucionempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodevolucionempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodevolucionempresaSessionBean.getcodigo());
				tipodevolucionempresaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodevolucionempresaSessionBean.getnombre());
				tipodevolucionempresaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodevolucionempresaSessionBean.getid_empresa());
				tipodevolucionempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodevolucionempresaSessionBean.setsUltimaBusquedaTipoDevolucionEmpresa("");
		this.tipodevolucionempresaSessionBean.setiNumeroPaginacion(TipoDevolucionEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipodevolucionempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDevolucionEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDevolucionEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoDevolucionEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoDevolucionEmpresa();
		this.updateHabilitarBusquedasFormularioTipoDevolucionEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDevolucionEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponents().length>0) {
	

		if(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoDevolucionEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
				jPanel.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoDevolucionEmpresa);
			}
		}

		if(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucionEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucionEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
				jPanel.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucionEmpresa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDevolucionEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarBusquedaPorCodigoTipoDevolucionEmpresa);
			if(!this.tipodevolucionempresaConstantesFunciones.mostrarBusquedaPorCodigoTipoDevolucionEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucionEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarBusquedaPorNombreTipoDevolucionEmpresa);
			if(!this.tipodevolucionempresaConstantesFunciones.mostrarBusquedaPorNombreTipoDevolucionEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDevolucionEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarBusquedaPorCodigoTipoDevolucionEmpresa);
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setEnabledAt(index,this.tipodevolucionempresaConstantesFunciones.activarBusquedaPorCodigoTipoDevolucionEmpresa);
			}

			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucionEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarBusquedaPorNombreTipoDevolucionEmpresa);
				this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setEnabledAt(index,this.tipodevolucionempresaConstantesFunciones.activarBusquedaPorNombreTipoDevolucionEmpresa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDevolucionEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDevolucionEmpresa);

			this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);

			this.tipodevolucionempresaConstantesFunciones.setResaltarBusquedaPorCodigoTipoDevolucionEmpresa(resaltar);

			jPanel.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoDevolucionEmpresa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDevolucionEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucionEmpresa);

			this.jTabbedPaneBusquedasTipoDevolucionEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucionEmpresa.getComponent(index);

			this.tipodevolucionempresaConstantesFunciones.setResaltarBusquedaPorNombreTipoDevolucionEmpresa(resaltar);

			jPanel.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucionEmpresa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDevolucionEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDevolucionEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDevolucionEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoDevolucionEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoDevolucionEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDevolucionEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodevolucionempresaConstantesFunciones.resaltaridTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltaridTipoDevolucionEmpresa);}
		if(this.tipodevolucionempresaConstantesFunciones.resaltarid_empresaTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarid_empresaTipoDevolucionEmpresa);}
		if(this.tipodevolucionempresaConstantesFunciones.resaltarcodigoTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarcodigoTipoDevolucionEmpresa);}
		if(this.tipodevolucionempresaConstantesFunciones.resaltarnombreTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltarnombreTipoDevolucionEmpresa);}
		if(this.tipodevolucionempresaConstantesFunciones.resaltaresta_activoTipoDevolucionEmpresa!=null && this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setBorder(this.tipodevolucionempresaConstantesFunciones.resaltaresta_activoTipoDevolucionEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDevolucionEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostraridTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelidTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostraridTipoDevolucionEmpresa);
		//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarid_empresaTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelid_empresaTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarid_empresaTipoDevolucionEmpresa);
		//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarcodigoTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelcodigoTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarcodigoTipoDevolucionEmpresa);
		//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarnombreTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelnombreTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostrarnombreTipoDevolucionEmpresa);
		//this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostraresta_activoTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jPanelesta_activoTipoDevolucionEmpresa.setVisible(this.tipodevolucionempresaConstantesFunciones.mostraresta_activoTipoDevolucionEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDevolucionEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucionEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jLabelidTipoDevolucionEmpresa.setEnabled(this.tipodevolucionempresaConstantesFunciones.activaridTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jComboBoxid_empresaTipoDevolucionEmpresa.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarid_empresaTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextFieldcodigoTipoDevolucionEmpresa.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarcodigoTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jTextAreanombreTipoDevolucionEmpresa.setEnabled(this.tipodevolucionempresaConstantesFunciones.activarnombreTipoDevolucionEmpresa);
		this.jInternalFrameDetalleFormTipoDevolucionEmpresa.jCheckBoxesta_activoTipoDevolucionEmpresa.setEnabled(this.tipodevolucionempresaConstantesFunciones.activaresta_activoTipoDevolucionEmpresa);
		}
	}
	
		
}