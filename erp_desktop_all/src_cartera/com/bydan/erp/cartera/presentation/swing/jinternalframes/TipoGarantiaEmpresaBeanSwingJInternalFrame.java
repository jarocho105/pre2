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

import com.bydan.erp.cartera.util.TipoGarantiaEmpresaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoGarantiaEmpresaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoGarantiaEmpresaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoGarantiaEmpresaBean;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGarantiaEmpresaBeanSwingJInternalFrame extends TipoGarantiaEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGarantiaEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGarantiaEmpresa> tipogarantiaempresaValidator = new ClassValidator<TipoGarantiaEmpresa>(TipoGarantiaEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGarantiaEmpresa tipogarantiaempresa;	
	public TipoGarantiaEmpresa tipogarantiaempresaAux;
	public TipoGarantiaEmpresa tipogarantiaempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGarantiaEmpresa tipogarantiaempresaTotales;
	public Long idTipoGarantiaEmpresaActual;
	public Long iIdNuevoTipoGarantiaEmpresa=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosGarantiaCliente=false;

	public Boolean getIsTienePermisosGarantiaCliente() {
		return isTienePermisosGarantiaCliente;
	}

	public void setIsTienePermisosGarantiaCliente(Boolean isTienePermisosGarantiaCliente) {
		this.isTienePermisosGarantiaCliente= isTienePermisosGarantiaCliente;
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
	
	public Boolean isPermisoTodoTipoGarantiaEmpresa;
	public Boolean isPermisoNuevoTipoGarantiaEmpresa;
	public Boolean isPermisoActualizarTipoGarantiaEmpresa;
	public Boolean isPermisoActualizarOriginalTipoGarantiaEmpresa;
	public Boolean isPermisoEliminarTipoGarantiaEmpresa;
	public Boolean isPermisoGuardarCambiosTipoGarantiaEmpresa;
	public Boolean isPermisoConsultaTipoGarantiaEmpresa;
	public Boolean isPermisoBusquedaTipoGarantiaEmpresa;
	public Boolean isPermisoReporteTipoGarantiaEmpresa;
	public Boolean isPermisoPaginacionMedioTipoGarantiaEmpresa;
	public Boolean isPermisoPaginacionAltoTipoGarantiaEmpresa;
	public Boolean isPermisoPaginacionTodoTipoGarantiaEmpresa;
	public Boolean isPermisoCopiarTipoGarantiaEmpresa;
	public Boolean isPermisoVerFormTipoGarantiaEmpresa;
	public Boolean isPermisoDuplicarTipoGarantiaEmpresa;
	public Boolean isPermisoOrdenTipoGarantiaEmpresa;
	
	
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
	
	public TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaReturnGeneral;
	public TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public GarantiaClienteLogic garantiaclienteLogic=null;

	public GarantiaClienteLogic getGarantiaClienteLogic() {
		return garantiaclienteLogic;
	}

	public void setGarantiaClienteLogic(GarantiaClienteLogic garantiaclienteLogic) {
		this.garantiaclienteLogic = garantiaclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGarantiaEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoGarantiaEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoGarantiaEmpresaSessionBeanAdditional tipogarantiaempresaSessionBeanAdditional=null;
	
	public TipoGarantiaEmpresaSessionBeanAdditional getTipoGarantiaEmpresaSessionBeanAdditional() {
		return this.tipogarantiaempresaSessionBeanAdditional;
	}
	
	public void setTipoGarantiaEmpresaSessionBeanAdditional(TipoGarantiaEmpresaSessionBeanAdditional tipogarantiaempresaSessionBeanAdditional) {
		try {
			this.tipogarantiaempresaSessionBeanAdditional=tipogarantiaempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional tipogarantiaempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoGarantiaEmpresaBeanSwingJInternalFrame
	
	public TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional getTipoGarantiaEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipogarantiaempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoGarantiaEmpresaBeanSwingJInternalFrameAdditional(TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional tipogarantiaempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipogarantiaempresaBeanSwingJInternalFrameAdditional=tipogarantiaempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGarantiaEmpresaLogic tipogarantiaempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGarantiaEmpresa tipogarantiaempresaBean;
	public TipoGarantiaEmpresaConstantesFunciones tipogarantiaempresaConstantesFunciones;
	//public TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGarantiaEmpresa> tipogarantiaempresas;	
	//public List<TipoGarantiaEmpresa> tipogarantiaempresasEliminados;
	//public List<TipoGarantiaEmpresa> tipogarantiaempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGarantiaEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoGarantiaEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoGarantiaEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoGarantiaEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoGarantiaEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoGarantiaEmpresa() {
		return this.iIdNuevoTipoGarantiaEmpresa;
	}

	public void setiIdNuevoTipoGarantiaEmpresa(Long iIdNuevoTipoGarantiaEmpresa) {
		this.iIdNuevoTipoGarantiaEmpresa = iIdNuevoTipoGarantiaEmpresa;
	}
	
	public Long getidTipoGarantiaEmpresaActual() {
		return this.idTipoGarantiaEmpresaActual;
	}

	public void setidTipoGarantiaEmpresaActual(Long idTipoGarantiaEmpresaActual) {
		this.idTipoGarantiaEmpresaActual = idTipoGarantiaEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGarantiaEmpresa gettipogarantiaempresa() {
		return this.tipogarantiaempresa;
	}

	public void settipogarantiaempresa(TipoGarantiaEmpresa tipogarantiaempresa) {
		this.tipogarantiaempresa = tipogarantiaempresa;
	}
	
	public TipoGarantiaEmpresa gettipogarantiaempresaAux() {
		return this.tipogarantiaempresaAux;
	}

	public void settipogarantiaempresaAux(TipoGarantiaEmpresa tipogarantiaempresaAux) {
		this.tipogarantiaempresaAux = tipogarantiaempresaAux;
	}				
	
	public TipoGarantiaEmpresa gettipogarantiaempresaAnterior() {
		return this.tipogarantiaempresaAnterior;
	}

	public void settipogarantiaempresaAnterior(TipoGarantiaEmpresa tipogarantiaempresaAnterior) {
		this.tipogarantiaempresaAnterior = tipogarantiaempresaAnterior;
	}	
	
	public TipoGarantiaEmpresa gettipogarantiaempresaTotales() {
		return this.tipogarantiaempresaTotales;
	}

	public void settipogarantiaempresaTotales(TipoGarantiaEmpresa tipogarantiaempresaTotales) {
		this.tipogarantiaempresaTotales = tipogarantiaempresaTotales;
	}	
	
	public TipoGarantiaEmpresa gettipogarantiaempresaBean() {
		return this.tipogarantiaempresaBean;
	}

	public void settipogarantiaempresaBean(TipoGarantiaEmpresa tipogarantiaempresaBean) {
		this.tipogarantiaempresaBean = tipogarantiaempresaBean;
	}	
	
	public TipoGarantiaEmpresaParameterReturnGeneral gettipogarantiaempresaReturnGeneral() {
		return this.tipogarantiaempresaReturnGeneral;
	}

	public void settipogarantiaempresaReturnGeneral(TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaReturnGeneral) {
		this.tipogarantiaempresaReturnGeneral = tipogarantiaempresaReturnGeneral;
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
	
	
	public TipoGarantiaEmpresaLogic getTipoGarantiaEmpresaLogic()	{		
		return tipogarantiaempresaLogic;
	}

	public void setTipoGarantiaEmpresaLogic(TipoGarantiaEmpresaLogic tipogarantiaempresaLogic) {
		this.tipogarantiaempresaLogic = tipogarantiaempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoGarantiaEmpresa() {
		return isEsNuevoTipoGarantiaEmpresa;
	}

	public void setIsEsNuevoTipoGarantiaEmpresa(Boolean isEsNuevoTipoGarantiaEmpresa) {
		this.isEsNuevoTipoGarantiaEmpresa = isEsNuevoTipoGarantiaEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGarantiaEmpresa() {
		return esParaAccionDesdeFormularioTipoGarantiaEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGarantiaEmpresa(Boolean esParaAccionDesdeFormularioTipoGarantiaEmpresa) {
		this.esParaAccionDesdeFormularioTipoGarantiaEmpresa = esParaAccionDesdeFormularioTipoGarantiaEmpresa;
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

			if(this.tipogarantiaempresaSessionBean==null) {
				this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
			}

			if(!this.tipogarantiaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipogarantiaempresaSessionBean.getlidEmpresaActual());
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

					if(this.tipogarantiaempresa!=null) {
						this.tipogarantiaempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoGarantiaEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoGarantiaEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoGarantiaEmpresaGenerico!=null && jComboBoxid_empresaTipoGarantiaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoGarantiaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoGarantiaEmpresa tipogarantiaempresa,JComboBox jComboBoxid_empresaTipoGarantiaEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoGarantiaEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoGarantiaEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipogarantiaempresa.setid_empresa(empresaAux.getId());
				tipogarantiaempresa.setempresa_descripcion(TipoGarantiaEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipogarantiaempresa.setEmpresa(empresaAux);			}
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

					if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { 
					}

					if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoGarantiaEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGarantiaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGarantiaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa(this.tipogarantiaempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogarantiaempresaLogic.setTipoGarantiaEmpresas(this.tipogarantiaempresas);
			tipogarantiaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGarantiaEmpresaParameterReturnGeneral getTipoGarantiaEmpresaParameterGeneral() {
		return this.tipogarantiaempresaParameterGeneral;
	}
	
	public void setTipoGarantiaEmpresaParameterGeneral(TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaParameterGeneral) {
		this.tipogarantiaempresaParameterGeneral = tipogarantiaempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGarantiaEmpresa() {
		return isPermisoTodoTipoGarantiaEmpresa;
	}

	public void setIsPermisoTodoTipoGarantiaEmpresa(Boolean isPermisoTodoTipoGarantiaEmpresa) {
		this.isPermisoTodoTipoGarantiaEmpresa = isPermisoTodoTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoGarantiaEmpresa() {
		return isPermisoNuevoTipoGarantiaEmpresa;
	}

	public void setIsPermisoNuevoTipoGarantiaEmpresa(Boolean isPermisoNuevoTipoGarantiaEmpresa) {
		this.isPermisoNuevoTipoGarantiaEmpresa = isPermisoNuevoTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoGarantiaEmpresa() {
		return isPermisoActualizarTipoGarantiaEmpresa;
	}

	public void setIsPermisoActualizarTipoGarantiaEmpresa(Boolean isPermisoActualizarTipoGarantiaEmpresa) {
		this.isPermisoActualizarTipoGarantiaEmpresa = isPermisoActualizarTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoGarantiaEmpresa() {
		return isPermisoEliminarTipoGarantiaEmpresa;
	}

	public void setIsPermisoEliminarTipoGarantiaEmpresa(Boolean isPermisoEliminarTipoGarantiaEmpresa) {
		this.isPermisoEliminarTipoGarantiaEmpresa = isPermisoEliminarTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGarantiaEmpresa() {
		return isPermisoGuardarCambiosTipoGarantiaEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoGarantiaEmpresa(Boolean isPermisoGuardarCambiosTipoGarantiaEmpresa) {
		this.isPermisoGuardarCambiosTipoGarantiaEmpresa = isPermisoGuardarCambiosTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoGarantiaEmpresa() {
		return isPermisoConsultaTipoGarantiaEmpresa;
	}

	public void setIsPermisoConsultaTipoGarantiaEmpresa(Boolean isPermisoConsultaTipoGarantiaEmpresa) {
		this.isPermisoConsultaTipoGarantiaEmpresa = isPermisoConsultaTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoGarantiaEmpresa() {
		return isPermisoBusquedaTipoGarantiaEmpresa;
	}

	public void setIsPermisoBusquedaTipoGarantiaEmpresa(Boolean isPermisoBusquedaTipoGarantiaEmpresa) {
		this.isPermisoBusquedaTipoGarantiaEmpresa = isPermisoBusquedaTipoGarantiaEmpresa;
	}

	public Boolean getIsPermisoReporteTipoGarantiaEmpresa() {
		return isPermisoReporteTipoGarantiaEmpresa;
	}

	public void setIsPermisoReporteTipoGarantiaEmpresa(Boolean isPermisoReporteTipoGarantiaEmpresa) {
		this.isPermisoReporteTipoGarantiaEmpresa = isPermisoReporteTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGarantiaEmpresa() {
		return isPermisoPaginacionMedioTipoGarantiaEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoGarantiaEmpresa(Boolean isPermisoPaginacionMedioTipoGarantiaEmpresa) {
		this.isPermisoPaginacionMedioTipoGarantiaEmpresa = isPermisoPaginacionMedioTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGarantiaEmpresa() {
		return isPermisoPaginacionTodoTipoGarantiaEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoGarantiaEmpresa(Boolean isPermisoPaginacionTodoTipoGarantiaEmpresa) {
		this.isPermisoPaginacionTodoTipoGarantiaEmpresa = isPermisoPaginacionTodoTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGarantiaEmpresa() {
		return isPermisoPaginacionAltoTipoGarantiaEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoGarantiaEmpresa(Boolean isPermisoPaginacionAltoTipoGarantiaEmpresa) {
		this.isPermisoPaginacionAltoTipoGarantiaEmpresa = isPermisoPaginacionAltoTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoGarantiaEmpresa() {
		return isPermisoCopiarTipoGarantiaEmpresa;
	}

	public void setIsPermisoCopiarTipoGarantiaEmpresa(Boolean isPermisoCopiarTipoGarantiaEmpresa) {
		this.isPermisoCopiarTipoGarantiaEmpresa = isPermisoCopiarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoGarantiaEmpresa() {
		return isPermisoVerFormTipoGarantiaEmpresa;
	}

	public void setIsPermisoVerFormTipoGarantiaEmpresa(Boolean isPermisoVerFormTipoGarantiaEmpresa) {
		this.isPermisoVerFormTipoGarantiaEmpresa = isPermisoVerFormTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoGarantiaEmpresa() {
		return isPermisoDuplicarTipoGarantiaEmpresa;
	}

	public void setIsPermisoDuplicarTipoGarantiaEmpresa(Boolean isPermisoDuplicarTipoGarantiaEmpresa) {
		this.isPermisoDuplicarTipoGarantiaEmpresa = isPermisoDuplicarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoGarantiaEmpresa() {
		return isPermisoOrdenTipoGarantiaEmpresa;
	}

	public void setIsPermisoOrdenTipoGarantiaEmpresa(Boolean isPermisoOrdenTipoGarantiaEmpresa) {
		this.isPermisoOrdenTipoGarantiaEmpresa = isPermisoOrdenTipoGarantiaEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGarantiaEmpresa() {
		return isVisibilidadCeldaNuevoTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoGarantiaEmpresa(Boolean isVisibilidadCeldaNuevoTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa = isVisibilidadCeldaNuevoTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaDuplicarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaDuplicarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa = isVisibilidadCeldaDuplicarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaCopiarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaCopiarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa = isVisibilidadCeldaCopiarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGarantiaEmpresa() {
		return isVisibilidadCeldaVerFormTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoGarantiaEmpresa(Boolean isVisibilidadCeldaVerFormTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa = isVisibilidadCeldaVerFormTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGarantiaEmpresa() {
		return isVisibilidadCeldaOrdenTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoGarantiaEmpresa(Boolean isVisibilidadCeldaOrdenTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa = isVisibilidadCeldaOrdenTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa = isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaModificarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaModificarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaModificarTipoGarantiaEmpresa = isVisibilidadCeldaModificarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaActualizarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaActualizarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa = isVisibilidadCeldaActualizarTipoGarantiaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaEliminarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaEliminarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa = isVisibilidadCeldaEliminarTipoGarantiaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaCancelarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaCancelarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa = isVisibilidadCeldaCancelarTipoGarantiaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGarantiaEmpresa() {
		return isVisibilidadCeldaGuardarTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoGarantiaEmpresa(Boolean isVisibilidadCeldaGuardarTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa = isVisibilidadCeldaGuardarTipoGarantiaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa = isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa;
	}
		
	public TipoGarantiaEmpresaSessionBean gettipogarantiaempresaSessionBean() {
		return this.tipogarantiaempresaSessionBean;
	}
	
	public void settipogarantiaempresaSessionBean(TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean) {
		this.tipogarantiaempresaSessionBean=tipogarantiaempresaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipogarantiaempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoGarantiaEmpresa tipogarantiaempresa,TipoGarantiaEmpresa tipogarantiaempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGarantiaEmpresa(tipogarantiaempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogarantiaempresaAux.setId(tipogarantiaempresa.getId());
		tipogarantiaempresaAux.setVersionRow(tipogarantiaempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGarantiaEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogarantiaempresaValidator.getInvalidValues(this.tipogarantiaempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogarantiaempresaLogic.setDatosCliente(datosCliente);
			tipogarantiaempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogarantiaempresaAux=new  TipoGarantiaEmpresa();
				
				tipogarantiaempresaAux.setIsNew(true);
				tipogarantiaempresaAux.setIsChanged(true);
				
				tipogarantiaempresaAux.setTipoGarantiaEmpresaOriginal(this.tipogarantiaempresa);
				
				tipogarantiaempresaAux.setId(this.tipogarantiaempresa.getId());	
				tipogarantiaempresaAux.setVersionRow(this.tipogarantiaempresa.getVersionRow());	
				tipogarantiaempresaAux.setid_empresa(this.tipogarantiaempresa.getid_empresa());	
				tipogarantiaempresaAux.setcodigo(this.tipogarantiaempresa.getcodigo());	
				tipogarantiaempresaAux.setnombre(this.tipogarantiaempresa.getnombre());	
				tipogarantiaempresaAux.setes_defecto(this.tipogarantiaempresa.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.saveTipoGarantiaEmpresas();//WithConnection
						//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogarantiaempresaLogic.saveTipoGarantiaEmpresaRelaciones(tipogarantiaempresaAux,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogarantiaempresaAux=new  TipoGarantiaEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() && this.tipogarantiaempresa.getId()>=0)) {
						
					tipogarantiaempresaAux.setIsNew(false);
				}
				
				tipogarantiaempresaAux.setIsDeleted(false);
			
				tipogarantiaempresaAux.setId(this.tipogarantiaempresa.getId());	
				tipogarantiaempresaAux.setVersionRow(this.tipogarantiaempresa.getVersionRow());	
				tipogarantiaempresaAux.setid_empresa(this.tipogarantiaempresa.getid_empresa());	
				tipogarantiaempresaAux.setcodigo(this.tipogarantiaempresa.getcodigo());	
				tipogarantiaempresaAux.setnombre(this.tipogarantiaempresa.getnombre());	
				tipogarantiaempresaAux.setes_defecto(this.tipogarantiaempresa.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.saveTipoGarantiaEmpresas();//WithConnection
						//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogarantiaempresaLogic.saveTipoGarantiaEmpresaRelaciones(tipogarantiaempresaAux,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogarantiaempresa,tipogarantiaempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogarantiaempresaAux=new  TipoGarantiaEmpresa();
				
				tipogarantiaempresaAux.setIsNew(false);
				tipogarantiaempresaAux.setIsChanged(false);
				
				tipogarantiaempresaAux.setIsDeleted(true);
				
				tipogarantiaempresaAux.setId(this.tipogarantiaempresa.getId());	
				tipogarantiaempresaAux.setVersionRow(this.tipogarantiaempresa.getVersionRow());	
				tipogarantiaempresaAux.setid_empresa(this.tipogarantiaempresa.getid_empresa());	
				tipogarantiaempresaAux.setcodigo(this.tipogarantiaempresa.getcodigo());	
				tipogarantiaempresaAux.setnombre(this.tipogarantiaempresa.getnombre());	
				tipogarantiaempresaAux.setes_defecto(this.tipogarantiaempresa.getes_defecto());	
				
				if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogarantiaempresaAux.getId()>=0) {	
						this.tipogarantiaempresasEliminados.add(tipogarantiaempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.saveTipoGarantiaEmpresas();//WithConnection
						//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogarantiaempresaLogic.saveTipoGarantiaEmpresaRelaciones(tipogarantiaempresaAux,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogarantiaempresaAux.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogarantiaempresaAux,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogarantiaempresaAux,tipogarantiaempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().addAll(this.tipogarantiaempresasEliminados);
					
					tipogarantiaempresaLogic.saveTipoGarantiaEmpresas();//WithConnection
					//tipogarantiaempresaLogic.getSetVersionRowTipoGarantiaEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa();
				
				this.tipogarantiaempresasEliminados= new ArrayList<TipoGarantiaEmpresa>();		
			}
			
			if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Garantia Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogarantiaempresa=tipogarantiaempresaAux;
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
      		//this.finishProcessTipoGarantiaEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGarantiaEmpresa tipogarantiaempresaLocal) throws Exception {
		
		if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipogarantiaempresaLocal.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				tipogarantiaempresaLocal.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
			
			} else {
			
				tipogarantiaempresaLocal.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clientes);
				tipogarantiaempresaLocal.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGarantiaEmpresa tipogarantiaempresaLocal) throws Exception {	
		if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipogarantiaempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGarantiaEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogarantiaempresaValidator.getInvalidValues(this.tipogarantiaempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGarantiaEmpresa tipogarantiaempresa,List<TipoGarantiaEmpresa> tipogarantiaempresas) throws Exception {
		try	{		
			TipoGarantiaEmpresaConstantesFunciones.actualizarLista(tipogarantiaempresa,tipogarantiaempresas,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGarantiaEmpresa tipogarantiaempresa,List<TipoGarantiaEmpresa> tipogarantiaempresas) throws Exception {
		try	{			
			TipoGarantiaEmpresaConstantesFunciones.actualizarSelectedLista(tipogarantiaempresa,tipogarantiaempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGarantiaEmpresa> tipogarantiaempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogarantiaempresasLocal=this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogarantiaempresasLocal=this.tipogarantiaempresas;
			}
			//ARCHITECTURE
		
			for(TipoGarantiaEmpresa tipogarantiaempresaLocal:tipogarantiaempresasLocal) {
				if(this.permiteMantenimiento(tipogarantiaempresaLocal) && tipogarantiaempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGarantiaEmpresaConstantesFunciones.getTipoGarantiaEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGarantiaEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelid_empresaTipoGarantiaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGarantiaEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelcodigoTipoGarantiaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGarantiaEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelnombreTipoGarantiaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGarantiaEmpresaConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabeles_defectoTipoGarantiaEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelid_empresaTipoGarantiaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelcodigoTipoGarantiaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelnombreTipoGarantiaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabeles_defectoTipoGarantiaEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.tipogarantiaempresa==null) {
				this.tipogarantiaempresa= new TipoGarantiaEmpresa();
			}

			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGarantiaEmpresa
				this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);

				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.getcliente().setTipoGarantiaEmpresa(this.tipogarantiaempresa);
			}

			return;
		}
		 else  if(sTipo.equals("GarantiaCliente")) {
			if(this.tipogarantiaempresa==null) {
				this.tipogarantiaempresa= new TipoGarantiaEmpresa();
			}

			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGarantiaEmpresa
				this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);

				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.getgarantiacliente().setTipoGarantiaEmpresa(this.tipogarantiaempresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoGarantiaEmpresa--;	
		
		
		this.tipogarantiaempresaAux=new TipoGarantiaEmpresa();
		
		this.tipogarantiaempresaAux.setId(this.iIdNuevoTipoGarantiaEmpresa);
		this.tipogarantiaempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(this.tipogarantiaempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogarantiaempresas.add(this.tipogarantiaempresaAux);
		}
		//ARCHITECTURE
		
		this.tipogarantiaempresa=this.tipogarantiaempresaAux;
		
		if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantiaEmpresa(this.tipogarantiaempresa);
		}
				
		//this.setDefaultControlesTipoGarantiaEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGarantiaEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGarantiaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantiaEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresaBean,this.tipogarantiaempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoGarantiaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGarantiaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.procesarEventosTipoGarantiaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this.tipogarantiaempresa,this.tipogarantiaempresaParameterGeneral,this.isEsNuevoTipoGarantiaEmpresa,classes);//this.tipogarantiaempresaLogic.getTipoGarantiaEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral,this.tipogarantiaempresaBean,false);
		
		if(this.tipogarantiaempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa());
		}
		
		if(this.tipogarantiaempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa(),classes);//this.tipogarantiaempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGarantiaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGarantiaEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoGarantiaEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
						
			if(tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado() && GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGarantiaClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoGarantiaEmpresa();
			
			this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGarantiaEmpresa(), this.getIndiceNuevoTipoGarantiaEmpresa());
			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGarantiaEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setEnabled(isHabilitar && this.tipogarantiaempresaConstantesFunciones.activarcodigoTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setEnabled(isHabilitar && this.tipogarantiaempresaConstantesFunciones.activarnombreTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setEnabled(isHabilitar && this.tipogarantiaempresaConstantesFunciones.activares_defectoTipoGarantiaEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setEnabled(isHabilitar && this.tipogarantiaempresaConstantesFunciones.activarid_empresaTipoGarantiaEmpresa);
	};
	
	public void setDefaultControlesTipoGarantiaEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGarantiaEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipogarantiaempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipogarantiaempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoGarantiaEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				if(tipogarantiaempresaAux.getId().equals(this.iIdNuevoTipoGarantiaEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresas) {
				if(tipogarantiaempresaAux.getId().equals(this.iIdNuevoTipoGarantiaEmpresa)) {
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
	
	public int getIndiceActualTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				if(tipogarantiaempresaAux.getId().equals(tipogarantiaempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresas) {
				if(tipogarantiaempresaAux.getId().equals(tipogarantiaempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				if(tipogarantiaempresaAux.getTipoGarantiaEmpresaOriginal().getId().equals(tipogarantiaempresaOriginal.getId())) {
					existe=true;
					tipogarantiaempresaOriginal.setId(tipogarantiaempresaAux.getId());
					tipogarantiaempresaOriginal.setVersionRow(tipogarantiaempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresas) {
				if(tipogarantiaempresaAux.getTipoGarantiaEmpresaOriginal().getId().equals(tipogarantiaempresaOriginal.getId())) {
					existe=true;
					tipogarantiaempresaOriginal.setId(tipogarantiaempresaAux.getId());
					tipogarantiaempresaOriginal.setVersionRow(tipogarantiaempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGarantiaEmpresa(Boolean esParaCancelar) throws Exception {
		tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
		tipogarantiaempresaAux=new TipoGarantiaEmpresa();
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
					if(tipogarantiaempresaAux.getId()<0) {
						tipogarantiaempresasAux.add(tipogarantiaempresaAux);
					}		
				}
				this.iIdNuevoTipoGarantiaEmpresa=0L;
				this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().removeAll(tipogarantiaempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresas) {
					if(tipogarantiaempresaAux.getId()<0) {
						tipogarantiaempresasAux.add(tipogarantiaempresaAux);
					}		
				}
				this.iIdNuevoTipoGarantiaEmpresa=0L;
				this.tipogarantiaempresas.removeAll(tipogarantiaempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGarantiaEmpresa 
					&& this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()>0
					) {
					tipogarantiaempresaAux=this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().get(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size() - 1);
				
					if(tipogarantiaempresaAux.getId()<0) {
						this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().remove(tipogarantiaempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGarantiaEmpresa && this.tipogarantiaempresas.size()>0) {
					tipogarantiaempresaAux=this.tipogarantiaempresas.get(this.tipogarantiaempresas.size() - 1);
				
					if(tipogarantiaempresaAux.getId()<0) {
						this.tipogarantiaempresas.remove(tipogarantiaempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGarantiaEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogarantiaempresa.getId()<0) {
				this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().remove(this.tipogarantiaempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogarantiaempresa.getId()<0) {
				this.tipogarantiaempresas.remove(this.tipogarantiaempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGarantiaEmpresa(List<TipoGarantiaEmpresa> tipogarantiaempresasAux) throws Exception {
		TipoGarantiaEmpresaConstantesFunciones.setEstadosInicialesTipoGarantiaEmpresa(tipogarantiaempresasAux);
	}
	
	public void setEstadosInicialesTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresaAux) throws Exception {
		TipoGarantiaEmpresaConstantesFunciones.setEstadosInicialesTipoGarantiaEmpresa(tipogarantiaempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGarantiaEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGarantiaEmpresaActual()) {
				if(!this.isEsNuevoTipoGarantiaEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGarantiaEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGarantiaEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Garantia Empresa ?", "MANTENIMIENTO DE Tipo Garantia Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGarantiaEmpresa tipogarantiaempresa) throws Exception {
		TipoGarantiaEmpresaConstantesFunciones.seleccionarAsignar(this.tipogarantiaempresa,tipogarantiaempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGarantiaEmpresa=this.isPermisoActualizarOriginalTipoGarantiaEmpresa;
			
			
			this.seleccionarAsignar(tipogarantiaempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGarantiaEmpresaConstantesFunciones.quitarEspaciosTipoGarantiaEmpresa(this.tipogarantiaempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogarantiaempresaSessionBean.setsFuncionBusquedaRapida(this.tipogarantiaempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGarantiaEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGarantiaEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoGarantiaEmpresa(esParaCancelar);								
			}
			
			this.tipogarantiaempresa=new TipoGarantiaEmpresa();
			
			this.inicializarTipoGarantiaEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGarantiaEmpresa() throws Exception {
		try {
			TipoGarantiaEmpresaConstantesFunciones.inicializarTipoGarantiaEmpresa(this.tipogarantiaempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGarantiaEmpresas(String sAccionBusqueda,List<TipoGarantiaEmpresa> tipogarantiaempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGarantiaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGarantiaEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGarantiaEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGarantiaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Garantia Empresas");		
		parameters.put("busquedapor", TipoGarantiaEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(GarantiaCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoGarantiaEmpresaLogic tipogarantiaempresaLogicAuxiliar=new TipoGarantiaEmpresaLogic();
					tipogarantiaempresaLogicAuxiliar.setDatosCliente(tipogarantiaempresaLogic.getDatosCliente());				
					tipogarantiaempresaLogicAuxiliar.setTipoGarantiaEmpresas(tipogarantiaempresasParaReportes);
					
					tipogarantiaempresaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoGarantiaEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipogarantiaempresasParaReportes=tipogarantiaempresaLogicAuxiliar.getTipoGarantiaEmpresas();
					
					//tipogarantiaempresaLogic.getNewConnexionToDeep();
					
					//for (TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresasParaReportes) {
					//	tipogarantiaempresaLogic.deepLoad(tipogarantiaempresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipogarantiaempresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileGarantiaCliente = AuxiliarReportes.class.getResourceAsStream("GarantiaClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_garantiacliente", reportFileGarantiaCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGarantiaEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGarantiaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGarantiaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGarantiaEmpresa=new JRBeanArrayDataSource(TipoGarantiaEmpresaJInternalFrame.TraerTipoGarantiaEmpresaBeans(tipogarantiaempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGarantiaEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGarantiaEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGarantiaEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGarantiaEmpresaBean.TraerTipoGarantiaEmpresaBeans(tipogarantiaempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGarantiaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipogarantiaempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGarantiaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantiaEmpresa> tipogarantiaempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantiaEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGarantiaEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGarantiaEmpresa tipogarantiaempresa : tipogarantiaempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGarantiaEmpresaConstantesFunciones.generarExcelReporteDataTipoGarantiaEmpresa("NORMAL",row,workbook,tipogarantiaempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGarantiaEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoGarantiaEmpresaConstantesFunciones.generarExcelReporteHeaderTipoGarantiaEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGarantiaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantiaEmpresa> tipogarantiaempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantiaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGarantiaEmpresa tipogarantiaempresa : tipogarantiaempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.getTipoGarantiaEmpresaDescripcion(tipogarantiaempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantiaempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantiaempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantiaempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipogarantiaempresa.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGarantiaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantiaEmpresa> tipogarantiaempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGarantiaEmpresa> tipogarantiaempresasRespaldo=null;
		
		classes=TipoGarantiaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGarantiaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogarantiaempresaLogic.setDatosCliente(this.datosCliente);
		this.tipogarantiaempresaLogic.setDatosDeep(this.datosDeep);
		this.tipogarantiaempresaLogic.setIsConDeep(true);
		
		tipogarantiaempresasRespaldo=this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas();
		
		this.tipogarantiaempresaLogic.setTipoGarantiaEmpresas(tipogarantiaempresasParaReportes);	
		this.tipogarantiaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogarantiaempresasParaReportes=this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas();
		this.tipogarantiaempresaLogic.setTipoGarantiaEmpresas(tipogarantiaempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantiaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGarantiaEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGarantiaEmpresa tipogarantiaempresa : tipogarantiaempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGarantiaEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGarantiaEmpresaConstantesFunciones.generarExcelReporteDataTipoGarantiaEmpresa("NORMAL",row,workbook,tipogarantiaempresa,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogarantiaempresa.getClientes()!=null && tipogarantiaempresa.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tipogarantiaempresa.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tipogarantiaempresa.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//GarantiaCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogarantiaempresa.getGarantiaClientes()!=null && tipogarantiaempresa.getGarantiaClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GarantiaClienteConstantesFunciones.generarExcelReporteHeaderGarantiaCliente("RELACIONADO",row,workbook);
				}

				if(tipogarantiaempresa.getGarantiaClientes()!=null) {
					i2=0;
					for(GarantiaCliente garantiacliente : tipogarantiaempresa.getGarantiaClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GarantiaClienteConstantesFunciones.generarExcelReporteDataGarantiaCliente("RELACIONADO",row,workbook,garantiacliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.getTipoGarantiaEmpresaDescripcion(tipogarantiaempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGarantiaEmpresa() throws Exception {		
		this.startProcessTipoGarantiaEmpresa(true);
	}
	
	public void startProcessTipoGarantiaEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGarantiaEmpresa ,this.jPanelParametrosReportesTipoGarantiaEmpresa, this.jScrollPanelDatosTipoGarantiaEmpresa,this.jPanelPaginacionTipoGarantiaEmpresa, this.jScrollPanelDatosEdicionTipoGarantiaEmpresa, this.jPanelAccionesTipoGarantiaEmpresa,this.jPanelAccionesFormularioTipoGarantiaEmpresa,this.jmenuBarTipoGarantiaEmpresa,this.jmenuBarDetalleTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGarantiaEmpresa=this.jTabbedPaneBusquedasTipoGarantiaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoGarantiaEmpresa=this.jPanelParametrosReportesTipoGarantiaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoGarantiaEmpresa=this.jScrollPanelDatosTipoGarantiaEmpresa;
		final JTable jTableDatosTipoGarantiaEmpresa=this.jTableDatosTipoGarantiaEmpresa;		
		final JPanel jPanelPaginacionTipoGarantiaEmpresa=this.jPanelPaginacionTipoGarantiaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoGarantiaEmpresa=this.jScrollPanelDatosEdicionTipoGarantiaEmpresa;
		final JPanel jPanelAccionesTipoGarantiaEmpresa=this.jPanelAccionesTipoGarantiaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoGarantiaEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			jPanelCamposAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelCamposTipoGarantiaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelAccionesFormularioTipoGarantiaEmpresa;
		}
		
		final JPanel jPanelCamposTipoGarantiaEmpresa=jPanelCamposAuxiliarTipoGarantiaEmpresa;
		final JPanel jPanelAccionesFormularioTipoGarantiaEmpresa=jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa;
		
		
		final JMenuBar jmenuBarTipoGarantiaEmpresa=this.jmenuBarTipoGarantiaEmpresa;
		final JToolBar jTtoolBarTipoGarantiaEmpresa=this.jTtoolBarTipoGarantiaEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGarantiaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jmenuBarDetalleTipoGarantiaEmpresa;
			jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTtoolBarDetalleTipoGarantiaEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoGarantiaEmpresa=jmenuBarDetalleAuxiliarTipoGarantiaEmpresa;
		final JToolBar jTtoolBarDetalleTipoGarantiaEmpresa=jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGarantiaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGarantiaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoGarantiaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoGarantiaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGarantiaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGarantiaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGarantiaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGarantiaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGarantiaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoGarantiaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGarantiaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGarantiaEmpresa ,jPanelParametrosReportesTipoGarantiaEmpresa,jTableDatosTipoGarantiaEmpresa, /*jScrollPanelDatosTipoGarantiaEmpresa,*/jPanelCamposTipoGarantiaEmpresa,jPanelPaginacionTipoGarantiaEmpresa, /*jScrollPanelDatosEdicionTipoGarantiaEmpresa,*/ jPanelAccionesTipoGarantiaEmpresa,jPanelAccionesFormularioTipoGarantiaEmpresa,jmenuBarTipoGarantiaEmpresa,jmenuBarDetalleTipoGarantiaEmpresa,jTtoolBarTipoGarantiaEmpresa,jTtoolBarDetalleTipoGarantiaEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGarantiaEmpresa ,jPanelParametrosReportesTipoGarantiaEmpresa, jScrollPanelDatosTipoGarantiaEmpresa,jPanelPaginacionTipoGarantiaEmpresa, jScrollPanelDatosEdicionTipoGarantiaEmpresa, jPanelAccionesTipoGarantiaEmpresa,jPanelAccionesFormularioTipoGarantiaEmpresa,jmenuBarTipoGarantiaEmpresa,jmenuBarDetalleTipoGarantiaEmpresa,jTtoolBarTipoGarantiaEmpresa,jTtoolBarDetalleTipoGarantiaEmpresa);
						
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
	
	public void finishProcessTipoGarantiaEmpresa() {// throws Exception 
		this.finishProcessTipoGarantiaEmpresa(true);
	}
	
	public void finishProcessTipoGarantiaEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGarantiaEmpresa ,this.jPanelParametrosReportesTipoGarantiaEmpresa, this.jScrollPanelDatosTipoGarantiaEmpresa,this.jPanelPaginacionTipoGarantiaEmpresa, this.jScrollPanelDatosEdicionTipoGarantiaEmpresa, this.jPanelAccionesTipoGarantiaEmpresa,this.jPanelAccionesFormularioTipoGarantiaEmpresa,this.jmenuBarTipoGarantiaEmpresa,this.jmenuBarDetalleTipoGarantiaEmpresa,this.jTtoolBarTipoGarantiaEmpresa,this.jTtoolBarDetalleTipoGarantiaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGarantiaEmpresa=this.jTabbedPaneBusquedasTipoGarantiaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoGarantiaEmpresa=this.jPanelParametrosReportesTipoGarantiaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoGarantiaEmpresa=this.jScrollPanelDatosTipoGarantiaEmpresa;
		final JTable jTableDatosTipoGarantiaEmpresa=this.jTableDatosTipoGarantiaEmpresa;		
		final JPanel jPanelPaginacionTipoGarantiaEmpresa=this.jPanelPaginacionTipoGarantiaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoGarantiaEmpresa=this.jScrollPanelDatosEdicionTipoGarantiaEmpresa;
		final JPanel jPanelAccionesTipoGarantiaEmpresa=this.jPanelAccionesTipoGarantiaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoGarantiaEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			jPanelCamposAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelCamposTipoGarantiaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelAccionesFormularioTipoGarantiaEmpresa;
		}
		
		final JPanel jPanelCamposTipoGarantiaEmpresa=jPanelCamposAuxiliarTipoGarantiaEmpresa;
		final JPanel jPanelAccionesFormularioTipoGarantiaEmpresa=jPanelAccionesFormularioAuxiliarTipoGarantiaEmpresa;
		
		
		final JMenuBar jmenuBarTipoGarantiaEmpresa=this.jmenuBarTipoGarantiaEmpresa;		
		final JToolBar jTtoolBarTipoGarantiaEmpresa=this.jTtoolBarTipoGarantiaEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGarantiaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jmenuBarDetalleTipoGarantiaEmpresa;
			jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTtoolBarDetalleTipoGarantiaEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGarantiaEmpresa=jmenuBarDetalleAuxiliarTipoGarantiaEmpresa;
		final JToolBar jTtoolBarDetalleTipoGarantiaEmpresa=jTtoolBarDetalleAuxiliarTipoGarantiaEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGarantiaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGarantiaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoGarantiaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoGarantiaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGarantiaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGarantiaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGarantiaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGarantiaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGarantiaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoGarantiaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGarantiaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGarantiaEmpresa ,jPanelParametrosReportesTipoGarantiaEmpresa, jTableDatosTipoGarantiaEmpresa,/*jScrollPanelDatosTipoGarantiaEmpresa,*/jPanelCamposTipoGarantiaEmpresa,jPanelPaginacionTipoGarantiaEmpresa, /*jScrollPanelDatosEdicionTipoGarantiaEmpresa,*/ jPanelAccionesTipoGarantiaEmpresa,jPanelAccionesFormularioTipoGarantiaEmpresa,jmenuBarTipoGarantiaEmpresa,jmenuBarDetalleTipoGarantiaEmpresa,jTtoolBarTipoGarantiaEmpresa,jTtoolBarDetalleTipoGarantiaEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGarantiaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGarantiaEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGarantiaEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGarantiaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGarantiaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGarantiaEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGarantiaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGarantiaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGarantiaEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogarantiaempresaConstantesFunciones.getsFinalQueryTipoGarantiaEmpresa();
		String  finalQueryPaginacionTodos=this.tipogarantiaempresaConstantesFunciones.getsFinalQueryTipoGarantiaEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGarantiaEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoGarantiaEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGarantiaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGarantiaEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGarantiaEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogarantiaempresasEliminados= new ArrayList<TipoGarantiaEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGarantiaEmpresa();
		
				///*TipoGarantiaEmpresaSessionBean*/this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
			
			if(this.tipogarantiaempresaSessionBean==null) {
				this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoGarantiaEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGarantiaEmpresaConstantesFunciones.getClassesForeignKeysOfTipoGarantiaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogarantiaempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogarantiaempresasAux= new ArrayList<TipoGarantiaEmpresa>();
			
				
			tipogarantiaempresaLogic.setDatosCliente(this.datosCliente);
			tipogarantiaempresaLogic.setDatosDeep(this.datosDeep);
			tipogarantiaempresaLogic.setIsConDeep(true);
			
			
			tipogarantiaempresaLogic.getTipoGarantiaEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogarantiaempresaLogic.getTodosTipoGarantiaEmpresas(finalQueryGlobal,pagination);
					
					//tipogarantiaempresaLogic.getTodosTipoGarantiaEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogarantiaempresaLogic.getTipoGarantiaEmpresas()==null|| tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiaempresasAux= new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresasAux.addAll(tipogarantiaempresaLogic.getTipoGarantiaEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresasAux= new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresasAux.addAll(tipogarantiaempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiaempresaLogic.getTodosTipoGarantiaEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipogarantiaempresaLogic.getTodosTipoGarantiaEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresaLogic.getTipoGarantiaEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiaempresaLogic.setTipoGarantiaEmpresas(new ArrayList<TipoGarantiaEmpresa>());					
							tipogarantiaempresaLogic.getTipoGarantiaEmpresas().addAll(tipogarantiaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresas.addAll(tipogarantiaempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGarantiaEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGarantiaEmpresa=this.idActual;
				
				} else if(this.idTipoGarantiaEmpresaActual!=null && this.idTipoGarantiaEmpresaActual!=0L) {
					idTipoGarantiaEmpresa=idTipoGarantiaEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoGarantiaEmpresa);
				
				this.tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogarantiaempresaLogic.getEntity(idTipoGarantiaEmpresa);
					
					//tipogarantiaempresaLogic.getEntityWithConnection(idTipoGarantiaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLogic.setTipoGarantiaEmpresas(new ArrayList<TipoGarantiaEmpresa>());
					tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(tipogarantiaempresaLogic.getTipoGarantiaEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
					this.tipogarantiaempresas.add(tipogarantiaempresa);
				}
				
				if(tipogarantiaempresaLogic.getTipoGarantiaEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaempresaLogic.getTipoGarantiaEmpresas()==null||tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantiaempresas==null|| tipogarantiaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
						tipogarantiaempresasAux.addAll(tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresasAux.addAll(tipogarantiaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantiaEmpresas("BusquedaPorCodigo",tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantiaEmpresas("BusquedaPorCodigo",tipogarantiaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.setTipoGarantiaEmpresas(new ArrayList<TipoGarantiaEmpresa>());
						tipogarantiaempresaLogic.getTipoGarantiaEmpresas().addAll(tipogarantiaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresas.addAll(tipogarantiaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaempresaLogic.getTipoGarantiaEmpresas()==null||tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantiaempresas==null|| tipogarantiaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
						tipogarantiaempresasAux.addAll(tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresasAux.addAll(tipogarantiaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantiaEmpresas("BusquedaPorNombre",tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantiaEmpresas("BusquedaPorNombre",tipogarantiaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.setTipoGarantiaEmpresas(new ArrayList<TipoGarantiaEmpresa>());
						tipogarantiaempresaLogic.getTipoGarantiaEmpresas().addAll(tipogarantiaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresas.addAll(tipogarantiaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaempresaLogic.getTipoGarantiaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaempresaLogic.getTipoGarantiaEmpresas()==null||tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantiaempresas==null|| tipogarantiaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
						tipogarantiaempresasAux.addAll(tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresasAux=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresasAux.addAll(tipogarantiaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaempresaLogic.getTipoGarantiaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantiaEmpresas("FK_IdEmpresa",tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantiaEmpresas("FK_IdEmpresa",tipogarantiaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaLogic.setTipoGarantiaEmpresas(new ArrayList<TipoGarantiaEmpresa>());
						tipogarantiaempresaLogic.getTipoGarantiaEmpresas().addAll(tipogarantiaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
							tipogarantiaempresas.addAll(tipogarantiaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGarantiaEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGarantiaEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantiaempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantiaempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGarantiaEmpresa tipogarantiaempresa) {
		Boolean permite=true;
		
		if(this.tipogarantiaempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGarantiaEmpresaConstantesFunciones.getOrderByListaTipoGarantiaEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGarantiaEmpresaConstantesFunciones.getOrderByListaTipoGarantiaEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				if(tipogarantiaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaempresaTotales=tipogarantiaempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantiaEmpresa tipogarantiaempresa:this.tipogarantiaempresas) {
				if(tipogarantiaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaempresaTotales=tipogarantiaempresa;
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
			this.tipogarantiaempresaAux=new TipoGarantiaEmpresa();
			this.tipogarantiaempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipogarantiaempresaAux.setIsNew(false);
			this.tipogarantiaempresaAux.setIsChanged(false);
			this.tipogarantiaempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGarantiaEmpresaConstantesFunciones.TotalizarValoresFilaTipoGarantiaEmpresa(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this.tipogarantiaempresaAux);
				
				this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(this.tipogarantiaempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGarantiaEmpresaConstantesFunciones.TotalizarValoresFilaTipoGarantiaEmpresa(this.tipogarantiaempresas,this.tipogarantiaempresaAux);
				
				this.tipogarantiaempresas.add(this.tipogarantiaempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogarantiaempresaTotales=new TipoGarantiaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().remove(tipogarantiaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogarantiaempresas.remove(tipogarantiaempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogarantiaempresaTotales=new TipoGarantiaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				if(tipogarantiaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaempresaTotales=tipogarantiaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGarantiaEmpresaConstantesFunciones.TotalizarValoresFilaTipoGarantiaEmpresa(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),tipogarantiaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantiaEmpresa tipogarantiaempresa:this.tipogarantiaempresas) {
				if(tipogarantiaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaempresaTotales=tipogarantiaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGarantiaEmpresaConstantesFunciones.TotalizarValoresFilaTipoGarantiaEmpresa(this.tipogarantiaempresas,tipogarantiaempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGarantiaEmpresasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGarantiaEmpresasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGarantiaEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoGarantiaEmpresasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGarantiaEmpresasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLogic.getTipoGarantiaEmpresasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGarantiaEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLogic.getTipoGarantiaEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoGarantiaEmpresa() {
		this.isPermisoTodoTipoGarantiaEmpresa=false;
		this.isPermisoNuevoTipoGarantiaEmpresa=false;
		this.isPermisoActualizarTipoGarantiaEmpresa=false;
		this.isPermisoActualizarOriginalTipoGarantiaEmpresa=false;
		this.isPermisoEliminarTipoGarantiaEmpresa=false;
		this.isPermisoGuardarCambiosTipoGarantiaEmpresa=false;
		this.isPermisoConsultaTipoGarantiaEmpresa=false;
		this.isPermisoBusquedaTipoGarantiaEmpresa=false;
		this.isPermisoReporteTipoGarantiaEmpresa=false;		
		this.isPermisoOrdenTipoGarantiaEmpresa=false;		
		this.isPermisoPaginacionMedioTipoGarantiaEmpresa=false;		
		this.isPermisoPaginacionAltoTipoGarantiaEmpresa=false;
		this.isPermisoPaginacionTodoTipoGarantiaEmpresa=false;
		this.isPermisoCopiarTipoGarantiaEmpresa=false;		
		this.isPermisoVerFormTipoGarantiaEmpresa=false;		
		this.isPermisoDuplicarTipoGarantiaEmpresa=false;		
		this.isPermisoOrdenTipoGarantiaEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoGarantiaEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoGarantiaEmpresa=isPermiso;
		this.isPermisoNuevoTipoGarantiaEmpresa=isPermiso;
		this.isPermisoActualizarTipoGarantiaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoGarantiaEmpresa=isPermiso;
		this.isPermisoEliminarTipoGarantiaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoGarantiaEmpresa=isPermiso;
		this.isPermisoConsultaTipoGarantiaEmpresa=isPermiso;
		this.isPermisoBusquedaTipoGarantiaEmpresa=isPermiso;
		this.isPermisoReporteTipoGarantiaEmpresa=isPermiso;
		this.isPermisoOrdenTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoCopiarTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoVerFormTipoGarantiaEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoGarantiaEmpresa=isPermiso;
		this.isPermisoOrdenTipoGarantiaEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGarantiaEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoGarantiaEmpresa=isPermiso;
		this.isPermisoNuevoTipoGarantiaEmpresa=isPermiso;
		this.isPermisoActualizarTipoGarantiaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoGarantiaEmpresa=isPermiso;
		this.isPermisoEliminarTipoGarantiaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoGarantiaEmpresa=isPermiso;
		//this.isPermisoConsultaTipoGarantiaEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoGarantiaEmpresa=isPermiso;
		//this.isPermisoReporteTipoGarantiaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoGarantiaEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGarantiaEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGarantiaEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGarantiaEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoGarantiaEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoGarantiaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoGarantiaEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGarantiaEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
		if(TipoGarantiaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoGarantiaEmpresaClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosGarantiaCliente=false;
		this.isTienePermisosGarantiaCliente=this.verificarGetPermisosUsuarioOpcionTipoGarantiaEmpresaClaseRelacionada(this.opcionsRelacionadas,GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGarantiaEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGarantiaEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosGarantiaCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGarantiaEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGarantiaEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGarantiaEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.remove(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosGarantiaCliente && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.remove(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoGarantiaEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGarantiaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGarantiaEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGarantiaEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGarantiaEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGarantiaEmpresa=this.isPermisoActualizarTipoGarantiaEmpresa;
			this.isPermisoEliminarTipoGarantiaEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGarantiaEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGarantiaEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGarantiaEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGarantiaEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGarantiaEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGarantiaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGarantiaEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGarantiaEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGarantiaEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGarantiaEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGarantiaEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGarantiaEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGarantiaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGarantiaEmpresa.setToolTipText(this.jTableDatosTipoGarantiaEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGarantiaEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGarantiaEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGarantiaEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tipogarantiaempresaConstantesFunciones.mostrarClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosGarantiaCliente && this.tipogarantiaempresaConstantesFunciones.mostrarGarantiaClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Garantia Cliente");
			reporte.setsDescripcion("Garantia Cliente");
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
	public void inicializarCombosForeignKeyTipoGarantiaEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGarantiaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGarantiaEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGarantiaEmpresaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoGarantiaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaReturnGeneral=new TipoGarantiaEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipogarantiaempresaConstantesFunciones.cargarid_empresaTipoGarantiaEmpresa)
					 || (this.esRecargarFks && this.tipogarantiaempresaConstantesFunciones.cargarid_empresaTipoGarantiaEmpresa)) {

					if(!this.tipogarantiaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipogarantiaempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.cargarCombosLoteForeignKeyTipoGarantiaEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipogarantiaempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGarantiaEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipogarantiaempresaSessionBean==null) {
				this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
			}

			if(!this.tipogarantiaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoGarantiaEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGarantiaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGarantiaEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantiaEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGarantiaEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantiaEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGarantiaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGarantiaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGarantiaEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGarantiaEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGarantiaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGarantiaEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGarantiaEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGarantiaEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGarantiaEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean(); 
		this.tipogarantiaempresaConstantesFunciones=new TipoGarantiaEmpresaConstantesFunciones(); 
		this.tipogarantiaempresaBean=new TipoGarantiaEmpresa();//(this.tipogarantiaempresaConstantesFunciones); 		
		this.tipogarantiaempresaReturnGeneral=new TipoGarantiaEmpresaParameterReturnGeneral(); 
		
		this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGarantiaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGarantiaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGarantiaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGarantiaEmpresa(true);
			
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
			
			this.tipogarantiaempresaConstantesFunciones=new TipoGarantiaEmpresaConstantesFunciones(); 
			this.tipogarantiaempresaBean=new TipoGarantiaEmpresa();//this.tipogarantiaempresaConstantesFunciones); 			
			this.tipogarantiaempresaReturnGeneral=new TipoGarantiaEmpresaParameterReturnGeneral(); 
		
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Garantia Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogarantiaempresa=new TipoGarantiaEmpresa();
			this.tipogarantiaempresas = new ArrayList<TipoGarantiaEmpresa>();
			this.tipogarantiaempresasAux = new ArrayList<TipoGarantiaEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic=new TipoGarantiaEmpresaLogic();
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogarantiaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogarantiaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGarantiaEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoGarantiaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGarantiaEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGarantiaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGarantiaEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGarantiaEmpresa);
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa);
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGarantiaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGarantiaEmpresa);
					this.jInternalFrameImportacionTipoGarantiaEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoGarantiaEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGarantiaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGarantiaEmpresa);
					this.jInternalFrameOrderByTipoGarantiaEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoGarantiaEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGarantiaEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGarantiaEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogarantiaempresaReturnGeneral=new TipoGarantiaEmpresaParameterReturnGeneral();
			
			this.tipogarantiaempresaParameterGeneral=new TipoGarantiaEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogarantiaempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGarantiaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado(),this.tipogarantiaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGarantiaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado(),this.tipogarantiaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGarantiaEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGarantiaEmpresa(false);
			
			this.setPermisosUsuarioTipoGarantiaEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado() && this.tipogarantiaempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGarantiaEmpresaClasesRelacionadas();
			}
			
			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGarantiaEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGarantiaEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGarantiaEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoGarantiaEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGarantiaEmpresa,this.isPermisoPaginacionMedioTipoGarantiaEmpresa,this.isPermisoPaginacionTodoTipoGarantiaEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGarantiaEmpresaConstantesFunciones.getTiposSeleccionarTipoGarantiaEmpresa());
				
				this.tiposColumnasSelect=TipoGarantiaEmpresaConstantesFunciones.getTiposSeleccionarTipoGarantiaEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoGarantiaEmpresa();				
				//this.tiposRelacionesSelect=TipoGarantiaEmpresaConstantesFunciones.getTiposRelacionesTipoGarantiaEmpresa(true);
				
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
			//if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGarantiaEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGarantiaEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGarantiaEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantiaEmpresa() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.garantiaclienteLogic=new GarantiaClienteLogic(); 
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
				tipogarantiaempresaImplementable= (TipoGarantiaEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGarantiaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogarantiaempresaImplementableHome= (TipoGarantiaEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGarantiaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogarantiaempresas= new ArrayList<TipoGarantiaEmpresa>();
			this.tipogarantiaempresasEliminados= new ArrayList<TipoGarantiaEmpresa>();
						
			this.isEsNuevoTipoGarantiaEmpresa=false;
			this.esParaAccionDesdeFormularioTipoGarantiaEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGarantiaEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGarantiaEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGarantiaEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGarantiaEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGarantiaEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGarantiaEmpresa();
			}
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGarantiaEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGarantiaEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGarantiaEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGarantiaEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGarantiaEmpresa();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Garantia Clientes")) {
					if(!GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGarantiaEmpresa();

						this.cargarParteTabPanelRelacionadaGarantiaCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGarantiaEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaGarantiaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(false,true,iIndex);
		this.jButtonGarantiaClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGarantiaCliente();

		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGarantiaEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("GarantiaCliente")) {
				int row=this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
				jButtonGarantiaClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tipogarantiaempresaConstantesFunciones.mostrarClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tipogarantiaempresaConstantesFunciones.resaltarClienteTipoGarantiaEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogarantiaempresaConstantesFunciones.resaltarClienteTipoGarantiaEmpresa);
						}

						jmenuItem.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarClienteTipoGarantiaEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jmenuDetalleTipoGarantiaEmpresa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Garantia Cliente")) {

					if(this.isTienePermisosGarantiaCliente && this.tipogarantiaempresaConstantesFunciones.mostrarGarantiaClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Garantia Clientes"+"("+GarantiaClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Garantia Clientes");

						if(tipogarantiaempresaConstantesFunciones.resaltarGarantiaClienteTipoGarantiaEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogarantiaempresaConstantesFunciones.resaltarGarantiaClienteTipoGarantiaEmpresa);
						}

						jmenuItem.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarGarantiaClienteTipoGarantiaEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GarantiaCliente"));

						

						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jmenuDetalleTipoGarantiaEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoGarantiaEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGarantiaEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGarantiaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGarantiaEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGarantiaEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoGarantiaEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGarantiaEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGarantiaEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoGarantiaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			
			if(jTableDatosTipoGarantiaEmpresa.getRowCount()>=1) {
				jTableDatosTipoGarantiaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoGarantiaEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGarantiaEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGarantiaEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(true);			
			//this.tipogarantiaempresa=new TipoGarantiaEmpresa();
			//this.tipogarantiaempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa() ;
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantiaEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogarantiaempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);				
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGarantiaEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGarantiaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGarantiaEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGarantiaEmpresa.getSelectedRows().length;			
			}
			
			tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGarantiaEmpresa--;			
				//TipoGarantiaEmpresa tipogarantiaempresaAux= new TipoGarantiaEmpresa();			
				//tipogarantiaempresaAux.setId(this.iIdNuevoTipoGarantiaEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGarantiaEmpresa tipogarantiaempresaOrigen=new TipoGarantiaEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGarantiaEmpresa tipogarantiaempresaOrigen : tipogarantiaempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogarantiaempresaOrigen =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaempresaOrigen =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGarantiaEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogarantiaempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGarantiaEmpresa(tipogarantiaempresaOrigen,this.tipogarantiaempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(this.tipogarantiaempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresas.add(this.tipogarantiaempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
				
				this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGarantiaEmpresa(), this.getIndiceNuevoTipoGarantiaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoGarantiaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGarantiaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGarantiaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();									
		
			TipoGarantiaEmpresa tipogarantiaempresaOrigen=new TipoGarantiaEmpresa();
			TipoGarantiaEmpresa tipogarantiaempresaDestino=new TipoGarantiaEmpresa();
				
			tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGarantiaEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogarantiaempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGarantiaEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaOrigen =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogarantiaempresaOrigen =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaempresaDestino =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogarantiaempresaDestino =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogarantiaempresaOrigen =tipogarantiaempresasSeleccionados.get(0);
				tipogarantiaempresaDestino =tipogarantiaempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGarantiaEmpresa(tipogarantiaempresaOrigen,tipogarantiaempresaDestino,true,false);
				
				tipogarantiaempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogarantiaempresaDestino,tipogarantiaempresaLogic.getTipoGarantiaEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaempresaDestino,tipogarantiaempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
				
				//this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGarantiaEmpresa(), this.getIndiceNuevoTipoGarantiaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoGarantiaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGarantiaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGarantiaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGarantiaEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoGarantiaEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGarantiaEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGarantiaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGarantiaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGarantiaEmpresa();
			
			this.abrirFrameOrderByTipoGarantiaEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGarantiaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGarantiaEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGarantiaEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSize(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGarantiaEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGarantiaEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth(),TipoGarantiaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth(),TipoGarantiaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth(),TipoGarantiaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGarantiaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGarantiaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGarantiaEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGarantiaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantiaEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoGarantiaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantiaEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGarantiaEmpresa);
				this.jInternalFrameOrderByTipoGarantiaEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoGarantiaEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoGarantiaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGarantiaEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGarantiaEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGarantiaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGarantiaEmpresa==null) {
				
				this.jInternalFrameImportacionTipoGarantiaEmpresa=new ImportacionJInternalFrame(TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGarantiaEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGarantiaEmpresa);
				this.jInternalFrameImportacionTipoGarantiaEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoGarantiaEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGarantiaEmpresa"));
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGarantiaEmpresa"));
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGarantiaEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGarantiaEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa=new ReporteDinamicoJInternalFrame(TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa);
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantiaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantiaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantiaEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantiaEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaGarantiaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jContentPaneDetalleTipoGarantiaEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoGarantiaEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGarantiaEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoGarantiaEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGarantiaEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGarantiaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGarantiaEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoGarantiaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGarantiaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoGarantiaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGarantiaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGarantiaEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoGarantiaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGarantiaEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGarantiaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGarantiaEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoGarantiaEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGarantiaEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGarantiaEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(true);
			//this.isEsNuevoTipoGarantiaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false) ;
			
			if(tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado() && GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGarantiaClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantiaEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGarantiaEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGarantiaEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(true);
			//this.isEsNuevoTipoGarantiaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogarantiaempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false) ;
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantiaEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGarantiaEmpresa(false);
			
			//if(!this.isEsNuevoTipoGarantiaEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipogarantiaempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGarantiaEmpresa=true;
					this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
					this.isEsNuevoTipoGarantiaEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGarantiaEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGarantiaEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(false);
			
												
				
				if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGarantiaEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,tipogarantiaempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGarantiaEmpresa(this.tipogarantiaempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogarantiaempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogarantiaempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipogarantiaempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipogarantiaempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogarantiaempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGarantiaEmpresaModel) this.jTableDatosTipoGarantiaEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGarantiaEmpresa=true;
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
				this.isEsNuevoTipoGarantiaEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(false);
				
				
				
				if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGarantiaEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGarantiaEmpresa.getRowCount()>=1) {
				jTableDatosTipoGarantiaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoGarantiaEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGarantiaEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(false) ;
			
			this.isEsNuevoTipoGarantiaEmpresa=false;
			
			if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGarantiaEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				
				//SI ES MANUAL
				if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGarantiaEmpresa--;			
			//TipoGarantiaEmpresa tipogarantiaempresaAux= new TipoGarantiaEmpresa();			
			//tipogarantiaempresaAux.setId(this.iIdNuevoTipoGarantiaEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGarantiaEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
			
			this.tipogarantiaempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().add(this.tipogarantiaempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogarantiaempresas.add(this.tipogarantiaempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			
			this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoGarantiaEmpresa(), this.getIndiceNuevoTipoGarantiaEmpresa());
			
			int iLastRow =  this.jTableDatosTipoGarantiaEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGarantiaEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGarantiaEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();
			}
			
			//this.abrirFrameTreeTipoGarantiaEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Garantia EmpresaS ?", "MANTENIMIENTO DE Tipo Garantia Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGarantiaEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGarantiaEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.procesarImportacionTipoGarantiaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogarantiaempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGarantiaEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGarantiaEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGarantiaEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoGarantiaEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGarantiaEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGarantiaEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		

		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGarantiaEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGarantiaEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGarantiaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantiaempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantiaempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantiaempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(TipoGarantiaEmpresa tipogarantiaempresa:tipogarantiaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantiaempresa.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelTipoGarantiaEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGarantiaEmpresa(tipogarantiaempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGarantiaEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGarantiaEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGarantiaEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGarantiaEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGarantiaEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGarantiaEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGarantiaEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGarantiaEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGarantiaEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGarantiaEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGarantiaEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGarantiaEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGarantiaEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantiaEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGarantiaEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGarantiaEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGarantiaEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGarantiaEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantiaEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantiaEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantiaEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGarantiaEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionNuevoTipoGarantiaEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionSinCerrarTipoGarantiaEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxPostAccionSinMensajeTipoGarantiaEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGarantiaEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantiaEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantiaEmpresa() throws Exception {
		try	{
			if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGarantiaEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGarantiaEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGarantiaEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGarantiaEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGarantiaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGarantiaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGarantiaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGarantiaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantiaEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantiaEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGarantiaEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoGarantiaEmpresa.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoGarantiaEmpresa.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGarantiaEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGarantiaEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGarantiaEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGarantiaEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGarantiaEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGarantiaEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogarantiaempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGarantiaEmpresa.setModel(new TipoGarantiaEmpresaModel(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGarantiaEmpresa.setModel(new TipoGarantiaEmpresaModel(this.tipogarantiaempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGarantiaEmpresa!=null && this.jInternalFrameOrderByTipoGarantiaEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGarantiaEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipogarantiaempresaConstantesFunciones.resaltarSeleccionarTipoGarantiaEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGarantiaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipogarantiaempresaConstantesFunciones.resaltarSeleccionarTipoGarantiaEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,TipoGarantiaEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipogarantiaempresaConstantesFunciones.mostraridTipoGarantiaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogarantiaempresaConstantesFunciones.resaltaridTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activaridTipoGarantiaEmpresa,this,true,"idTipoGarantiaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaempresaConstantesFunciones.resaltaridTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activaridTipoGarantiaEmpresa,this,true,"idTipoGarantiaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipogarantiaempresaConstantesFunciones.mostrarid_empresaTipoGarantiaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipogarantiaempresaConstantesFunciones.resaltarid_empresaTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarid_empresaTipoGarantiaEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipogarantiaempresaConstantesFunciones.resaltarid_empresaTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarid_empresaTipoGarantiaEmpresa,false,"id_empresaTipoGarantiaEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipogarantiaempresaConstantesFunciones.mostrarcodigoTipoGarantiaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogarantiaempresaConstantesFunciones.resaltarcodigoTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activarcodigoTipoGarantiaEmpresa,this,true,"codigoTipoGarantiaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaempresaConstantesFunciones.resaltarcodigoTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activarcodigoTipoGarantiaEmpresa,this,true,"codigoTipoGarantiaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogarantiaempresaConstantesFunciones.mostrarnombreTipoGarantiaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogarantiaempresaConstantesFunciones.resaltarnombreTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activarnombreTipoGarantiaEmpresa,this,true,"nombreTipoGarantiaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaempresaConstantesFunciones.resaltarnombreTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activarnombreTipoGarantiaEmpresa,this,true,"nombreTipoGarantiaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO));

		if(this.tipogarantiaempresaConstantesFunciones.mostrares_defectoTipoGarantiaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipogarantiaempresaConstantesFunciones.resaltares_defectoTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activares_defectoTipoGarantiaEmpresa));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipogarantiaempresaConstantesFunciones.resaltares_defectoTipoGarantiaEmpresa,this.tipogarantiaempresaConstantesFunciones.activares_defectoTipoGarantiaEmpresa,this,true,"es_defectoTipoGarantiaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoGarantiaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tipogarantiaempresaConstantesFunciones.mostrarClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tipogarantiaempresaConstantesFunciones.resaltarClienteTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarClienteTipoGarantiaEmpresa));
				tableColumn.setCellEditor(new ClienteTableCell(tipogarantiaempresaConstantesFunciones.resaltarClienteTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarClienteTipoGarantiaEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
			}

			if(this.isTienePermisosGarantiaCliente && this.tipogarantiaempresaConstantesFunciones.mostrarGarantiaClienteTipoGarantiaEmpresa && !TipoGarantiaEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Garantia Clientes");
				tableColumn.setHeaderValue("Garantia Clientes");
				tableColumn.setCellRenderer(new GarantiaClienteTableCell(tipogarantiaempresaConstantesFunciones.resaltarGarantiaClienteTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarGarantiaClienteTipoGarantiaEmpresa));
				tableColumn.setCellEditor(new GarantiaClienteTableCell(tipogarantiaempresaConstantesFunciones.resaltarGarantiaClienteTipoGarantiaEmpresa,this,this.tipogarantiaempresaConstantesFunciones.activarGarantiaClienteTipoGarantiaEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGarantiaEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGarantiaEmpresa.moveColumn(this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGarantiaEmpresa.moveColumn(this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoGarantiaEmpresa.moveColumn(this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGarantiaEmpresa.moveColumn(this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGarantiaEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGarantiaEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGarantiaEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGarantiaEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGarantiaEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGarantiaEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogarantiaempresaLogic.getTipoGarantiaEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogarantiaempresas.size()-1;
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
		//this.jTableDatosTipoGarantiaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGarantiaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGarantiaEmpresa();
			
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
				
				//this.isEsNuevoTipoGarantiaEmpresa=false;
					
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
				if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGarantiaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogarantiaempresa.getsType().equals("DUPLICADO")
				   || this.tipogarantiaempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGarantiaEmpresa=true;
				
				} else {
					this.isEsNuevoTipoGarantiaEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogarantiaempresa.getId()>=0 && !this.tipogarantiaempresa.getIsNew()) {						
						this.isEsNuevoTipoGarantiaEmpresa=false;
						
					} else {
						this.isEsNuevoTipoGarantiaEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGarantiaEmpresa(esRelaciones);						
				
				this.seleccionarTipoGarantiaEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogarantiaempresa.getId()<0) {
					this.isEsNuevoTipoGarantiaEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGarantiaEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGarantiaEmpresa(evt,rowIndex);
				}	
				
				if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGarantiaEmpresa: " + this.dDif); 
					}
				}								
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGarantiaEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogarantiaempresa)) {
					if(this.tipogarantiaempresa.getId()>0) {
						this.tipogarantiaempresa.setIsDeleted(true);
						
						this.tipogarantiaempresasEliminados.add(this.tipogarantiaempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().remove(this.tipogarantiaempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresas.remove(this.tipogarantiaempresa);				
					}
					
					
					((TipoGarantiaEmpresaModel) this.jTableDatosTipoGarantiaEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGarantiaEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGarantiaEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGarantiaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipogarantiaempresaConstantesFunciones.cargarid_empresaTipoGarantiaEmpresa || this.tipogarantiaempresaConstantesFunciones.event_dependid_empresaTipoGarantiaEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipogarantiaempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipogarantiaempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipogarantiaempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipogarantiaempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGarantiaEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGarantiaEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGarantiaEmpresa(tipogarantiaempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(tipogarantiaempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGarantiaEmpresa(tipogarantiaempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantiaEmpresa(tipogarantiaempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setText(tipogarantiaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setText(tipogarantiaempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setText(tipogarantiaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setSelected(tipogarantiaempresa.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGarantiaEmpresa tipogarantiaempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogarantiaempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGarantiaEmpresa tipogarantiaempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogarantiaempresaLocal=this.tipogarantiaempresa;
			} else {
				tipogarantiaempresaLocal=this.tipogarantiaempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogarantiaempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGarantiaEmpresa(tipogarantiaempresaLocal,true);
					
					if(tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogarantiaempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogarantiaempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(tipogarantiaempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(tipogarantiaempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(tipogarantiaempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setText("0");
			}

			if(conColumnasBase) {tipogarantiaempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelIdTipoGarantiaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogarantiaempresa.setcodigo(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelcodigoTipoGarantiaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogarantiaempresa.setnombre(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelnombreTipoGarantiaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogarantiaempresa.setes_defecto(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabeles_defectoTipoGarantiaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresaBean,TipoGarantiaEmpresa tipogarantiaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresaOrigen,TipoGarantiaEmpresa tipogarantiaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogarantiaempresaOrigen.getId()!=null && !tipogarantiaempresaOrigen.getId().equals(0L))) {tipogarantiaempresa.setId(tipogarantiaempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipogarantiaempresaOrigen.getcodigo()!=null && !tipogarantiaempresaOrigen.getcodigo().equals(""))) {tipogarantiaempresa.setcodigo(tipogarantiaempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipogarantiaempresaOrigen.getnombre()!=null && !tipogarantiaempresaOrigen.getnombre().equals(""))) {tipogarantiaempresa.setnombre(tipogarantiaempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipogarantiaempresaOrigen.getes_defecto()!=null && !tipogarantiaempresaOrigen.getes_defecto().equals(false))) {tipogarantiaempresa.setes_defecto(tipogarantiaempresaOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setText(tipogarantiaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setText(tipogarantiaempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setText(tipogarantiaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setSelected(tipogarantiaempresa.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGarantiaEmpresa(TipoGarantiaEmpresaBean tipogarantiaempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setText(tipogarantiaempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setText(tipogarantiaempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setText(tipogarantiaempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setSelected(tipogarantiaempresaBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGarantiaEmpresa(TipoGarantiaEmpresaParameterReturnGeneral tipogarantiaempresaReturnGeneral,TipoGarantiaEmpresaBean tipogarantiaempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoGarantiaEmpresa tipogarantiaempresaLocal=new TipoGarantiaEmpresa();
			
			tipogarantiaempresaLocal=tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogarantiaempresaLocal.getId()!=null && !tipogarantiaempresaLocal.getId().equals(0L))) {tipogarantiaempresaBean.setId(tipogarantiaempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipogarantiaempresaLocal.getcodigo()!=null && !tipogarantiaempresaLocal.getcodigo().equals(""))) {tipogarantiaempresaBean.setcodigo(tipogarantiaempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipogarantiaempresaLocal.getnombre()!=null && !tipogarantiaempresaLocal.getnombre().equals(""))) {tipogarantiaempresaBean.setnombre(tipogarantiaempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipogarantiaempresaLocal.getes_defecto()!=null && !tipogarantiaempresaLocal.getes_defecto().equals(false))) {tipogarantiaempresaBean.setes_defecto(tipogarantiaempresaLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGarantiaEmpresaGenerico(Long idTipoGarantiaEmpresaSeleccionado,JComboBox jComboBoxTipoGarantiaEmpresa,List<TipoGarantiaEmpresa> tipogarantiaempresasLocal)throws Exception {
		try {
			TipoGarantiaEmpresa  tipogarantiaempresaTemp=null;

			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasLocal) {
				if(tipogarantiaempresaAux.getId()!=null && tipogarantiaempresaAux.getId().equals(idTipoGarantiaEmpresaSeleccionado)) {
					tipogarantiaempresaTemp=tipogarantiaempresaAux;
					break;
				}
			}

			jComboBoxTipoGarantiaEmpresa.setSelectedItem(tipogarantiaempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGarantiaEmpresaGenerico(JComboBox jComboBoxTipoGarantiaEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGarantiaEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGarantiaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGarantiaEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGarantiaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGarantiaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGarantiaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("GarantiaCliente")) {
			jButtonGarantiaClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantiaempresa=(TipoGarantiaEmpresa) tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogarantiaempresa =(TipoGarantiaEmpresa) tipogarantiaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipogarantiaempresa.getIsNew() && !tipogarantiaempresa.getIsChanged() && !tipogarantiaempresa.getIsDeleted()) {
				sDescripcion=tipogarantiaempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipogarantiaempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGarantiaEmpresa tipogarantiaempresaRow=new TipoGarantiaEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantiaempresaRow=(TipoGarantiaEmpresa) tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogarantiaempresaRow=(TipoGarantiaEmpresa) tipogarantiaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGarantiaEmpresa tipogarantiaempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa = (TipoGarantiaEmpresa)this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogarantiaempresa = (TipoGarantiaEmpresa)this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogarantiaempresa!=null) {
						this.tipogarantiaempresa = tipogarantiaempresa;
					} else {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tipogarantiaempresa)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame;
					}

					List<TipoGarantiaEmpresa> tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
					tipogarantiaempresas.add(this.tipogarantiaempresa);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.cargarClienteBeanSwingJInternalFrame(tipogarantiaempresas,this.tipogarantiaempresa,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGarantiaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoGarantiaEmpresa.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoGarantiaEmpresa.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonGarantiaClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGarantiaEmpresa tipogarantiaempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa = (TipoGarantiaEmpresa)this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogarantiaempresa = (TipoGarantiaEmpresa)this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogarantiaempresa!=null) {
						this.tipogarantiaempresa = tipogarantiaempresa;
					} else {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}
				}

				if(this.isTienePermisosGarantiaCliente && this.permiteMantenimiento(this.tipogarantiaempresa)) {
					GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup=new GarantiaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						garantiaclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup;
					} else {
						garantiaclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame;
					}

					List<TipoGarantiaEmpresa> tipogarantiaempresas=new ArrayList<TipoGarantiaEmpresa>();
					tipogarantiaempresas.add(this.tipogarantiaempresa);
					if(!esRelacionado) {
						//garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setConGuardarRelaciones(false);
						//garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					garantiaclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.cargarGarantiaClienteBeanSwingJInternalFrame(tipogarantiaempresas,this.tipogarantiaempresa,garantiaclienteBeanSwingJInternalFrame,/*conInicializar,*/garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getConGuardarRelaciones(),garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado());
					garantiaclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("no_relacionado");

						garantiaclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GarantiaClienteConstantesFunciones.ITAMANIOFILATABLA + (GarantiaClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						garantiaclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGarantiaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoGarantiaEmpresa.getBorder();
						TitledBorder titledBorderGarantiaCliente=(TitledBorder)garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.getBorder();

						titledBorderGarantiaCliente.setTitle(titledBorderTipoGarantiaEmpresa.getTitle() + " -> Garantia Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,garantiaclienteBeanSwingJInternalFrame);
						}

						garantiaclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(garantiaclienteBeanSwingJInternalFrame);

						garantiaclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Garantia Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));			
			this.jButtonDuplicarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa && this.isPermisoDuplicarTipoGarantiaEmpresa));			
			this.jButtonCopiarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa && this.isPermisoCopiarTipoGarantiaEmpresa));
			this.jButtonVerFormTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa && this.isPermisoVerFormTipoGarantiaEmpresa));
			
			this.jButtonAbrirOrderByTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));			
			
			this.jButtonNuevoRelacionesTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGarantiaEmpresa && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa && this.isPermisoEliminarTipoGarantiaEmpresa));
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa);							
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));						
			this.jButtonDuplicarToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa && this.isPermisoDuplicarTipoGarantiaEmpresa));						
			this.jButtonCopiarToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa && this.isPermisoCopiarTipoGarantiaEmpresa));			
			this.jButtonVerFormToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa && this.isPermisoVerFormTipoGarantiaEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGarantiaEmpresa && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa  && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa && this.isPermisoEliminarTipoGarantiaEmpresa));
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarToolBarTipoGarantiaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa);				
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));			
			this.jMenuItemDuplicarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa && this.isPermisoDuplicarTipoGarantiaEmpresa));			
			this.jMenuItemCopiarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa && this.isPermisoCopiarTipoGarantiaEmpresa));			
			this.jMenuItemVerFormTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa && this.isPermisoVerFormTipoGarantiaEmpresa));			
			this.jMenuItemAbrirOrderByTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));			
			//this.jMenuItemMostrarOcultarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa && this.isPermisoOrdenTipoGarantiaEmpresa));			
			this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa && this.isPermisoNuevoTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemModificarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoGarantiaEmpresa && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemActualizarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa && this.isPermisoActualizarTipoGarantiaEmpresa));	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemEliminarTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa && this.isPermisoEliminarTipoGarantiaEmpresa));
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemCancelarTipoGarantiaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=this.jButtonNuevoTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa=this.jButtonDuplicarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa=this.jButtonCopiarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa=this.jButtonVerFormTipoGarantiaEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGarantiaEmpresa=this.jButtonAbrirOrderByTipoGarantiaEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=this.jButtonNuevoRelacionesTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=this.jButtonModificarTipoGarantiaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=this.jButtonNuevoToolBarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarToolBarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarToolBarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarToolBarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarToolBarTipoGarantiaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=this.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=this.jMenuItemNuevoTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemModificarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemActualizarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemEliminarTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemCancelarTipoGarantiaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGarantiaEmpresa(Boolean esInicializar) {
		if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGarantiaEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGarantiaEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGarantiaEmpresa() {
		this.jButtonNuevoTipoGarantiaEmpresa.setVisible(this.isPermisoNuevoTipoGarantiaEmpresa);			
		this.jButtonDuplicarTipoGarantiaEmpresa.setVisible(this.isPermisoDuplicarTipoGarantiaEmpresa);			
		this.jButtonCopiarTipoGarantiaEmpresa.setVisible(this.isPermisoCopiarTipoGarantiaEmpresa);			
		this.jButtonVerFormTipoGarantiaEmpresa.setVisible(this.isPermisoVerFormTipoGarantiaEmpresa);			
		
		this.jButtonAbrirOrderByTipoGarantiaEmpresa.setVisible(this.isPermisoOrdenTipoGarantiaEmpresa);					
		
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.setVisible(this.isPermisoNuevoTipoGarantiaEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarTipoGarantiaEmpresa.setVisible(this.isPermisoActualizarTipoGarantiaEmpresa);	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.setVisible(this.isPermisoActualizarTipoGarantiaEmpresa);	
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.setVisible(this.isPermisoEliminarTipoGarantiaEmpresa);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa);						
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.setVisible(this.isPermisoGuardarCambiosTipoGarantiaEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.setVisible(this.isPermisoActualizarTipoGarantiaEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGarantiaEmpresa() {
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarTipoGarantiaEmpresa.setVisible(this.isPermisoActualizarTipoGarantiaEmpresa);	
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.setVisible(this.isPermisoActualizarTipoGarantiaEmpresa);	
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.setVisible(this.isPermisoEliminarTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa);							
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa && this.isPermisoGuardarCambiosTipoGarantiaEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGarantiaEmpresa() {
		if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGarantiaEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGarantiaEmpresa() {
	}
	
	public void jTableDatosTipoGarantiaEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGarantiaEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGarantiaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantiaempresa==null) {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}

				if(this.tipogarantiaempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogarantiaempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoGarantiaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoGarantiaEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGarantiaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGarantiaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipogarantiaempresaLogic.getConnexion());

				if(this.tipogarantiaempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipogarantiaempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGarantiaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoGarantiaEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoGarantiaEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoGarantiaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantiaempresa==null) {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}

				if(this.tipogarantiaempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipogarantiaempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGarantiaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantiaempresa==null) {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}

				if(this.tipogarantiaempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipogarantiaempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGarantiaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantiaempresa==null) {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}

				if(this.tipogarantiaempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogarantiaempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoTipoGarantiaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.gettipogarantiaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantiaempresa==null) {
						this.tipogarantiaempresa = new TipoGarantiaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);
				}

				if(this.tipogarantiaempresa.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.tipogarantiaempresa.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);

			this.getTipoGarantiaEmpresasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);

			//if(TipoGarantiaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);

			this.getTipoGarantiaEmpresasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);

			//if(TipoGarantiaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoGarantiaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);

			this.getTipoGarantiaEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);

			//if(TipoGarantiaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGarantiaEmpresa() {
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoGarantiaEmpresa!=null) {
			this.jInternalFrameImportacionTipoGarantiaEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGarantiaEmpresa.dispose();
			this.jInternalFrameImportacionTipoGarantiaEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGarantiaEmpresa();
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGarantiaEmpresa")) {
				jButtonDuplicarTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGarantiaEmpresa")) {
				jButtonCopiarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGarantiaEmpresa")) {
				jButtonVerFormTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGarantiaEmpresa")) {
				jButtonDuplicarTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGarantiaEmpresa")) {
				jButtonDuplicarTipoGarantiaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGarantiaEmpresa")) {
				jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGarantiaEmpresa")) {
				jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGarantiaEmpresa")) {
				jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGarantiaEmpresa")) {
				jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGarantiaEmpresa")) {
				jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGarantiaEmpresa")) {
				jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGarantiaEmpresa")) {
				jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGarantiaEmpresa")) {
				jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGarantiaEmpresa")) {
				jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGarantiaEmpresa")) {
				jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGarantiaEmpresa")) {
				jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGarantiaEmpresa")) {
				jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGarantiaEmpresa")) {
				jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGarantiaEmpresa")) {
				jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGarantiaEmpresa")) {
				jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGarantiaEmpresa")) {
				jButtonMostrarOcultarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGarantiaEmpresa")) {
				jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGarantiaEmpresa")) {
				jButtonCopiarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGarantiaEmpresa")) {
				jButtonVerFormTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGarantiaEmpresa")) {
				jButtonCopiarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGarantiaEmpresa")) {
				jButtonVerFormTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGarantiaEmpresa")) {
				jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGarantiaEmpresa")) {
				jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGarantiaEmpresa")) {
				jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGarantiaEmpresa")) {
				jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGarantiaEmpresa")) {
				jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGarantiaEmpresa")) {
				jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGarantiaEmpresa")) {
				jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGarantiaEmpresa")) {
				jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGarantiaEmpresa")) {
				jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGarantiaEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGarantiaEmpresa")) {
				jButtonAbrirOrderByTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGarantiaEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGarantiaEmpresa")) {
				jButtonMostrarOcultarTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGarantiaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGarantiaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGarantiaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGarantiaEmpresa")) {
				jButtonCerrarReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGarantiaEmpresa")) {
				jButtonGenerarReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGarantiaEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGarantiaEmpresa")) {
				jButtonCerrarImportacionTipoGarantiaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGarantiaEmpresa")) {
				
				jButtonGenerarImportacionTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGarantiaEmpresa")) {
				
				jButtonAbrirImportacionTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGarantiaEmpresa")) {
				jComboBoxTiposAccionesTipoGarantiaEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGarantiaEmpresa")) {
				jComboBoxTiposRelacionesTipoGarantiaEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGarantiaEmpresa")) {
				jComboBoxTiposAccionesTipoGarantiaEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGarantiaEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoGarantiaEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGarantiaEmpresa")) {
				jTextFieldValorCampoGeneralTipoGarantiaEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGarantiaEmpresa")) {
				jButtonAbrirOrderByTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGarantiaEmpresa")) {
				jButtonAbrirOrderByTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGarantiaEmpresa")) {
				jButtonCerrarOrderByTipoGarantiaEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGarantiaEmpresaBusqueda")) {
				this.jButtonidTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoGarantiaEmpresaUpdate")) {
				this.jButtonid_empresaTipoGarantiaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoGarantiaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGarantiaEmpresaBusqueda")) {
				this.jButtoncodigoTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGarantiaEmpresaBusqueda")) {
				this.jButtonnombreTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoGarantiaEmpresaBusqueda")) {
				this.jButtones_defectoTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoGarantiaEmpresa")) {
				this.jButtonBusquedaPorCodigoTipoGarantiaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoGarantiaEmpresa")) {
				this.jButtonBusquedaPorNombreTipoGarantiaEmpresaActionPerformed(evt);
			}
			
			;
			
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGarantiaEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGarantiaEmpresa tipogarantiaempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogarantiaempresaLocal=this.tipogarantiaempresa;
			} else {
				tipogarantiaempresaLocal=this.tipogarantiaempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
							
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
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
			
			


			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
								
						
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
								
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
							
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
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
			
			


			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
								
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGarantiaEmpresa")) {
					jCheckBoxSeleccionarTodosTipoGarantiaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGarantiaEmpresa")) {
					jCheckBoxSeleccionadosTipoGarantiaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGarantiaEmpresa")) {
					
				}
				
				


				
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
												
				
				


				
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
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
			
			


			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantiaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantiaempresa);
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
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
				
				


				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantiaEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantiaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaempresaAnterior =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGarantiaEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGarantiaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGarantiaEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogarantiaempresa =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogarantiaempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGarantiaEmpresa")) {
				
				}
				
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGarantiaEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGarantiaEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGarantiaEmpresa")) {
			
			}
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGarantiaEmpresa();
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGarantiaEmpresa")) {
				jButtonDuplicarTipoGarantiaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGarantiaEmpresa")) {
				jButtonCopiarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGarantiaEmpresa")) {
				jButtonVerFormTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGarantiaEmpresa")) {
				jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGarantiaEmpresa")) {
				jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGarantiaEmpresa")) {
				jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGarantiaEmpresa")) {
				jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGarantiaEmpresa")) {
				jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGarantiaEmpresa")) {
				jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGarantiaEmpresa")) {
				jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGarantiaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGarantiaEmpresa")) {
				jButtonAbrirOrderByTipoGarantiaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGarantiaEmpresa")) {
				jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGarantiaEmpresa")) {
				jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGarantiaEmpresa")) {
				jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGarantiaEmpresaBusqueda")) {
				this.jButtonidTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoGarantiaEmpresaUpdate")) {
				this.jButtonid_empresaTipoGarantiaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoGarantiaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGarantiaEmpresaBusqueda")) {
				this.jButtoncodigoTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGarantiaEmpresaBusqueda")) {
				this.jButtonnombreTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoTipoGarantiaEmpresaBusqueda")) {
				this.jButtones_defectoTipoGarantiaEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGarantiaEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGarantiaEmpresa")) {
				closingInternalFrameTipoGarantiaEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoGarantiaEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGarantiaEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGarantiaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoGarantiaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGarantiaEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGarantiaEmpresaActionPerformed(null);
			}
			
			TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogarantiaempresa,new Object(),this.tipogarantiaempresaParameterGeneral,this.tipogarantiaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGarantiaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGarantiaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGarantiaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogarantiaempresa)) {
			if(!esControlTabla) {
				if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);			
				}
				
				if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.procesarEventosTipoGarantiaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this.tipogarantiaempresa,this.tipogarantiaempresaParameterGeneral,this.isEsNuevoTipoGarantiaEmpresa,classes);//this.tipogarantiaempresaLogic.getTipoGarantiaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral,this.tipogarantiaempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGarantiaEmpresa(classes,this.tipogarantiaempresaReturnGeneral,this.tipogarantiaempresaBean,false);
					}
						
					if(this.tipogarantiaempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa());	
					}
						
					if(this.tipogarantiaempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa(),classes);//this.tipogarantiaempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGarantiaEmpresa(this.tipogarantiaempresa,classes);//this.tipogarantiaempresaBean);									
				}
			
				if(TipoGarantiaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGarantiaEmpresa(this.tipogarantiaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantiaEmpresa(this.tipogarantiaempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogarantiaempresaAnterior!=null) {
						this.tipogarantiaempresa=this.tipogarantiaempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.procesarEventosTipoGarantiaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this.tipogarantiaempresa,this.tipogarantiaempresaParameterGeneral,this.isEsNuevoTipoGarantiaEmpresa,classes);//this.tipogarantiaempresaLogic.getTipoGarantiaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogarantiaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa(),tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa(),this.tipogarantiaempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGarantiaEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGarantiaEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGarantiaEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGarantiaEmpresa() throws Exception {
		
		TipoGarantiaEmpresaModel tipogarantiaempresaModel=(TipoGarantiaEmpresaModel)this.jTableDatosTipoGarantiaEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantiaempresaModel.tipogarantiaempresas=this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogarantiaempresaModel.tipogarantiaempresas=this.tipogarantiaempresas;
		}
		
		
		((TipoGarantiaEmpresaModel) this.jTableDatosTipoGarantiaEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGarantiaEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogarantiaempresaAnterior(),this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogarantiaempresaAnterior(),this.tipogarantiaempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGarantiaEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipogarantiaempresa.getClientes());
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(tipogarantiaempresa.getGarantiaClientes());
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaempresa,new Object(),generalEntityParameterGeneral,this.tipogarantiaempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGarantiaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoGarantiaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGarantiaEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGarantiaEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGarantiaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaempresa,new Object(),generalEntityParameterGeneral,this.tipogarantiaempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGarantiaEmpresa(TipoGarantiaEmpresaBean tipogarantiaempresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipogarantiaempresa.getClientes());
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(tipogarantiaempresa.getGarantiaClientes());
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGarantiaEmpresa(ArrayList<Classe> classes,TipoGarantiaEmpresaReturnGeneral tipogarantiaempresaReturnGeneral,TipoGarantiaEmpresaBean tipogarantiaempresaBean,Boolean conDefault) throws Exception {
		
			this.tipogarantiaempresaBean.setClientes(tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa().getClientes());
			this.tipogarantiaempresaBean.setGarantiaClientes(tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa().getGarantiaClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tipogarantiaempresa.setClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					tipogarantiaempresa.setGarantiaClientes(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipogarantiaempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa = new TipoGarantiaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipogarantiaempresaSessionBean.getConGuardarRelaciones(),this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.tipogarantiaempresaLogic=this.tipogarantiaempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoGarantiaEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGarantiaEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGarantiaEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGarantiaEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGarantiaEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGarantiaEmpresa"));
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoGarantiaEmpresa"));

		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGarantiaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemModificarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGarantiaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoGarantiaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGarantiaEmpresa"));
						
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemActualizarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGarantiaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoGarantiaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGarantiaEmpresa"));
								
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemEliminarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGarantiaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoGarantiaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGarantiaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemCancelarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGarantiaEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemDetalleCerrarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGarantiaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantiaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantiaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGarantiaEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonidTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtoncodigoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonnombreTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtones_defectoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoGarantiaEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGarantiaEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGarantiaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGarantiaEmpresa"));
		}
		
		this.jTableDatosTipoGarantiaEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGarantiaEmpresa"));
		
		this.jTableDatosTipoGarantiaEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGarantiaEmpresa"));
		
		this.jButtonNuevoTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoGarantiaEmpresa"));
		
		this.jButtonDuplicarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoGarantiaEmpresa"));
		
		this.jButtonCopiarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoGarantiaEmpresa"));
		
		this.jButtonVerFormTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoGarantiaEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGarantiaEmpresa"));
			
		this.jButtonDuplicarToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemNuevoTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGarantiaEmpresa"));
			
		this.jMenuItemDuplicarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGarantiaEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGarantiaEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGarantiaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoGarantiaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonModificarToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGarantiaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemModificarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGarantiaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoGarantiaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonActualizarToolBarTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGarantiaEmpresa"));
				
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemActualizarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGarantiaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoGarantiaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonEliminarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGarantiaEmpresa"));
						
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemEliminarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGarantiaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoGarantiaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonCancelarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGarantiaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemCancelarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGarantiaEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGarantiaEmpresa"));		
		
		
		this.jButtonCerrarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoGarantiaEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemCerrarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGarantiaEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jMenuItemDetalleCerrarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGarantiaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGarantiaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantiaEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGarantiaEmpresa"));
			
		this.jButtonVerFormToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGarantiaEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGarantiaEmpresa"));
			
		this.jMenuItemCopiarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGarantiaEmpresa"));		
		
		this.jMenuItemVerFormTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGarantiaEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGarantiaEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGarantiaEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGarantiaEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGarantiaEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGarantiaEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoGarantiaEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGarantiaEmpresa"));
		
		this.jMenuItemAnterioresTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGarantiaEmpresa"));		
		
		
		this.jButtonSiguientesTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoGarantiaEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemSiguientesTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGarantiaEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGarantiaEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGarantiaEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGarantiaEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGarantiaEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGarantiaEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGarantiaEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGarantiaEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGarantiaEmpresa"));

		this.jCheckBoxSeleccionadosTipoGarantiaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGarantiaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGarantiaEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGarantiaEmpresa"));
			
		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGarantiaEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGarantiaEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGarantiaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonidTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtoncodigoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonnombreTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtones_defectoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoGarantiaEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGarantiaEmpresa"));

			this.jButtonBusquedaPorNombreTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGarantiaEmpresa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantiaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantiaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoGarantiaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantiaEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantiaEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantiaEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantiaEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGarantiaEmpresa!=null) {
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGarantiaEmpresa"));
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGarantiaEmpresa"));
				this.jInternalFrameImportacionTipoGarantiaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGarantiaEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGarantiaEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoGarantiaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGarantiaEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoGarantiaEmpresa!=null) {
				this.jInternalFrameOrderByTipoGarantiaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGarantiaEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTabbedPaneRelacionesTipoGarantiaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGarantiaEmpresa"));
		
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
            		closingInternalFrameTipoGarantiaEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGarantiaEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoGarantiaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoGarantiaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGarantiaEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGarantiaEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGarantiaEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGarantiaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGarantiaEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGarantiaEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGarantiaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGarantiaEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGarantiaEmpresa";
		inputMap = this.jButtonModificarTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGarantiaEmpresa";
		inputMap = this.jButtonActualizarTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGarantiaEmpresa";
		inputMap = this.jButtonEliminarTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGarantiaEmpresa";
		inputMap = this.jButtonCancelarTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGarantiaEmpresa";
		inputMap = this.jButtonCerrarTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGarantiaEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonGuardarCambiosTipoGarantiaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGarantiaEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGarantiaEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGarantiaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGarantiaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGarantiaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGarantiaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonidTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonid_empresaTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtoncodigoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtonnombreTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jButtones_defectoTipoGarantiaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoTipoGarantiaEmpresaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGarantiaEmpresa"));

		this.jButtonBusquedaPorNombreTipoGarantiaEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGarantiaEmpresa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGarantiaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGarantiaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGarantiaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGarantiaEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGarantiaEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
					tipogarantiaempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresas) {
					tipogarantiaempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGarantiaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
						tipogarantiaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresas) {
						tipogarantiaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
					
						if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipogarantiaempresaAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresas) {
						
						if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							tipogarantiaempresaAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGarantiaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGarantiaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGarantiaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGarantiaEmpresa.getSelectedRows();
			
			TipoGarantiaEmpresa tipogarantiaempresaLocal=new TipoGarantiaEmpresa();
			
			//this.seleccionarTodosTipoGarantiaEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLocal =(TipoGarantiaEmpresa) this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas().toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogarantiaempresaLocal =(TipoGarantiaEmpresa) this.tipogarantiaempresas.toArray()[this.jTableDatosTipoGarantiaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogarantiaempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
						tipogarantiaempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresas) {
						tipogarantiaempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGarantiaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGarantiaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGarantiaEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGarantiaEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGarantiaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGarantiaEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogarantiaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogarantiaempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresas) {
					
						if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogarantiaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogarantiaempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGarantiaEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGarantiaEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGarantiaEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGarantiaEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGarantiaEmpresa(conSplash);
				
					this.generarReporteTipoGarantiaEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGarantiaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGarantiaEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGarantiaEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGarantiaEmpresa();
				
				this.exportarTipoGarantiaEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGarantiaEmpresas();
				//this.importarTipoGarantiaEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGarantiaEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGarantiaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Garantia Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGarantiaEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGarantiaEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGarantiaEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoGarantiaEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoGarantiaEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoGarantiaEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoGarantiaEmpresa();
						
						this.generarReporteProcesoAccionTipoGarantiaEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Garantia EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Garantia Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoGarantiaEmpresa();
				
						this.actualizarParametrosGeneralTipoGarantiaEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipogarantiaempresaReturnGeneral=tipogarantiaempresaLogic.procesarAccionTipoGarantiaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas(),this.tipogarantiaempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoGarantiaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGarantiaEmpresa();
					
					TipoGarantiaEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoGarantiaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGarantiaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxTiposAccionesFormularioTipoGarantiaEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGarantiaEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGarantiaEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGarantiaEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
			TipoGarantiaEmpresa tipogarantiaempresa=new TipoGarantiaEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGarantiaEmpresa.getSelectedItem();
			
			
			
			
			tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogarantiaempresasSeleccionados.size()==1) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
					tipogarantiaempresa=tipogarantiaempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tipogarantiaempresa);
				}
				else if(this.sTipoRelacion.equals("Garantia Cliente")) {
					jButtonGarantiaClienteActionPerformed(null,rowIndex,true,false,tipogarantiaempresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGarantiaEmpresa();
			
      		//this.finishProcessTipoGarantiaEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGarantiaEmpresaReturnGeneral() throws Exception {
		if(this.tipogarantiaempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogarantiaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogarantiaempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogarantiaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogarantiaempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogarantiaempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
		}
		
		if(this.tipogarantiaempresaReturnGeneral.getConRetornoLista() || this.tipogarantiaempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogarantiaempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogarantiaempresaLogic.setTipoGarantiaEmpresas(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogarantiaempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogarantiaempresaLogic.setTipoGarantiaEmpresa(this.tipogarantiaempresaReturnGeneral.getTipoGarantiaEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGarantiaEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGarantiaEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoGarantiaEmpresa> getTipoGarantiaEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGarantiaEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresaLogic.getTipoGarantiaEmpresas()) {
					if(tipogarantiaempresaAux.getIsSelected()) {
						tipogarantiaempresasSeleccionados.add(tipogarantiaempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantiaEmpresa tipogarantiaempresaAux:this.tipogarantiaempresas) {
					if(tipogarantiaempresaAux.getIsSelected()) {
						tipogarantiaempresasSeleccionados.add(tipogarantiaempresaAux);				
					}
				}
			}
			
			if(tipogarantiaempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogarantiaempresasSeleccionados.addAll(this.tipogarantiaempresaLogic.getTipoGarantiaEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogarantiaempresasSeleccionados.addAll(this.tipogarantiaempresas);				
					}
				}
			}
		} else {
			tipogarantiaempresasSeleccionados.add(this.tipogarantiaempresa);
		}
		
		return tipogarantiaempresasSeleccionados;
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
	
	public void generarReporteTipoGarantiaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGarantiaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGarantiaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGarantiaEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGarantiaEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoGarantiaEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Garantia Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGarantiaEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGarantiaEmpresa();
		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGarantiaEmpresa();
		
		
		//this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados ,tipogarantiaempresaImplementable,tipogarantiaempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoGarantiaEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGarantiaEmpresa();
		
		this.abrirFrameImportacionTipoGarantiaEmpresa();		
		
			
		//this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados ,tipogarantiaempresaImplementable,tipogarantiaempresaImplementableHome);
	}
	
	public void importarTipoGarantiaEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoGarantiaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGarantiaEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGarantiaEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGarantiaEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Garantia Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGarantiaEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGarantiaEmpresa(tipogarantiaempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogarantiaempresaAux.setsDetalleGeneralEntityReporte(tipogarantiaempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGarantiaEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogarantiaempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantiaempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantiaempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantiaempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantiaempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantiaempresa.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGarantiaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGarantiaEmpresa(row);				
				iRow++;
			}				
			
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGarantiaEmpresa(tipogarantiaempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGarantiaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();		
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantiaempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogarantiaempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogarantiaempresa");
			//elementRoot.appendChild(element);
		
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
				element = document.createElement("tipogarantiaempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGarantiaEmpresa(tipogarantiaempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGarantiaEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantiaempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantiaempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantiaempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantiaempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantiaempresa.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlTipoGarantiaEmpresa(TipoGarantiaEmpresa tipogarantiaempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGarantiaEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogarantiaempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGarantiaEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogarantiaempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoGarantiaEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipogarantiaempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoGarantiaEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipogarantiaempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGarantiaEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogarantiaempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(TipoGarantiaEmpresaConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(tipogarantiaempresa.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoTipoGarantiaEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados=new ArrayList<TipoGarantiaEmpresa>();
		
		tipogarantiaempresasSeleccionados=this.getTipoGarantiaEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGarantiaEmpresa(tipogarantiaempresasSeleccionados);
		
		this.generarReporteTipoGarantiaEmpresas("Todos",tipogarantiaempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGarantiaEmpresa(ArrayList<TipoGarantiaEmpresa> tipogarantiaempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasSeleccionados) {
				tipogarantiaempresaAux.setsDetalleGeneralEntityReporte(tipogarantiaempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipogarantiaempresaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipogarantiaempresaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogarantiaempresaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoGarantiaEmpresaConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					tipogarantiaempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipogarantiaempresaAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGarantiaEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoGarantiaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantiaEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGarantiaEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoGarantiaEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGarantiaEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoGarantiaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipogarantiaempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;												
			}
			
			this.jButtonCerrarTipoGarantiaEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantiaEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogarantiaempresa)) {
			this.isVisibilidadCeldaActualizarTipoGarantiaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoGarantiaEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGarantiaEmpresa() {
		this.isVisibilidadCeldaNuevoTipoGarantiaEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosTipoGarantiaEmpresa=false;
	}
	
	public void actualizarEstadoPanelsTipoGarantiaEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoGarantiaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantiaEmpresa!=null) {
				this.jScrollPanelDatosTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantiaEmpresa!=null) {
				this.jPanelPaginacionTipoGarantiaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogarantiaempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGarantiaEmpresa!=null) {
				this.jPanelParametrosReportesTipoGarantiaEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoGarantiaEmpresa.remove(jPanelBusquedaPorCodigoTipoGarantiaEmpresa);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoGarantiaEmpresa.remove(jPanelBusquedaPorNombreTipoGarantiaEmpresa);}
		}
		
	}
	
	

	public String registrarSesionTipoGarantiaEmpresaParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tipogarantiaempresaSessionBean==null) {
				this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setsPathNavegacionActual(tipogarantiaempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoGarantiaEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa(true);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.clienteSessionBean.setlidTipoGarantiaEmpresaActual(this.idTipoGarantiaEmpresaActual);

			tipogarantiaempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGarantiaEmpresa(true);
			tipogarantiaempresaSessionBean.setlIdTipoGarantiaEmpresaActualForeignKey(this.idTipoGarantiaEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGarantiaEmpresaParaGarantiaClientes() throws Exception {
		Boolean isPaginaPopupGarantiaCliente=false;

		try {

			if(this.tipogarantiaempresaSessionBean==null) {
				this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setsPathNavegacionActual(tipogarantiaempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGarantiaCliente=this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGarantiaCliente(true);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGarantiaCliente(TipoGarantiaEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa(true);
			this.jInternalFrameDetalleFormTipoGarantiaEmpresa.garantiaclienteSessionBean.setlidTipoGarantiaEmpresaActual(this.idTipoGarantiaEmpresaActual);

			tipogarantiaempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGarantiaEmpresa(true);
			tipogarantiaempresaSessionBean.setlIdTipoGarantiaEmpresaActualForeignKey(this.idTipoGarantiaEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		
		if(this.tipogarantiaempresaSessionBean==null) {
			this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		}
		
		this.tipogarantiaempresaSessionBean.setsUltimaBusquedaTipoGarantiaEmpresa(this.getsAccionBusqueda());
		this.tipogarantiaempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogarantiaempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipogarantiaempresaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipogarantiaempresaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipogarantiaempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		
		if(this.tipogarantiaempresaSessionBean==null) {
			this.tipogarantiaempresaSessionBean=new TipoGarantiaEmpresaSessionBean();
		}
		
		if(this.tipogarantiaempresaSessionBean.getsUltimaBusquedaTipoGarantiaEmpresa()!=null&&!this.tipogarantiaempresaSessionBean.getsUltimaBusquedaTipoGarantiaEmpresa().equals("")) {
			this.setsAccionBusqueda(tipogarantiaempresaSessionBean.getsUltimaBusquedaTipoGarantiaEmpresa());
			this.setiNumeroPaginacion(tipogarantiaempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogarantiaempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipogarantiaempresaSessionBean.getcodigo());
				tipogarantiaempresaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipogarantiaempresaSessionBean.getnombre());
				tipogarantiaempresaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipogarantiaempresaSessionBean.getid_empresa());
				tipogarantiaempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipogarantiaempresaSessionBean.setsUltimaBusquedaTipoGarantiaEmpresa("");
		this.tipogarantiaempresaSessionBean.setiNumeroPaginacion(TipoGarantiaEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipogarantiaempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGarantiaEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGarantiaEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoGarantiaEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoGarantiaEmpresa();
		this.updateHabilitarBusquedasFormularioTipoGarantiaEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGarantiaEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponents().length>0) {
	

		if(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantiaEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
				jPanel.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantiaEmpresa);
			}
		}

		if(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantiaEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantiaEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
				jPanel.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantiaEmpresa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGarantiaEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarBusquedaPorCodigoTipoGarantiaEmpresa);
			if(!this.tipogarantiaempresaConstantesFunciones.mostrarBusquedaPorCodigoTipoGarantiaEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantiaEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarBusquedaPorNombreTipoGarantiaEmpresa);
			if(!this.tipogarantiaempresaConstantesFunciones.mostrarBusquedaPorNombreTipoGarantiaEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGarantiaEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarBusquedaPorCodigoTipoGarantiaEmpresa);
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setEnabledAt(index,this.tipogarantiaempresaConstantesFunciones.activarBusquedaPorCodigoTipoGarantiaEmpresa);
			}

			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantiaEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarBusquedaPorNombreTipoGarantiaEmpresa);
				this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setEnabledAt(index,this.tipogarantiaempresaConstantesFunciones.activarBusquedaPorNombreTipoGarantiaEmpresa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGarantiaEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantiaEmpresa);

			this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);

			this.tipogarantiaempresaConstantesFunciones.setResaltarBusquedaPorCodigoTipoGarantiaEmpresa(resaltar);

			jPanel.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantiaEmpresa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoGarantiaEmpresa.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantiaEmpresa);

			this.jTabbedPaneBusquedasTipoGarantiaEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantiaEmpresa.getComponent(index);

			this.tipogarantiaempresaConstantesFunciones.setResaltarBusquedaPorNombreTipoGarantiaEmpresa(resaltar);

			jPanel.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantiaEmpresa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGarantiaEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGarantiaEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGarantiaEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoGarantiaEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoGarantiaEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGarantiaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogarantiaempresaConstantesFunciones.resaltaridTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltaridTipoGarantiaEmpresa);}
		if(this.tipogarantiaempresaConstantesFunciones.resaltarid_empresaTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarid_empresaTipoGarantiaEmpresa);}
		if(this.tipogarantiaempresaConstantesFunciones.resaltarcodigoTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarcodigoTipoGarantiaEmpresa);}
		if(this.tipogarantiaempresaConstantesFunciones.resaltarnombreTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltarnombreTipoGarantiaEmpresa);}
		if(this.tipogarantiaempresaConstantesFunciones.resaltares_defectoTipoGarantiaEmpresa!=null && this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setBorder(this.tipogarantiaempresaConstantesFunciones.resaltares_defectoTipoGarantiaEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGarantiaEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostraridTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelidTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostraridTipoGarantiaEmpresa);
		//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarid_empresaTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelid_empresaTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarid_empresaTipoGarantiaEmpresa);
		//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarcodigoTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelcodigoTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarcodigoTipoGarantiaEmpresa);
		//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarnombreTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPanelnombreTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrarnombreTipoGarantiaEmpresa);
		//this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrares_defectoTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jPaneles_defectoTipoGarantiaEmpresa.setVisible(this.tipogarantiaempresaConstantesFunciones.mostrares_defectoTipoGarantiaEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGarantiaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantiaEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jLabelidTipoGarantiaEmpresa.setEnabled(this.tipogarantiaempresaConstantesFunciones.activaridTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jComboBoxid_empresaTipoGarantiaEmpresa.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarid_empresaTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextFieldcodigoTipoGarantiaEmpresa.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarcodigoTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jTextAreanombreTipoGarantiaEmpresa.setEnabled(this.tipogarantiaempresaConstantesFunciones.activarnombreTipoGarantiaEmpresa);
		this.jInternalFrameDetalleFormTipoGarantiaEmpresa.jCheckBoxes_defectoTipoGarantiaEmpresa.setEnabled(this.tipogarantiaempresaConstantesFunciones.activares_defectoTipoGarantiaEmpresa);
		}
	}
	
		
}