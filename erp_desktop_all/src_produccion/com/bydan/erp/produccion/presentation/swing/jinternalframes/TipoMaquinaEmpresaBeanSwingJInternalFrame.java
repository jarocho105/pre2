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

import com.bydan.erp.produccion.util.TipoMaquinaEmpresaConstantesFunciones;
import com.bydan.erp.produccion.util.TipoMaquinaEmpresaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.TipoMaquinaEmpresaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.TipoMaquinaEmpresaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoMaquinaEmpresaBeanSwingJInternalFrame extends TipoMaquinaEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMaquinaEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMaquinaEmpresa> tipomaquinaempresaValidator = new ClassValidator<TipoMaquinaEmpresa>(TipoMaquinaEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMaquinaEmpresa tipomaquinaempresa;	
	public TipoMaquinaEmpresa tipomaquinaempresaAux;
	public TipoMaquinaEmpresa tipomaquinaempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMaquinaEmpresa tipomaquinaempresaTotales;
	public Long idTipoMaquinaEmpresaActual;
	public Long iIdNuevoTipoMaquinaEmpresa=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboCuentaContableDebito="";

	public List<CuentaContable> cuentacontabledebitosForeignKey;

	public List<CuentaContable> getcuentacontabledebitosForeignKey() {
		return cuentacontabledebitosForeignKey;
	}

	public void setcuentacontabledebitosForeignKey(List<CuentaContable> cuentacontabledebitosForeignKey) {
		this.cuentacontabledebitosForeignKey = cuentacontabledebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledebitoForeignKey;

	public CuentaContable getcuentacontabledebitoForeignKey() {
		return cuentacontabledebitoForeignKey;
	}

	public void setcuentacontabledebitoForeignKey(CuentaContable cuentacontabledebitoForeignKey) {
		this.cuentacontabledebitoForeignKey = cuentacontabledebitoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosProductoOrdenDetaProduMaquina=false;

	public Boolean getIsTienePermisosProductoOrdenDetaProduMaquina() {
		return isTienePermisosProductoOrdenDetaProduMaquina;
	}

	public void setIsTienePermisosProductoOrdenDetaProduMaquina(Boolean isTienePermisosProductoOrdenDetaProduMaquina) {
		this.isTienePermisosProductoOrdenDetaProduMaquina= isTienePermisosProductoOrdenDetaProduMaquina;
	}


	public Boolean isTienePermisosProductoProduMaquina=false;

	public Boolean getIsTienePermisosProductoProduMaquina() {
		return isTienePermisosProductoProduMaquina;
	}

	public void setIsTienePermisosProductoProduMaquina(Boolean isTienePermisosProductoProduMaquina) {
		this.isTienePermisosProductoProduMaquina= isTienePermisosProductoProduMaquina;
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
	
	public Boolean isPermisoTodoTipoMaquinaEmpresa;
	public Boolean isPermisoNuevoTipoMaquinaEmpresa;
	public Boolean isPermisoActualizarTipoMaquinaEmpresa;
	public Boolean isPermisoActualizarOriginalTipoMaquinaEmpresa;
	public Boolean isPermisoEliminarTipoMaquinaEmpresa;
	public Boolean isPermisoGuardarCambiosTipoMaquinaEmpresa;
	public Boolean isPermisoConsultaTipoMaquinaEmpresa;
	public Boolean isPermisoBusquedaTipoMaquinaEmpresa;
	public Boolean isPermisoReporteTipoMaquinaEmpresa;
	public Boolean isPermisoPaginacionMedioTipoMaquinaEmpresa;
	public Boolean isPermisoPaginacionAltoTipoMaquinaEmpresa;
	public Boolean isPermisoPaginacionTodoTipoMaquinaEmpresa;
	public Boolean isPermisoCopiarTipoMaquinaEmpresa;
	public Boolean isPermisoVerFormTipoMaquinaEmpresa;
	public Boolean isPermisoDuplicarTipoMaquinaEmpresa;
	public Boolean isPermisoOrdenTipoMaquinaEmpresa;
	
	
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
	
	public TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaReturnGeneral;
	public TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaParameterGeneral;
	
	

	public ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic=null;

	public ProductoOrdenDetaProduMaquinaLogic getProductoOrdenDetaProduMaquinaLogic() {
		return productoordendetaprodumaquinaLogic;
	}

	public void setProductoOrdenDetaProduMaquinaLogic(ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic) {
		this.productoordendetaprodumaquinaLogic = productoordendetaprodumaquinaLogic;
	}


	public ProductoProduMaquinaLogic productoprodumaquinaLogic=null;

	public ProductoProduMaquinaLogic getProductoProduMaquinaLogic() {
		return productoprodumaquinaLogic;
	}

	public void setProductoProduMaquinaLogic(ProductoProduMaquinaLogic productoprodumaquinaLogic) {
		this.productoprodumaquinaLogic = productoprodumaquinaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMaquinaEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoMaquinaEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMaquinaEmpresaSessionBeanAdditional tipomaquinaempresaSessionBeanAdditional=null;
	
	public TipoMaquinaEmpresaSessionBeanAdditional getTipoMaquinaEmpresaSessionBeanAdditional() {
		return this.tipomaquinaempresaSessionBeanAdditional;
	}
	
	public void setTipoMaquinaEmpresaSessionBeanAdditional(TipoMaquinaEmpresaSessionBeanAdditional tipomaquinaempresaSessionBeanAdditional) {
		try {
			this.tipomaquinaempresaSessionBeanAdditional=tipomaquinaempresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional tipomaquinaempresaBeanSwingJInternalFrameAdditional=null;
	//public class TipoMaquinaEmpresaBeanSwingJInternalFrame
	
	public TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional getTipoMaquinaEmpresaBeanSwingJInternalFrameAdditional() {
		return this.tipomaquinaempresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMaquinaEmpresaBeanSwingJInternalFrameAdditional(TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional tipomaquinaempresaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomaquinaempresaBeanSwingJInternalFrameAdditional=tipomaquinaempresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMaquinaEmpresaLogic tipomaquinaempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMaquinaEmpresa tipomaquinaempresaBean;
	public TipoMaquinaEmpresaConstantesFunciones tipomaquinaempresaConstantesFunciones;
	//public TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMaquinaEmpresa> tipomaquinaempresas;	
	//public List<TipoMaquinaEmpresa> tipomaquinaempresasEliminados;
	//public List<TipoMaquinaEmpresa> tipomaquinaempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMaquinaEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoMaquinaEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoMaquinaEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoMaquinaEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoTipoMaquinaEmpresa() {
		return this.iIdNuevoTipoMaquinaEmpresa;
	}

	public void setiIdNuevoTipoMaquinaEmpresa(Long iIdNuevoTipoMaquinaEmpresa) {
		this.iIdNuevoTipoMaquinaEmpresa = iIdNuevoTipoMaquinaEmpresa;
	}
	
	public Long getidTipoMaquinaEmpresaActual() {
		return this.idTipoMaquinaEmpresaActual;
	}

	public void setidTipoMaquinaEmpresaActual(Long idTipoMaquinaEmpresaActual) {
		this.idTipoMaquinaEmpresaActual = idTipoMaquinaEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMaquinaEmpresa gettipomaquinaempresa() {
		return this.tipomaquinaempresa;
	}

	public void settipomaquinaempresa(TipoMaquinaEmpresa tipomaquinaempresa) {
		this.tipomaquinaempresa = tipomaquinaempresa;
	}
	
	public TipoMaquinaEmpresa gettipomaquinaempresaAux() {
		return this.tipomaquinaempresaAux;
	}

	public void settipomaquinaempresaAux(TipoMaquinaEmpresa tipomaquinaempresaAux) {
		this.tipomaquinaempresaAux = tipomaquinaempresaAux;
	}				
	
	public TipoMaquinaEmpresa gettipomaquinaempresaAnterior() {
		return this.tipomaquinaempresaAnterior;
	}

	public void settipomaquinaempresaAnterior(TipoMaquinaEmpresa tipomaquinaempresaAnterior) {
		this.tipomaquinaempresaAnterior = tipomaquinaempresaAnterior;
	}	
	
	public TipoMaquinaEmpresa gettipomaquinaempresaTotales() {
		return this.tipomaquinaempresaTotales;
	}

	public void settipomaquinaempresaTotales(TipoMaquinaEmpresa tipomaquinaempresaTotales) {
		this.tipomaquinaempresaTotales = tipomaquinaempresaTotales;
	}	
	
	public TipoMaquinaEmpresa gettipomaquinaempresaBean() {
		return this.tipomaquinaempresaBean;
	}

	public void settipomaquinaempresaBean(TipoMaquinaEmpresa tipomaquinaempresaBean) {
		this.tipomaquinaempresaBean = tipomaquinaempresaBean;
	}	
	
	public TipoMaquinaEmpresaParameterReturnGeneral gettipomaquinaempresaReturnGeneral() {
		return this.tipomaquinaempresaReturnGeneral;
	}

	public void settipomaquinaempresaReturnGeneral(TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaReturnGeneral) {
		this.tipomaquinaempresaReturnGeneral = tipomaquinaempresaReturnGeneral;
	}	
	
	
	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=-1L;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_cuenta_contable_debitoFK_IdCuentaContableDebito=-1L;

	public Long getid_cuenta_contable_debitoFK_IdCuentaContableDebito() {
		return this.id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public void setid_cuenta_contable_debitoFK_IdCuentaContableDebito(Long id_cuenta_contable_debitoFK_IdCuentaContableDebito) {
		this.id_cuenta_contable_debitoFK_IdCuentaContableDebito = id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMaquinaEmpresaLogic getTipoMaquinaEmpresaLogic()	{		
		return tipomaquinaempresaLogic;
	}

	public void setTipoMaquinaEmpresaLogic(TipoMaquinaEmpresaLogic tipomaquinaempresaLogic) {
		this.tipomaquinaempresaLogic = tipomaquinaempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoMaquinaEmpresa() {
		return isEsNuevoTipoMaquinaEmpresa;
	}

	public void setIsEsNuevoTipoMaquinaEmpresa(Boolean isEsNuevoTipoMaquinaEmpresa) {
		this.isEsNuevoTipoMaquinaEmpresa = isEsNuevoTipoMaquinaEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMaquinaEmpresa() {
		return esParaAccionDesdeFormularioTipoMaquinaEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMaquinaEmpresa(Boolean esParaAccionDesdeFormularioTipoMaquinaEmpresa) {
		this.esParaAccionDesdeFormularioTipoMaquinaEmpresa = esParaAccionDesdeFormularioTipoMaquinaEmpresa;
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

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipomaquinaempresaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(tipomaquinaempresaSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosCuentaContableDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledebitoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledebitosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(tipomaquinaempresaSessionBean.getlidCuentaContableDebitoActual());
					this.cuentacontabledebitosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(tipomaquinaempresaSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.tipomaquinaempresa!=null) {
						this.tipomaquinaempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoMaquinaEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoMaquinaEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoMaquinaEmpresaGenerico!=null && jComboBoxid_empresaTipoMaquinaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoMaquinaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.tipomaquinaempresa!=null) {
						this.tipomaquinaempresa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalTipoMaquinaEmpresaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTipoMaquinaEmpresaGenerico!=null && jComboBoxid_sucursalTipoMaquinaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTipoMaquinaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDebitoForeignKey(Long idCuentaContableDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledebitoTemp!=null) {

					if(this.tipomaquinaempresa!=null) {
						this.tipomaquinaempresa.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledebitoTemp!=null && jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa!=null) {
						jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebitoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa!=null) {
							//jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebitoTemp);
							if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.getItemCount()>0) {
								jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setSelectedIndex(0);
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

	public String getActualCuentaContableDebitoForeignKeyDescripcion(Long idCuentaContableDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(cuentacontabledebitoTemp!=null) {
				jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico!=null && jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.tipomaquinaempresa!=null) {
						this.tipomaquinaempresa.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico!=null && jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoMaquinaEmpresa tipomaquinaempresa,JComboBox jComboBoxid_empresaTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoMaquinaEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoMaquinaEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipomaquinaempresa.setid_empresa(empresaAux.getId());
				tipomaquinaempresa.setempresa_descripcion(TipoMaquinaEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipomaquinaempresa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TipoMaquinaEmpresa tipomaquinaempresa,JComboBox jComboBoxid_sucursalTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTipoMaquinaEmpresaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTipoMaquinaEmpresaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tipomaquinaempresa.setid_sucursal(sucursalAux.getId());
				tipomaquinaempresa.setsucursal_descripcion(TipoMaquinaEmpresaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tipomaquinaempresa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(TipoMaquinaEmpresa tipomaquinaempresa,JComboBox jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				tipomaquinaempresa.setid_cuenta_contable_debito(cuentacontableAux.getId());
				tipomaquinaempresa.setcuentacontabledebito_descripcion(TipoMaquinaEmpresaConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				tipomaquinaempresa.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(TipoMaquinaEmpresa tipomaquinaempresa,JComboBox jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				tipomaquinaempresa.setid_cuenta_contable_credito(cuentacontableAux.getId());
				tipomaquinaempresa.setcuentacontablecredito_descripcion(TipoMaquinaEmpresaConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				tipomaquinaempresa.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
					}

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
					}

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
					}

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.addItem(cuentacontabledebito);
							}
						}

						if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { 
					}

					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.addItem(cuentacontablecredito);
							}
						}

						if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableDebitoForeignKey(CuentaContable cuentacontabledebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setSelectedItem(cuentacontabledebito);
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoMaquinaEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMaquinaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMaquinaEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa(this.tipomaquinaempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomaquinaempresaLogic.setTipoMaquinaEmpresas(this.tipomaquinaempresas);
			tipomaquinaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMaquinaEmpresaParameterReturnGeneral getTipoMaquinaEmpresaParameterGeneral() {
		return this.tipomaquinaempresaParameterGeneral;
	}
	
	public void setTipoMaquinaEmpresaParameterGeneral(TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaParameterGeneral) {
		this.tipomaquinaempresaParameterGeneral = tipomaquinaempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMaquinaEmpresa() {
		return isPermisoTodoTipoMaquinaEmpresa;
	}

	public void setIsPermisoTodoTipoMaquinaEmpresa(Boolean isPermisoTodoTipoMaquinaEmpresa) {
		this.isPermisoTodoTipoMaquinaEmpresa = isPermisoTodoTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoMaquinaEmpresa() {
		return isPermisoNuevoTipoMaquinaEmpresa;
	}

	public void setIsPermisoNuevoTipoMaquinaEmpresa(Boolean isPermisoNuevoTipoMaquinaEmpresa) {
		this.isPermisoNuevoTipoMaquinaEmpresa = isPermisoNuevoTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoMaquinaEmpresa() {
		return isPermisoActualizarTipoMaquinaEmpresa;
	}

	public void setIsPermisoActualizarTipoMaquinaEmpresa(Boolean isPermisoActualizarTipoMaquinaEmpresa) {
		this.isPermisoActualizarTipoMaquinaEmpresa = isPermisoActualizarTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoMaquinaEmpresa() {
		return isPermisoEliminarTipoMaquinaEmpresa;
	}

	public void setIsPermisoEliminarTipoMaquinaEmpresa(Boolean isPermisoEliminarTipoMaquinaEmpresa) {
		this.isPermisoEliminarTipoMaquinaEmpresa = isPermisoEliminarTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMaquinaEmpresa() {
		return isPermisoGuardarCambiosTipoMaquinaEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoMaquinaEmpresa(Boolean isPermisoGuardarCambiosTipoMaquinaEmpresa) {
		this.isPermisoGuardarCambiosTipoMaquinaEmpresa = isPermisoGuardarCambiosTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoMaquinaEmpresa() {
		return isPermisoConsultaTipoMaquinaEmpresa;
	}

	public void setIsPermisoConsultaTipoMaquinaEmpresa(Boolean isPermisoConsultaTipoMaquinaEmpresa) {
		this.isPermisoConsultaTipoMaquinaEmpresa = isPermisoConsultaTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoMaquinaEmpresa() {
		return isPermisoBusquedaTipoMaquinaEmpresa;
	}

	public void setIsPermisoBusquedaTipoMaquinaEmpresa(Boolean isPermisoBusquedaTipoMaquinaEmpresa) {
		this.isPermisoBusquedaTipoMaquinaEmpresa = isPermisoBusquedaTipoMaquinaEmpresa;
	}

	public Boolean getIsPermisoReporteTipoMaquinaEmpresa() {
		return isPermisoReporteTipoMaquinaEmpresa;
	}

	public void setIsPermisoReporteTipoMaquinaEmpresa(Boolean isPermisoReporteTipoMaquinaEmpresa) {
		this.isPermisoReporteTipoMaquinaEmpresa = isPermisoReporteTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMaquinaEmpresa() {
		return isPermisoPaginacionMedioTipoMaquinaEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoMaquinaEmpresa(Boolean isPermisoPaginacionMedioTipoMaquinaEmpresa) {
		this.isPermisoPaginacionMedioTipoMaquinaEmpresa = isPermisoPaginacionMedioTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMaquinaEmpresa() {
		return isPermisoPaginacionTodoTipoMaquinaEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoMaquinaEmpresa(Boolean isPermisoPaginacionTodoTipoMaquinaEmpresa) {
		this.isPermisoPaginacionTodoTipoMaquinaEmpresa = isPermisoPaginacionTodoTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMaquinaEmpresa() {
		return isPermisoPaginacionAltoTipoMaquinaEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoMaquinaEmpresa(Boolean isPermisoPaginacionAltoTipoMaquinaEmpresa) {
		this.isPermisoPaginacionAltoTipoMaquinaEmpresa = isPermisoPaginacionAltoTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoMaquinaEmpresa() {
		return isPermisoCopiarTipoMaquinaEmpresa;
	}

	public void setIsPermisoCopiarTipoMaquinaEmpresa(Boolean isPermisoCopiarTipoMaquinaEmpresa) {
		this.isPermisoCopiarTipoMaquinaEmpresa = isPermisoCopiarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoMaquinaEmpresa() {
		return isPermisoVerFormTipoMaquinaEmpresa;
	}

	public void setIsPermisoVerFormTipoMaquinaEmpresa(Boolean isPermisoVerFormTipoMaquinaEmpresa) {
		this.isPermisoVerFormTipoMaquinaEmpresa = isPermisoVerFormTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoMaquinaEmpresa() {
		return isPermisoDuplicarTipoMaquinaEmpresa;
	}

	public void setIsPermisoDuplicarTipoMaquinaEmpresa(Boolean isPermisoDuplicarTipoMaquinaEmpresa) {
		this.isPermisoDuplicarTipoMaquinaEmpresa = isPermisoDuplicarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoMaquinaEmpresa() {
		return isPermisoOrdenTipoMaquinaEmpresa;
	}

	public void setIsPermisoOrdenTipoMaquinaEmpresa(Boolean isPermisoOrdenTipoMaquinaEmpresa) {
		this.isPermisoOrdenTipoMaquinaEmpresa = isPermisoOrdenTipoMaquinaEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMaquinaEmpresa() {
		return isVisibilidadCeldaNuevoTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoMaquinaEmpresa(Boolean isVisibilidadCeldaNuevoTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa = isVisibilidadCeldaNuevoTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaDuplicarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaDuplicarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa = isVisibilidadCeldaDuplicarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaCopiarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaCopiarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa = isVisibilidadCeldaCopiarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMaquinaEmpresa() {
		return isVisibilidadCeldaVerFormTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoMaquinaEmpresa(Boolean isVisibilidadCeldaVerFormTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa = isVisibilidadCeldaVerFormTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMaquinaEmpresa() {
		return isVisibilidadCeldaOrdenTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoMaquinaEmpresa(Boolean isVisibilidadCeldaOrdenTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa = isVisibilidadCeldaOrdenTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa = isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaModificarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaModificarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaModificarTipoMaquinaEmpresa = isVisibilidadCeldaModificarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaActualizarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaActualizarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa = isVisibilidadCeldaActualizarTipoMaquinaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaEliminarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaEliminarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa = isVisibilidadCeldaEliminarTipoMaquinaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaCancelarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaCancelarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa = isVisibilidadCeldaCancelarTipoMaquinaEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMaquinaEmpresa() {
		return isVisibilidadCeldaGuardarTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoMaquinaEmpresa(Boolean isVisibilidadCeldaGuardarTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa = isVisibilidadCeldaGuardarTipoMaquinaEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa = isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa;
	}
		
	public TipoMaquinaEmpresaSessionBean gettipomaquinaempresaSessionBean() {
		return this.tipomaquinaempresaSessionBean;
	}
	
	public void settipomaquinaempresaSessionBean(TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean) {
		this.tipomaquinaempresaSessionBean=tipomaquinaempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDebito() {
		return this.isVisibilidadFK_IdCuentaContableDebito;
	}

	public void setisVisibilidadFK_IdCuentaContableDebito(Boolean isVisibilidadFK_IdCuentaContableDebito) {
		this.isVisibilidadFK_IdCuentaContableDebito=isVisibilidadFK_IdCuentaContableDebito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipomaquinaempresa,null);
				this.setActualParaGuardarSucursalForeignKey(tipomaquinaempresa,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(tipomaquinaempresa,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(tipomaquinaempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoMaquinaEmpresa tipomaquinaempresa,TipoMaquinaEmpresa tipomaquinaempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMaquinaEmpresa(tipomaquinaempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomaquinaempresaAux.setId(tipomaquinaempresa.getId());
		tipomaquinaempresaAux.setVersionRow(tipomaquinaempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMaquinaEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomaquinaempresaValidator.getInvalidValues(this.tipomaquinaempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomaquinaempresaLogic.setDatosCliente(datosCliente);
			tipomaquinaempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomaquinaempresaAux=new  TipoMaquinaEmpresa();
				
				tipomaquinaempresaAux.setIsNew(true);
				tipomaquinaempresaAux.setIsChanged(true);
				
				tipomaquinaempresaAux.setTipoMaquinaEmpresaOriginal(this.tipomaquinaempresa);
				
				tipomaquinaempresaAux.setId(this.tipomaquinaempresa.getId());	
				tipomaquinaempresaAux.setVersionRow(this.tipomaquinaempresa.getVersionRow());	
				tipomaquinaempresaAux.setid_empresa(this.tipomaquinaempresa.getid_empresa());	
				tipomaquinaempresaAux.setid_sucursal(this.tipomaquinaempresa.getid_sucursal());	
				tipomaquinaempresaAux.setid_cuenta_contable_debito(this.tipomaquinaempresa.getid_cuenta_contable_debito());	
				tipomaquinaempresaAux.setid_cuenta_contable_credito(this.tipomaquinaempresa.getid_cuenta_contable_credito());	
				tipomaquinaempresaAux.setcodigo(this.tipomaquinaempresa.getcodigo());	
				tipomaquinaempresaAux.setnombre(this.tipomaquinaempresa.getnombre());	
				tipomaquinaempresaAux.setmarca(this.tipomaquinaempresa.getmarca());	
				tipomaquinaempresaAux.setmodelo(this.tipomaquinaempresa.getmodelo());	
				tipomaquinaempresaAux.setcosto(this.tipomaquinaempresa.getcosto());	
				tipomaquinaempresaAux.setesta_activo(this.tipomaquinaempresa.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.saveTipoMaquinaEmpresas();//WithConnection
						//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomaquinaempresaLogic.saveTipoMaquinaEmpresaRelaciones(tipomaquinaempresaAux,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomaquinaempresaAux=new  TipoMaquinaEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() && this.tipomaquinaempresa.getId()>=0)) {
						
					tipomaquinaempresaAux.setIsNew(false);
				}
				
				tipomaquinaempresaAux.setIsDeleted(false);
			
				tipomaquinaempresaAux.setId(this.tipomaquinaempresa.getId());	
				tipomaquinaempresaAux.setVersionRow(this.tipomaquinaempresa.getVersionRow());	
				tipomaquinaempresaAux.setid_empresa(this.tipomaquinaempresa.getid_empresa());	
				tipomaquinaempresaAux.setid_sucursal(this.tipomaquinaempresa.getid_sucursal());	
				tipomaquinaempresaAux.setid_cuenta_contable_debito(this.tipomaquinaempresa.getid_cuenta_contable_debito());	
				tipomaquinaempresaAux.setid_cuenta_contable_credito(this.tipomaquinaempresa.getid_cuenta_contable_credito());	
				tipomaquinaempresaAux.setcodigo(this.tipomaquinaempresa.getcodigo());	
				tipomaquinaempresaAux.setnombre(this.tipomaquinaempresa.getnombre());	
				tipomaquinaempresaAux.setmarca(this.tipomaquinaempresa.getmarca());	
				tipomaquinaempresaAux.setmodelo(this.tipomaquinaempresa.getmodelo());	
				tipomaquinaempresaAux.setcosto(this.tipomaquinaempresa.getcosto());	
				tipomaquinaempresaAux.setesta_activo(this.tipomaquinaempresa.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.saveTipoMaquinaEmpresas();//WithConnection
						//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomaquinaempresaLogic.saveTipoMaquinaEmpresaRelaciones(tipomaquinaempresaAux,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomaquinaempresa,tipomaquinaempresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomaquinaempresaAux=new  TipoMaquinaEmpresa();
				
				tipomaquinaempresaAux.setIsNew(false);
				tipomaquinaempresaAux.setIsChanged(false);
				
				tipomaquinaempresaAux.setIsDeleted(true);
				
				tipomaquinaempresaAux.setId(this.tipomaquinaempresa.getId());	
				tipomaquinaempresaAux.setVersionRow(this.tipomaquinaempresa.getVersionRow());	
				tipomaquinaempresaAux.setid_empresa(this.tipomaquinaempresa.getid_empresa());	
				tipomaquinaempresaAux.setid_sucursal(this.tipomaquinaempresa.getid_sucursal());	
				tipomaquinaempresaAux.setid_cuenta_contable_debito(this.tipomaquinaempresa.getid_cuenta_contable_debito());	
				tipomaquinaempresaAux.setid_cuenta_contable_credito(this.tipomaquinaempresa.getid_cuenta_contable_credito());	
				tipomaquinaempresaAux.setcodigo(this.tipomaquinaempresa.getcodigo());	
				tipomaquinaempresaAux.setnombre(this.tipomaquinaempresa.getnombre());	
				tipomaquinaempresaAux.setmarca(this.tipomaquinaempresa.getmarca());	
				tipomaquinaempresaAux.setmodelo(this.tipomaquinaempresa.getmodelo());	
				tipomaquinaempresaAux.setcosto(this.tipomaquinaempresa.getcosto());	
				tipomaquinaempresaAux.setesta_activo(this.tipomaquinaempresa.getesta_activo());	
				
				if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomaquinaempresaAux.getId()>=0) {	
						this.tipomaquinaempresasEliminados.add(tipomaquinaempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.saveTipoMaquinaEmpresas();//WithConnection
						//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinasEliminados);
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomaquinaempresaLogic.saveTipoMaquinaEmpresaRelaciones(tipomaquinaempresaAux,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());

							if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomaquinaempresaAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomaquinaempresaAux,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomaquinaempresaAux,tipomaquinaempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(this.tipomaquinaempresasEliminados);
					
					tipomaquinaempresaLogic.saveTipoMaquinaEmpresas();//WithConnection
					//tipomaquinaempresaLogic.getSetVersionRowTipoMaquinaEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa();
				
				this.tipomaquinaempresasEliminados= new ArrayList<TipoMaquinaEmpresa>();		
			}
			
			if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Maquina Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomaquinaempresa=tipomaquinaempresaAux;
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
      		//this.finishProcessTipoMaquinaEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMaquinaEmpresa tipomaquinaempresaLocal) throws Exception {
		
		if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipomaquinaempresaLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				tipomaquinaempresaLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
			
			} else {
			
				tipomaquinaempresaLocal.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinas);
				tipomaquinaempresaLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMaquinaEmpresa tipomaquinaempresaLocal) throws Exception {	
		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipomaquinaempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tipomaquinaempresaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				tipomaquinaempresaLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				tipomaquinaempresaLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMaquinaEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomaquinaempresaValidator.getInvalidValues(this.tipomaquinaempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMaquinaEmpresa tipomaquinaempresa,List<TipoMaquinaEmpresa> tipomaquinaempresas) throws Exception {
		try	{		
			TipoMaquinaEmpresaConstantesFunciones.actualizarLista(tipomaquinaempresa,tipomaquinaempresas,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMaquinaEmpresa tipomaquinaempresa,List<TipoMaquinaEmpresa> tipomaquinaempresas) throws Exception {
		try	{			
			TipoMaquinaEmpresaConstantesFunciones.actualizarSelectedLista(tipomaquinaempresa,tipomaquinaempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMaquinaEmpresa> tipomaquinaempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomaquinaempresasLocal=this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomaquinaempresasLocal=this.tipomaquinaempresas;
			}
			//ARCHITECTURE
		
			for(TipoMaquinaEmpresa tipomaquinaempresaLocal:tipomaquinaempresasLocal) {
				if(this.permiteMantenimiento(tipomaquinaempresaLocal) && tipomaquinaempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.getTipoMaquinaEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_empresaTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_sucursalTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcodigoTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelnombreTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmarcaTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.MODELO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmodeloTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcostoTipoMaquinaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMaquinaEmpresaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelesta_activoTipoMaquinaEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_empresaTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_sucursalTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcodigoTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelnombreTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmarcaTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmodeloTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcostoTipoMaquinaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelesta_activoTipoMaquinaEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			if(this.tipomaquinaempresa==null) {
				this.tipomaquinaempresa= new TipoMaquinaEmpresa();
			}

			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMaquinaEmpresa
				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.getproductoordendetaprodumaquina().setTipoMaquinaEmpresa(this.tipomaquinaempresa);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduMaquina")) {
			if(this.tipomaquinaempresa==null) {
				this.tipomaquinaempresa= new TipoMaquinaEmpresa();
			}

			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMaquinaEmpresa
				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.getproductoprodumaquina().setTipoMaquinaEmpresa(this.tipomaquinaempresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoMaquinaEmpresa--;	
		
		
		this.tipomaquinaempresaAux=new TipoMaquinaEmpresa();
		
		this.tipomaquinaempresaAux.setId(this.iIdNuevoTipoMaquinaEmpresa);
		this.tipomaquinaempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().add(this.tipomaquinaempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomaquinaempresas.add(this.tipomaquinaempresaAux);
		}
		//ARCHITECTURE
		
		this.tipomaquinaempresa=this.tipomaquinaempresaAux;
		
		if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMaquinaEmpresa(this.tipomaquinaempresa);
		}
				
		//this.setDefaultControlesTipoMaquinaEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMaquinaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMaquinaEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresaBean,this.tipomaquinaempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoMaquinaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMaquinaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.procesarEventosTipoMaquinaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this.tipomaquinaempresa,this.tipomaquinaempresaParameterGeneral,this.isEsNuevoTipoMaquinaEmpresa,classes);//this.tipomaquinaempresaLogic.getTipoMaquinaEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral,this.tipomaquinaempresaBean,false);
		
		if(this.tipomaquinaempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa());
		}
		
		if(this.tipomaquinaempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa(),classes);//this.tipomaquinaempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMaquinaEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMaquinaEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.RecargarFormTipoMaquinaEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
						
			if(tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoMaquinaEmpresa();
			
			this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMaquinaEmpresa(), this.getIndiceNuevoTipoMaquinaEmpresa());
			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMaquinaEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarcodigoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarnombreTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarmarcaTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarmodeloTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarcostoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activaresta_activoTipoMaquinaEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarid_empresaTipoMaquinaEmpresa);//
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarid_sucursalTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_debitoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setEnabled(isHabilitar && this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_creditoTipoMaquinaEmpresa);
	};
	
	public void setDefaultControlesTipoMaquinaEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMaquinaEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipomaquinaempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipomaquinaempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoMaquinaEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				if(tipomaquinaempresaAux.getId().equals(this.iIdNuevoTipoMaquinaEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresas) {
				if(tipomaquinaempresaAux.getId().equals(this.iIdNuevoTipoMaquinaEmpresa)) {
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
	
	public int getIndiceActualTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				if(tipomaquinaempresaAux.getId().equals(tipomaquinaempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresas) {
				if(tipomaquinaempresaAux.getId().equals(tipomaquinaempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				if(tipomaquinaempresaAux.getTipoMaquinaEmpresaOriginal().getId().equals(tipomaquinaempresaOriginal.getId())) {
					existe=true;
					tipomaquinaempresaOriginal.setId(tipomaquinaempresaAux.getId());
					tipomaquinaempresaOriginal.setVersionRow(tipomaquinaempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresas) {
				if(tipomaquinaempresaAux.getTipoMaquinaEmpresaOriginal().getId().equals(tipomaquinaempresaOriginal.getId())) {
					existe=true;
					tipomaquinaempresaOriginal.setId(tipomaquinaempresaAux.getId());
					tipomaquinaempresaOriginal.setVersionRow(tipomaquinaempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMaquinaEmpresa(Boolean esParaCancelar) throws Exception {
		tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
		tipomaquinaempresaAux=new TipoMaquinaEmpresa();
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
					if(tipomaquinaempresaAux.getId()<0) {
						tipomaquinaempresasAux.add(tipomaquinaempresaAux);
					}		
				}
				this.iIdNuevoTipoMaquinaEmpresa=0L;
				this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().removeAll(tipomaquinaempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresas) {
					if(tipomaquinaempresaAux.getId()<0) {
						tipomaquinaempresasAux.add(tipomaquinaempresaAux);
					}		
				}
				this.iIdNuevoTipoMaquinaEmpresa=0L;
				this.tipomaquinaempresas.removeAll(tipomaquinaempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMaquinaEmpresa 
					&& this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()>0
					) {
					tipomaquinaempresaAux=this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().get(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size() - 1);
				
					if(tipomaquinaempresaAux.getId()<0) {
						this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().remove(tipomaquinaempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMaquinaEmpresa && this.tipomaquinaempresas.size()>0) {
					tipomaquinaempresaAux=this.tipomaquinaempresas.get(this.tipomaquinaempresas.size() - 1);
				
					if(tipomaquinaempresaAux.getId()<0) {
						this.tipomaquinaempresas.remove(tipomaquinaempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMaquinaEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomaquinaempresa.getId()<0) {
				this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().remove(this.tipomaquinaempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomaquinaempresa.getId()<0) {
				this.tipomaquinaempresas.remove(this.tipomaquinaempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMaquinaEmpresa(List<TipoMaquinaEmpresa> tipomaquinaempresasAux) throws Exception {
		TipoMaquinaEmpresaConstantesFunciones.setEstadosInicialesTipoMaquinaEmpresa(tipomaquinaempresasAux);
	}
	
	public void setEstadosInicialesTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresaAux) throws Exception {
		TipoMaquinaEmpresaConstantesFunciones.setEstadosInicialesTipoMaquinaEmpresa(tipomaquinaempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMaquinaEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMaquinaEmpresaActual()) {
				if(!this.isEsNuevoTipoMaquinaEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMaquinaEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMaquinaEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Maquina Empresa ?", "MANTENIMIENTO DE Tipo Maquina Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMaquinaEmpresa tipomaquinaempresa) throws Exception {
		TipoMaquinaEmpresaConstantesFunciones.seleccionarAsignar(this.tipomaquinaempresa,tipomaquinaempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMaquinaEmpresa=this.isPermisoActualizarOriginalTipoMaquinaEmpresa;
			
			
			this.seleccionarAsignar(tipomaquinaempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMaquinaEmpresaConstantesFunciones.quitarEspaciosTipoMaquinaEmpresa(this.tipomaquinaempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomaquinaempresaSessionBean.setsFuncionBusquedaRapida(this.tipomaquinaempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMaquinaEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMaquinaEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoMaquinaEmpresa(esParaCancelar);								
			}
			
			this.tipomaquinaempresa=new TipoMaquinaEmpresa();
			
			this.inicializarTipoMaquinaEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMaquinaEmpresa() throws Exception {
		try {
			TipoMaquinaEmpresaConstantesFunciones.inicializarTipoMaquinaEmpresa(this.tipomaquinaempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMaquinaEmpresas(String sAccionBusqueda,List<TipoMaquinaEmpresa> tipomaquinaempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMaquinaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMaquinaEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMaquinaEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMaquinaEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Maquina Empresas");		
		parameters.put("busquedapor", TipoMaquinaEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoOrdenDetaProduMaquina.class));
			classes.add(new Classe(ProductoProduMaquina.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoMaquinaEmpresaLogic tipomaquinaempresaLogicAuxiliar=new TipoMaquinaEmpresaLogic();
					tipomaquinaempresaLogicAuxiliar.setDatosCliente(tipomaquinaempresaLogic.getDatosCliente());				
					tipomaquinaempresaLogicAuxiliar.setTipoMaquinaEmpresas(tipomaquinaempresasParaReportes);
					
					tipomaquinaempresaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoMaquinaEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipomaquinaempresasParaReportes=tipomaquinaempresaLogicAuxiliar.getTipoMaquinaEmpresas();
					
					//tipomaquinaempresaLogic.getNewConnexionToDeep();
					
					//for (TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasParaReportes) {
					//	tipomaquinaempresaLogic.deepLoad(tipomaquinaempresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipomaquinaempresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProductoOrdenDetaProduMaquina = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduMaquinaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoordendetaprodumaquina", reportFileProductoOrdenDetaProduMaquina);

			InputStream reportFileProductoProduMaquina = AuxiliarReportes.class.getResourceAsStream("ProductoProduMaquinaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumaquina", reportFileProductoProduMaquina);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMaquinaEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMaquinaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMaquinaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMaquinaEmpresa=new JRBeanArrayDataSource(TipoMaquinaEmpresaJInternalFrame.TraerTipoMaquinaEmpresaBeans(tipomaquinaempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMaquinaEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMaquinaEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMaquinaEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMaquinaEmpresaBean.TraerTipoMaquinaEmpresaBeans(tipomaquinaempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMaquinaEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipomaquinaempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMaquinaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMaquinaEmpresa> tipomaquinaempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMaquinaEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMaquinaEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMaquinaEmpresa tipomaquinaempresa : tipomaquinaempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMaquinaEmpresaConstantesFunciones.generarExcelReporteDataTipoMaquinaEmpresa("NORMAL",row,workbook,tipomaquinaempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMaquinaEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoMaquinaEmpresaConstantesFunciones.generarExcelReporteHeaderTipoMaquinaEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMaquinaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMaquinaEmpresa> tipomaquinaempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMaquinaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMaquinaEmpresa tipomaquinaempresa : tipomaquinaempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getmodelo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomaquinaempresa.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipomaquinaempresa.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMaquinaEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMaquinaEmpresa> tipomaquinaempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMaquinaEmpresa> tipomaquinaempresasRespaldo=null;
		
		classes=TipoMaquinaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMaquinaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomaquinaempresaLogic.setDatosCliente(this.datosCliente);
		this.tipomaquinaempresaLogic.setDatosDeep(this.datosDeep);
		this.tipomaquinaempresaLogic.setIsConDeep(true);
		
		tipomaquinaempresasRespaldo=this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas();
		
		this.tipomaquinaempresaLogic.setTipoMaquinaEmpresas(tipomaquinaempresasParaReportes);	
		this.tipomaquinaempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomaquinaempresasParaReportes=this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas();
		this.tipomaquinaempresaLogic.setTipoMaquinaEmpresas(tipomaquinaempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMaquinaEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMaquinaEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMaquinaEmpresa tipomaquinaempresa : tipomaquinaempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMaquinaEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMaquinaEmpresaConstantesFunciones.generarExcelReporteDataTipoMaquinaEmpresa("NORMAL",row,workbook,tipomaquinaempresa,cellStyleDataAux);
		
			
			


				//ProductoOrdenDetaProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas()!=null && tipomaquinaempresa.getProductoOrdenDetaProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas()!=null) {
					i2=0;
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : tipomaquinaempresa.getProductoOrdenDetaProduMaquinas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMaquina("RELACIONADO",row,workbook,productoordendetaprodumaquina,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomaquinaempresa.getProductoProduMaquinas()!=null && tipomaquinaempresa.getProductoProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoProduMaquina("RELACIONADO",row,workbook);
				}

				if(tipomaquinaempresa.getProductoProduMaquinas()!=null) {
					i2=0;
					for(ProductoProduMaquina productoprodumaquina : tipomaquinaempresa.getProductoProduMaquinas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduMaquinaConstantesFunciones.generarExcelReporteDataProductoProduMaquina("RELACIONADO",row,workbook,productoprodumaquina,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMaquinaEmpresa() throws Exception {		
		this.startProcessTipoMaquinaEmpresa(true);
	}
	
	public void startProcessTipoMaquinaEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMaquinaEmpresa ,this.jPanelParametrosReportesTipoMaquinaEmpresa, this.jScrollPanelDatosTipoMaquinaEmpresa,this.jPanelPaginacionTipoMaquinaEmpresa, this.jScrollPanelDatosEdicionTipoMaquinaEmpresa, this.jPanelAccionesTipoMaquinaEmpresa,this.jPanelAccionesFormularioTipoMaquinaEmpresa,this.jmenuBarTipoMaquinaEmpresa,this.jmenuBarDetalleTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMaquinaEmpresa=this.jTabbedPaneBusquedasTipoMaquinaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoMaquinaEmpresa=this.jPanelParametrosReportesTipoMaquinaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoMaquinaEmpresa=this.jScrollPanelDatosTipoMaquinaEmpresa;
		final JTable jTableDatosTipoMaquinaEmpresa=this.jTableDatosTipoMaquinaEmpresa;		
		final JPanel jPanelPaginacionTipoMaquinaEmpresa=this.jPanelPaginacionTipoMaquinaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoMaquinaEmpresa=this.jScrollPanelDatosEdicionTipoMaquinaEmpresa;
		final JPanel jPanelAccionesTipoMaquinaEmpresa=this.jPanelAccionesTipoMaquinaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoMaquinaEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			jPanelCamposAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelCamposTipoMaquinaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelAccionesFormularioTipoMaquinaEmpresa;
		}
		
		final JPanel jPanelCamposTipoMaquinaEmpresa=jPanelCamposAuxiliarTipoMaquinaEmpresa;
		final JPanel jPanelAccionesFormularioTipoMaquinaEmpresa=jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa;
		
		
		final JMenuBar jmenuBarTipoMaquinaEmpresa=this.jmenuBarTipoMaquinaEmpresa;
		final JToolBar jTtoolBarTipoMaquinaEmpresa=this.jTtoolBarTipoMaquinaEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMaquinaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jmenuBarDetalleTipoMaquinaEmpresa;
			jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTtoolBarDetalleTipoMaquinaEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoMaquinaEmpresa=jmenuBarDetalleAuxiliarTipoMaquinaEmpresa;
		final JToolBar jTtoolBarDetalleTipoMaquinaEmpresa=jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMaquinaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMaquinaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoMaquinaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoMaquinaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMaquinaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMaquinaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMaquinaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMaquinaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMaquinaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoMaquinaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMaquinaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMaquinaEmpresa ,jPanelParametrosReportesTipoMaquinaEmpresa,jTableDatosTipoMaquinaEmpresa, /*jScrollPanelDatosTipoMaquinaEmpresa,*/jPanelCamposTipoMaquinaEmpresa,jPanelPaginacionTipoMaquinaEmpresa, /*jScrollPanelDatosEdicionTipoMaquinaEmpresa,*/ jPanelAccionesTipoMaquinaEmpresa,jPanelAccionesFormularioTipoMaquinaEmpresa,jmenuBarTipoMaquinaEmpresa,jmenuBarDetalleTipoMaquinaEmpresa,jTtoolBarTipoMaquinaEmpresa,jTtoolBarDetalleTipoMaquinaEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMaquinaEmpresa ,jPanelParametrosReportesTipoMaquinaEmpresa, jScrollPanelDatosTipoMaquinaEmpresa,jPanelPaginacionTipoMaquinaEmpresa, jScrollPanelDatosEdicionTipoMaquinaEmpresa, jPanelAccionesTipoMaquinaEmpresa,jPanelAccionesFormularioTipoMaquinaEmpresa,jmenuBarTipoMaquinaEmpresa,jmenuBarDetalleTipoMaquinaEmpresa,jTtoolBarTipoMaquinaEmpresa,jTtoolBarDetalleTipoMaquinaEmpresa);
						
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
	
	public void finishProcessTipoMaquinaEmpresa() {// throws Exception 
		this.finishProcessTipoMaquinaEmpresa(true);
	}
	
	public void finishProcessTipoMaquinaEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMaquinaEmpresa ,this.jPanelParametrosReportesTipoMaquinaEmpresa, this.jScrollPanelDatosTipoMaquinaEmpresa,this.jPanelPaginacionTipoMaquinaEmpresa, this.jScrollPanelDatosEdicionTipoMaquinaEmpresa, this.jPanelAccionesTipoMaquinaEmpresa,this.jPanelAccionesFormularioTipoMaquinaEmpresa,this.jmenuBarTipoMaquinaEmpresa,this.jmenuBarDetalleTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMaquinaEmpresa=this.jTabbedPaneBusquedasTipoMaquinaEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoMaquinaEmpresa=this.jPanelParametrosReportesTipoMaquinaEmpresa;
		//final JScrollPane jScrollPanelDatosTipoMaquinaEmpresa=this.jScrollPanelDatosTipoMaquinaEmpresa;
		final JTable jTableDatosTipoMaquinaEmpresa=this.jTableDatosTipoMaquinaEmpresa;		
		final JPanel jPanelPaginacionTipoMaquinaEmpresa=this.jPanelPaginacionTipoMaquinaEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoMaquinaEmpresa=this.jScrollPanelDatosEdicionTipoMaquinaEmpresa;
		final JPanel jPanelAccionesTipoMaquinaEmpresa=this.jPanelAccionesTipoMaquinaEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoMaquinaEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			jPanelCamposAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelCamposTipoMaquinaEmpresa;
			jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelAccionesFormularioTipoMaquinaEmpresa;
		}
		
		final JPanel jPanelCamposTipoMaquinaEmpresa=jPanelCamposAuxiliarTipoMaquinaEmpresa;
		final JPanel jPanelAccionesFormularioTipoMaquinaEmpresa=jPanelAccionesFormularioAuxiliarTipoMaquinaEmpresa;
		
		
		final JMenuBar jmenuBarTipoMaquinaEmpresa=this.jmenuBarTipoMaquinaEmpresa;		
		final JToolBar jTtoolBarTipoMaquinaEmpresa=this.jTtoolBarTipoMaquinaEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMaquinaEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jmenuBarDetalleTipoMaquinaEmpresa;
			jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTtoolBarDetalleTipoMaquinaEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMaquinaEmpresa=jmenuBarDetalleAuxiliarTipoMaquinaEmpresa;
		final JToolBar jTtoolBarDetalleTipoMaquinaEmpresa=jTtoolBarDetalleAuxiliarTipoMaquinaEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMaquinaEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMaquinaEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoMaquinaEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoMaquinaEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMaquinaEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMaquinaEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMaquinaEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMaquinaEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMaquinaEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoMaquinaEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMaquinaEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMaquinaEmpresa ,jPanelParametrosReportesTipoMaquinaEmpresa, jTableDatosTipoMaquinaEmpresa,/*jScrollPanelDatosTipoMaquinaEmpresa,*/jPanelCamposTipoMaquinaEmpresa,jPanelPaginacionTipoMaquinaEmpresa, /*jScrollPanelDatosEdicionTipoMaquinaEmpresa,*/ jPanelAccionesTipoMaquinaEmpresa,jPanelAccionesFormularioTipoMaquinaEmpresa,jmenuBarTipoMaquinaEmpresa,jmenuBarDetalleTipoMaquinaEmpresa,jTtoolBarTipoMaquinaEmpresa,jTtoolBarDetalleTipoMaquinaEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMaquinaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMaquinaEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMaquinaEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMaquinaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMaquinaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMaquinaEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMaquinaEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMaquinaEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMaquinaEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomaquinaempresaConstantesFunciones.getsFinalQueryTipoMaquinaEmpresa();
		String  finalQueryPaginacionTodos=this.tipomaquinaempresaConstantesFunciones.getsFinalQueryTipoMaquinaEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMaquinaEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoMaquinaEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMaquinaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMaquinaEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMaquinaEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomaquinaempresasEliminados= new ArrayList<TipoMaquinaEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMaquinaEmpresa();
		
				///*TipoMaquinaEmpresaSessionBean*/this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			
			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoMaquinaEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMaquinaEmpresaConstantesFunciones.getClassesForeignKeysOfTipoMaquinaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomaquinaempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomaquinaempresasAux= new ArrayList<TipoMaquinaEmpresa>();
			
				
			tipomaquinaempresaLogic.setDatosCliente(this.datosCliente);
			tipomaquinaempresaLogic.setDatosDeep(this.datosDeep);
			tipomaquinaempresaLogic.setIsConDeep(true);
			
			
			tipomaquinaempresaLogic.getTipoMaquinaEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomaquinaempresaLogic.getTodosTipoMaquinaEmpresas(finalQueryGlobal,pagination);
					
					//tipomaquinaempresaLogic.getTodosTipoMaquinaEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomaquinaempresaLogic.getTipoMaquinaEmpresas()==null|| tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomaquinaempresasAux= new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresaLogic.getTipoMaquinaEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresasAux= new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomaquinaempresaLogic.getTodosTipoMaquinaEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipomaquinaempresaLogic.getTodosTipoMaquinaEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresaLogic.getTipoMaquinaEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());					
							tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(tipomaquinaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresas.addAll(tipomaquinaempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMaquinaEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMaquinaEmpresa=this.idActual;
				
				} else if(this.idTipoMaquinaEmpresaActual!=null && this.idTipoMaquinaEmpresaActual!=0L) {
					idTipoMaquinaEmpresa=idTipoMaquinaEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoMaquinaEmpresa);
				
				this.tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomaquinaempresaLogic.getEntity(idTipoMaquinaEmpresa);
					
					//tipomaquinaempresaLogic.getEntityWithConnection(idTipoMaquinaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());
					tipomaquinaempresaLogic.getTipoMaquinaEmpresas().add(tipomaquinaempresaLogic.getTipoMaquinaEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
					this.tipomaquinaempresas.add(tipomaquinaempresa);
				}
				
				if(tipomaquinaempresaLogic.getTipoMaquinaEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomaquinaempresaLogic.getTipoMaquinaEmpresas()==null||tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomaquinaempresas==null|| tipomaquinaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
						tipomaquinaempresasAux.addAll(tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMaquinaEmpresas("FK_IdCuentaContableCredito",tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMaquinaEmpresas("FK_IdCuentaContableCredito",tipomaquinaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());
						tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(tipomaquinaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresas.addAll(tipomaquinaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDebito")) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomaquinaempresaLogic.getTipoMaquinaEmpresas()==null||tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomaquinaempresas==null|| tipomaquinaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
						tipomaquinaempresasAux.addAll(tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMaquinaEmpresas("FK_IdCuentaContableDebito",tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMaquinaEmpresas("FK_IdCuentaContableDebito",tipomaquinaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());
						tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(tipomaquinaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresas.addAll(tipomaquinaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomaquinaempresaLogic.getTipoMaquinaEmpresas()==null||tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomaquinaempresas==null|| tipomaquinaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
						tipomaquinaempresasAux.addAll(tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMaquinaEmpresas("FK_IdEmpresa",tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMaquinaEmpresas("FK_IdEmpresa",tipomaquinaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());
						tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(tipomaquinaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresas.addAll(tipomaquinaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomaquinaempresaLogic.getTipoMaquinaEmpresas()==null||tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomaquinaempresas==null|| tipomaquinaempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
						tipomaquinaempresasAux.addAll(tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresasAux=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresasAux.addAll(tipomaquinaempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMaquinaEmpresaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMaquinaEmpresas("FK_IdSucursal",tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMaquinaEmpresas("FK_IdSucursal",tipomaquinaempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaLogic.setTipoMaquinaEmpresas(new ArrayList<TipoMaquinaEmpresa>());
						tipomaquinaempresaLogic.getTipoMaquinaEmpresas().addAll(tipomaquinaempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
							tipomaquinaempresas.addAll(tipomaquinaempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMaquinaEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMaquinaEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomaquinaempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomaquinaempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMaquinaEmpresa tipomaquinaempresa) {
		Boolean permite=true;
		
		if(this.tipomaquinaempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMaquinaEmpresaConstantesFunciones.getOrderByListaTipoMaquinaEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMaquinaEmpresaConstantesFunciones.getOrderByListaTipoMaquinaEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				if(tipomaquinaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomaquinaempresaTotales=tipomaquinaempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresas) {
				if(tipomaquinaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomaquinaempresaTotales=tipomaquinaempresa;
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
			this.tipomaquinaempresaAux=new TipoMaquinaEmpresa();
			this.tipomaquinaempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipomaquinaempresaAux.setIsNew(false);
			this.tipomaquinaempresaAux.setIsChanged(false);
			this.tipomaquinaempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMaquinaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMaquinaEmpresa(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this.tipomaquinaempresaAux);
				
				this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().add(this.tipomaquinaempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMaquinaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMaquinaEmpresa(this.tipomaquinaempresas,this.tipomaquinaempresaAux);
				
				this.tipomaquinaempresas.add(this.tipomaquinaempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomaquinaempresaTotales=new TipoMaquinaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().remove(tipomaquinaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomaquinaempresas.remove(tipomaquinaempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomaquinaempresaTotales=new TipoMaquinaEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				if(tipomaquinaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomaquinaempresaTotales=tipomaquinaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMaquinaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMaquinaEmpresa(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),tipomaquinaempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresas) {
				if(tipomaquinaempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipomaquinaempresaTotales=tipomaquinaempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMaquinaEmpresaConstantesFunciones.TotalizarValoresFilaTipoMaquinaEmpresa(this.tipomaquinaempresas,tipomaquinaempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMaquinaEmpresasFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMaquinaEmpresasFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMaquinaEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMaquinaEmpresasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMaquinaEmpresasFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMaquinaEmpresasFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMaquinaEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMaquinaEmpresasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getTipoMaquinaEmpresasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosTipoMaquinaEmpresa() {
		this.isPermisoTodoTipoMaquinaEmpresa=false;
		this.isPermisoNuevoTipoMaquinaEmpresa=false;
		this.isPermisoActualizarTipoMaquinaEmpresa=false;
		this.isPermisoActualizarOriginalTipoMaquinaEmpresa=false;
		this.isPermisoEliminarTipoMaquinaEmpresa=false;
		this.isPermisoGuardarCambiosTipoMaquinaEmpresa=false;
		this.isPermisoConsultaTipoMaquinaEmpresa=false;
		this.isPermisoBusquedaTipoMaquinaEmpresa=false;
		this.isPermisoReporteTipoMaquinaEmpresa=false;		
		this.isPermisoOrdenTipoMaquinaEmpresa=false;		
		this.isPermisoPaginacionMedioTipoMaquinaEmpresa=false;		
		this.isPermisoPaginacionAltoTipoMaquinaEmpresa=false;
		this.isPermisoPaginacionTodoTipoMaquinaEmpresa=false;
		this.isPermisoCopiarTipoMaquinaEmpresa=false;		
		this.isPermisoVerFormTipoMaquinaEmpresa=false;		
		this.isPermisoDuplicarTipoMaquinaEmpresa=false;		
		this.isPermisoOrdenTipoMaquinaEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoMaquinaEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoMaquinaEmpresa=isPermiso;
		this.isPermisoNuevoTipoMaquinaEmpresa=isPermiso;
		this.isPermisoActualizarTipoMaquinaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoMaquinaEmpresa=isPermiso;
		this.isPermisoEliminarTipoMaquinaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoMaquinaEmpresa=isPermiso;
		this.isPermisoConsultaTipoMaquinaEmpresa=isPermiso;
		this.isPermisoBusquedaTipoMaquinaEmpresa=isPermiso;
		this.isPermisoReporteTipoMaquinaEmpresa=isPermiso;
		this.isPermisoOrdenTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoCopiarTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoVerFormTipoMaquinaEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoMaquinaEmpresa=isPermiso;
		this.isPermisoOrdenTipoMaquinaEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMaquinaEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoMaquinaEmpresa=isPermiso;
		this.isPermisoNuevoTipoMaquinaEmpresa=isPermiso;
		this.isPermisoActualizarTipoMaquinaEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoMaquinaEmpresa=isPermiso;
		this.isPermisoEliminarTipoMaquinaEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoMaquinaEmpresa=isPermiso;
		//this.isPermisoConsultaTipoMaquinaEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoMaquinaEmpresa=isPermiso;
		//this.isPermisoReporteTipoMaquinaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoMaquinaEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMaquinaEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMaquinaEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMaquinaEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoMaquinaEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoMaquinaEmpresa=isPermiso;
		//this.isPermisoOrdenTipoMaquinaEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMaquinaEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoMaquinaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoOrdenDetaProduMaquina=false;
		this.isTienePermisosProductoOrdenDetaProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoMaquinaEmpresaClaseRelacionada(this.opcionsRelacionadas,ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduMaquina=false;
		this.isTienePermisosProductoProduMaquina=this.verificarGetPermisosUsuarioOpcionTipoMaquinaEmpresaClaseRelacionada(this.opcionsRelacionadas,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMaquinaEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMaquinaEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoOrdenDetaProduMaquina=conPermiso;
		this.isTienePermisosProductoProduMaquina=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMaquinaEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMaquinaEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMaquinaEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoOrdenDetaProduMaquina && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.remove(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduMaquina && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.remove(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoMaquinaEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMaquinaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMaquinaEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMaquinaEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMaquinaEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMaquinaEmpresa=this.isPermisoActualizarTipoMaquinaEmpresa;
			this.isPermisoEliminarTipoMaquinaEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMaquinaEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMaquinaEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMaquinaEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMaquinaEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMaquinaEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMaquinaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMaquinaEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMaquinaEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMaquinaEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMaquinaEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMaquinaEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMaquinaEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMaquinaEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMaquinaEmpresa.setToolTipText(this.jTableDatosTipoMaquinaEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMaquinaEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMaquinaEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMaquinaEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden Maquina");
			reporte.setsDescripcion("Orden Maquina");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Maquina Produccion");
			reporte.setsDescripcion("Producto Maquina Produccion");
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
	public void inicializarCombosForeignKeyTipoMaquinaEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.cuentacontabledebitosForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMaquinaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMaquinaEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMaquinaEmpresaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoMaquinaEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaReturnGeneral=new TipoMaquinaEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipomaquinaempresaConstantesFunciones.cargarid_empresaTipoMaquinaEmpresa)
					 || (this.esRecargarFks && this.tipomaquinaempresaConstantesFunciones.cargarid_empresaTipoMaquinaEmpresa)) {

					if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipomaquinaempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.tipomaquinaempresaConstantesFunciones.cargarid_sucursalTipoMaquinaEmpresa)
					 || (this.esRecargarFks && this.tipomaquinaempresaConstantesFunciones.cargarid_sucursalTipoMaquinaEmpresa)) {

					if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+tipomaquinaempresaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_debitoTipoMaquinaEmpresa)
					 || (this.esRecargarFks && this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_debitoTipoMaquinaEmpresa)) {

					if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+tipomaquinaempresaSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_creditoTipoMaquinaEmpresa)
					 || (this.esRecargarFks && this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_creditoTipoMaquinaEmpresa)) {

					if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+tipomaquinaempresaSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.cargarCombosLoteForeignKeyTipoMaquinaEmpresa(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipomaquinaempresaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=tipomaquinaempresaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=tipomaquinaempresaReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=tipomaquinaempresaReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMaquinaEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCuentaContableDebito();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDebito()throws Exception {
		try {

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				CuentaContable cuentacontabledebito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledebito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledebitosForeignKey,cuentacontabledebito,true)) {

					this.cuentacontabledebitosForeignKey.add(0,cuentacontabledebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.tipomaquinaempresaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoMaquinaEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMaquinaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMaquinaEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMaquinaEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa)throws Exception {	
		try {
			
			this.setActualCuentaContableDebitoForeignKey(tipomaquinaempresa.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(tipomaquinaempresa.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMaquinaEmpresa()throws Exception {	
		try {
			
			this.setActualCuentaContableDebitoForeignKey(this.tipomaquinaempresaConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.tipomaquinaempresaConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMaquinaEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMaquinaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMaquinaEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMaquinaEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMaquinaEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMaquinaEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMaquinaEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public TipoMaquinaEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMaquinaEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMaquinaEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean(); 
		this.tipomaquinaempresaConstantesFunciones=new TipoMaquinaEmpresaConstantesFunciones(); 
		this.tipomaquinaempresaBean=new TipoMaquinaEmpresa();//(this.tipomaquinaempresaConstantesFunciones); 		
		this.tipomaquinaempresaReturnGeneral=new TipoMaquinaEmpresaParameterReturnGeneral(); 
		
		this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomaquinaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMaquinaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMaquinaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMaquinaEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMaquinaEmpresa(true);
			
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
			
			this.tipomaquinaempresaConstantesFunciones=new TipoMaquinaEmpresaConstantesFunciones(); 
			this.tipomaquinaempresaBean=new TipoMaquinaEmpresa();//this.tipomaquinaempresaConstantesFunciones); 			
			this.tipomaquinaempresaReturnGeneral=new TipoMaquinaEmpresaParameterReturnGeneral(); 
		
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Maquina Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipomaquinaempresa=new TipoMaquinaEmpresa();
			this.tipomaquinaempresas = new ArrayList<TipoMaquinaEmpresa>();
			this.tipomaquinaempresasAux = new ArrayList<TipoMaquinaEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic=new TipoMaquinaEmpresaLogic();
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomaquinaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMaquinaEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoMaquinaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMaquinaEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMaquinaEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMaquinaEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMaquinaEmpresa);
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa);
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMaquinaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMaquinaEmpresa);
					this.jInternalFrameImportacionTipoMaquinaEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoMaquinaEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMaquinaEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMaquinaEmpresa);
					this.jInternalFrameOrderByTipoMaquinaEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoMaquinaEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMaquinaEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMaquinaEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomaquinaempresaReturnGeneral=new TipoMaquinaEmpresaParameterReturnGeneral();
			
			this.tipomaquinaempresaParameterGeneral=new TipoMaquinaEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomaquinaempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMaquinaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),this.tipomaquinaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMaquinaEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),this.tipomaquinaempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			
			
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMaquinaEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMaquinaEmpresa(false);
			
			this.setPermisosUsuarioTipoMaquinaEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() && this.tipomaquinaempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMaquinaEmpresaClasesRelacionadas();
			}
			
			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMaquinaEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMaquinaEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMaquinaEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoMaquinaEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMaquinaEmpresa,this.isPermisoPaginacionMedioTipoMaquinaEmpresa,this.isPermisoPaginacionTodoTipoMaquinaEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMaquinaEmpresaConstantesFunciones.getTiposSeleccionarTipoMaquinaEmpresa());
				
				this.tiposColumnasSelect=TipoMaquinaEmpresaConstantesFunciones.getTiposSeleccionarTipoMaquinaEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoMaquinaEmpresa();				
				//this.tiposRelacionesSelect=TipoMaquinaEmpresaConstantesFunciones.getTiposRelacionesTipoMaquinaEmpresa(true);
				
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
			//if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMaquinaEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoMaquinaEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoMaquinaEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMaquinaEmpresa() ;
			
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
			
			
			this.productoordendetaprodumaquinaLogic=new ProductoOrdenDetaProduMaquinaLogic();
			this.productoprodumaquinaLogic=new ProductoProduMaquinaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.cuentacontabledebitoLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipomaquinaempresaImplementable= (TipoMaquinaEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMaquinaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomaquinaempresaImplementableHome= (TipoMaquinaEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMaquinaEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomaquinaempresas= new ArrayList<TipoMaquinaEmpresa>();
			this.tipomaquinaempresasEliminados= new ArrayList<TipoMaquinaEmpresa>();
						
			this.isEsNuevoTipoMaquinaEmpresa=false;
			this.esParaAccionDesdeFormularioTipoMaquinaEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMaquinaEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMaquinaEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMaquinaEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMaquinaEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMaquinaEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMaquinaEmpresa();
			}
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMaquinaEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMaquinaEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMaquinaEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMaquinaEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Orden Maquinaes")) {
					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMaquinaEmpresa();

						this.cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Maquina Producciones")) {
					if(!ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMaquinaEmpresa();

						this.cargarParteTabPanelRelacionadaProductoProduMaquina(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMaquinaEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProductoOrdenDetaProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(false,true,iIndex);
		this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();

		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(false,true,iIndex);
		this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMaquina();

		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
				int row=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
				jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduMaquina")) {
				int row=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
				jButtonProductoProduMaquinaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Orden Maquina")) {

					if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden Maquinaes"+"("+ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden Maquinaes");

						if(tipomaquinaempresaConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomaquinaempresaConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa);
						}

						jmenuItem.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoOrdenDetaProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jmenuDetalleTipoMaquinaEmpresa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Maquina Produccion")) {

					if(this.isTienePermisosProductoProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Maquina Producciones"+"("+ProductoProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Maquina Producciones");

						if(tipomaquinaempresaConstantesFunciones.resaltarProductoProduMaquinaTipoMaquinaEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomaquinaempresaConstantesFunciones.resaltarProductoProduMaquinaTipoMaquinaEmpresa);
						}

						jmenuItem.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarProductoProduMaquinaTipoMaquinaEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMaquina"));

						

						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jmenuDetalleTipoMaquinaEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoMaquinaEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMaquinaEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMaquinaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMaquinaEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMaquinaEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoMaquinaEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMaquinaEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMaquinaEmpresa();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContableDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoMaquinaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			
			if(jTableDatosTipoMaquinaEmpresa.getRowCount()>=1) {
				jTableDatosTipoMaquinaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoMaquinaEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMaquinaEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMaquinaEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(true);			
			//this.tipomaquinaempresa=new TipoMaquinaEmpresa();
			//this.tipomaquinaempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa() ;
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMaquinaEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomaquinaempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);				
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMaquinaEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMaquinaEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMaquinaEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMaquinaEmpresa.getSelectedRows().length;			
			}
			
			tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMaquinaEmpresa--;			
				//TipoMaquinaEmpresa tipomaquinaempresaAux= new TipoMaquinaEmpresa();			
				//tipomaquinaempresaAux.setId(this.iIdNuevoTipoMaquinaEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMaquinaEmpresa tipomaquinaempresaOrigen=new TipoMaquinaEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMaquinaEmpresa tipomaquinaempresaOrigen : tipomaquinaempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomaquinaempresaOrigen =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomaquinaempresaOrigen =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMaquinaEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomaquinaempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMaquinaEmpresa(tipomaquinaempresaOrigen,this.tipomaquinaempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().add(this.tipomaquinaempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresas.add(this.tipomaquinaempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
				
				this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMaquinaEmpresa(), this.getIndiceNuevoTipoMaquinaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoMaquinaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMaquinaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMaquinaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();									
		
			TipoMaquinaEmpresa tipomaquinaempresaOrigen=new TipoMaquinaEmpresa();
			TipoMaquinaEmpresa tipomaquinaempresaDestino=new TipoMaquinaEmpresa();
				
			tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMaquinaEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomaquinaempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMaquinaEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaOrigen =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomaquinaempresaOrigen =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomaquinaempresaDestino =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomaquinaempresaDestino =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomaquinaempresaOrigen =tipomaquinaempresasSeleccionados.get(0);
				tipomaquinaempresaDestino =tipomaquinaempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMaquinaEmpresa(tipomaquinaempresaOrigen,tipomaquinaempresaDestino,true,false);
				
				tipomaquinaempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomaquinaempresaDestino,tipomaquinaempresaLogic.getTipoMaquinaEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomaquinaempresaDestino,tipomaquinaempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
				
				//this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMaquinaEmpresa(), this.getIndiceNuevoTipoMaquinaEmpresa());
				
				int iLastRow =  this.jTableDatosTipoMaquinaEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMaquinaEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMaquinaEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMaquinaEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoMaquinaEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMaquinaEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMaquinaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMaquinaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMaquinaEmpresa();
			
			this.abrirFrameOrderByTipoMaquinaEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMaquinaEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMaquinaEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMaquinaEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSize(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMaquinaEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMaquinaEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth(),TipoMaquinaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth(),TipoMaquinaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth(),TipoMaquinaEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina();
					}

					if(ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMaquina();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMaquinaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMaquinaEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMaquinaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMaquinaEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoMaquinaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMaquinaEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMaquinaEmpresa);
				this.jInternalFrameOrderByTipoMaquinaEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoMaquinaEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoMaquinaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMaquinaEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMaquinaEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMaquinaEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMaquinaEmpresa==null) {
				
				this.jInternalFrameImportacionTipoMaquinaEmpresa=new ImportacionJInternalFrame(TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMaquinaEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMaquinaEmpresa);
				this.jInternalFrameImportacionTipoMaquinaEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoMaquinaEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMaquinaEmpresa"));
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMaquinaEmpresa"));
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMaquinaEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMaquinaEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa=new ReporteDinamicoJInternalFrame(TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa);
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMaquinaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMaquinaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMaquinaEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMaquinaEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProductoOrdenDetaProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jContentPaneDetalleTipoMaquinaEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoMaquinaEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMaquinaEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoMaquinaEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMaquinaEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMaquinaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMaquinaEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoMaquinaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMaquinaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoMaquinaEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMaquinaEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoMaquinaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMaquinaEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMaquinaEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMaquinaEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoMaquinaEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableDebito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDebito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDebito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMaquinaEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMaquinaEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(true);
			//this.isEsNuevoTipoMaquinaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false) ;
			
			if(tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMaquinaEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMaquinaEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMaquinaEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(true);
			//this.isEsNuevoTipoMaquinaEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomaquinaempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false) ;
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMaquinaEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCuentaContableDebito(List<CuentaContable> cuentacontabledebitosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledebitosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMaquinaEmpresa(false);
			
			//if(!this.isEsNuevoTipoMaquinaEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipomaquinaempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMaquinaEmpresa=true;
					this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
					this.isEsNuevoTipoMaquinaEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMaquinaEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMaquinaEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(false);
			
												
				
				if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMaquinaEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,tipomaquinaempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMaquinaEmpresa(this.tipomaquinaempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomaquinaempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomaquinaempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomaquinaempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipomaquinaempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomaquinaempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMaquinaEmpresaModel) this.jTableDatosTipoMaquinaEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMaquinaEmpresa=true;
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
				this.isEsNuevoTipoMaquinaEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(false);
				
				
				
				if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMaquinaEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMaquinaEmpresa.getRowCount()>=1) {
				jTableDatosTipoMaquinaEmpresa.removeRowSelectionInterval(0, jTableDatosTipoMaquinaEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMaquinaEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(false) ;
			
			this.isEsNuevoTipoMaquinaEmpresa=false;
			
			if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMaquinaEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				
				//SI ES MANUAL
				if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMaquinaEmpresa--;			
			//TipoMaquinaEmpresa tipomaquinaempresaAux= new TipoMaquinaEmpresa();			
			//tipomaquinaempresaAux.setId(this.iIdNuevoTipoMaquinaEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMaquinaEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
			
			this.tipomaquinaempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().add(this.tipomaquinaempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomaquinaempresas.add(this.tipomaquinaempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			
			this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoMaquinaEmpresa(), this.getIndiceNuevoTipoMaquinaEmpresa());
			
			int iLastRow =  this.jTableDatosTipoMaquinaEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMaquinaEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMaquinaEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();
			}
			
			//this.abrirFrameTreeTipoMaquinaEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Maquina EmpresaS ?", "MANTENIMIENTO DE Tipo Maquina Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMaquinaEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMaquinaEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.procesarImportacionTipoMaquinaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomaquinaempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMaquinaEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMaquinaEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMaquinaEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoMaquinaEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMaquinaEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMaquinaEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		

		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMaquinaEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMaquinaEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_delo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_delo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_delo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_delo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoria="modelo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoriaValor="modelo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modelo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modelo");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMaquinaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getmodelo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomaquinaempresa.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelTipoMaquinaEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMaquinaEmpresa(tipomaquinaempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
			
			//SI ES MANUAL
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMaquinaEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMaquinaEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMaquinaEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMaquinaEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMaquinaEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMaquinaEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMaquinaEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMaquinaEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMaquinaEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMaquinaEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMaquinaEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMaquinaEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMaquinaEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMaquinaEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMaquinaEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMaquinaEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMaquinaEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMaquinaEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMaquinaEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMaquinaEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMaquinaEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMaquinaEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMaquinaEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMaquinaEmpresa() throws Exception {
		try	{
			if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMaquinaEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMaquinaEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMaquinaEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMaquinaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMaquinaEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMaquinaEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMaquinaEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoMaquinaEmpresaConstantesFunciones.getTiposSeleccionarTipoMaquinaEmpresa(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoMaquinaEmpresaConstantesFunciones.getTiposSeleccionarTipoMaquinaEmpresa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoMaquinaEmpresaConstantesFunciones.getTiposSeleccionarTipoMaquinaEmpresa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMaquinaEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.getSelectedItem()!=null){this.id_cuenta_contable_debitoFK_IdCuentaContableDebito=((CuentaContable)this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMaquinaEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMaquinaEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMaquinaEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMaquinaEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMaquinaEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMaquinaEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomaquinaempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMaquinaEmpresa.setModel(new TipoMaquinaEmpresaModel(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMaquinaEmpresa.setModel(new TipoMaquinaEmpresaModel(this.tipomaquinaempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMaquinaEmpresa!=null && this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMaquinaEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomaquinaempresaConstantesFunciones.resaltarSeleccionarTipoMaquinaEmpresa,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,tipomaquinaempresaConstantesFunciones.resaltarSeleccionarTipoMaquinaEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipomaquinaempresaConstantesFunciones.mostraridTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomaquinaempresaConstantesFunciones.resaltaridTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activaridTipoMaquinaEmpresa,iSizeTabla,this,true,"idTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltaridTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activaridTipoMaquinaEmpresa,this,true,"idTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarid_empresaTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_empresaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_empresaTipoMaquinaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_empresaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_empresaTipoMaquinaEmpresa,false,"id_empresaTipoMaquinaEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarid_sucursalTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_sucursalTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_sucursalTipoMaquinaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_sucursalTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_sucursalTipoMaquinaEmpresa,false,"id_sucursalTipoMaquinaEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_debitoTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_debitoTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_debitoTipoMaquinaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_debitoTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_debitoTipoMaquinaEmpresa,true,"id_cuenta_contable_debitoTipoMaquinaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_creditoTipoMaquinaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_creditoTipoMaquinaEmpresa,true,"id_cuenta_contable_creditoTipoMaquinaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarcodigoTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarcodigoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarcodigoTipoMaquinaEmpresa,iSizeTabla,this,true,"codigoTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarcodigoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarcodigoTipoMaquinaEmpresa,this,true,"codigoTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarnombreTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarnombreTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarnombreTipoMaquinaEmpresa,iSizeTabla,this,true,"nombreTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarnombreTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarnombreTipoMaquinaEmpresa,this,true,"nombreTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarmarcaTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarmarcaTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarmarcaTipoMaquinaEmpresa,iSizeTabla,this,true,"marcaTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarmarcaTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarmarcaTipoMaquinaEmpresa,this,true,"marcaTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarmodeloTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarmodeloTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarmodeloTipoMaquinaEmpresa,iSizeTabla,this,true,"modeloTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarmodeloTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarmodeloTipoMaquinaEmpresa,this,true,"modeloTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO));

		if(this.tipomaquinaempresaConstantesFunciones.mostrarcostoTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarcostoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarcostoTipoMaquinaEmpresa,iSizeTabla,this,true,"costoTipoMaquinaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltarcostoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activarcostoTipoMaquinaEmpresa,this,true,"costoTipoMaquinaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.tipomaquinaempresaConstantesFunciones.mostraresta_activoTipoMaquinaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipomaquinaempresaConstantesFunciones.resaltaresta_activoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activaresta_activoTipoMaquinaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipomaquinaempresaConstantesFunciones.resaltaresta_activoTipoMaquinaEmpresa,this.tipomaquinaempresaConstantesFunciones.activaresta_activoTipoMaquinaEmpresa,this,true,"esta_activoTipoMaquinaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoMaquinaEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden Maquinaes");
				tableColumn.setHeaderValue("Orden Maquinaes");
				tableColumn.setCellRenderer(new ProductoOrdenDetaProduMaquinaTableCell(tipomaquinaempresaConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa));
				tableColumn.setCellEditor(new ProductoOrdenDetaProduMaquinaTableCell(tipomaquinaempresaConstantesFunciones.resaltarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarProductoOrdenDetaProduMaquinaTipoMaquinaEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduMaquina && this.tipomaquinaempresaConstantesFunciones.mostrarProductoProduMaquinaTipoMaquinaEmpresa && !TipoMaquinaEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Maquina Producciones");
				tableColumn.setHeaderValue("Producto Maquina Producciones");
				tableColumn.setCellRenderer(new ProductoProduMaquinaTableCell(tipomaquinaempresaConstantesFunciones.resaltarProductoProduMaquinaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarProductoProduMaquinaTipoMaquinaEmpresa));
				tableColumn.setCellEditor(new ProductoProduMaquinaTableCell(tipomaquinaempresaConstantesFunciones.resaltarProductoProduMaquinaTipoMaquinaEmpresa,this,this.tipomaquinaempresaConstantesFunciones.activarProductoProduMaquinaTipoMaquinaEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMaquinaEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMaquinaEmpresa.moveColumn(this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMaquinaEmpresa.moveColumn(this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoMaquinaEmpresa.moveColumn(this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMaquinaEmpresa.moveColumn(this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMaquinaEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMaquinaEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMaquinaEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMaquinaEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMaquinaEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMaquinaEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomaquinaempresas.size()-1;
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
		//this.jTableDatosTipoMaquinaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMaquinaEmpresa();
			
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
				
				//this.isEsNuevoTipoMaquinaEmpresa=false;
					
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
				if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMaquinaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomaquinaempresa.getsType().equals("DUPLICADO")
				   || this.tipomaquinaempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMaquinaEmpresa=true;
				
				} else {
					this.isEsNuevoTipoMaquinaEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomaquinaempresa.getId()>=0 && !this.tipomaquinaempresa.getIsNew()) {						
						this.isEsNuevoTipoMaquinaEmpresa=false;
						
					} else {
						this.isEsNuevoTipoMaquinaEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMaquinaEmpresa(esRelaciones);						
				
				this.seleccionarTipoMaquinaEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomaquinaempresa.getId()<0) {
					this.isEsNuevoTipoMaquinaEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMaquinaEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMaquinaEmpresa(evt,rowIndex);
				}	
				
				if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMaquinaEmpresa: " + this.dDif); 
					}
				}								
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMaquinaEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomaquinaempresa)) {
					if(this.tipomaquinaempresa.getId()>0) {
						this.tipomaquinaempresa.setIsDeleted(true);
						
						this.tipomaquinaempresasEliminados.add(this.tipomaquinaempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().remove(this.tipomaquinaempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresas.remove(this.tipomaquinaempresa);				
					}
					
					
					((TipoMaquinaEmpresaModel) this.jTableDatosTipoMaquinaEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMaquinaEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMaquinaEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMaquinaEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipomaquinaempresaConstantesFunciones.cargarid_empresaTipoMaquinaEmpresa || this.tipomaquinaempresaConstantesFunciones.event_dependid_empresaTipoMaquinaEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipomaquinaempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipomaquinaempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipomaquinaempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipomaquinaempresa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.tipomaquinaempresaConstantesFunciones.cargarid_sucursalTipoMaquinaEmpresa || this.tipomaquinaempresaConstantesFunciones.event_dependid_sucursalTipoMaquinaEmpresa) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.tipomaquinaempresa.getid_sucursal());
									//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(tipomaquinaempresa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(tipomaquinaempresa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.tipomaquinaempresa.getid_sucursal(),false,"Formulario");

					//CuentaContableDebito
					if(!this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_debitoTipoMaquinaEmpresa || this.tipomaquinaempresaConstantesFunciones.event_dependid_cuenta_contable_debitoTipoMaquinaEmpresa) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.tipomaquinaempresa.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(tipomaquinaempresa.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(tipomaquinaempresa.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.tipomaquinaempresa.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.tipomaquinaempresaConstantesFunciones.cargarid_cuenta_contable_creditoTipoMaquinaEmpresa || this.tipomaquinaempresaConstantesFunciones.event_dependid_cuenta_contable_creditoTipoMaquinaEmpresa) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.tipomaquinaempresa.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(tipomaquinaempresa.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(tipomaquinaempresa.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.tipomaquinaempresa.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMaquinaEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMaquinaEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMaquinaEmpresa(tipomaquinaempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(tipomaquinaempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMaquinaEmpresa(tipomaquinaempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMaquinaEmpresa(tipomaquinaempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setText(tipomaquinaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setText(tipomaquinaempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setText(tipomaquinaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setText(tipomaquinaempresa.getmarca());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setText(tipomaquinaempresa.getmodelo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setText(tipomaquinaempresa.getcosto().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setSelected(tipomaquinaempresa.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMaquinaEmpresa tipomaquinaempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomaquinaempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMaquinaEmpresa tipomaquinaempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomaquinaempresaLocal=this.tipomaquinaempresa;
			} else {
				tipomaquinaempresaLocal=this.tipomaquinaempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomaquinaempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMaquinaEmpresa(tipomaquinaempresaLocal,true);
					
					if(tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomaquinaempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomaquinaempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(tipomaquinaempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(tipomaquinaempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(tipomaquinaempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setText("0");
			}

			if(conColumnasBase) {tipomaquinaempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelIdTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setcodigo(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcodigoTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setnombre(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelnombreTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setmarca(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmarcaTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setmodelo(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelmodeloTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelcostoTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomaquinaempresa.setesta_activo(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelesta_activoTipoMaquinaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresaBean,TipoMaquinaEmpresa tipomaquinaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipomaquinaempresaBean.getid_cuenta_contable_debito()!=null && !tipomaquinaempresaBean.getid_cuenta_contable_debito().equals(-1L))) {tipomaquinaempresa.setid_cuenta_contable_debito(tipomaquinaempresaBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tipomaquinaempresaBean.getid_cuenta_contable_credito()!=null && !tipomaquinaempresaBean.getid_cuenta_contable_credito().equals(-1L))) {tipomaquinaempresa.setid_cuenta_contable_credito(tipomaquinaempresaBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresaOrigen,TipoMaquinaEmpresa tipomaquinaempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getId()!=null && !tipomaquinaempresaOrigen.getId().equals(0L))) {tipomaquinaempresa.setId(tipomaquinaempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getid_cuenta_contable_debito()!=null && !tipomaquinaempresaOrigen.getid_cuenta_contable_debito().equals(-1L))) {tipomaquinaempresa.setid_cuenta_contable_debito(tipomaquinaempresaOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getid_cuenta_contable_credito()!=null && !tipomaquinaempresaOrigen.getid_cuenta_contable_credito().equals(-1L))) {tipomaquinaempresa.setid_cuenta_contable_credito(tipomaquinaempresaOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getcodigo()!=null && !tipomaquinaempresaOrigen.getcodigo().equals(""))) {tipomaquinaempresa.setcodigo(tipomaquinaempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getnombre()!=null && !tipomaquinaempresaOrigen.getnombre().equals(""))) {tipomaquinaempresa.setnombre(tipomaquinaempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getmarca()!=null && !tipomaquinaempresaOrigen.getmarca().equals(""))) {tipomaquinaempresa.setmarca(tipomaquinaempresaOrigen.getmarca());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getmodelo()!=null && !tipomaquinaempresaOrigen.getmodelo().equals(""))) {tipomaquinaempresa.setmodelo(tipomaquinaempresaOrigen.getmodelo());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getcosto()!=null && !tipomaquinaempresaOrigen.getcosto().equals(0.0))) {tipomaquinaempresa.setcosto(tipomaquinaempresaOrigen.getcosto());}
			if(conDefault || (!conDefault && tipomaquinaempresaOrigen.getesta_activo()!=null && !tipomaquinaempresaOrigen.getesta_activo().equals(false))) {tipomaquinaempresa.setesta_activo(tipomaquinaempresaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setText(tipomaquinaempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setText(tipomaquinaempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setText(tipomaquinaempresa.getnombre());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setText(tipomaquinaempresa.getmarca());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setText(tipomaquinaempresa.getmodelo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setText(tipomaquinaempresa.getcosto().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setSelected(tipomaquinaempresa.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMaquinaEmpresa(TipoMaquinaEmpresaBean tipomaquinaempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getmarca());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getmodelo());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setText(tipomaquinaempresaBean.getcosto().toString());
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setSelected(tipomaquinaempresaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMaquinaEmpresa(TipoMaquinaEmpresaParameterReturnGeneral tipomaquinaempresaReturnGeneral,TipoMaquinaEmpresaBean tipomaquinaempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoMaquinaEmpresa tipomaquinaempresaLocal=new TipoMaquinaEmpresa();
			
			tipomaquinaempresaLocal=tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomaquinaempresaLocal.getId()!=null && !tipomaquinaempresaLocal.getId().equals(0L))) {tipomaquinaempresaBean.setId(tipomaquinaempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getid_cuenta_contable_debito()!=null && !tipomaquinaempresaLocal.getid_cuenta_contable_debito().equals(-1L))) {tipomaquinaempresaBean.setid_cuenta_contable_debito(tipomaquinaempresaLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getid_cuenta_contable_credito()!=null && !tipomaquinaempresaLocal.getid_cuenta_contable_credito().equals(-1L))) {tipomaquinaempresaBean.setid_cuenta_contable_credito(tipomaquinaempresaLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getcodigo()!=null && !tipomaquinaempresaLocal.getcodigo().equals(""))) {tipomaquinaempresaBean.setcodigo(tipomaquinaempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getnombre()!=null && !tipomaquinaempresaLocal.getnombre().equals(""))) {tipomaquinaempresaBean.setnombre(tipomaquinaempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getmarca()!=null && !tipomaquinaempresaLocal.getmarca().equals(""))) {tipomaquinaempresaBean.setmarca(tipomaquinaempresaLocal.getmarca());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getmodelo()!=null && !tipomaquinaempresaLocal.getmodelo().equals(""))) {tipomaquinaempresaBean.setmodelo(tipomaquinaempresaLocal.getmodelo());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getcosto()!=null && !tipomaquinaempresaLocal.getcosto().equals(0.0))) {tipomaquinaempresaBean.setcosto(tipomaquinaempresaLocal.getcosto());}
			if(conDefault || (!conDefault && tipomaquinaempresaLocal.getesta_activo()!=null && !tipomaquinaempresaLocal.getesta_activo().equals(false))) {tipomaquinaempresaBean.setesta_activo(tipomaquinaempresaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMaquinaEmpresaGenerico(Long idTipoMaquinaEmpresaSeleccionado,JComboBox jComboBoxTipoMaquinaEmpresa,List<TipoMaquinaEmpresa> tipomaquinaempresasLocal)throws Exception {
		try {
			TipoMaquinaEmpresa  tipomaquinaempresaTemp=null;

			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasLocal) {
				if(tipomaquinaempresaAux.getId()!=null && tipomaquinaempresaAux.getId().equals(idTipoMaquinaEmpresaSeleccionado)) {
					tipomaquinaempresaTemp=tipomaquinaempresaAux;
					break;
				}
			}

			jComboBoxTipoMaquinaEmpresa.setSelectedItem(tipomaquinaempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMaquinaEmpresaGenerico(JComboBox jComboBoxTipoMaquinaEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMaquinaEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMaquinaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMaquinaEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMaquinaEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProductoOrdenDetaProduMaquina")) {
			jButtonProductoOrdenDetaProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduMaquina")) {
			jButtonProductoProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomaquinaempresa=(TipoMaquinaEmpresa) tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomaquinaempresa =(TipoMaquinaEmpresa) tipomaquinaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipomaquinaempresa.getIsNew() && !tipomaquinaempresa.getIsChanged() && !tipomaquinaempresa.getIsDeleted()) {
				sDescripcion=tipomaquinaempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipomaquinaempresa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tipomaquinaempresa.getIsNew() && !tipomaquinaempresa.getIsChanged() && !tipomaquinaempresa.getIsDeleted()) {
				sDescripcion=tipomaquinaempresa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tipomaquinaempresa.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!tipomaquinaempresa.getIsNew() && !tipomaquinaempresa.getIsChanged() && !tipomaquinaempresa.getIsDeleted()) {
				sDescripcion=tipomaquinaempresa.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=tipomaquinaempresa.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!tipomaquinaempresa.getIsNew() && !tipomaquinaempresa.getIsChanged() && !tipomaquinaempresa.getIsDeleted()) {
				sDescripcion=tipomaquinaempresa.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tipomaquinaempresa.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMaquinaEmpresa tipomaquinaempresaRow=new TipoMaquinaEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomaquinaempresaRow=(TipoMaquinaEmpresa) tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomaquinaempresaRow=(TipoMaquinaEmpresa) tipomaquinaempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMaquinaEmpresa tipomaquinaempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa = (TipoMaquinaEmpresa)this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomaquinaempresa = (TipoMaquinaEmpresa)this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomaquinaempresa!=null) {
						this.tipomaquinaempresa = tipomaquinaempresa;
					} else {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}
				}

				if(this.isTienePermisosProductoOrdenDetaProduMaquina && this.permiteMantenimiento(this.tipomaquinaempresa)) {
					ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoMaquinaEmpresa> tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
					tipomaquinaempresas.add(this.tipomaquinaempresa);
					if(!esRelacionado) {
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(tipomaquinaempresas,this.tipomaquinaempresa,productoordendetaprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoordendetaprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");

						productoordendetaprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
						TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)productoordendetaprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();

						titledBorderProductoOrdenDetaProduMaquina.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Orden Maquina");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoordendetaprodumaquinaBeanSwingJInternalFrame);
						}

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoordendetaprodumaquinaBeanSwingJInternalFrame);

						productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden Maquina",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMaquinaEmpresa tipomaquinaempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa = (TipoMaquinaEmpresa)this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomaquinaempresa = (TipoMaquinaEmpresa)this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomaquinaempresa!=null) {
						this.tipomaquinaempresa = tipomaquinaempresa;
					} else {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}
				}

				if(this.isTienePermisosProductoProduMaquina && this.permiteMantenimiento(this.tipomaquinaempresa)) {
					ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame;
					}

					List<TipoMaquinaEmpresa> tipomaquinaempresas=new ArrayList<TipoMaquinaEmpresa>();
					tipomaquinaempresas.add(this.tipomaquinaempresa);
					if(!esRelacionado) {
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.cargarProductoProduMaquinaBeanSwingJInternalFrame(tipomaquinaempresas,this.tipomaquinaempresa,productoprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getConGuardarRelaciones(),productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");

						productoprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
						TitledBorder titledBorderProductoProduMaquina=(TitledBorder)productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getBorder();

						titledBorderProductoProduMaquina.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Producto Maquina Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumaquinaBeanSwingJInternalFrame);
						}

						productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumaquinaBeanSwingJInternalFrame);

						productoprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Maquina Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));			
			this.jButtonDuplicarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa && this.isPermisoDuplicarTipoMaquinaEmpresa));			
			this.jButtonCopiarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa && this.isPermisoCopiarTipoMaquinaEmpresa));
			this.jButtonVerFormTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa && this.isPermisoVerFormTipoMaquinaEmpresa));
			
			this.jButtonAbrirOrderByTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));			
			
			this.jButtonNuevoRelacionesTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMaquinaEmpresa && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa && this.isPermisoEliminarTipoMaquinaEmpresa));
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa);							
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));						
			this.jButtonDuplicarToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa && this.isPermisoDuplicarTipoMaquinaEmpresa));						
			this.jButtonCopiarToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa && this.isPermisoCopiarTipoMaquinaEmpresa));			
			this.jButtonVerFormToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa && this.isPermisoVerFormTipoMaquinaEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMaquinaEmpresa && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa  && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa && this.isPermisoEliminarTipoMaquinaEmpresa));
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarToolBarTipoMaquinaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa);				
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));			
			this.jMenuItemDuplicarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa && this.isPermisoDuplicarTipoMaquinaEmpresa));			
			this.jMenuItemCopiarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa && this.isPermisoCopiarTipoMaquinaEmpresa));			
			this.jMenuItemVerFormTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa && this.isPermisoVerFormTipoMaquinaEmpresa));			
			this.jMenuItemAbrirOrderByTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));			
			//this.jMenuItemMostrarOcultarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa && this.isPermisoOrdenTipoMaquinaEmpresa));			
			this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa && this.isPermisoNuevoTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemModificarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoMaquinaEmpresa && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemActualizarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa && this.isPermisoActualizarTipoMaquinaEmpresa));	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemEliminarTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa && this.isPermisoEliminarTipoMaquinaEmpresa));
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemCancelarTipoMaquinaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=this.jButtonNuevoTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa=this.jButtonDuplicarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa=this.jButtonCopiarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa=this.jButtonVerFormTipoMaquinaEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMaquinaEmpresa=this.jButtonAbrirOrderByTipoMaquinaEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=this.jButtonNuevoRelacionesTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=this.jButtonModificarTipoMaquinaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=this.jButtonNuevoToolBarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarToolBarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarToolBarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarToolBarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarToolBarTipoMaquinaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=this.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=this.jMenuItemNuevoTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemModificarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemActualizarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemEliminarTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemCancelarTipoMaquinaEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMaquinaEmpresa(Boolean esInicializar) {
		if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMaquinaEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMaquinaEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMaquinaEmpresa() {
		this.jButtonNuevoTipoMaquinaEmpresa.setVisible(this.isPermisoNuevoTipoMaquinaEmpresa);			
		this.jButtonDuplicarTipoMaquinaEmpresa.setVisible(this.isPermisoDuplicarTipoMaquinaEmpresa);			
		this.jButtonCopiarTipoMaquinaEmpresa.setVisible(this.isPermisoCopiarTipoMaquinaEmpresa);			
		this.jButtonVerFormTipoMaquinaEmpresa.setVisible(this.isPermisoVerFormTipoMaquinaEmpresa);			
		
		this.jButtonAbrirOrderByTipoMaquinaEmpresa.setVisible(this.isPermisoOrdenTipoMaquinaEmpresa);					
		
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.setVisible(this.isPermisoNuevoTipoMaquinaEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarTipoMaquinaEmpresa.setVisible(this.isPermisoActualizarTipoMaquinaEmpresa);	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.setVisible(this.isPermisoActualizarTipoMaquinaEmpresa);	
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.setVisible(this.isPermisoEliminarTipoMaquinaEmpresa);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa);						
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.setVisible(this.isPermisoGuardarCambiosTipoMaquinaEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setVisible(this.isPermisoActualizarTipoMaquinaEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMaquinaEmpresa() {
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarTipoMaquinaEmpresa.setVisible(this.isPermisoActualizarTipoMaquinaEmpresa);	
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.setVisible(this.isPermisoActualizarTipoMaquinaEmpresa);	
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.setVisible(this.isPermisoEliminarTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa);							
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa && this.isPermisoGuardarCambiosTipoMaquinaEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMaquinaEmpresa() {
		if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMaquinaEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMaquinaEmpresa() {
	}
	
	public void jTableDatosTipoMaquinaEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMaquinaEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomaquinaempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoMaquinaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoMaquinaEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMaquinaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

				if(this.tipomaquinaempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipomaquinaempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipomaquinaempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTipoMaquinaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTipoMaquinaEmpresa(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMaquinaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

				if(this.tipomaquinaempresa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tipomaquinaempresa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tipomaquinaempresa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebTipoMaquinaEmpresa(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMaquinaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

				if(this.tipomaquinaempresa.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.tipomaquinaempresa.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.tipomaquinaempresa.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebTipoMaquinaEmpresa(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMaquinaEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMaquinaEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

				if(this.tipomaquinaempresa.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.tipomaquinaempresa.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMaquinaEmpresa=(TitledBorder)this.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTipoMaquinaEmpresa.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.tipomaquinaempresa.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomaquinaempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomaquinaempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.tipomaquinaempresa.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodeloTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getmodelo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modelo like '%"+this.tipomaquinaempresa.getmodelo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.tipomaquinaempresa.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoTipoMaquinaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.gettipomaquinaempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomaquinaempresa==null) {
						this.tipomaquinaempresa = new TipoMaquinaEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);
				}

				if(this.tipomaquinaempresa.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.tipomaquinaempresa.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);

			this.getTipoMaquinaEmpresasFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);

			//if(TipoMaquinaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);

			this.getTipoMaquinaEmpresasFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);

			//if(TipoMaquinaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);

			this.getTipoMaquinaEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);

			//if(TipoMaquinaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTipoMaquinaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);

			this.getTipoMaquinaEmpresasFK_IdSucursal();

			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);

			//if(TipoMaquinaEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomaquinaempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMaquinaEmpresa() {
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoMaquinaEmpresa!=null) {
			this.jInternalFrameImportacionTipoMaquinaEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMaquinaEmpresa.dispose();
			this.jInternalFrameImportacionTipoMaquinaEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMaquinaEmpresa();
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMaquinaEmpresa")) {
				jButtonDuplicarTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMaquinaEmpresa")) {
				jButtonCopiarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMaquinaEmpresa")) {
				jButtonVerFormTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMaquinaEmpresa")) {
				jButtonDuplicarTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMaquinaEmpresa")) {
				jButtonDuplicarTipoMaquinaEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMaquinaEmpresa")) {
				jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMaquinaEmpresa")) {
				jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMaquinaEmpresa")) {
				jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMaquinaEmpresa")) {
				jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMaquinaEmpresa")) {
				jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMaquinaEmpresa")) {
				jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMaquinaEmpresa")) {
				jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMaquinaEmpresa")) {
				jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMaquinaEmpresa")) {
				jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMaquinaEmpresa")) {
				jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMaquinaEmpresa")) {
				jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMaquinaEmpresa")) {
				jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMaquinaEmpresa")) {
				jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMaquinaEmpresa")) {
				jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMaquinaEmpresa")) {
				jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMaquinaEmpresa")) {
				jButtonMostrarOcultarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMaquinaEmpresa")) {
				jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMaquinaEmpresa")) {
				jButtonCopiarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMaquinaEmpresa")) {
				jButtonVerFormTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMaquinaEmpresa")) {
				jButtonCopiarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMaquinaEmpresa")) {
				jButtonVerFormTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMaquinaEmpresa")) {
				jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMaquinaEmpresa")) {
				jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMaquinaEmpresa")) {
				jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMaquinaEmpresa")) {
				jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMaquinaEmpresa")) {
				jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMaquinaEmpresa")) {
				jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMaquinaEmpresa")) {
				jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMaquinaEmpresa")) {
				jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMaquinaEmpresa")) {
				jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMaquinaEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMaquinaEmpresa")) {
				jButtonAbrirOrderByTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMaquinaEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMaquinaEmpresa")) {
				jButtonMostrarOcultarTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMaquinaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMaquinaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMaquinaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMaquinaEmpresa")) {
				jButtonCerrarReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMaquinaEmpresa")) {
				jButtonGenerarReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMaquinaEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMaquinaEmpresa")) {
				jButtonCerrarImportacionTipoMaquinaEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMaquinaEmpresa")) {
				
				jButtonGenerarImportacionTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMaquinaEmpresa")) {
				
				jButtonAbrirImportacionTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMaquinaEmpresa")) {
				jComboBoxTiposAccionesTipoMaquinaEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMaquinaEmpresa")) {
				jComboBoxTiposRelacionesTipoMaquinaEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMaquinaEmpresa")) {
				jComboBoxTiposAccionesTipoMaquinaEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMaquinaEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoMaquinaEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMaquinaEmpresa")) {
				jTextFieldValorCampoGeneralTipoMaquinaEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMaquinaEmpresa")) {
				jButtonAbrirOrderByTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMaquinaEmpresa")) {
				jButtonAbrirOrderByTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMaquinaEmpresa")) {
				jButtonCerrarOrderByTipoMaquinaEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMaquinaEmpresaBusqueda")) {
				this.jButtonidTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_empresaTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_sucursalTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_sucursalTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMaquinaEmpresaBusqueda")) {
				this.jButtoncodigoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMaquinaEmpresaBusqueda")) {
				this.jButtonnombreTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaTipoMaquinaEmpresaBusqueda")) {
				this.jButtonmarcaTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloTipoMaquinaEmpresaBusqueda")) {
				this.jButtonmodeloTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoTipoMaquinaEmpresaBusqueda")) {
				this.jButtoncostoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonesta_activoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableCreditoTipoMaquinaEmpresa")) {
				this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDebitoTipoMaquinaEmpresa")) {
				this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresaActionPerformed(evt);
			}
			
			;
			
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMaquinaEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMaquinaEmpresa tipomaquinaempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomaquinaempresaLocal=this.tipomaquinaempresa;
			} else {
				tipomaquinaempresaLocal=this.tipomaquinaempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
							
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
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
			
			


			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
								
						
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
								
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
							
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
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
			
			


			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
								
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMaquinaEmpresa")) {
					jCheckBoxSeleccionarTodosTipoMaquinaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMaquinaEmpresa")) {
					jCheckBoxSeleccionadosTipoMaquinaEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMaquinaEmpresa")) {
					
				}
				
				


				
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
												
				
				


				
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
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
			
			


			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomaquinaempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomaquinaempresa);
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
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
				
				


				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMaquinaEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMaquinaEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMaquinaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomaquinaempresaAnterior =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMaquinaEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMaquinaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMaquinaEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomaquinaempresa =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomaquinaempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMaquinaEmpresa")) {
				
				}
				
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMaquinaEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMaquinaEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMaquinaEmpresa")) {
			
			}
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMaquinaEmpresa();
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMaquinaEmpresa")) {
				jButtonDuplicarTipoMaquinaEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMaquinaEmpresa")) {
				jButtonCopiarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMaquinaEmpresa")) {
				jButtonVerFormTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMaquinaEmpresa")) {
				jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMaquinaEmpresa")) {
				jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMaquinaEmpresa")) {
				jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMaquinaEmpresa")) {
				jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMaquinaEmpresa")) {
				jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMaquinaEmpresa")) {
				jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMaquinaEmpresa")) {
				jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMaquinaEmpresa")) {
				jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMaquinaEmpresa")) {
				jButtonAbrirOrderByTipoMaquinaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMaquinaEmpresa")) {
				jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMaquinaEmpresa")) {
				jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMaquinaEmpresa")) {
				jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMaquinaEmpresaBusqueda")) {
				this.jButtonidTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_empresaTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_empresaTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_sucursalTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_sucursalTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMaquinaEmpresaBusqueda")) {
				this.jButtoncodigoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMaquinaEmpresaBusqueda")) {
				this.jButtonnombreTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaTipoMaquinaEmpresaBusqueda")) {
				this.jButtonmarcaTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloTipoMaquinaEmpresaBusqueda")) {
				this.jButtonmodeloTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoTipoMaquinaEmpresaBusqueda")) {
				this.jButtoncostoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoMaquinaEmpresaBusqueda")) {
				this.jButtonesta_activoTipoMaquinaEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMaquinaEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMaquinaEmpresa")) {
				closingInternalFrameTipoMaquinaEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoMaquinaEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMaquinaEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMaquinaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoMaquinaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMaquinaEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMaquinaEmpresaActionPerformed(null);
			}
			
			TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomaquinaempresa,new Object(),this.tipomaquinaempresaParameterGeneral,this.tipomaquinaempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMaquinaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMaquinaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMaquinaEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomaquinaempresa)) {
			if(!esControlTabla) {
				if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);			
				}
				
				if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.procesarEventosTipoMaquinaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this.tipomaquinaempresa,this.tipomaquinaempresaParameterGeneral,this.isEsNuevoTipoMaquinaEmpresa,classes);//this.tipomaquinaempresaLogic.getTipoMaquinaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral,this.tipomaquinaempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMaquinaEmpresa(classes,this.tipomaquinaempresaReturnGeneral,this.tipomaquinaempresaBean,false);
					}
						
					if(this.tipomaquinaempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa());	
					}
						
					if(this.tipomaquinaempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa(),classes);//this.tipomaquinaempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMaquinaEmpresa(this.tipomaquinaempresa,classes);//this.tipomaquinaempresaBean);									
				}
			
				if(TipoMaquinaEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMaquinaEmpresa(this.tipomaquinaempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMaquinaEmpresa(this.tipomaquinaempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomaquinaempresaAnterior!=null) {
						this.tipomaquinaempresa=this.tipomaquinaempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.procesarEventosTipoMaquinaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this.tipomaquinaempresa,this.tipomaquinaempresaParameterGeneral,this.isEsNuevoTipoMaquinaEmpresa,classes);//this.tipomaquinaempresaLogic.getTipoMaquinaEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa(),tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa(),this.tipomaquinaempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMaquinaEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMaquinaEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMaquinaEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMaquinaEmpresa() throws Exception {
		
		TipoMaquinaEmpresaModel tipomaquinaempresaModel=(TipoMaquinaEmpresaModel)this.jTableDatosTipoMaquinaEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomaquinaempresaModel.tipomaquinaempresas=this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomaquinaempresaModel.tipomaquinaempresas=this.tipomaquinaempresas;
		}
		
		
		((TipoMaquinaEmpresaModel) this.jTableDatosTipoMaquinaEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMaquinaEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomaquinaempresaAnterior(),this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomaquinaempresaAnterior(),this.tipomaquinaempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMaquinaEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipomaquinaempresa.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomaquinaempresa,new Object(),generalEntityParameterGeneral,this.tipomaquinaempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMaquinaEmpresaConstantesFunciones.getClassesRelationshipsOfTipoMaquinaEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMaquinaEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMaquinaEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMaquinaEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomaquinaempresa,new Object(),generalEntityParameterGeneral,this.tipomaquinaempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMaquinaEmpresa(TipoMaquinaEmpresaBean tipomaquinaempresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas());
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(tipomaquinaempresa.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMaquinaEmpresa(ArrayList<Classe> classes,TipoMaquinaEmpresaReturnGeneral tipomaquinaempresaReturnGeneral,TipoMaquinaEmpresaBean tipomaquinaempresaBean,Boolean conDefault) throws Exception {
		
			this.tipomaquinaempresaBean.setProductoOrdenDetaProduMaquinas(tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa().getProductoOrdenDetaProduMaquinas());
			this.tipomaquinaempresaBean.setProductoProduMaquinas(tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa().getProductoProduMaquinas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoOrdenDetaProduMaquina.class)) {
					tipomaquinaempresa.setProductoOrdenDetaProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					tipomaquinaempresa.setProductoProduMaquinas(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipomaquinaempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa = new TipoMaquinaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomaquinaempresaSessionBean.getConGuardarRelaciones(),this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.tipomaquinaempresaLogic=this.tipomaquinaempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoMaquinaEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMaquinaEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMaquinaEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMaquinaEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMaquinaEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMaquinaEmpresa"));
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoMaquinaEmpresa"));

		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMaquinaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemModificarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMaquinaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoMaquinaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMaquinaEmpresa"));
						
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemActualizarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMaquinaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoMaquinaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMaquinaEmpresa"));
								
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemEliminarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMaquinaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoMaquinaEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMaquinaEmpresa"));
					
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemCancelarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMaquinaEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemDetalleCerrarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMaquinaEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMaquinaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMaquinaEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMaquinaEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonidTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncodigoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonnombreTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmarcaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmodeloTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"modeloTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncostoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"costoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonesta_activoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMaquinaEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMaquinaEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMaquinaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMaquinaEmpresa"));
		}
		
		this.jTableDatosTipoMaquinaEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMaquinaEmpresa"));
		
		this.jTableDatosTipoMaquinaEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMaquinaEmpresa"));
		
		this.jButtonNuevoTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoMaquinaEmpresa"));
		
		this.jButtonDuplicarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoMaquinaEmpresa"));
		
		this.jButtonCopiarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoMaquinaEmpresa"));
		
		this.jButtonVerFormTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoMaquinaEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMaquinaEmpresa"));
			
		this.jButtonDuplicarToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemNuevoTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMaquinaEmpresa"));
			
		this.jMenuItemDuplicarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMaquinaEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMaquinaEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMaquinaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoMaquinaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonModificarToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMaquinaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemModificarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMaquinaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoMaquinaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonActualizarToolBarTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMaquinaEmpresa"));
				
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemActualizarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMaquinaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoMaquinaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonEliminarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMaquinaEmpresa"));
						
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemEliminarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMaquinaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoMaquinaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonCancelarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMaquinaEmpresa"));
			
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemCancelarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMaquinaEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMaquinaEmpresa"));		
		
		
		this.jButtonCerrarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoMaquinaEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemCerrarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMaquinaEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jMenuItemDetalleCerrarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMaquinaEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMaquinaEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMaquinaEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMaquinaEmpresa"));
			
		this.jButtonVerFormToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMaquinaEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMaquinaEmpresa"));
			
		this.jMenuItemCopiarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMaquinaEmpresa"));		
		
		this.jMenuItemVerFormTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMaquinaEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMaquinaEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMaquinaEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMaquinaEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMaquinaEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMaquinaEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoMaquinaEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMaquinaEmpresa"));
		
		this.jMenuItemAnterioresTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMaquinaEmpresa"));		
		
		
		this.jButtonSiguientesTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoMaquinaEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemSiguientesTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMaquinaEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMaquinaEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMaquinaEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMaquinaEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMaquinaEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMaquinaEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMaquinaEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMaquinaEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMaquinaEmpresa"));

		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMaquinaEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMaquinaEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMaquinaEmpresa"));
			
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMaquinaEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMaquinaEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMaquinaEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonidTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncodigoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonnombreTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmarcaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmodeloTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"modeloTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncostoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"costoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonesta_activoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMaquinaEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoTipoMaquinaEmpresa"));

			this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoTipoMaquinaEmpresa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMaquinaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMaquinaEmpresa"));
				this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMaquinaEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMaquinaEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMaquinaEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMaquinaEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMaquinaEmpresa!=null) {
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMaquinaEmpresa"));
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMaquinaEmpresa"));
				this.jInternalFrameImportacionTipoMaquinaEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMaquinaEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMaquinaEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoMaquinaEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMaquinaEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoMaquinaEmpresa!=null) {
				this.jInternalFrameOrderByTipoMaquinaEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMaquinaEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTabbedPaneRelacionesTipoMaquinaEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMaquinaEmpresa"));
		
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
            		closingInternalFrameTipoMaquinaEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMaquinaEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoMaquinaEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoMaquinaEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMaquinaEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMaquinaEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMaquinaEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMaquinaEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMaquinaEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMaquinaEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMaquinaEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMaquinaEmpresa";
		inputMap = this.jButtonModificarTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMaquinaEmpresa";
		inputMap = this.jButtonActualizarTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMaquinaEmpresa";
		inputMap = this.jButtonEliminarTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMaquinaEmpresa";
		inputMap = this.jButtonCancelarTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMaquinaEmpresa";
		inputMap = this.jButtonCerrarTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMaquinaEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonGuardarCambiosTipoMaquinaEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMaquinaEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMaquinaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMaquinaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMaquinaEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonidTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_empresaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncodigoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonnombreTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmarcaTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonmodeloTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"modeloTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtoncostoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"costoTipoMaquinaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jButtonesta_activoTipoMaquinaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoMaquinaEmpresaBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoTipoMaquinaEmpresa"));

		this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoTipoMaquinaEmpresa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMaquinaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMaquinaEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMaquinaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMaquinaEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
					tipomaquinaempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresas) {
					tipomaquinaempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMaquinaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
						tipomaquinaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresas) {
						tipomaquinaempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
					
						if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipomaquinaempresaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresas) {
						
						if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipomaquinaempresaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMaquinaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMaquinaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMaquinaEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMaquinaEmpresa.getSelectedRows();
			
			TipoMaquinaEmpresa tipomaquinaempresaLocal=new TipoMaquinaEmpresa();
			
			//this.seleccionarTodosTipoMaquinaEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLocal =(TipoMaquinaEmpresa) this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas().toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomaquinaempresaLocal =(TipoMaquinaEmpresa) this.tipomaquinaempresas.toArray()[this.jTableDatosTipoMaquinaEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomaquinaempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
						tipomaquinaempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresas) {
						tipomaquinaempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMaquinaEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMaquinaEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMaquinaEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMaquinaEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMaquinaEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMaquinaEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomaquinaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomaquinaempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							tipomaquinaempresaAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							tipomaquinaempresaAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							tipomaquinaempresaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresas) {
					
						if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomaquinaempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomaquinaempresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							tipomaquinaempresaAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							tipomaquinaempresaAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							tipomaquinaempresaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMaquinaEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMaquinaEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMaquinaEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMaquinaEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMaquinaEmpresa(conSplash);
				
					this.generarReporteTipoMaquinaEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMaquinaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMaquinaEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMaquinaEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMaquinaEmpresa();
				
				this.exportarTipoMaquinaEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMaquinaEmpresas();
				//this.importarTipoMaquinaEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMaquinaEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMaquinaEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Maquina Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMaquinaEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMaquinaEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMaquinaEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMaquinaEmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMaquinaEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMaquinaEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralTipoMaquinaEmpresa();
						
						this.generarReporteProcesoAccionTipoMaquinaEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Maquina EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Maquina Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMaquinaEmpresa();
				
						this.actualizarParametrosGeneralTipoMaquinaEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomaquinaempresaReturnGeneral=tipomaquinaempresaLogic.procesarAccionTipoMaquinaEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas(),this.tipomaquinaempresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMaquinaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMaquinaEmpresa();
					
					TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMaquinaEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMaquinaEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMaquinaEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMaquinaEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
			TipoMaquinaEmpresa tipomaquinaempresa=new TipoMaquinaEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.getSelectedItem();
			
			
			
			
			tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomaquinaempresasSeleccionados.size()==1) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
					tipomaquinaempresa=tipomaquinaempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Orden Maquina")) {
					jButtonProductoOrdenDetaProduMaquinaActionPerformed(null,rowIndex,true,false,tipomaquinaempresa);
				}
				else if(this.sTipoRelacion.equals("Producto Maquina Produccion")) {
					jButtonProductoProduMaquinaActionPerformed(null,rowIndex,true,false,tipomaquinaempresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMaquinaEmpresa();
			
      		//this.finishProcessTipoMaquinaEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMaquinaEmpresaReturnGeneral() throws Exception {
		if(this.tipomaquinaempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomaquinaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomaquinaempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomaquinaempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomaquinaempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomaquinaempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
		}
		
		if(this.tipomaquinaempresaReturnGeneral.getConRetornoLista() || this.tipomaquinaempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomaquinaempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomaquinaempresaLogic.setTipoMaquinaEmpresas(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomaquinaempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomaquinaempresaLogic.setTipoMaquinaEmpresa(this.tipomaquinaempresaReturnGeneral.getTipoMaquinaEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMaquinaEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMaquinaEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoMaquinaEmpresa> getTipoMaquinaEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMaquinaEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresaLogic.getTipoMaquinaEmpresas()) {
					if(tipomaquinaempresaAux.getIsSelected()) {
						tipomaquinaempresasSeleccionados.add(tipomaquinaempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMaquinaEmpresa tipomaquinaempresaAux:this.tipomaquinaempresas) {
					if(tipomaquinaempresaAux.getIsSelected()) {
						tipomaquinaempresasSeleccionados.add(tipomaquinaempresaAux);				
					}
				}
			}
			
			if(tipomaquinaempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomaquinaempresasSeleccionados.addAll(this.tipomaquinaempresaLogic.getTipoMaquinaEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomaquinaempresasSeleccionados.addAll(this.tipomaquinaempresas);				
					}
				}
			}
		} else {
			tipomaquinaempresasSeleccionados.add(this.tipomaquinaempresa);
		}
		
		return tipomaquinaempresasSeleccionados;
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
	
	public void generarReporteTipoMaquinaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMaquinaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMaquinaEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMaquinaEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMaquinaEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoMaquinaEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Maquina Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMaquinaEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMaquinaEmpresa();
		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMaquinaEmpresa();
		
		
		//this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados ,tipomaquinaempresaImplementable,tipomaquinaempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoMaquinaEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMaquinaEmpresa();
		
		this.abrirFrameImportacionTipoMaquinaEmpresa();		
		
			
		//this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados ,tipomaquinaempresaImplementable,tipomaquinaempresaImplementableHome);
	}
	
	public void importarTipoMaquinaEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoMaquinaEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMaquinaEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMaquinaEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMaquinaEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Maquina Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMaquinaEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMaquinaEmpresa(tipomaquinaempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomaquinaempresaAux.setsDetalleGeneralEntityReporte(tipomaquinaempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMaquinaEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomaquinaempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getmodelo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomaquinaempresa.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMaquinaEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMaquinaEmpresa(row);				
				iRow++;
			}				
			
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMaquinaEmpresa(tipomaquinaempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMaquinaEmpresasSeleccionados() throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();		
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomaquinaempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomaquinaempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomaquinaempresa");
			//elementRoot.appendChild(element);
		
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
				element = document.createElement("tipomaquinaempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMaquinaEmpresa(tipomaquinaempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Maquina Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMaquinaEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getmodelo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomaquinaempresa.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlTipoMaquinaEmpresa(TipoMaquinaEmpresa tipomaquinaempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMaquinaEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomaquinaempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMaquinaEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomaquinaempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoMaquinaEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipomaquinaempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TipoMaquinaEmpresaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tipomaquinaempresa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcuentacontabledebito_descripcion = document.createElement(TipoMaquinaEmpresaConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(tipomaquinaempresa.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(TipoMaquinaEmpresaConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(tipomaquinaempresa.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementcodigo = document.createElement(TipoMaquinaEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomaquinaempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMaquinaEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomaquinaempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementmarca = document.createElement(TipoMaquinaEmpresaConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(tipomaquinaempresa.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementmodelo = document.createElement(TipoMaquinaEmpresaConstantesFunciones.MODELO);
		elementmodelo.appendChild(document.createTextNode(tipomaquinaempresa.getmodelo().trim()));
		element.appendChild(elementmodelo);

		Element elementcosto = document.createElement(TipoMaquinaEmpresaConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(tipomaquinaempresa.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementesta_activo = document.createElement(TipoMaquinaEmpresaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(tipomaquinaempresa.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoTipoMaquinaEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados=new ArrayList<TipoMaquinaEmpresa>();
		
		tipomaquinaempresasSeleccionados=this.getTipoMaquinaEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMaquinaEmpresa(tipomaquinaempresasSeleccionados);
		
		this.generarReporteTipoMaquinaEmpresas("Todos",tipomaquinaempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMaquinaEmpresa(ArrayList<TipoMaquinaEmpresa> tipomaquinaempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasSeleccionados) {
				tipomaquinaempresaAux.setsDetalleGeneralEntityReporte(tipomaquinaempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(tipomaquinaempresaAux.getmodelo());
				}
				 else if(sTipoSeleccionar.equals(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					tipomaquinaempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipomaquinaempresaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMaquinaEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaModificarTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoMaquinaEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMaquinaEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoMaquinaEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMaquinaEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoMaquinaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;												
			}
			
			this.jButtonCerrarTipoMaquinaEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMaquinaEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomaquinaempresa)) {
			this.isVisibilidadCeldaActualizarTipoMaquinaEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoMaquinaEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMaquinaEmpresa() {
		this.isVisibilidadCeldaNuevoTipoMaquinaEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosTipoMaquinaEmpresa=false;
	}
	
	public void actualizarEstadoPanelsTipoMaquinaEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMaquinaEmpresa!=null) {
				this.jScrollPanelDatosTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMaquinaEmpresa!=null) {
				this.jPanelPaginacionTipoMaquinaEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMaquinaEmpresa!=null) {
				this.jPanelParametrosReportesTipoMaquinaEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContableCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCuentaContableCredito=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableDebito;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);}
		}
		
	}
	
	

	public String registrarSesionTipoMaquinaEmpresaParaProductoOrdenDetaProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoOrdenDetaProduMaquina=false;

		try {

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setsPathNavegacionActual(tipomaquinaempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(true);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduMaquina(TipoMaquinaEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa(true);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoordendetaprodumaquinaSessionBean.setlidTipoMaquinaEmpresaActual(this.idTipoMaquinaEmpresaActual);

			tipomaquinaempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa(true);
			tipomaquinaempresaSessionBean.setlIdTipoMaquinaEmpresaActualForeignKey(this.idTipoMaquinaEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoMaquinaEmpresaParaProductoProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoProduMaquina=false;

		try {

			if(this.tipomaquinaempresaSessionBean==null) {
				this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setsPathNavegacionActual(tipomaquinaempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMaquina=this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMaquina(true);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMaquina(TipoMaquinaEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa(true);
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa.productoprodumaquinaSessionBean.setlidTipoMaquinaEmpresaActual(this.idTipoMaquinaEmpresaActual);

			tipomaquinaempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMaquinaEmpresa(true);
			tipomaquinaempresaSessionBean.setlIdTipoMaquinaEmpresaActualForeignKey(this.idTipoMaquinaEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		
		if(this.tipomaquinaempresaSessionBean==null) {
			this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		}
		
		this.tipomaquinaempresaSessionBean.setsUltimaBusquedaTipoMaquinaEmpresa(this.getsAccionBusqueda());
		this.tipomaquinaempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomaquinaempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			tipomaquinaempresaSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
			tipomaquinaempresaSessionBean.setid_cuenta_contable_debito(this.getid_cuenta_contable_debitoFK_IdCuentaContableDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipomaquinaempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			tipomaquinaempresaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		
		if(this.tipomaquinaempresaSessionBean==null) {
			this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		}
		
		if(this.tipomaquinaempresaSessionBean.getsUltimaBusquedaTipoMaquinaEmpresa()!=null&&!this.tipomaquinaempresaSessionBean.getsUltimaBusquedaTipoMaquinaEmpresa().equals("")) {
			this.setsAccionBusqueda(tipomaquinaempresaSessionBean.getsUltimaBusquedaTipoMaquinaEmpresa());
			this.setiNumeroPaginacion(tipomaquinaempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomaquinaempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(tipomaquinaempresaSessionBean.getid_cuenta_contable_credito());
				tipomaquinaempresaSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
				this.setid_cuenta_contable_debitoFK_IdCuentaContableDebito(tipomaquinaempresaSessionBean.getid_cuenta_contable_debito());
				tipomaquinaempresaSessionBean.setid_cuenta_contable_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipomaquinaempresaSessionBean.getid_empresa());
				tipomaquinaempresaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(tipomaquinaempresaSessionBean.getid_sucursal());
				tipomaquinaempresaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.tipomaquinaempresaSessionBean.setsUltimaBusquedaTipoMaquinaEmpresa("");
		this.tipomaquinaempresaSessionBean.setiNumeroPaginacion(TipoMaquinaEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipomaquinaempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMaquinaEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMaquinaEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoMaquinaEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoMaquinaEmpresa();
		this.updateHabilitarBusquedasFormularioTipoMaquinaEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMaquinaEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponents().length>0) {
	

		if(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableCreditoTipoMaquinaEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
				jPanel.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			}
		}

		if(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableDebitoTipoMaquinaEmpresa!=null) {
			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
				jPanel.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMaquinaEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			if(!this.tipomaquinaempresaConstantesFunciones.mostrarFK_IdCuentaContableCreditoTipoMaquinaEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			if(!this.tipomaquinaempresaConstantesFunciones.mostrarFK_IdCuentaContableDebitoTipoMaquinaEmpresa && index>-1) {
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMaquinaEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setEnabledAt(index,this.tipomaquinaempresaConstantesFunciones.activarFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			}

			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
				this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setEnabledAt(index,this.tipomaquinaempresaConstantesFunciones.activarFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMaquinaEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);

			this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);

			this.tipomaquinaempresaConstantesFunciones.setResaltarFK_IdCuentaContableCreditoTipoMaquinaEmpresa(resaltar);

			jPanel.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDebito")) {
			index= this.jTabbedPaneBusquedasTipoMaquinaEmpresa.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);

			this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMaquinaEmpresa.getComponent(index);

			this.tipomaquinaempresaConstantesFunciones.setResaltarFK_IdCuentaContableDebitoTipoMaquinaEmpresa(resaltar);

			jPanel.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoMaquinaEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMaquinaEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMaquinaEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoMaquinaEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoMaquinaEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMaquinaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomaquinaempresaConstantesFunciones.resaltaridTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltaridTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarid_empresaTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarid_empresaTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarid_sucursalTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarid_sucursalTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_debitoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_debitoTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarcodigoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarcodigoTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarnombreTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarnombreTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarmarcaTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarmarcaTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarmodeloTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarmodeloTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltarcostoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltarcostoTipoMaquinaEmpresa);}
		if(this.tipomaquinaempresaConstantesFunciones.resaltaresta_activoTipoMaquinaEmpresa!=null && this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setBorder(this.tipomaquinaempresaConstantesFunciones.resaltaresta_activoTipoMaquinaEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMaquinaEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostraridTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelidTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostraridTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_empresaTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelid_empresaTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_empresaTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_sucursalTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelid_sucursalTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_sucursalTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_debitoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_debitoTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarcodigoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelcodigoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarcodigoTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarnombreTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelnombreTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarnombreTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarmarcaTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelmarcaTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarmarcaTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarmodeloTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelmodeloTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarmodeloTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarcostoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelcostoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostrarcostoTipoMaquinaEmpresa);
		//this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostraresta_activoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jPanelesta_activoTipoMaquinaEmpresa.setVisible(this.tipomaquinaempresaConstantesFunciones.mostraresta_activoTipoMaquinaEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMaquinaEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMaquinaEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jLabelidTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activaridTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_empresaTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarid_empresaTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_sucursalTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarid_sucursalTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_debitoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarid_cuenta_contable_creditoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcodigoTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarcodigoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreanombreTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarnombreTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamarcaTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarmarcaTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextAreamodeloTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarmodeloTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jTextFieldcostoTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activarcostoTipoMaquinaEmpresa);
		this.jInternalFrameDetalleFormTipoMaquinaEmpresa.jCheckBoxesta_activoTipoMaquinaEmpresa.setEnabled(this.tipomaquinaempresaConstantesFunciones.activaresta_activoTipoMaquinaEmpresa);
		}
	}
	
		
}