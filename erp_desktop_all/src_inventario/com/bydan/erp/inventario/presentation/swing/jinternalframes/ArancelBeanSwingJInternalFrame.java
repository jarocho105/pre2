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

import com.bydan.erp.inventario.util.ArancelConstantesFunciones;
import com.bydan.erp.inventario.util.ArancelParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ArancelParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ArancelBean;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ArancelBeanSwingJInternalFrame extends ArancelJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ArancelBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Arancel> arancelValidator = new ClassValidator<Arancel>(Arancel.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Arancel arancel;	
	public Arancel arancelAux;
	public Arancel arancelAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Arancel arancelTotales;
	public Long idArancelActual;
	public Long iIdNuevoArancel=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosProducto=false;

	public Boolean getIsTienePermisosProducto() {
		return isTienePermisosProducto;
	}

	public void setIsTienePermisosProducto(Boolean isTienePermisosProducto) {
		this.isTienePermisosProducto= isTienePermisosProducto;
	}


	public Boolean isTienePermisosDetallePedidoCompraImpor=false;

	public Boolean getIsTienePermisosDetallePedidoCompraImpor() {
		return isTienePermisosDetallePedidoCompraImpor;
	}

	public void setIsTienePermisosDetallePedidoCompraImpor(Boolean isTienePermisosDetallePedidoCompraImpor) {
		this.isTienePermisosDetallePedidoCompraImpor= isTienePermisosDetallePedidoCompraImpor;
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
	
	public Boolean isPermisoTodoArancel;
	public Boolean isPermisoNuevoArancel;
	public Boolean isPermisoActualizarArancel;
	public Boolean isPermisoActualizarOriginalArancel;
	public Boolean isPermisoEliminarArancel;
	public Boolean isPermisoGuardarCambiosArancel;
	public Boolean isPermisoConsultaArancel;
	public Boolean isPermisoBusquedaArancel;
	public Boolean isPermisoReporteArancel;
	public Boolean isPermisoPaginacionMedioArancel;
	public Boolean isPermisoPaginacionAltoArancel;
	public Boolean isPermisoPaginacionTodoArancel;
	public Boolean isPermisoCopiarArancel;
	public Boolean isPermisoVerFormArancel;
	public Boolean isPermisoDuplicarArancel;
	public Boolean isPermisoOrdenArancel;
	
	
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
	
	public ArancelParameterReturnGeneral arancelReturnGeneral;
	public ArancelParameterReturnGeneral arancelParameterGeneral;
	
	

	public ProductoLogic productoLogic=null;

	public ProductoLogic getProductoLogic() {
		return productoLogic;
	}

	public void setProductoLogic(ProductoLogic productoLogic) {
		this.productoLogic = productoLogic;
	}


	public DetallePedidoCompraImporLogic detallepedidocompraimporLogic=null;

	public DetallePedidoCompraImporLogic getDetallePedidoCompraImporLogic() {
		return detallepedidocompraimporLogic;
	}

	public void setDetallePedidoCompraImporLogic(DetallePedidoCompraImporLogic detallepedidocompraimporLogic) {
		this.detallepedidocompraimporLogic = detallepedidocompraimporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoArancel=false;
	public Boolean esParaAccionDesdeFormularioArancel=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ArancelSessionBeanAdditional arancelSessionBeanAdditional=null;
	
	public ArancelSessionBeanAdditional getArancelSessionBeanAdditional() {
		return this.arancelSessionBeanAdditional;
	}
	
	public void setArancelSessionBeanAdditional(ArancelSessionBeanAdditional arancelSessionBeanAdditional) {
		try {
			this.arancelSessionBeanAdditional=arancelSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ArancelBeanSwingJInternalFrameAdditional arancelBeanSwingJInternalFrameAdditional=null;
	//public class ArancelBeanSwingJInternalFrame
	
	public ArancelBeanSwingJInternalFrameAdditional getArancelBeanSwingJInternalFrameAdditional() {
		return this.arancelBeanSwingJInternalFrameAdditional;
	}
	
	public void setArancelBeanSwingJInternalFrameAdditional(ArancelBeanSwingJInternalFrameAdditional arancelBeanSwingJInternalFrameAdditional) {
		try {
			this.arancelBeanSwingJInternalFrameAdditional=arancelBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ArancelLogic arancelLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Arancel arancelBean;
	public ArancelConstantesFunciones arancelConstantesFunciones;
	//public ArancelParameterReturnGeneral arancelReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Arancel> arancels;	
	//public List<Arancel> arancelsEliminados;
	//public List<Arancel> arancelsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoArancel=false;
	public Boolean isVisibilidadCeldaDuplicarArancel=true;
	public Boolean isVisibilidadCeldaCopiarArancel=true;
	public Boolean isVisibilidadCeldaVerFormArancel=true;
	public Boolean isVisibilidadCeldaOrdenArancel=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesArancel=false;
	public Boolean isVisibilidadCeldaModificarArancel=false;
	public Boolean isVisibilidadCeldaActualizarArancel=false;
	public Boolean isVisibilidadCeldaEliminarArancel=false;
	public Boolean isVisibilidadCeldaCancelarArancel=false;
	public Boolean isVisibilidadCeldaGuardarArancel=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosArancel=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoArancel() {
		return this.iIdNuevoArancel;
	}

	public void setiIdNuevoArancel(Long iIdNuevoArancel) {
		this.iIdNuevoArancel = iIdNuevoArancel;
	}
	
	public Long getidArancelActual() {
		return this.idArancelActual;
	}

	public void setidArancelActual(Long idArancelActual) {
		this.idArancelActual = idArancelActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Arancel getarancel() {
		return this.arancel;
	}

	public void setarancel(Arancel arancel) {
		this.arancel = arancel;
	}
	
	public Arancel getarancelAux() {
		return this.arancelAux;
	}

	public void setarancelAux(Arancel arancelAux) {
		this.arancelAux = arancelAux;
	}				
	
	public Arancel getarancelAnterior() {
		return this.arancelAnterior;
	}

	public void setarancelAnterior(Arancel arancelAnterior) {
		this.arancelAnterior = arancelAnterior;
	}	
	
	public Arancel getarancelTotales() {
		return this.arancelTotales;
	}

	public void setarancelTotales(Arancel arancelTotales) {
		this.arancelTotales = arancelTotales;
	}	
	
	public Arancel getarancelBean() {
		return this.arancelBean;
	}

	public void setarancelBean(Arancel arancelBean) {
		this.arancelBean = arancelBean;
	}	
	
	public ArancelParameterReturnGeneral getarancelReturnGeneral() {
		return this.arancelReturnGeneral;
	}

	public void setarancelReturnGeneral(ArancelParameterReturnGeneral arancelReturnGeneral) {
		this.arancelReturnGeneral = arancelReturnGeneral;
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
	
	
	public ArancelLogic getArancelLogic()	{		
		return arancelLogic;
	}

	public void setArancelLogic(ArancelLogic arancelLogic) {
		this.arancelLogic = arancelLogic;
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
	
	public Boolean getIsEsNuevoArancel() {
		return isEsNuevoArancel;
	}

	public void setIsEsNuevoArancel(Boolean isEsNuevoArancel) {
		this.isEsNuevoArancel = isEsNuevoArancel;
	}

	public Boolean getEsParaAccionDesdeFormularioArancel() {
		return esParaAccionDesdeFormularioArancel;
	}
	
	public void setEsParaAccionDesdeFormularioArancel(Boolean esParaAccionDesdeFormularioArancel) {
		this.esParaAccionDesdeFormularioArancel = esParaAccionDesdeFormularioArancel;
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

			if(this.arancelSessionBean==null) {
				this.arancelSessionBean=new ArancelSessionBean();
			}

			if(!this.arancelSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(arancelSessionBean.getlidEmpresaActual());
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

					if(this.arancel!=null) {
						this.arancel.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormArancel!=null) {
						this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaArancel.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormArancel!=null) {
						if(this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.getItemCount()>0) {
							this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaArancelGenerico)throws Exception
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
				jComboBoxid_empresaArancelGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaArancelGenerico!=null && jComboBoxid_empresaArancelGenerico.getItemCount()>0) {
					jComboBoxid_empresaArancelGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Arancel arancel,JComboBox jComboBoxid_empresaArancelGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaArancelGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaArancelGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				arancel.setid_empresa(empresaAux.getId());
				arancel.setempresa_descripcion(ArancelConstantesFunciones.getEmpresaDescripcion(empresaAux));
				arancel.setEmpresa(empresaAux);			}
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

					if(!ArancelJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormArancel!=null) { 
							this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormArancel!=null) { 
					}

					if(!ArancelJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormArancel!=null) {
							this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormArancel!=null) {
							this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesArancel() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ArancelConstantesFunciones.refrescarForeignKeysDescripcionesArancel(this.arancelLogic.getArancels());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ArancelConstantesFunciones.refrescarForeignKeysDescripcionesArancel(this.arancels);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//arancelLogic.setArancels(this.arancels);
			arancelLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ArancelParameterReturnGeneral getArancelParameterGeneral() {
		return this.arancelParameterGeneral;
	}
	
	public void setArancelParameterGeneral(ArancelParameterReturnGeneral arancelParameterGeneral) {
		this.arancelParameterGeneral = arancelParameterGeneral;
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
	
	public Boolean getIsPermisoTodoArancel() {
		return isPermisoTodoArancel;
	}

	public void setIsPermisoTodoArancel(Boolean isPermisoTodoArancel) {
		this.isPermisoTodoArancel = isPermisoTodoArancel;
	}

	public Boolean getIsPermisoNuevoArancel() {
		return isPermisoNuevoArancel;
	}

	public void setIsPermisoNuevoArancel(Boolean isPermisoNuevoArancel) {
		this.isPermisoNuevoArancel = isPermisoNuevoArancel;
	}

	public Boolean getIsPermisoActualizarArancel() {
		return isPermisoActualizarArancel;
	}

	public void setIsPermisoActualizarArancel(Boolean isPermisoActualizarArancel) {
		this.isPermisoActualizarArancel = isPermisoActualizarArancel;
	}

	public Boolean getIsPermisoEliminarArancel() {
		return isPermisoEliminarArancel;
	}

	public void setIsPermisoEliminarArancel(Boolean isPermisoEliminarArancel) {
		this.isPermisoEliminarArancel = isPermisoEliminarArancel;
	}

	public Boolean getIsPermisoGuardarCambiosArancel() {
		return isPermisoGuardarCambiosArancel;
	}

	public void setIsPermisoGuardarCambiosArancel(Boolean isPermisoGuardarCambiosArancel) {
		this.isPermisoGuardarCambiosArancel = isPermisoGuardarCambiosArancel;
	}
	
	public Boolean getIsPermisoConsultaArancel() {
		return isPermisoConsultaArancel;
	}

	public void setIsPermisoConsultaArancel(Boolean isPermisoConsultaArancel) {
		this.isPermisoConsultaArancel = isPermisoConsultaArancel;
	}

	public Boolean getIsPermisoBusquedaArancel() {
		return isPermisoBusquedaArancel;
	}

	public void setIsPermisoBusquedaArancel(Boolean isPermisoBusquedaArancel) {
		this.isPermisoBusquedaArancel = isPermisoBusquedaArancel;
	}

	public Boolean getIsPermisoReporteArancel() {
		return isPermisoReporteArancel;
	}

	public void setIsPermisoReporteArancel(Boolean isPermisoReporteArancel) {
		this.isPermisoReporteArancel = isPermisoReporteArancel;
	}
	
	public Boolean getIsPermisoPaginacionMedioArancel() {
		return isPermisoPaginacionMedioArancel;
	}

	public void setIsPermisoPaginacionMedioArancel(Boolean isPermisoPaginacionMedioArancel) {
		this.isPermisoPaginacionMedioArancel = isPermisoPaginacionMedioArancel;
	}
	
	public Boolean getIsPermisoPaginacionTodoArancel() {
		return isPermisoPaginacionTodoArancel;
	}

	public void setIsPermisoPaginacionTodoArancel(Boolean isPermisoPaginacionTodoArancel) {
		this.isPermisoPaginacionTodoArancel = isPermisoPaginacionTodoArancel;
	}
	
	public Boolean getIsPermisoPaginacionAltoArancel() {
		return isPermisoPaginacionAltoArancel;
	}

	public void setIsPermisoPaginacionAltoArancel(Boolean isPermisoPaginacionAltoArancel) {
		this.isPermisoPaginacionAltoArancel = isPermisoPaginacionAltoArancel;
	}
	
	public Boolean getIsPermisoCopiarArancel() {
		return isPermisoCopiarArancel;
	}

	public void setIsPermisoCopiarArancel(Boolean isPermisoCopiarArancel) {
		this.isPermisoCopiarArancel = isPermisoCopiarArancel;
	}
	
	public Boolean getIsPermisoVerFormArancel() {
		return isPermisoVerFormArancel;
	}

	public void setIsPermisoVerFormArancel(Boolean isPermisoVerFormArancel) {
		this.isPermisoVerFormArancel = isPermisoVerFormArancel;
	}
	
	public Boolean getIsPermisoDuplicarArancel() {
		return isPermisoDuplicarArancel;
	}

	public void setIsPermisoDuplicarArancel(Boolean isPermisoDuplicarArancel) {
		this.isPermisoDuplicarArancel = isPermisoDuplicarArancel;
	}
	
	public Boolean getIsPermisoOrdenArancel() {
		return isPermisoOrdenArancel;
	}

	public void setIsPermisoOrdenArancel(Boolean isPermisoOrdenArancel) {
		this.isPermisoOrdenArancel = isPermisoOrdenArancel;
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
	
	public Boolean getIsVisibilidadCeldaNuevoArancel() {
		return isVisibilidadCeldaNuevoArancel;
	}

	public void setIsVisibilidadCeldaNuevoArancel(Boolean isVisibilidadCeldaNuevoArancel) {
		this.isVisibilidadCeldaNuevoArancel = isVisibilidadCeldaNuevoArancel;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarArancel() {
		return isVisibilidadCeldaDuplicarArancel;
	}

	public void setIsVisibilidadCeldaDuplicarArancel(Boolean isVisibilidadCeldaDuplicarArancel) {
		this.isVisibilidadCeldaDuplicarArancel = isVisibilidadCeldaDuplicarArancel;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarArancel() {
		return isVisibilidadCeldaCopiarArancel;
	}

	public void setIsVisibilidadCeldaCopiarArancel(Boolean isVisibilidadCeldaCopiarArancel) {
		this.isVisibilidadCeldaCopiarArancel = isVisibilidadCeldaCopiarArancel;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormArancel() {
		return isVisibilidadCeldaVerFormArancel;
	}

	public void setIsVisibilidadCeldaVerFormArancel(Boolean isVisibilidadCeldaVerFormArancel) {
		this.isVisibilidadCeldaVerFormArancel = isVisibilidadCeldaVerFormArancel;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenArancel() {
		return isVisibilidadCeldaOrdenArancel;
	}

	public void setIsVisibilidadCeldaOrdenArancel(Boolean isVisibilidadCeldaOrdenArancel) {
		this.isVisibilidadCeldaOrdenArancel = isVisibilidadCeldaOrdenArancel;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesArancel() {
		return isVisibilidadCeldaNuevoRelacionesArancel;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesArancel(Boolean isVisibilidadCeldaNuevoRelacionesArancel) {
		this.isVisibilidadCeldaNuevoRelacionesArancel = isVisibilidadCeldaNuevoRelacionesArancel;
	}
	
	public Boolean getIsVisibilidadCeldaModificarArancel() {
		return isVisibilidadCeldaModificarArancel;
	}

	public void setIsVisibilidadCeldaModificarArancel(Boolean isVisibilidadCeldaModificarArancel) {
		this.isVisibilidadCeldaModificarArancel = isVisibilidadCeldaModificarArancel;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarArancel() {
		return isVisibilidadCeldaActualizarArancel;
	}

	public void setIsVisibilidadCeldaActualizarArancel(Boolean isVisibilidadCeldaActualizarArancel) {
		this.isVisibilidadCeldaActualizarArancel = isVisibilidadCeldaActualizarArancel;
	}

	public Boolean getIsVisibilidadCeldaEliminarArancel() {
		return isVisibilidadCeldaEliminarArancel;
	}

	public void setIsVisibilidadCeldaEliminarArancel(Boolean isVisibilidadCeldaEliminarArancel) {
		this.isVisibilidadCeldaEliminarArancel = isVisibilidadCeldaEliminarArancel;
	}

	public Boolean getIsVisibilidadCeldaCancelarArancel() {
		return isVisibilidadCeldaCancelarArancel;
	}

	public void setIsVisibilidadCeldaCancelarArancel(Boolean isVisibilidadCeldaCancelarArancel) {
		this.isVisibilidadCeldaCancelarArancel = isVisibilidadCeldaCancelarArancel;
	}

	public Boolean getIsVisibilidadCeldaGuardarArancel() {
		return isVisibilidadCeldaGuardarArancel;
	}

	public void setIsVisibilidadCeldaGuardarArancel(Boolean isVisibilidadCeldaGuardarArancel) {
		this.isVisibilidadCeldaGuardarArancel = isVisibilidadCeldaGuardarArancel;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosArancel() {
		return isVisibilidadCeldaGuardarCambiosArancel;
	}

	public void setIsVisibilidadCeldaGuardarCambiosArancel(Boolean isVisibilidadCeldaGuardarCambiosArancel) {
		this.isVisibilidadCeldaGuardarCambiosArancel = isVisibilidadCeldaGuardarCambiosArancel;
	}
		
	public ArancelSessionBean getarancelSessionBean() {
		return this.arancelSessionBean;
	}
	
	public void setarancelSessionBean(ArancelSessionBean arancelSessionBean) {
		this.arancelSessionBean=arancelSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysArancel(Arancel arancel)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(arancel,null);
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
	
	public void bugActualizarReferenciaActual(Arancel arancel,Arancel arancelAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalArancel(arancel);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		arancelAux.setId(arancel.getId());
		arancelAux.setVersionRow(arancel.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessArancel();
		
			int intSelectedRow = this.jTableDatosArancel.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = arancelValidator.getInvalidValues(this.arancel);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			arancelLogic.setDatosCliente(datosCliente);
			arancelLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				arancelAux=new  Arancel();
				
				arancelAux.setIsNew(true);
				arancelAux.setIsChanged(true);
				
				arancelAux.setArancelOriginal(this.arancel);
				
				arancelAux.setId(this.arancel.getId());	
				arancelAux.setVersionRow(this.arancel.getVersionRow());	
				arancelAux.setid_empresa(this.arancel.getid_empresa());	
				arancelAux.setcodigo(this.arancel.getcodigo());	
				arancelAux.setnombre(this.arancel.getnombre());	
				arancelAux.setporcentaje(this.arancel.getporcentaje());	
				arancelAux.setobservacion(this.arancel.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.arancelSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.arancelSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(arancelAux,arancelLogic.getArancels());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(arancelAux,arancels);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.arancelSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.arancelSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.saveArancels();//WithConnection
						//arancelLogic.getSetVersionRowArancels();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.arancel,arancelAux);
					
					this.refrescarForeignKeysDescripcionesArancel();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors().addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors.addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								arancelLogic.saveArancelRelaciones(arancelAux,this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());//WithConnection
								//arancelLogic.getSetVersionRowArancels();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.arancel,arancelAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.setDetallePedidoCompraImpors(new ArrayList<DetallePedidoCompraImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors= new ArrayList<DetallePedidoCompraImpor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.arancelSessionBean.getEstaModoGuardarRelaciones() 
									|| this.arancelSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(arancelAux,arancelLogic.getArancels());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(arancelAux,arancels);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.arancel,arancelAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				arancelAux=new  Arancel();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.arancelSessionBean.getEsGuardarRelacionado() 
					|| (this.arancelSessionBean.getEsGuardarRelacionado() && this.arancel.getId()>=0)) {
						
					arancelAux.setIsNew(false);
				}
				
				arancelAux.setIsDeleted(false);
			
				arancelAux.setId(this.arancel.getId());	
				arancelAux.setVersionRow(this.arancel.getVersionRow());	
				arancelAux.setid_empresa(this.arancel.getid_empresa());	
				arancelAux.setcodigo(this.arancel.getcodigo());	
				arancelAux.setnombre(this.arancel.getnombre());	
				arancelAux.setporcentaje(this.arancel.getporcentaje());	
				arancelAux.setobservacion(this.arancel.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(arancelAux,arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(arancelAux,arancels);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.arancelSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.arancelSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.saveArancels();//WithConnection
						//arancelLogic.getSetVersionRowArancels();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.arancel,arancelAux);
					
					this.refrescarForeignKeysDescripcionesArancel();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors().addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors.addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								arancelLogic.saveArancelRelaciones(arancelAux,this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());//WithConnection
								//arancelLogic.getSetVersionRowArancels();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.arancel,arancelAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.setDetallePedidoCompraImpors(new ArrayList<DetallePedidoCompraImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors= new ArrayList<DetallePedidoCompraImpor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.arancelSessionBean.getEstaModoGuardarRelaciones() 
									|| this.arancelSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(arancelAux,arancelLogic.getArancels());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(arancelAux,arancels);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.arancel,arancelAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				arancelAux=new  Arancel();
				
				arancelAux.setIsNew(false);
				arancelAux.setIsChanged(false);
				
				arancelAux.setIsDeleted(true);
				
				arancelAux.setId(this.arancel.getId());	
				arancelAux.setVersionRow(this.arancel.getVersionRow());	
				arancelAux.setid_empresa(this.arancel.getid_empresa());	
				arancelAux.setcodigo(this.arancel.getcodigo());	
				arancelAux.setnombre(this.arancel.getnombre());	
				arancelAux.setporcentaje(this.arancel.getporcentaje());	
				arancelAux.setobservacion(this.arancel.getobservacion());	
				
				if(this.arancelSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.arancelAux.getId()>=0) {	
						this.arancelsEliminados.add(arancelAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(arancelAux,arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(arancelAux,arancels);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.arancelSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.arancelSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.saveArancels();//WithConnection
						//arancelLogic.getSetVersionRowArancels();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors().addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors.addAll(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								arancelLogic.saveArancelRelaciones(arancelAux,this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());//WithConnection
								//arancelLogic.getSetVersionRowArancels();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.setDetallePedidoCompraImpors(new ArrayList<DetallePedidoCompraImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors= new ArrayList<DetallePedidoCompraImpor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.quitarFilaTotales();}
							arancelAux.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.arancelSessionBean.getEstaModoGuardarRelaciones() 
								|| this.arancelSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(arancelAux,arancelLogic.getArancels());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(arancelAux,arancels);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getArancels().addAll(this.arancelsEliminados);
					
					arancelLogic.saveArancels();//WithConnection
					//arancelLogic.getSetVersionRowArancels();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesArancel();
				
				this.arancelsEliminados= new ArrayList<Arancel>();		
			}
			
			if(this.arancelSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Arancel GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.arancel=arancelAux;
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
      		//this.finishProcessArancel();
      	}
		
	}	
	
	public void actualizarRelaciones(Arancel arancelLocal) throws Exception {
		
		if(this.arancelSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				arancelLocal.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				arancelLocal.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());
			
			} else {
			
				arancelLocal.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productos);
				arancelLocal.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Arancel arancelLocal) throws Exception {	
		if(this.arancelSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				arancelLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarArancelActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosArancel.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = arancelValidator.getInvalidValues(this.arancel);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Arancel arancel,List<Arancel> arancels) throws Exception {
		try	{		
			ArancelConstantesFunciones.actualizarLista(arancel,arancels,this.arancelSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Arancel arancel,List<Arancel> arancels) throws Exception {
		try	{			
			ArancelConstantesFunciones.actualizarSelectedLista(arancel,arancels);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Arancel> arancelsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				arancelsLocal=this.arancelLogic.getArancels();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				arancelsLocal=this.arancels;
			}
			//ARCHITECTURE
		
			for(Arancel arancelLocal:arancelsLocal) {
				if(this.permiteMantenimiento(arancelLocal) && arancelLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ArancelConstantesFunciones.getArancelLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ArancelConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelid_empresaArancel,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ArancelConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelcodigoArancel,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ArancelConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelnombreArancel,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ArancelConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelporcentajeArancel,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ArancelConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelobservacionArancel,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArancel.jLabelid_empresaArancel,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArancel.jLabelcodigoArancel,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArancel.jLabelnombreArancel,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArancel.jLabelporcentajeArancel,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArancel.jLabelobservacionArancel,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.arancel==null) {
				this.arancel= new Arancel();
			}

			if(this.arancelSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoArancel
				this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);

				this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.getproducto().setArancel(this.arancel);
			}

			return;
		}
		 else  if(sTipo.equals("DetallePedidoCompraImpor")) {
			if(this.arancel==null) {
				this.arancel= new Arancel();
			}

			if(this.arancelSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoArancel
				this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);

				this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.getdetallepedidocompraimpor().setArancel(this.arancel);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoArancel--;	
		
		
		this.arancelAux=new Arancel();
		
		this.arancelAux.setId(this.iIdNuevoArancel);
		this.arancelAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arancelLogic.getArancels().add(this.arancelAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arancels.add(this.arancelAux);
		}
		//ARCHITECTURE
		
		this.arancel=this.arancelAux;
		
		if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioArancel(this.arancel);
			this.setVariablesObjetoActualToFormularioForeignKeyArancel(this.arancel);
		}
				
		//this.setDefaultControlesArancel();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyArancel();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyArancel();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyArancel();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualArancel(this.arancelBean,this.arancel,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ArancelConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.arancelSessionBean.getConGuardarRelaciones()) {
			classes=ArancelConstantesFunciones.getClassesRelationshipsOfArancel(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.arancelReturnGeneral=arancelLogic.procesarEventosArancelsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.arancelLogic.getArancels(),this.arancel,this.arancelParameterGeneral,this.isEsNuevoArancel,classes);//this.arancelLogic.getArancel()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanArancel(this.arancelReturnGeneral,this.arancelBean,false);
		
		if(this.arancelReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyArancel(this.arancelReturnGeneral.getArancel());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioArancel(this.arancelReturnGeneral.getArancel());
		}
		
		if(this.arancelReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioArancel(this.arancelReturnGeneral.getArancel(),classes);//this.arancelBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualArancel(this.arancel,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyArancel();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyArancel();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ArancelBeanSwingJInternalFrameAdditional.RecargarFormArancel(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingArancel(false);
						
			if(arancelSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() && DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePedidoCompraImporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArancel();
			}
			
			this.actualizarVisualTableDatosArancel();
			
			this.jTableDatosArancel.setRowSelectionInterval(this.getIndiceNuevoArancel(), this.getIndiceNuevoArancel());
			
			this.seleccionarFilaTablaArancelActual();
						
			this.actualizarEstadoCeldasBotonesArancel("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesArancel(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setEnabled(isHabilitar && this.arancelConstantesFunciones.activarcodigoArancel);
		this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setEnabled(isHabilitar && this.arancelConstantesFunciones.activarnombreArancel);
		this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setEnabled(isHabilitar && this.arancelConstantesFunciones.activarporcentajeArancel);
		this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setEnabled(isHabilitar && this.arancelConstantesFunciones.activarobservacionArancel);	
		//
		this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setEnabled(isHabilitar && this.arancelConstantesFunciones.activarid_empresaArancel);
	};
	
	public void setDefaultControlesArancel() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoArancel(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.arancelSessionBean.setConGuardarRelaciones(true);			
			this.arancelSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.arancelSessionBean.setConGuardarRelaciones(false);			
			this.arancelSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoArancel() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Arancel arancelAux:this.arancelLogic.getArancels()) {
				if(arancelAux.getId().equals(this.iIdNuevoArancel)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Arancel arancelAux:this.arancels) {
				if(arancelAux.getId().equals(this.iIdNuevoArancel)) {
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
	
	public int getIndiceActualArancel(Arancel arancel,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Arancel arancelAux:this.arancelLogic.getArancels()) {
				if(arancelAux.getId().equals(arancel.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Arancel arancelAux:this.arancels) {
				if(arancelAux.getId().equals(arancel.getId())) {
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
	
	public void setCamposBaseDesdeOriginalArancel(Arancel arancelOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Arancel arancelAux:this.arancelLogic.getArancels()) {
				if(arancelAux.getArancelOriginal().getId().equals(arancelOriginal.getId())) {
					existe=true;
					arancelOriginal.setId(arancelAux.getId());
					arancelOriginal.setVersionRow(arancelAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Arancel arancelAux:this.arancels) {
				if(arancelAux.getArancelOriginal().getId().equals(arancelOriginal.getId())) {
					existe=true;
					arancelOriginal.setId(arancelAux.getId());
					arancelOriginal.setVersionRow(arancelAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosArancel(Boolean esParaCancelar) throws Exception {
		arancelsAux=new ArrayList<Arancel>();
		arancelAux=new Arancel();
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Arancel arancelAux:this.arancelLogic.getArancels()) {
					if(arancelAux.getId()<0) {
						arancelsAux.add(arancelAux);
					}		
				}
				this.iIdNuevoArancel=0L;
				this.arancelLogic.getArancels().removeAll(arancelsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Arancel arancelAux:this.arancels) {
					if(arancelAux.getId()<0) {
						arancelsAux.add(arancelAux);
					}		
				}
				this.iIdNuevoArancel=0L;
				this.arancels.removeAll(arancelsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoArancel 
					&& this.arancelLogic.getArancels().size()>0
					) {
					arancelAux=this.arancelLogic.getArancels().get(this.arancelLogic.getArancels().size() - 1);
				
					if(arancelAux.getId()<0) {
						this.arancelLogic.getArancels().remove(arancelAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoArancel && this.arancels.size()>0) {
					arancelAux=this.arancels.get(this.arancels.size() - 1);
				
					if(arancelAux.getId()<0) {
						this.arancels.remove(arancelAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoArancel(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(arancel.getId()<0) {
				this.arancelLogic.getArancels().remove(this.arancel);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(arancel.getId()<0) {
				this.arancels.remove(this.arancel);
			}
		}			
	}
	
	public void setEstadosInicialesArancel(List<Arancel> arancelsAux) throws Exception {
		ArancelConstantesFunciones.setEstadosInicialesArancel(arancelsAux);
	}
	
	public void setEstadosInicialesArancel(Arancel arancelAux) throws Exception {
		ArancelConstantesFunciones.setEstadosInicialesArancel(arancelAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarArancelActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarArancelActual()) {
				if(!this.isEsNuevoArancel) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoArancel=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarArancelActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Arancel ?", "MANTENIMIENTO DE Arancel", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Arancel arancel) throws Exception {
		ArancelConstantesFunciones.seleccionarAsignar(this.arancel,arancel);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarArancel=this.isPermisoActualizarOriginalArancel;
			
			
			this.seleccionarAsignar(arancel);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ArancelConstantesFunciones.quitarEspaciosArancel(this.arancel,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesArancel("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.arancelSessionBean.setsFuncionBusquedaRapida(this.arancelSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoArancel) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosArancel(esParaCancelar);				
				this.cancelarNuevoArancel(esParaCancelar);								
			}
			
			this.arancel=new Arancel();
			
			this.inicializarArancel();
			
			this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarArancel() throws Exception {
		try {
			ArancelConstantesFunciones.inicializarArancel(this.arancel);
			
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
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.arancelLogic.getArancels().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteArancels(String sAccionBusqueda,List<Arancel> arancelsParaReportes) throws Exception {
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
					sPathReporteFinal="Arancel"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ArancelMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ArancelMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Arancel"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Aranceles");		
		parameters.put("busquedapor", ArancelConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Producto.class));
			classes.add(new Classe(DetallePedidoCompraImpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ArancelLogic arancelLogicAuxiliar=new ArancelLogic();
					arancelLogicAuxiliar.setDatosCliente(arancelLogic.getDatosCliente());				
					arancelLogicAuxiliar.setArancels(arancelsParaReportes);
					
					arancelLogicAuxiliar.cargarRelacionesLoteForeignKeyArancelWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					arancelsParaReportes=arancelLogicAuxiliar.getArancels();
					
					//arancelLogic.getNewConnexionToDeep();
					
					//for (Arancel arancel:arancelsParaReportes) {
					//	arancelLogic.deepLoad(arancel, false, DeepLoadType.INCLUDE, classes);
					//}						
					//arancelLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//arancelLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProducto = AuxiliarReportes.class.getResourceAsStream("ProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_producto", reportFileProducto);

			InputStream reportFileDetallePedidoCompraImpor = AuxiliarReportes.class.getResourceAsStream("DetallePedidoCompraImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallepedidocompraimpor", reportFileDetallePedidoCompraImpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceArancel=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ArancelConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ArancelConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceArancel=new JRBeanArrayDataSource(ArancelJInternalFrame.TraerArancelBeans(arancelsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceArancel);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ArancelConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ArancelConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ArancelBean.TraerArancelBeans(arancelsParaReportes).toArray()));
							
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
				this.generarExcelReporteArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoArancelActionPerformed(null);
					//this.generarExcelReporteArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesArancels(sAccionBusqueda,sTipoArchivoReporte,arancelsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteArancels(String sAccionBusqueda,String sTipoArchivoReporte,List<Arancel> arancelsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Arancels");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderArancel("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Arancel arancel : arancelsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ArancelConstantesFunciones.generarExcelReporteDataArancel("NORMAL",row,workbook,arancel,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderArancel(String sTipo,Row row,Workbook workbook) {
		
		ArancelConstantesFunciones.generarExcelReporteHeaderArancel(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalArancels(String sAccionBusqueda,String sTipoArchivoReporte,List<Arancel> arancelsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Arancels");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Arancel arancel : arancelsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ArancelConstantesFunciones.getArancelDescripcion(arancel));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ArancelConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ArancelConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(arancel.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ArancelConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ArancelConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(arancel.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ArancelConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ArancelConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(arancel.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ArancelConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ArancelConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(arancel.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ArancelConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ArancelConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(arancel.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesArancels(String sAccionBusqueda,String sTipoArchivoReporte,List<Arancel> arancelsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Arancel> arancelsRespaldo=null;
		
		classes=ArancelConstantesFunciones.getClassesRelationshipsOfArancel(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.arancelLogic.setDatosCliente(this.datosCliente);
		this.arancelLogic.setDatosDeep(this.datosDeep);
		this.arancelLogic.setIsConDeep(true);
		
		arancelsRespaldo=this.arancelLogic.getArancels();
		
		this.arancelLogic.setArancels(arancelsParaReportes);	
		this.arancelLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		arancelsParaReportes=this.arancelLogic.getArancels();
		this.arancelLogic.setArancels(arancelsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Arancels");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderArancel("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Arancel arancel : arancelsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderArancel("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ArancelConstantesFunciones.generarExcelReporteDataArancel("NORMAL",row,workbook,arancel,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(arancel.getProductos()!=null && arancel.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(arancel.getProductos()!=null) {
					i2=0;
					for(Producto producto : arancel.getProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoConstantesFunciones.generarExcelReporteDataProducto("RELACIONADO",row,workbook,producto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetallePedidoCompraImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(arancel.getDetallePedidoCompraImpors()!=null && arancel.getDetallePedidoCompraImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetallePedidoCompraImporConstantesFunciones.generarExcelReporteHeaderDetallePedidoCompraImpor("RELACIONADO",row,workbook);
				}

				if(arancel.getDetallePedidoCompraImpors()!=null) {
					i2=0;
					for(DetallePedidoCompraImpor detallepedidocompraimpor : arancel.getDetallePedidoCompraImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetallePedidoCompraImporConstantesFunciones.generarExcelReporteDataDetallePedidoCompraImpor("RELACIONADO",row,workbook,detallepedidocompraimpor,cellStyleDataAuxHijo);
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
		cell.setCellValue(ArancelConstantesFunciones.getArancelDescripcion(arancel));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoArancel.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArancel.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessArancel() throws Exception {		
		this.startProcessArancel(true);
	}
	
	public void startProcessArancel(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasArancel ,this.jPanelParametrosReportesArancel, this.jScrollPanelDatosArancel,this.jPanelPaginacionArancel, this.jScrollPanelDatosEdicionArancel, this.jPanelAccionesArancel,this.jPanelAccionesFormularioArancel,this.jmenuBarArancel,this.jmenuBarDetalleArancel,this.jTtoolBarArancel,this.jTtoolBarDetalleArancel);		
		
		final JTabbedPane jTabbedPaneBusquedasArancel=this.jTabbedPaneBusquedasArancel; 
		
		final JPanel jPanelParametrosReportesArancel=this.jPanelParametrosReportesArancel;
		//final JScrollPane jScrollPanelDatosArancel=this.jScrollPanelDatosArancel;
		final JTable jTableDatosArancel=this.jTableDatosArancel;		
		final JPanel jPanelPaginacionArancel=this.jPanelPaginacionArancel;
		//final JScrollPane jScrollPanelDatosEdicionArancel=this.jScrollPanelDatosEdicionArancel;
		final JPanel jPanelAccionesArancel=this.jPanelAccionesArancel;
		
		JPanel jPanelCamposAuxiliarArancel=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarArancel=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
			jPanelCamposAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jPanelCamposArancel;
			jPanelAccionesFormularioAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jPanelAccionesFormularioArancel;
		}
		
		final JPanel jPanelCamposArancel=jPanelCamposAuxiliarArancel;
		final JPanel jPanelAccionesFormularioArancel=jPanelAccionesFormularioAuxiliarArancel;
		
		
		final JMenuBar jmenuBarArancel=this.jmenuBarArancel;
		final JToolBar jTtoolBarArancel=this.jTtoolBarArancel;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarArancel=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarArancel=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
			jmenuBarDetalleAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jmenuBarDetalleArancel;
			jTtoolBarDetalleAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jTtoolBarDetalleArancel;
		}
		
		final JMenuBar jmenuBarDetalleArancel=jmenuBarDetalleAuxiliarArancel;
		final JToolBar jTtoolBarDetalleArancel=jTtoolBarDetalleAuxiliarArancel;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasArancel;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesArancel;
			processRunnable.jTableDatos=jTableDatosArancel;
			processRunnable.jPanelCampos=jPanelCamposArancel;
			processRunnable.jPanelPaginacion=jPanelPaginacionArancel;
			processRunnable.jPanelAcciones=jPanelAccionesArancel;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioArancel;
			
			
			processRunnable.jmenuBar=jmenuBarArancel;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleArancel;
			processRunnable.jTtoolBar=jTtoolBarArancel;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleArancel;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasArancel ,jPanelParametrosReportesArancel,jTableDatosArancel, /*jScrollPanelDatosArancel,*/jPanelCamposArancel,jPanelPaginacionArancel, /*jScrollPanelDatosEdicionArancel,*/ jPanelAccionesArancel,jPanelAccionesFormularioArancel,jmenuBarArancel,jmenuBarDetalleArancel,jTtoolBarArancel,jTtoolBarDetalleArancel);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasArancel ,jPanelParametrosReportesArancel, jScrollPanelDatosArancel,jPanelPaginacionArancel, jScrollPanelDatosEdicionArancel, jPanelAccionesArancel,jPanelAccionesFormularioArancel,jmenuBarArancel,jmenuBarDetalleArancel,jTtoolBarArancel,jTtoolBarDetalleArancel);
						
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
	
	public void finishProcessArancel() {// throws Exception 
		this.finishProcessArancel(true);
	}
	
	public void finishProcessArancel(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasArancel ,this.jPanelParametrosReportesArancel, this.jScrollPanelDatosArancel,this.jPanelPaginacionArancel, this.jScrollPanelDatosEdicionArancel, this.jPanelAccionesArancel,this.jPanelAccionesFormularioArancel,this.jmenuBarArancel,this.jmenuBarDetalleArancel,this.jTtoolBarArancel,this.jTtoolBarDetalleArancel);		
		
		final JTabbedPane jTabbedPaneBusquedasArancel=this.jTabbedPaneBusquedasArancel; 
		
		final JPanel jPanelParametrosReportesArancel=this.jPanelParametrosReportesArancel;
		//final JScrollPane jScrollPanelDatosArancel=this.jScrollPanelDatosArancel;
		final JTable jTableDatosArancel=this.jTableDatosArancel;		
		final JPanel jPanelPaginacionArancel=this.jPanelPaginacionArancel;
		//final JScrollPane jScrollPanelDatosEdicionArancel=this.jScrollPanelDatosEdicionArancel;
		final JPanel jPanelAccionesArancel=this.jPanelAccionesArancel;
		
		JPanel jPanelCamposAuxiliarArancel=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarArancel=new JPanel();
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
			jPanelCamposAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jPanelCamposArancel;
			jPanelAccionesFormularioAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jPanelAccionesFormularioArancel;
		}
		
		final JPanel jPanelCamposArancel=jPanelCamposAuxiliarArancel;
		final JPanel jPanelAccionesFormularioArancel=jPanelAccionesFormularioAuxiliarArancel;
		
		
		final JMenuBar jmenuBarArancel=this.jmenuBarArancel;		
		final JToolBar jTtoolBarArancel=this.jTtoolBarArancel;
				
		JMenuBar jmenuBarDetalleAuxiliarArancel=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarArancel=new JToolBar();
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
			jmenuBarDetalleAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jmenuBarDetalleArancel;
			jTtoolBarDetalleAuxiliarArancel=this.jInternalFrameDetalleFormArancel.jTtoolBarDetalleArancel;		
		}
		
		final JMenuBar jmenuBarDetalleArancel=jmenuBarDetalleAuxiliarArancel;
		final JToolBar jTtoolBarDetalleArancel=jTtoolBarDetalleAuxiliarArancel;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasArancel;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesArancel;
			processRunnable.jTableDatos=jTableDatosArancel;
			processRunnable.jPanelCampos=jPanelCamposArancel;
			processRunnable.jPanelPaginacion=jPanelPaginacionArancel;
			processRunnable.jPanelAcciones=jPanelAccionesArancel;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioArancel;
			
			
			processRunnable.jmenuBar=jmenuBarArancel;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleArancel;
			processRunnable.jTtoolBar=jTtoolBarArancel;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleArancel;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasArancel ,jPanelParametrosReportesArancel, jTableDatosArancel,/*jScrollPanelDatosArancel,*/jPanelCamposArancel,jPanelPaginacionArancel, /*jScrollPanelDatosEdicionArancel,*/ jPanelAccionesArancel,jPanelAccionesFormularioArancel,jmenuBarArancel,jmenuBarDetalleArancel,jTtoolBarArancel,jTtoolBarDetalleArancel));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesArancel(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarArancel(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuArancel(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarArancel(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarArancel,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleArancel,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuArancel(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarArancel,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleArancel,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.arancelConstantesFunciones.getsFinalQueryArancel();
		String  finalQueryPaginacionTodos=this.arancelConstantesFunciones.getsFinalQueryArancel();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ArancelConstantesFunciones.getArrayColumnasGlobalesNoArancel(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ArancelConstantesFunciones.getArrayColumnasGlobalesArancel(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ArancelConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.arancelsEliminados= new ArrayList<Arancel>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessArancel();
		
				///*ArancelSessionBean*/this.arancelSessionBean=new ArancelSessionBean();
			
			if(this.arancelSessionBean==null) {
				this.arancelSessionBean=new ArancelSessionBean();
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
					this.iNumeroPaginacion=ArancelConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ArancelConstantesFunciones.getClassesForeignKeysOfArancel(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/arancel."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			arancelsAux= new ArrayList<Arancel>();
			
				
			arancelLogic.setDatosCliente(this.datosCliente);
			arancelLogic.setDatosDeep(this.datosDeep);
			arancelLogic.setIsConDeep(true);
			
			
			arancelLogic.getArancelDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					arancelLogic.getTodosArancels(finalQueryGlobal,pagination);
					
					//arancelLogic.getTodosArancelsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(arancelLogic.getArancels()==null|| arancelLogic.getArancels().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							arancelsAux= new ArrayList<Arancel>();
							arancelsAux.addAll(arancelLogic.getArancels());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancelsAux= new ArrayList<Arancel>();
							arancelsAux.addAll(arancels);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							arancelLogic.getTodosArancels(finalQueryGlobal+"",this.pagination);												
							
							//arancelLogic.getTodosArancelsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteArancels("Todos",arancelLogic.getArancels() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							arancelLogic.setArancels(new ArrayList<Arancel>());					
							arancelLogic.getArancels().addAll(arancelsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancels=new ArrayList<Arancel>();
							arancels.addAll(arancelsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idArancel=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idArancel=this.idActual;
				
				} else if(this.idArancelActual!=null && this.idArancelActual!=0L) {
					idArancel=idArancelActual;
				}
				
					
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndicePorId(idArancel);
				
				this.arancels=new ArrayList<Arancel>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					arancelLogic.getEntity(idArancel);
					
					//arancelLogic.getEntityWithConnection(idArancel);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					arancelLogic.setArancels(new ArrayList<Arancel>());
					arancelLogic.getArancels().add(arancelLogic.getArancel());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.arancels=new ArrayList<Arancel>();
					this.arancels.add(arancel);
				}
				
				if(arancelLogic.getArancel()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					arancelLogic.getArancelsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=arancelLogic.getArancels()==null||arancelLogic.getArancels().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=arancels==null|| arancels.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelsAux=new ArrayList<Arancel>();
						arancelsAux.addAll(arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancelsAux=new ArrayList<Arancel>();
							arancelsAux.addAll(arancels);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							arancelLogic.getArancelsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteArancels("BusquedaPorCodigo",arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteArancels("BusquedaPorCodigo",arancels);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.setArancels(new ArrayList<Arancel>());
						arancelLogic.getArancels().addAll(arancelsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancels=new ArrayList<Arancel>();
							arancels.addAll(arancelsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					arancelLogic.getArancelsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=arancelLogic.getArancels()==null||arancelLogic.getArancels().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=arancels==null|| arancels.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelsAux=new ArrayList<Arancel>();
						arancelsAux.addAll(arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancelsAux=new ArrayList<Arancel>();
							arancelsAux.addAll(arancels);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							arancelLogic.getArancelsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteArancels("BusquedaPorNombre",arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteArancels("BusquedaPorNombre",arancels);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.setArancels(new ArrayList<Arancel>());
						arancelLogic.getArancels().addAll(arancelsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancels=new ArrayList<Arancel>();
							arancels.addAll(arancelsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					arancelLogic.getArancelsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=arancelLogic.getArancels()==null||arancelLogic.getArancels().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=arancels==null|| arancels.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelsAux=new ArrayList<Arancel>();
						arancelsAux.addAll(arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancelsAux=new ArrayList<Arancel>();
							arancelsAux.addAll(arancels);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							arancelLogic.getArancelsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ArancelConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteArancels("FK_IdEmpresa",arancelLogic.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteArancels("FK_IdEmpresa",arancels);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelLogic.setArancels(new ArrayList<Arancel>());
						arancelLogic.getArancels().addAll(arancelsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancels=new ArrayList<Arancel>();
							arancels.addAll(arancelsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesArancel();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessArancel();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=arancelLogic.getArancels().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=arancels.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=arancelLogic.getArancels().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=arancels.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Arancel arancel) {
		Boolean permite=true;
		
		if(this.arancel.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ArancelConstantesFunciones.getOrderByListaArancel();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ArancelConstantesFunciones.getOrderByListaArancel();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Arancel arancel:arancelLogic.getArancels()) {
				if(arancel.getsType().equals(Constantes2.S_TOTALES)) {
					arancelTotales=arancel;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Arancel arancel:this.arancels) {
				if(arancel.getsType().equals(Constantes2.S_TOTALES)) {
					arancelTotales=arancel;
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
			this.arancelAux=new Arancel();
			this.arancelAux.setsType(Constantes2.S_TOTALES);
			this.arancelAux.setIsNew(false);
			this.arancelAux.setIsChanged(false);
			this.arancelAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ArancelConstantesFunciones.TotalizarValoresFilaArancel(this.arancelLogic.getArancels(),this.arancelAux);
				
				this.arancelLogic.getArancels().add(this.arancelAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ArancelConstantesFunciones.TotalizarValoresFilaArancel(this.arancels,this.arancelAux);
				
				this.arancels.add(this.arancelAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		arancelTotales=new Arancel();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.arancelLogic.getArancels().remove(arancelTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.arancels.remove(arancelTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		arancelTotales=new Arancel();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Arancel arancel:arancelLogic.getArancels()) {
				if(arancel.getsType().equals(Constantes2.S_TOTALES)) {
					arancelTotales=arancel;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ArancelConstantesFunciones.TotalizarValoresFilaArancel(this.arancelLogic.getArancels(),arancelTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Arancel arancel:this.arancels) {
				if(arancel.getsType().equals(Constantes2.S_TOTALES)) {
					arancelTotales=arancel;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ArancelConstantesFunciones.TotalizarValoresFilaArancel(this.arancels,arancelTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getArancelsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getArancelsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getArancelsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getArancelsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					arancelLogic.getArancelsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getArancelsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					arancelLogic.getArancelsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getArancelsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					arancelLogic.getArancelsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosArancel() {
		this.isPermisoTodoArancel=false;
		this.isPermisoNuevoArancel=false;
		this.isPermisoActualizarArancel=false;
		this.isPermisoActualizarOriginalArancel=false;
		this.isPermisoEliminarArancel=false;
		this.isPermisoGuardarCambiosArancel=false;
		this.isPermisoConsultaArancel=false;
		this.isPermisoBusquedaArancel=false;
		this.isPermisoReporteArancel=false;		
		this.isPermisoOrdenArancel=false;		
		this.isPermisoPaginacionMedioArancel=false;		
		this.isPermisoPaginacionAltoArancel=false;
		this.isPermisoPaginacionTodoArancel=false;
		this.isPermisoCopiarArancel=false;		
		this.isPermisoVerFormArancel=false;		
		this.isPermisoDuplicarArancel=false;		
		this.isPermisoOrdenArancel=false;		
	}
	
	public void setPermisosUsuarioArancel(Boolean isPermiso) {
		this.isPermisoTodoArancel=isPermiso;
		this.isPermisoNuevoArancel=isPermiso;
		this.isPermisoActualizarArancel=isPermiso;
		this.isPermisoActualizarOriginalArancel=isPermiso;
		this.isPermisoEliminarArancel=isPermiso;
		this.isPermisoGuardarCambiosArancel=isPermiso;
		this.isPermisoConsultaArancel=isPermiso;
		this.isPermisoBusquedaArancel=isPermiso;
		this.isPermisoReporteArancel=isPermiso;
		this.isPermisoOrdenArancel=isPermiso;		
		this.isPermisoPaginacionMedioArancel=isPermiso;		
		this.isPermisoPaginacionAltoArancel=isPermiso;		
		this.isPermisoPaginacionTodoArancel=isPermiso;		
		this.isPermisoCopiarArancel=isPermiso;		
		this.isPermisoVerFormArancel=isPermiso;		
		this.isPermisoDuplicarArancel=isPermiso;
		this.isPermisoOrdenArancel=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioArancel(Boolean isPermiso) {
		//this.isPermisoTodoArancel=isPermiso;
		this.isPermisoNuevoArancel=isPermiso;
		this.isPermisoActualizarArancel=isPermiso;
		this.isPermisoActualizarOriginalArancel=isPermiso;
		this.isPermisoEliminarArancel=isPermiso;
		this.isPermisoGuardarCambiosArancel=isPermiso;
		//this.isPermisoConsultaArancel=isPermiso;
		//this.isPermisoBusquedaArancel=isPermiso;
		//this.isPermisoReporteArancel=isPermiso;
		//this.isPermisoOrdenArancel=isPermiso;		
		//this.isPermisoPaginacionMedioArancel=isPermiso;		
		//this.isPermisoPaginacionAltoArancel=isPermiso;		
		//this.isPermisoPaginacionTodoArancel=isPermiso;		
		//this.isPermisoCopiarArancel=isPermiso;		
		//this.isPermisoDuplicarArancel=isPermiso;
		//this.isPermisoOrdenArancel=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioArancelClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetallePedidoCompraImporConstantesFunciones.SNOMBREOPCION);
		
		if(ArancelJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProducto=false;
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionArancelClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetallePedidoCompraImpor=false;
		this.isTienePermisosDetallePedidoCompraImpor=this.verificarGetPermisosUsuarioOpcionArancelClaseRelacionada(this.opcionsRelacionadas,DetallePedidoCompraImporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebArancel(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioArancelClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosDetallePedidoCompraImpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioArancelClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionArancelClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioArancelClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormArancel!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.remove(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetallePedidoCompraImpor && this.jInternalFrameDetalleFormArancel!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.remove(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioArancel() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ArancelJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.arancelSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ArancelConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoArancel=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarArancel=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalArancel=this.isPermisoActualizarArancel;
			this.isPermisoEliminarArancel=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosArancel=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaArancel=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaArancel=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoArancel=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteArancel=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenArancel=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioArancel=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoArancel=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoArancel=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarArancel=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormArancel=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarArancel=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenArancel=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.arancelSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosArancel.setToolTipText(this.jTableDatosArancel.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioArancel(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioArancel(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ArancelJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ArancelJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioArancel() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.arancelConstantesFunciones.mostrarProductoArancel && !ArancelConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetallePedidoCompraImpor && this.arancelConstantesFunciones.mostrarDetallePedidoCompraImporArancel && !ArancelConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Pedido Compra");
			reporte.setsDescripcion("Detalle Pedido Compra");
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
	public void inicializarCombosForeignKeyArancelListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyArancelListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ArancelJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyArancelListas(false);
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
	
	public void cargarCombosLoteForeignKeyArancelListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ArancelParameterReturnGeneral arancelReturnGeneral=new ArancelParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.arancelConstantesFunciones.cargarid_empresaArancel)
					 || (this.esRecargarFks && this.arancelConstantesFunciones.cargarid_empresaArancel)) {

					if(!this.arancelSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+arancelSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				arancelReturnGeneral=arancelLogic.cargarCombosLoteForeignKeyArancel(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=arancelReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyArancel()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.arancelSessionBean==null) {
				this.arancelSessionBean=new ArancelSessionBean();
			}

			if(!this.arancelSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyArancel()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyArancel(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyArancel()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyArancel();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyArancel(Arancel arancel)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyArancel(Arancel arancel,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyArancel()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyArancel()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyArancel()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyArancel()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroArancel()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyArancel()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyArancel(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyArancel()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel!=null && this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.getItemCount()>0) {
				this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ArancelBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ArancelBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ArancelBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.arancelSessionBean=new ArancelSessionBean(); 
		this.arancelConstantesFunciones=new ArancelConstantesFunciones(); 
		this.arancelBean=new Arancel();//(this.arancelConstantesFunciones); 		
		this.arancelReturnGeneral=new ArancelParameterReturnGeneral(); 
		
		this.arancelSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.arancelSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ArancelBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ArancelBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ArancelBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessArancel(true);
			
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
			
			this.arancelConstantesFunciones=new ArancelConstantesFunciones(); 
			this.arancelBean=new Arancel();//this.arancelConstantesFunciones); 			
			this.arancelReturnGeneral=new ArancelParameterReturnGeneral(); 
		
			ArancelBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Arancel Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.arancel=new Arancel();
			this.arancels = new ArrayList<Arancel>();
			this.arancelsAux = new ArrayList<Arancel>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic=new ArancelLogic();
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			//this.arancelSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.arancelSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormArancel);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoArancel!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoArancel);	
					}
					
					if(this.jInternalFrameImportacionArancel!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionArancel);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByArancel!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByArancel);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormArancel!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormArancel);
				this.jInternalFrameDetalleFormArancel.setVisible(false);
				this.jInternalFrameDetalleFormArancel.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoArancel!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoArancel);
					this.jInternalFrameReporteDinamicoArancel.setVisible(false);
					this.jInternalFrameReporteDinamicoArancel.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionArancel!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionArancel);
					this.jInternalFrameImportacionArancel.setVisible(false);
					this.jInternalFrameImportacionArancel.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByArancel!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByArancel);
					this.jInternalFrameOrderByArancel.setVisible(false);
					this.jInternalFrameOrderByArancel.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idArancelActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ArancelConstantesFunciones.INUMEROPAGINACION;
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
			
			this.arancelReturnGeneral=new ArancelParameterReturnGeneral();
			
			this.arancelParameterGeneral=new ArancelParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.arancelLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ArancelJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.arancelSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetallePedidoCompraImporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ArancelConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.arancelSessionBean.getEsGuardarRelacionado(),this.arancelSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ArancelConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.arancelSessionBean.getEsGuardarRelacionado(),this.arancelSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaDuplicarArancel=true;
			this.isVisibilidadCeldaCopiarArancel=true;
			this.isVisibilidadCeldaVerFormArancel=true;
			this.isVisibilidadCeldaOrdenArancel=true;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=false;
			this.isVisibilidadCeldaGuardarArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosArancel();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioArancel(false);
			
			this.setPermisosUsuarioArancel();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.arancelSessionBean.getEsGuardarRelacionado() 
				|| (this.arancelSessionBean.getEsGuardarRelacionado() && this.arancelSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioArancelClasesRelacionadas();
			}
			
			if(this.arancelSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioArancelClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ArancelJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosArancel();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualArancel();
			}
			
			if(!this.isPermisoBusquedaArancel) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasArancel.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.arancelSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioArancel,this.isPermisoPaginacionMedioArancel,this.isPermisoPaginacionTodoArancel);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ArancelConstantesFunciones.getTiposSeleccionarArancel());
				
				this.tiposColumnasSelect=ArancelConstantesFunciones.getTiposSeleccionarArancel(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectArancel();				
				//this.tiposRelacionesSelect=ArancelConstantesFunciones.getTiposRelacionesArancel(true);
				
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
			//if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioArancel();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioArancel(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioArancel(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesArancel() ;
			
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
			
			
			this.productoLogic=new ProductoLogic();
			this.detallepedidocompraimporLogic=new DetallePedidoCompraImporLogic(); 
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
				arancelImplementable= (ArancelImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ArancelConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				arancelImplementableHome= (ArancelImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ArancelConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.arancels= new ArrayList<Arancel>();
			this.arancelsEliminados= new ArrayList<Arancel>();
						
			this.isEsNuevoArancel=false;
			this.esParaAccionDesdeFormularioArancel=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyArancel(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroArancel();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ArancelBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ArancelConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesArancel("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingArancel(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormArancel!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioArancel();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioArancel();
			}
			
			ArancelBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasArancel.getTabCount(); i++) {
					this.jTabbedPaneBusquedasArancel.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasArancel.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessArancel(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Arancel: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectArancel() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesArancel")) {
				iIndex=this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosArancel.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Pedido Compras")) {
					if(!DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessArancel();

						this.cargarParteTabPanelRelacionadaDetallePedidoCompraImpor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessArancel();

						this.cargarParteTabPanelRelacionadaProducto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessArancel();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetallePedidoCompraImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormArancel.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(false,true,iIndex);
		this.jButtonDetallePedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetallePedidoCompraImpor();

		//this.jTabbedPaneRelacionesArancel.updateUI();
		//this.jTabbedPaneRelacionesArancel.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesArancel.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormArancel.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesArancel.updateUI();
		//this.jTabbedPaneRelacionesArancel.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesArancel.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosArancel.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetallePedidoCompraImpor")) {
				int row=this.jTableDatosArancel.getSelectedRow();
				jButtonDetallePedidoCompraImporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.arancelConstantesFunciones.mostrarProductoArancel && !ArancelConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(arancelConstantesFunciones.resaltarProductoArancel!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(arancelConstantesFunciones.resaltarProductoArancel);
						}

						jmenuItem.setEnabled(this.arancelConstantesFunciones.activarProductoArancel);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormArancel.jmenuDetalleArancel.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Pedido Compra")) {

					if(this.isTienePermisosDetallePedidoCompraImpor && this.arancelConstantesFunciones.mostrarDetallePedidoCompraImporArancel && !ArancelConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Pedido Compras"+"("+DetallePedidoCompraImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Pedido Compras");

						if(arancelConstantesFunciones.resaltarDetallePedidoCompraImporArancel!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(arancelConstantesFunciones.resaltarDetallePedidoCompraImporArancel);
						}

						jmenuItem.setEnabled(this.arancelConstantesFunciones.activarDetallePedidoCompraImporArancel);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetallePedidoCompraImpor"));

						

						this.jInternalFrameDetalleFormArancel.jmenuDetalleArancel.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyArancel(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyArancel(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyArancel(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyArancelListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyArancel();
		
		this.cargarCombosFrameForeignKeyArancel();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyArancel();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyArancel();
		}
	}
	
	
	
	public void jButtonNuevoArancelActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.arancelSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			
			if(jTableDatosArancel.getRowCount()>=1) {
				jTableDatosArancel.removeRowSelectionInterval(0, jTableDatosArancel.getRowCount()-1);						
			}
			
			this.isEsNuevoArancel=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoArancel(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesArancel(true);			
			//this.arancel=new Arancel();
			//this.arancel.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArancel(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArancel() ;
			
			if(ArancelJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArancel(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.arancel);	
			this.actualizarInformacion("INFO_PADRE",false,this.arancel);				
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			if(this.arancelSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Arancel: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarArancelActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosArancel.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosArancel.getSelectedRows().length;			
			}
			
			arancelsSeleccionados=this.getArancelsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoArancel--;			
				//Arancel arancelAux= new Arancel();			
				//arancelAux.setId(this.iIdNuevoArancel);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Arancel arancelOrigen=new Arancel();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Arancel arancelOrigen : arancelsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosArancel.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							arancelOrigen =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							arancelOrigen =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaArancel();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.arancel.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosArancel(arancelOrigen,this.arancel,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.arancelLogic.getArancels().add(this.arancelAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.arancels.add(this.arancelAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaArancel(false);
				
				this.jTableDatosArancel.setRowSelectionInterval(this.getIndiceNuevoArancel(), this.getIndiceNuevoArancel());
				
				int iLastRow =  this.jTableDatosArancel.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosArancel.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosArancel.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaArancel(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();									
		
			Arancel arancelOrigen=new Arancel();
			Arancel arancelDestino=new Arancel();
				
			arancelsSeleccionados=this.getArancelsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosArancel.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || arancelsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosArancel.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelOrigen =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						arancelOrigen =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						arancelDestino =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						arancelDestino =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				arancelOrigen =arancelsSeleccionados.get(0);
				arancelDestino =arancelsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosArancel(arancelOrigen,arancelDestino,true,false);
				
				arancelDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(arancelDestino,arancelLogic.getArancels());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(arancelDestino,arancels);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaArancel(false);
				
				//this.jTableDatosArancel.setRowSelectionInterval(this.getIndiceNuevoArancel(), this.getIndiceNuevoArancel());
				
				int iLastRow =  this.jTableDatosArancel.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosArancel.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosArancel.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaArancel(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormArancel.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesArancel.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasArancel.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesArancel.setVisible(!isVisible);
			this.jPanelPaginacionArancel.setVisible(!isVisible);
			this.jPanelAccionesArancel.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameArancel();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoArancel();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionArancel();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByArancel();
			
			this.abrirFrameOrderByArancel();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByArancel();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleArancel(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormArancel);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormArancel.isMaximum()) {
					this.jInternalFrameDetalleFormArancel.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormArancel.setSize(this.jInternalFrameDetalleFormArancel.iWidthFormulario,this.jInternalFrameDetalleFormArancel.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormArancel.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormArancel.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormArancel.isMaximum()) {
						this.jInternalFrameDetalleFormArancel.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth(),ArancelConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth(),ArancelConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth(),ArancelConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetallePedidoCompraImpor();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormArancel.setVisible(true);
	        this.jInternalFrameDetalleFormArancel.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByArancel() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByArancel==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByArancel=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArancel,false,this);
				} else {
					this.jInternalFrameOrderByArancel=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArancel,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByArancel);
				this.jInternalFrameOrderByArancel.setVisible(false);
				this.jInternalFrameOrderByArancel.setSelected(false);
				
				this.jInternalFrameOrderByArancel.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByArancel"));
				
				this.inicializarActualizarBindingTablaOrderByArancel();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionArancel() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionArancel==null) {
				
				this.jInternalFrameImportacionArancel=new ImportacionJInternalFrame(ArancelConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionArancel);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionArancel);
				this.jInternalFrameImportacionArancel.setVisible(false);
				this.jInternalFrameImportacionArancel.setSelected(false);


				this.jInternalFrameImportacionArancel.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionArancel"));
				this.jInternalFrameImportacionArancel.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionArancel"));
				this.jInternalFrameImportacionArancel.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionArancel"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoArancel() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoArancel==null) {
				this.jInternalFrameReporteDinamicoArancel=new ReporteDinamicoJInternalFrame(ArancelConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoArancel);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoArancel);
				this.jInternalFrameReporteDinamicoArancel.setVisible(false);
				this.jInternalFrameReporteDinamicoArancel.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoArancel.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArancel"));
				this.jInternalFrameReporteDinamicoArancel.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArancel"));
				this.jInternalFrameReporteDinamicoArancel.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArancel"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArancel();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetallePedidoCompraImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoCompraImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoCompraImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoCompraImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoCompraImpor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormArancel.jContentPaneDetalleArancel.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleArancel() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormArancel);
			
	       	this.jInternalFrameDetalleFormArancel.setVisible(false);
	        this.jInternalFrameDetalleFormArancel.setSelected(false);
			
			//this.jInternalFrameDetalleFormArancel.dispose();
			//this.jInternalFrameDetalleFormArancel=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoArancel() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoArancel.setVisible(true);
	        this.jInternalFrameReporteDinamicoArancel.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionArancel() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionArancel.setVisible(true);
	        this.jInternalFrameImportacionArancel.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByArancel() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByArancel.setVisible(true);
	        this.jInternalFrameOrderByArancel.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByArancel() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByArancel.setVisible(false);
	        this.jInternalFrameOrderByArancel.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoArancel() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoArancel.setVisible(false);
	        this.jInternalFrameReporteDinamicoArancel.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionArancel() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionArancel.setVisible(false);
	        this.jInternalFrameImportacionArancel.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarArancel(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarArancel(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosArancel.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesArancel(true);
			//this.isEsNuevoArancel=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesArancel("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArancel(false) ;
			
			if(arancelSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() && DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePedidoCompraImporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ArancelJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArancel(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArancel(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaArancelActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarArancel(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosArancel.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesArancel(true);
			//this.isEsNuevoArancel=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.arancel.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesArancel("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesArancel(false) ;
			
			if(ArancelJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArancel(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArancel(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesArancel(false);
			
			//if(!this.isEsNuevoArancel) {								
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
				this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				
			}
			
			if(this.permiteMantenimiento(this.arancel)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.arancelSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoArancel=true;
					this.inicializarActualizarBindingTablaArancel(false);
					this.isEsNuevoArancel=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoArancel=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoArancel=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesArancel(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArancel(false);
				
				this.habilitarDeshabilitarControlesArancel(false);
			
												
				
				if(ArancelJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleArancel();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoArancelActionPerformed(evt,arancelSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualArancel(this.arancel,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosArancel.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,arancelSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.arancel.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarArancelActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosArancel.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				this.arancel.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				this.arancel.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.arancel)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.arancelSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ArancelModel) this.jTableDatosArancel.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoArancel=true;
				this.inicializarActualizarBindingTablaArancel(false);
				this.isEsNuevoArancel=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesArancel(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArancel(false);
				
				this.habilitarDeshabilitarControlesArancel(false);
				
				
				
				if(ArancelJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleArancel();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarArancelActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosArancel.getRowCount()>=1) {
				jTableDatosArancel.removeRowSelectionInterval(0, jTableDatosArancel.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesArancel(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaArancel(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArancel(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArancel(false) ;
			
			this.isEsNuevoArancel=false;
			
			if(ArancelJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleArancel();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosArancelActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingArancel(false);
				
				//SI ES MANUAL
				if(ArancelJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualArancel();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosArancelActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoArancel--;			
			//Arancel arancelAux= new Arancel();			
			//arancelAux.setId(this.iIdNuevoArancel);
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaArancel();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
			
			this.arancel.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.arancelLogic.getArancels().add(this.arancelAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.arancels.add(this.arancelAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaArancel(false);
			
			this.jTableDatosArancel.setRowSelectionInterval(this.getIndiceNuevoArancel(), this.getIndiceNuevoArancel());
			
			int iLastRow =  this.jTableDatosArancel.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosArancel.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosArancel.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaArancel(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionArancelActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingArancel(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArancel(false);
			
			//SI ES MANUAL
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArancel();
			}
			
			//this.abrirFrameTreeArancel();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionArancelActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ArancelES ?", "MANTENIMIENTO DE Arancel", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionArancel.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralArancel();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.arancelReturnGeneral=arancelLogic.procesarImportacionArancelsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.arancelParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarArancelReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionArancelActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionArancel.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionArancel.setFileImportacion(this.jInternalFrameImportacionArancel.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionArancel.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionArancel.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionArancel.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionArancel.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoArancelActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		

		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ArancelBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ArancelBaseDesign.jrxml";
			
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
			
			this.generarReporteArancels("Todos",arancelsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ArancelConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ArancelConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ArancelConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ArancelConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ArancelConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoArancel.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ArancelConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ArancelConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ArancelConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ArancelConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ArancelConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ArancelConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ArancelConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ArancelConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ArancelConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ArancelConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoArancel.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArancel.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ArancelConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ArancelConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ArancelConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ArancelConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ArancelConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoArancelActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Arancels");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ArancelConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ArancelConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Arancel arancel:arancelsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(arancel.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ArancelConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ArancelConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Arancel arancel:arancelsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(arancel.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ArancelConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ArancelConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Arancel arancel:arancelsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(arancel.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ArancelConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ArancelConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(Arancel arancel:arancelsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(arancel.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ArancelConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ArancelConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(Arancel arancel:arancelsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(arancel.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelArancel(row);				
			//	iRow++;
			//}				
			
			//for(Arancel arancelAux:arancelsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelArancel(arancelAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
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
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArancel(false);
			
			//SI ES MANUAL
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArancel();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresArancelActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArancel(false);
			
			//SI ES MANUAL
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualArancel();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesArancelActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArancel(false);
			
			//SI ES MANUAL
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualArancel();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaArancel() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosArancel.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosArancel.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosArancel.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosArancel.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosArancel.setMinimumSize(dimensionMinimum);
		this.jTableDatosArancel.setMaximumSize(dimensionMaximum);
		this.jTableDatosArancel.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingArancel(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingArancel(esInicializar,true);
	}
	
	public void inicializarActualizarBindingArancel(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaArancel(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesArancel(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasArancel(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesArancel(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesArancel(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ArancelJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ArancelJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualArancel() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaArancel();
		
		this.inicializarActualizarBindingBotonesManualArancel(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualArancel();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesArancel() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualArancel(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualArancel(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosArancel.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosArancel.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteArancel.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormArancel!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionNuevoArancel.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionSinCerrarArancel.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionSinMensajeArancel.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosArancel.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosArancel.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteArancel.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormArancel!=null) {
				this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionNuevoArancel.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionSinCerrarArancel.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormArancel.jCheckBoxPostAccionSinMensajeArancel.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionArancel.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionArancel.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesArancel.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoArancel!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesArancel.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesArancel.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarArancel.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesArancel.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoArancel!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesArancel.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralArancel.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesArancel(Boolean esInicializar) throws Exception {
		try	{	
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualArancel(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesArancel() throws Exception {
		try	{
			if(ArancelJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualArancel();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleArancel() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualArancel() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesArancel.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesArancel.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesArancel.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionArancel.addItem(reporte);
			}
			
			
			if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionArancel.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionArancel.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesArancel.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesArancel.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarArancel.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarArancel.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarArancel.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArancel();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArancel() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoArancel!=null) {
				this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoArancel!=null) {
				this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoArancel!=null) {
				
				if(this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoArancel.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoArancel.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoArancel.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ArancelConstantesFunciones.getTiposSeleccionarArancel(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ArancelConstantesFunciones.getTiposSeleccionarArancel(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoArancel.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoArancel.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ArancelConstantesFunciones.getTiposSeleccionarArancel(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoArancel.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoArancel.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualArancel()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoArancel.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreArancel.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasArancel(Boolean esInicializar) throws Exception {				
		if(ArancelJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualArancel();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaArancel() throws Exception {
		this.inicializarActualizarBindingTablaArancel(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByArancel() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArancel.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArancel.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosArancelOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancelOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArancel.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaArancel(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=arancelLogic.getArancels().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=arancels.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosArancel.setModel(new ArancelModel(this.arancelLogic.getArancels(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosArancel.setModel(new ArancelModel(this.arancels,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByArancel!=null && this.jInternalFrameOrderByArancel.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByArancel();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ArancelConstantesFunciones.SCLASSWEBTITULO,arancelConstantesFunciones.resaltarSeleccionarArancel,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ArancelConstantesFunciones.SCLASSWEBTITULO,arancelConstantesFunciones.resaltarSeleccionarArancel,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_ID));

		if(this.arancelConstantesFunciones.mostraridArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.arancelConstantesFunciones.resaltaridArancel,this.arancelConstantesFunciones.activaridArancel,iSizeTabla,this,true,"idArancel","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.arancelConstantesFunciones.resaltaridArancel,this.arancelConstantesFunciones.activaridArancel,this,true,"idArancel","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_IDEMPRESA));

		if(this.arancelConstantesFunciones.mostrarid_empresaArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.arancelConstantesFunciones.resaltarid_empresaArancel,this,this.arancelConstantesFunciones.activarid_empresaArancel,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.arancelConstantesFunciones.resaltarid_empresaArancel,this,this.arancelConstantesFunciones.activarid_empresaArancel,false,"id_empresaArancel","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_CODIGO));

		if(this.arancelConstantesFunciones.mostrarcodigoArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.arancelConstantesFunciones.resaltarcodigoArancel,this.arancelConstantesFunciones.activarcodigoArancel,iSizeTabla,this,true,"codigoArancel","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.arancelConstantesFunciones.resaltarcodigoArancel,this.arancelConstantesFunciones.activarcodigoArancel,this,true,"codigoArancel","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_NOMBRE));

		if(this.arancelConstantesFunciones.mostrarnombreArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.arancelConstantesFunciones.resaltarnombreArancel,this.arancelConstantesFunciones.activarnombreArancel,iSizeTabla,this,true,"nombreArancel","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.arancelConstantesFunciones.resaltarnombreArancel,this.arancelConstantesFunciones.activarnombreArancel,this,true,"nombreArancel","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_PORCENTAJE));

		if(this.arancelConstantesFunciones.mostrarporcentajeArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.arancelConstantesFunciones.resaltarporcentajeArancel,this.arancelConstantesFunciones.activarporcentajeArancel,iSizeTabla,this,true,"porcentajeArancel","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.arancelConstantesFunciones.resaltarporcentajeArancel,this.arancelConstantesFunciones.activarporcentajeArancel,this,true,"porcentajeArancel","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArancel,ArancelConstantesFunciones.LABEL_OBSERVACION));

		if(this.arancelConstantesFunciones.mostrarobservacionArancel && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ArancelConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.arancelConstantesFunciones.resaltarobservacionArancel,this.arancelConstantesFunciones.activarobservacionArancel,iSizeTabla,this,true,"observacionArancel","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.arancelConstantesFunciones.resaltarobservacionArancel,this.arancelConstantesFunciones.activarobservacionArancel,this,true,"observacionArancel","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ArancelPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.arancelSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.arancelConstantesFunciones.mostrarProductoArancel && !ArancelConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(arancelConstantesFunciones.resaltarProductoArancel,this,this.arancelConstantesFunciones.activarProductoArancel));
				tableColumn.setCellEditor(new ProductoTableCell(arancelConstantesFunciones.resaltarProductoArancel,this,this.arancelConstantesFunciones.activarProductoArancel));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosArancel.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetallePedidoCompraImpor && this.arancelConstantesFunciones.mostrarDetallePedidoCompraImporArancel && !ArancelConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Pedido Compras");
				tableColumn.setHeaderValue("Detalle Pedido Compras");
				tableColumn.setCellRenderer(new DetallePedidoCompraImporTableCell(arancelConstantesFunciones.resaltarDetallePedidoCompraImporArancel,this,this.arancelConstantesFunciones.activarDetallePedidoCompraImporArancel));
				tableColumn.setCellEditor(new DetallePedidoCompraImporTableCell(arancelConstantesFunciones.resaltarDetallePedidoCompraImporArancel,this,this.arancelConstantesFunciones.activarDetallePedidoCompraImporArancel));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosArancel.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosArancel.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosArancel.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarArancel && this.isPermisoGuardarCambiosArancel) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.arancelSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosArancel.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.arancelSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosArancel.addColumn(tableColumn);
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
			
			this.jTableDatosArancel.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarArancel && this.isPermisoGuardarCambiosArancel) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.arancelSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarArancel && this.isPermisoGuardarCambiosArancel) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosArancel.moveColumn(this.jTableDatosArancel.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosArancel.moveColumn(this.jTableDatosArancel.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.arancelSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosArancel.moveColumn(this.jTableDatosArancel.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosArancel.moveColumn(this.jTableDatosArancel.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosArancel.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosArancel.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosArancel,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosArancel.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosArancel.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosArancel.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosArancel.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosArancel.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=arancelLogic.getArancels().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=arancels.size()-1;
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
		//this.jTableDatosArancel.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosArancel.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosArancel();
			
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
				
				//this.isEsNuevoArancel=false;
					
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
				if(this.arancelSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormArancel==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosArancel.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosArancel.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.arancel.getsType().equals("DUPLICADO")
				   || this.arancel.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoArancel=true;
				
				} else {
					this.isEsNuevoArancel=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
					if(this.arancel.getId()>=0 && !this.arancel.getIsNew()) {						
						this.isEsNuevoArancel=false;
						
					} else {
						this.isEsNuevoArancel=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoArancel(esRelaciones);						
				
				this.seleccionarArancel(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.arancel.getId()<0) {
					this.isEsNuevoArancel=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarArancel(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarArancel(evt,rowIndex);
				}	
				
				if(this.arancelSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Arancel: " + this.dDif); 
					}
				}								
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarArancel(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.arancel)) {
					if(this.arancel.getId()>0) {
						this.arancel.setIsDeleted(true);
						
						this.arancelsEliminados.add(this.arancel);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.arancelLogic.getArancels().remove(this.arancel);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.arancels.remove(this.arancel);				
					}
					
					
					((ArancelModel) this.jTableDatosArancel.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaArancel(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarArancel(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoArancel) {
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosArancel.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosArancel.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioArancel(this.arancel);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.arancelConstantesFunciones.cargarid_empresaArancel || this.arancelConstantesFunciones.event_dependid_empresaArancel) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.arancel.getid_empresa());
									//this.inicializarActualizarBindingArancel(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(arancel.getEmpresa()!=null) {
							this.empresasForeignKey.add(arancel.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.arancel.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesArancel("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesArancel(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArancel() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoArancel(Arancel arancel) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoArancel(arancel,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoArancel(Arancel arancel,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioArancel(arancel);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyArancel(arancel,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyArancel(arancel);
	}
	
	public void setVariablesObjetoActualToFormularioArancel(Arancel arancel) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormArancel.jLabelidArancel.setText(arancel.getId().toString());
			this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setText(arancel.getcodigo());
			this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setText(arancel.getnombre());
			this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setText(arancel.getporcentaje().toString());
			this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setText(arancel.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Arancel arancelLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,arancelLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Arancel arancelLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				arancelLocal=this.arancel;
			} else {
				arancelLocal=this.arancelAnterior;
			}
		}
		
		if(this.permiteMantenimiento(arancelLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoArancel(arancelLocal,true);
					
					if(arancelSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(arancelLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.arancelSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(arancelLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoArancel(Arancel arancel,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualArancel(arancel,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysArancel(arancel);
	}
	
	public void setVariablesFormularioToObjetoActualArancel(Arancel arancel,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualArancel(arancel,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualArancel(Arancel arancel,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormArancel.jLabelidArancel.getText()==null || this.jInternalFrameDetalleFormArancel.jLabelidArancel.getText()=="" || this.jInternalFrameDetalleFormArancel.jLabelidArancel.getText()=="Id") {
				this.jInternalFrameDetalleFormArancel.jLabelidArancel.setText("0");
			}

			if(conColumnasBase) {arancel.setId(Long.parseLong(this.jInternalFrameDetalleFormArancel.jLabelidArancel.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ArancelConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelIdArancel,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			arancel.setcodigo(this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ArancelConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelcodigoArancel,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			arancel.setnombre(this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ArancelConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelnombreArancel,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			arancel.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ArancelConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelporcentajeArancel,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			arancel.setobservacion(this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ArancelConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArancel.jLabelobservacionArancel,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualArancel(Arancel arancelBean,Arancel arancel,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosArancel(Arancel arancelOrigen,Arancel arancel,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && arancelOrigen.getId()!=null && !arancelOrigen.getId().equals(0L))) {arancel.setId(arancelOrigen.getId());}}
			if(conDefault || (!conDefault && arancelOrigen.getcodigo()!=null && !arancelOrigen.getcodigo().equals(""))) {arancel.setcodigo(arancelOrigen.getcodigo());}
			if(conDefault || (!conDefault && arancelOrigen.getnombre()!=null && !arancelOrigen.getnombre().equals(""))) {arancel.setnombre(arancelOrigen.getnombre());}
			if(conDefault || (!conDefault && arancelOrigen.getporcentaje()!=null && !arancelOrigen.getporcentaje().equals(0.0))) {arancel.setporcentaje(arancelOrigen.getporcentaje());}
			if(conDefault || (!conDefault && arancelOrigen.getobservacion()!=null && !arancelOrigen.getobservacion().equals(""))) {arancel.setobservacion(arancelOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioArancel(Arancel arancel) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormArancel.jLabelidArancel.setText(arancel.getId().toString());
			this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setText(arancel.getcodigo());
			this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setText(arancel.getnombre());
			this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setText(arancel.getporcentaje().toString());
			this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setText(arancel.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioArancel(ArancelBean arancelBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormArancel.jLabelidArancel.setText(arancelBean.getId().toString());
			this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setText(arancelBean.getcodigo());
			this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setText(arancelBean.getnombre());
			this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setText(arancelBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setText(arancelBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanArancel(ArancelParameterReturnGeneral arancelReturnGeneral,ArancelBean arancelBean,Boolean conDefault) throws Exception { 
		try {
			Arancel arancelLocal=new Arancel();
			
			arancelLocal=arancelReturnGeneral.getArancel();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && arancelLocal.getId()!=null && !arancelLocal.getId().equals(0L))) {arancelBean.setId(arancelLocal.getId());}}
			if(conDefault || (!conDefault && arancelLocal.getcodigo()!=null && !arancelLocal.getcodigo().equals(""))) {arancelBean.setcodigo(arancelLocal.getcodigo());}
			if(conDefault || (!conDefault && arancelLocal.getnombre()!=null && !arancelLocal.getnombre().equals(""))) {arancelBean.setnombre(arancelLocal.getnombre());}
			if(conDefault || (!conDefault && arancelLocal.getporcentaje()!=null && !arancelLocal.getporcentaje().equals(0.0))) {arancelBean.setporcentaje(arancelLocal.getporcentaje());}
			if(conDefault || (!conDefault && arancelLocal.getobservacion()!=null && !arancelLocal.getobservacion().equals(""))) {arancelBean.setobservacion(arancelLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxArancelGenerico(Long idArancelSeleccionado,JComboBox jComboBoxArancel,List<Arancel> arancelsLocal)throws Exception {
		try {
			Arancel  arancelTemp=null;

			for(Arancel arancelAux:arancelsLocal) {
				if(arancelAux.getId()!=null && arancelAux.getId().equals(idArancelSeleccionado)) {
					arancelTemp=arancelAux;
					break;
				}
			}

			jComboBoxArancel.setSelectedItem(arancelTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxArancelGenerico(JComboBox jComboBoxArancel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxArancel.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxArancel.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxArancel.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxArancel.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Producto")) {
			jButtonProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetallePedidoCompraImpor")) {
			jButtonDetallePedidoCompraImporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			arancel=(Arancel) arancelLogic.getArancels().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			arancel =(Arancel) arancels.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!arancel.getIsNew() && !arancel.getIsChanged() && !arancel.getIsDeleted()) {
				sDescripcion=arancel.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=arancel.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Arancel arancelRow=new Arancel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			arancelRow=(Arancel) arancelLogic.getArancels().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			arancelRow=(Arancel) arancels.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Arancel arancel) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormArancel==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel = (Arancel)this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.arancel = (Arancel)this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(arancel!=null) {
						this.arancel = arancel;
					} else {
						this.arancel = new Arancel();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.arancel)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame;
					}

					List<Arancel> arancels=new ArrayList<Arancel>();
					arancels.add(this.arancel);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormArancel.cargarProductoBeanSwingJInternalFrame(arancels,this.arancel,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArancel=(TitledBorder)this.jScrollPanelDatosArancel.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderArancel.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.arancelSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetallePedidoCompraImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Arancel arancel) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormArancel==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel = (Arancel)this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.arancel = (Arancel)this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(arancel!=null) {
						this.arancel = arancel;
					} else {
						this.arancel = new Arancel();
					}
				}

				if(this.isTienePermisosDetallePedidoCompraImpor && this.permiteMantenimiento(this.arancel)) {
					DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup=new DetallePedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallepedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup;
					} else {
						detallepedidocompraimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame;
					}

					List<Arancel> arancels=new ArrayList<Arancel>();
					arancels.add(this.arancel);
					if(!esRelacionado) {
						//detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setConGuardarRelaciones(false);
						//detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallepedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormArancel.cargarDetallePedidoCompraImporBeanSwingJInternalFrame(arancels,this.arancel,detallepedidocompraimporBeanSwingJInternalFrame,/*conInicializar,*/detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.getConGuardarRelaciones(),detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
					detallepedidocompraimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompraImpor("no_relacionado");

						detallepedidocompraimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetallePedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA + (DetallePedidoCompraImporConstantesFunciones.ITAMANIOFILATABLA/2));

						detallepedidocompraimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderArancel=(TitledBorder)this.jScrollPanelDatosArancel.getBorder();
						TitledBorder titledBorderDetallePedidoCompraImpor=(TitledBorder)detallepedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosDetallePedidoCompraImpor.getBorder();

						titledBorderDetallePedidoCompraImpor.setTitle(titledBorderArancel.getTitle() + " -> Detalle Pedido Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallepedidocompraimporBeanSwingJInternalFrame);
						}

						detallepedidocompraimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallepedidocompraimporBeanSwingJInternalFrame);

						detallepedidocompraimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.arancelSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Pedido Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualArancel(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel));			
			this.jButtonDuplicarArancel.setVisible((this.isVisibilidadCeldaDuplicarArancel && this.isPermisoDuplicarArancel));			
			this.jButtonCopiarArancel.setVisible((this.isVisibilidadCeldaCopiarArancel && this.isPermisoCopiarArancel));
			this.jButtonVerFormArancel.setVisible((this.isVisibilidadCeldaVerFormArancel && this.isPermisoVerFormArancel));
			
			this.jButtonAbrirOrderByArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));			
			
			this.jButtonNuevoRelacionesArancel.setVisible((this.isVisibilidadCeldaNuevoRelacionesArancel && this.isPermisoNuevoArancel));			
			this.jButtonNuevoGuardarCambiosArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel && this.isPermisoGuardarCambiosArancel));
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.jInternalFrameDetalleFormArancel.jButtonModificarArancel.setVisible((this.isVisibilidadCeldaModificarArancel && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.setVisible((this.isVisibilidadCeldaActualizarArancel && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.setVisible((this.isVisibilidadCeldaEliminarArancel && this.isPermisoEliminarArancel));
			this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.setVisible(this.isVisibilidadCeldaCancelarArancel);							
			this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.setVisible((this.isVisibilidadCeldaGuardarArancel && this.isPermisoGuardarCambiosArancel));			
			
			}
						
			this.jButtonGuardarCambiosTablaArancel.setVisible((this.isVisibilidadCeldaGuardarCambiosArancel && this.isPermisoGuardarCambiosArancel));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel));						
			this.jButtonDuplicarToolBarArancel.setVisible((this.isVisibilidadCeldaDuplicarArancel && this.isPermisoDuplicarArancel));						
			this.jButtonCopiarToolBarArancel.setVisible((this.isVisibilidadCeldaCopiarArancel && this.isPermisoCopiarArancel));			
			this.jButtonVerFormToolBarArancel.setVisible((this.isVisibilidadCeldaVerFormArancel && this.isPermisoVerFormArancel));			
			this.jButtonAbrirOrderByToolBarArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));
			this.jButtonNuevoRelacionesToolBarArancel.setVisible((this.isVisibilidadCeldaNuevoRelacionesArancel && this.isPermisoNuevoArancel));			
			this.jButtonNuevoGuardarCambiosToolBarArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel && this.isPermisoGuardarCambiosArancel));			
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.jInternalFrameDetalleFormArancel.jButtonModificarToolBarArancel.setVisible((this.isVisibilidadCeldaModificarArancel && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jButtonActualizarToolBarArancel.setVisible((this.isVisibilidadCeldaActualizarArancel  && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jButtonEliminarToolBarArancel.setVisible((this.isVisibilidadCeldaEliminarArancel && this.isPermisoEliminarArancel));
			this.jInternalFrameDetalleFormArancel.jButtonCancelarToolBarArancel.setVisible(this.isVisibilidadCeldaCancelarArancel);				
			this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosToolBarArancel.setVisible((this.isVisibilidadCeldaGuardarArancel && this.isPermisoGuardarCambiosArancel));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarArancel.setVisible((this.isVisibilidadCeldaGuardarCambiosArancel && this.isPermisoGuardarCambiosArancel));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel));			
			this.jMenuItemDuplicarArancel.setVisible((this.isVisibilidadCeldaDuplicarArancel && this.isPermisoDuplicarArancel));			
			this.jMenuItemCopiarArancel.setVisible((this.isVisibilidadCeldaCopiarArancel && this.isPermisoCopiarArancel));			
			this.jMenuItemVerFormArancel.setVisible((this.isVisibilidadCeldaVerFormArancel && this.isPermisoVerFormArancel));			
			this.jMenuItemAbrirOrderByArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));			
			//this.jMenuItemMostrarOcultarArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));
			this.jMenuItemDetalleAbrirOrderByArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));			
			//this.jMenuItemDetalleMostrarOcultarArancel.setVisible((this.isVisibilidadCeldaOrdenArancel && this.isPermisoOrdenArancel));			
			this.jMenuItemNuevoRelacionesArancel.setVisible((this.isVisibilidadCeldaNuevoRelacionesArancel && this.isPermisoNuevoArancel));			
			this.jMenuItemNuevoGuardarCambiosArancel.setVisible((this.isVisibilidadCeldaNuevoArancel && this.isPermisoNuevoArancel && this.isPermisoGuardarCambiosArancel));									
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.jInternalFrameDetalleFormArancel.jMenuItemModificarArancel.setVisible((this.isVisibilidadCeldaModificarArancel && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jMenuItemActualizarArancel.setVisible((this.isVisibilidadCeldaActualizarArancel && this.isPermisoActualizarArancel));	
			this.jInternalFrameDetalleFormArancel.jMenuItemEliminarArancel.setVisible((this.isVisibilidadCeldaEliminarArancel && this.isPermisoEliminarArancel));
			this.jInternalFrameDetalleFormArancel.jMenuItemCancelarArancel.setVisible(this.isVisibilidadCeldaCancelarArancel);				
			}
			
			this.jMenuItemGuardarCambiosArancel.setVisible((this.isVisibilidadCeldaGuardarArancel && this.isPermisoGuardarCambiosArancel));						
			this.jMenuItemGuardarCambiosTablaArancel.setVisible((this.isVisibilidadCeldaGuardarCambiosArancel && this.isPermisoGuardarCambiosArancel));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoArancel=this.jButtonNuevoArancel.isVisible();
			this.isVisibilidadCeldaDuplicarArancel=this.jButtonDuplicarArancel.isVisible();
			this.isVisibilidadCeldaCopiarArancel=this.jButtonCopiarArancel.isVisible();
			this.isVisibilidadCeldaVerFormArancel=this.jButtonVerFormArancel.isVisible();
			
			this.isVisibilidadCeldaOrdenArancel=this.jButtonAbrirOrderByArancel.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesArancel=this.jButtonNuevoRelacionesArancel.isVisible();
			this.isVisibilidadCeldaModificarArancel=this.jButtonModificarArancel.isVisible();
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.isVisibilidadCeldaActualizarArancel=this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.isVisible();
			this.isVisibilidadCeldaEliminarArancel=this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.isVisible();
			this.isVisibilidadCeldaCancelarArancel=this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.isVisible();
			this.isVisibilidadCeldaGuardarArancel=this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosArancel=this.jButtonGuardarCambiosTablaArancel.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoArancel=this.jButtonNuevoToolBarArancel.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesArancel=this.jButtonNuevoRelacionesToolBarArancel.isVisible();
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.isVisibilidadCeldaModificarArancel=this.jInternalFrameDetalleFormArancel.jButtonModificarToolBarArancel.isVisible();
			this.isVisibilidadCeldaActualizarArancel=this.jInternalFrameDetalleFormArancel.jButtonActualizarToolBarArancel.isVisible();
			this.isVisibilidadCeldaEliminarArancel=this.jInternalFrameDetalleFormArancel.jButtonEliminarToolBarArancel.isVisible();
			this.isVisibilidadCeldaCancelarArancel=this.jInternalFrameDetalleFormArancel.jButtonCancelarToolBarArancel.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarArancel=this.jButtonGuardarCambiosToolBarArancel.isVisible();
			this.isVisibilidadCeldaGuardarCambiosArancel=this.jButtonGuardarCambiosTablaToolBarArancel.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoArancel=this.jMenuItemNuevoArancel.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesArancel=this.jMenuItemNuevoRelacionesArancel.isVisible();
			
			if(this.jInternalFrameDetalleFormArancel!=null) {
			this.isVisibilidadCeldaModificarArancel=this.jInternalFrameDetalleFormArancel.jMenuItemModificarArancel.isVisible();
			this.isVisibilidadCeldaActualizarArancel=this.jInternalFrameDetalleFormArancel.jMenuItemActualizarArancel.isVisible();
			this.isVisibilidadCeldaEliminarArancel=this.jInternalFrameDetalleFormArancel.jMenuItemEliminarArancel.isVisible();
			this.isVisibilidadCeldaCancelarArancel=this.jInternalFrameDetalleFormArancel.jMenuItemCancelarArancel.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarArancel=this.jMenuItemGuardarCambiosArancel.isVisible();
			this.isVisibilidadCeldaGuardarCambiosArancel=this.jMenuItemGuardarCambiosTablaArancel.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesArancel(Boolean esInicializar) {
		if(ArancelJInternalFrame.ISBINDING_MANUAL) {			
			if(this.arancelSessionBean.getConGuardarRelaciones()) {
				//if(this.arancelSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesArancel();
			}
			
			this.inicializarActualizarBindingBotonesManualArancel(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualArancel() {
		this.jButtonNuevoArancel.setVisible(this.isPermisoNuevoArancel);			
		this.jButtonDuplicarArancel.setVisible(this.isPermisoDuplicarArancel);			
		this.jButtonCopiarArancel.setVisible(this.isPermisoCopiarArancel);			
		this.jButtonVerFormArancel.setVisible(this.isPermisoVerFormArancel);			
		
		this.jButtonAbrirOrderByArancel.setVisible(this.isPermisoOrdenArancel);					
		
		this.jButtonNuevoRelacionesArancel.setVisible(this.isPermisoNuevoArancel);			
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonModificarArancel.setVisible(this.isPermisoActualizarArancel);	
			this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.setVisible(this.isPermisoActualizarArancel);	
			this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.setVisible(this.isPermisoEliminarArancel);
			this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.setVisible(this.isVisibilidadCeldaCancelarArancel);						
			this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.setVisible(this.isPermisoGuardarCambiosArancel);							
		}
		
		this.jButtonGuardarCambiosTablaArancel.setVisible(this.isPermisoActualizarArancel);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleArancel() {
		this.jInternalFrameDetalleFormArancel.jButtonModificarArancel.setVisible(this.isPermisoActualizarArancel);	
		this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.setVisible(this.isPermisoActualizarArancel);	
		this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.setVisible(this.isPermisoEliminarArancel);
		this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.setVisible(this.isVisibilidadCeldaCancelarArancel);							
		this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.setVisible((this.isVisibilidadCeldaGuardarArancel && this.isPermisoGuardarCambiosArancel));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosArancel() {
		if(ArancelJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualArancel();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesArancel() {
	}
	
	public void jTableDatosArancelListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarArancel(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.arancel.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaArancelUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebArancel(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosArancel.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosArancel.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.arancelLogic.getConnexion());

				if(this.arancel.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.arancel.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderArancel=(TitledBorder)this.jScrollPanelDatosArancel.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderArancel.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.arancel.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.arancel.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.arancel.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.arancel.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionArancelBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArancel.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArancel(this.getarancel(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.arancel==null) {
						this.arancel = new Arancel();
					}

					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);
				}

				if(this.arancel.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.arancel.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArancel(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoArancelActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArancel(false,false);

			this.getArancelsBusquedaPorCodigo();

			this.inicializarActualizarBindingArancel(false);

			//if(ArancelBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArancel(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreArancelActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArancel(false,false);

			this.getArancelsBusquedaPorNombre();

			this.inicializarActualizarBindingArancel(false);

			//if(ArancelBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArancel(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaArancelActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArancel(false,false);

			this.getArancelsFK_IdEmpresa();

			this.inicializarActualizarBindingArancel(false);

			//if(ArancelBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArancel(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.arancelLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameArancel() {
		if(this.jInternalFrameDetalleFormArancel!=null) {
		

		if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
			this.jInternalFrameDetalleFormArancel.setVisible(false);	    			
			this.jInternalFrameDetalleFormArancel.dispose();
			this.jInternalFrameDetalleFormArancel=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoArancel!=null) {
			this.jInternalFrameReporteDinamicoArancel.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoArancel.dispose();
			this.jInternalFrameReporteDinamicoArancel=null;
		}
		
		if(this.jInternalFrameImportacionArancel!=null) {
			this.jInternalFrameImportacionArancel.setVisible(false);	    			
			this.jInternalFrameImportacionArancel.dispose();
			this.jInternalFrameImportacionArancel=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessArancel();
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			
			if(sTipo.equals("NuevoArancel")) {
				jButtonNuevoArancelActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarArancel")) {
				jButtonDuplicarArancelActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarArancel")) {
				jButtonCopiarArancelActionPerformed(evt);
			} else if(sTipo.equals("VerFormArancel")) {
				jButtonVerFormArancelActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarArancel")) {
				jButtonNuevoArancelActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarArancel")) {
				jButtonDuplicarArancelActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoArancel")) {
				jButtonNuevoArancelActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarArancel")) {
				jButtonDuplicarArancelActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesArancel")) {
				jButtonNuevoArancelActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarArancel")) {
				jButtonNuevoArancelActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesArancel")) {
				jButtonNuevoArancelActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarArancel")) {
				jButtonModificarArancelActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarArancel")) {
				jButtonModificarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarArancel")) {
				jButtonModificarArancelActionPerformed(evt);
			} else if(sTipo.equals("ActualizarArancel")) {
				jButtonActualizarArancelActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarArancel")) {
				jButtonActualizarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarArancel")) {
				jButtonActualizarArancelActionPerformed(evt);
			} else if(sTipo.equals("EliminarArancel")) {
				jButtonEliminarArancelActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarArancel")) {
				jButtonEliminarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarArancel")) {
				jButtonEliminarArancelActionPerformed(evt);
			} else if(sTipo.equals("CancelarArancel")) {
				jButtonCancelarArancelActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarArancel")) {
				jButtonCancelarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarArancel")) {
				jButtonCancelarArancelActionPerformed(evt);
			} else if(sTipo.equals("CerrarArancel")) {
				jButtonCerrarArancelActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarArancel")) {
				jButtonCerrarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarArancel")) {
				jButtonCerrarArancelActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarArancel")) {
				jButtonMostrarOcultarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarArancel")) {
				jButtonCancelarArancelActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarArancel")) {
				jButtonCopiarArancelActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarArancel")) {
				jButtonVerFormArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarArancel")) {
				jButtonCopiarArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormArancel")) {
				jButtonVerFormArancelActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionArancel")) {
				jButtonRecargarInformacionArancelActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarArancel")) {
				jButtonRecargarInformacionArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionArancel")) {
				jButtonRecargarInformacionArancelActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresArancel")) {
				jButtonAnterioresArancelActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarArancel")) {
				jButtonAnterioresArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreArancel")) {
				jButtonAnterioresArancelActionPerformed(evt);
			} else if(sTipo.equals("SiguientesArancel")) {
				jButtonSiguientesArancelActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarArancel")) {
				jButtonSiguientesArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesArancel")) {
				jButtonSiguientesArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByArancel") || sTipo.equals("MenuItemDetalleAbrirOrderByArancel")) {
				jButtonAbrirOrderByArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarArancel") || sTipo.equals("MenuItemDetalleMostrarOcultarArancel")) {
				jButtonMostrarOcultarArancelActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosArancel")) {
				jButtonNuevoGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarArancel")) {
				jButtonNuevoGuardarCambiosArancelActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosArancel")) {
				jButtonNuevoGuardarCambiosArancelActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoArancel")) {
				jButtonCerrarReporteDinamicoArancelActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoArancel")) {
				jButtonGenerarReporteDinamicoArancelActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoArancel")) {
				
				jButtonGenerarExcelReporteDinamicoArancelActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionArancel")) {
				jButtonCerrarImportacionArancelActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionArancel")) {
				
				jButtonGenerarImportacionArancelActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionArancel")) {
				
				jButtonAbrirImportacionArancelActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesArancel")) {
				jComboBoxTiposAccionesArancelActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesArancel")) {
				jComboBoxTiposRelacionesArancelActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioArancel")) {
				jComboBoxTiposAccionesArancelActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarArancel")) {
				
				jComboBoxTiposSeleccionarArancelActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralArancel")) {
				jTextFieldValorCampoGeneralArancelActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByArancel")) {
				jButtonAbrirOrderByArancelActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarArancel")) {
				jButtonAbrirOrderByArancelActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByArancel")) {
				jButtonCerrarOrderByArancelActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idArancelBusqueda")) {
				this.jButtonidArancelBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaArancelUpdate")) {
				this.jButtonid_empresaArancelUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaArancelBusqueda")) {
				this.jButtonid_empresaArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoArancelBusqueda")) {
				this.jButtoncodigoArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreArancelBusqueda")) {
				this.jButtonnombreArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeArancelBusqueda")) {
				this.jButtonporcentajeArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionArancelBusqueda")) {
				this.jButtonobservacionArancelBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoArancel")) {
				this.jButtonBusquedaPorCodigoArancelActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreArancel")) {
				this.jButtonBusquedaPorNombreArancelActionPerformed(evt);
			}
			
			;
			
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessArancel();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Arancel arancelLocal=null;
			
			if(!this.getEsControlTabla()) {
				arancelLocal=this.arancel;
			} else {
				arancelLocal=this.arancelAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
							
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
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
			
			


			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
								
						
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
								
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
			
			this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
							
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
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
			
			


			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
			
			this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
								
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
			
			this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosArancel")) {
					jCheckBoxSeleccionarTodosArancelItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosArancel")) {
					jCheckBoxSeleccionadosArancelItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarArancel")) {
					
				}
				
				


				
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
												
				
				


				
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
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
			
			


			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaArancelActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.arancel);
				
				this.actualizarInformacion("INFO_PADRE",false,this.arancel);
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
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
				
				


				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Arancel.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Arancel.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaArancelActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.arancelAnterior =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.arancelAnterior =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarArancel")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosArancelListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosArancel.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.arancel =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.arancel =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.arancel);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarArancel")) {
				
				}
				
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarArancel")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosArancel.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarArancel")) {
			
			}
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessArancel();
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			if(sTipo.equals("NuevoArancel")) {
				jButtonNuevoArancelActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarArancel")) {
				jButtonDuplicarArancelActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarArancel")) {
				jButtonCopiarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormArancel")) {
				jButtonVerFormArancelActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesArancel")) {
				jButtonNuevoArancelActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarArancel")) {
				jButtonModificarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarArancel")) {
				jButtonActualizarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarArancel")) {
				jButtonEliminarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarArancel")) {
				jButtonCancelarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarArancel")) {
				jButtonCerrarArancelActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosArancel")) {
				jButtonGuardarCambiosArancelActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosArancel")) {
				jButtonNuevoGuardarCambiosArancelActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByArancel")) {
				jButtonAbrirOrderByArancelActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionArancel")) {
				jButtonRecargarInformacionArancelActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresArancel")) {
				jButtonAnterioresArancelActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesArancel")) {
				jButtonSiguientesArancelActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idArancelBusqueda")) {
				this.jButtonidArancelBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaArancelUpdate")) {
				this.jButtonid_empresaArancelUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaArancelBusqueda")) {
				this.jButtonid_empresaArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoArancelBusqueda")) {
				this.jButtoncodigoArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreArancelBusqueda")) {
				this.jButtonnombreArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeArancelBusqueda")) {
				this.jButtonporcentajeArancelBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionArancelBusqueda")) {
				this.jButtonobservacionArancelBusquedaActionPerformed(evt);
			}
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessArancel();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameArancel")) {
				closingInternalFrameArancel();
				
			} else if(sTipo.equals("jButtonCancelarArancel")) {
				JInternalFrameBase jInternalFrameDetalleFormArancel = (JInternalFrameBase)evt.getSource();
	            	
	            ArancelBeanSwingJInternalFrame jInternalFrameParent=(ArancelBeanSwingJInternalFrame)jInternalFrameDetalleFormArancel.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarArancelActionPerformed(null);
			}
			
			ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.arancel,new Object(),this.arancelParameterGeneral,this.arancelReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormArancel(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormArancel(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormArancel(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.arancel)) {
			if(!esControlTabla) {
				if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);			
				}
				
				if(this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualArancel(this.arancel,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.arancelReturnGeneral=arancelLogic.procesarEventosArancelsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.arancelLogic.getArancels(),this.arancel,this.arancelParameterGeneral,this.isEsNuevoArancel,classes);//this.arancelLogic.getArancel()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanArancel(this.arancelReturnGeneral,this.arancelBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanArancel(classes,this.arancelReturnGeneral,this.arancelBean,false);
					}
						
					if(this.arancelReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyArancel(this.arancelReturnGeneral.getArancel());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioArancel(this.arancelReturnGeneral.getArancel());	
					}
						
					if(this.arancelReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioArancel(this.arancelReturnGeneral.getArancel(),classes);//this.arancelBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioArancel(this.arancel,classes);//this.arancelBean);									
				}
			
				if(ArancelJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualArancel(this.arancel,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysArancel(this.arancel);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.arancelAnterior!=null) {
						this.arancel=this.arancelAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.arancelReturnGeneral=arancelLogic.procesarEventosArancelsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.arancelLogic.getArancels(),this.arancel,this.arancelParameterGeneral,this.isEsNuevoArancel,classes);//this.arancelLogic.getArancel()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.arancelSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.arancelSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.arancelReturnGeneral.getArancel(),arancelLogic.getArancels());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.arancelReturnGeneral.getArancel(),this.arancels);
				}
				//ARCHITECTURE
				
				//this.jTableDatosArancel.repaint();
				
				//((AbstractTableModel) this.jTableDatosArancel.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosArancel();
			}
		}
	}
	
	public void actualizarVisualTableDatosArancel() throws Exception {
		
		ArancelModel arancelModel=(ArancelModel)this.jTableDatosArancel.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			arancelModel.arancels=this.arancelLogic.getArancels();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			arancelModel.arancels=this.arancels;
		}
		
		
		((ArancelModel) this.jTableDatosArancel.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaArancel() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getarancelAnterior(),this.arancelLogic.getArancels());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getarancelAnterior(),this.arancels);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosArancel();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioArancel(Arancel arancel,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.setProductos(arancel.getProductos());
					this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.setDetallePedidoCompraImpors(arancel.getDetallePedidoCompraImpors());
					this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoCompraImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
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
										
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.arancel,new Object(),generalEntityParameterGeneral,this.arancelReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.arancelSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ArancelConstantesFunciones.getClassesRelationshipsOfArancel(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ArancelConstantesFunciones.getClassesRelationshipsFromStringsOfArancel(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormArancel(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ArancelBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.arancel,new Object(),generalEntityParameterGeneral,this.arancelReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioArancel(ArancelBean arancelBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.setProductos(arancel.getProductos());
					this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoCompraImpor.class)) {
					this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.setDetallePedidoCompraImpors(arancel.getDetallePedidoCompraImpors());
					this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoCompraImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanArancel(ArrayList<Classe> classes,ArancelReturnGeneral arancelReturnGeneral,ArancelBean arancelBean,Boolean conDefault) throws Exception {
		
			this.arancelBean.setProductos(arancelReturnGeneral.getArancel().getProductos());
			this.arancelBean.setDetallePedidoCompraImpors(arancelReturnGeneral.getArancel().getDetallePedidoCompraImpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualArancel(Arancel arancel,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					arancel.setProductos(this.jInternalFrameDetalleFormArancel.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePedidoCompraImpor.class)) {
					arancel.setDetallePedidoCompraImpors(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporLogic.getDetallePedidoCompraImpors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.arancel)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormArancel = new ArancelDetalleFormJInternalFrame(jDesktopPane,this.arancelSessionBean.getConGuardarRelaciones(),this.arancelSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormArancel);
		this.jInternalFrameDetalleFormArancel.setVisible(false);
		this.jInternalFrameDetalleFormArancel.setSelected(false);						
		
		this.jInternalFrameDetalleFormArancel.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormArancel.arancelLogic=this.arancelLogic;
		
		this.cargarCombosFrameForeignKeyArancel("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleArancel();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleArancel();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyArancel("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyArancel();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormArancel.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarArancel"));
		
		this.jInternalFrameDetalleFormArancel.jButtonModificarArancel.addActionListener(new ButtonActionListener(this,"ModificarArancel"));

		
		this.jInternalFrameDetalleFormArancel.jButtonModificarToolBarArancel.addActionListener(new ButtonActionListener(this,"ModificarToolBarArancel"));
					
		this.jInternalFrameDetalleFormArancel.jMenuItemModificarArancel.addActionListener(new ButtonActionListener(this,"MenuItemModificarArancel"));		
		
		
		
		this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.addActionListener (new ButtonActionListener(this,"ActualizarArancel"));
		
		
		this.jInternalFrameDetalleFormArancel.jButtonActualizarToolBarArancel.addActionListener(new ButtonActionListener(this,"ActualizarToolBarArancel"));
						
		this.jInternalFrameDetalleFormArancel.jMenuItemActualizarArancel.addActionListener (new ButtonActionListener(this,"MenuItemActualizarArancel"));		
		
		
		
		this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.addActionListener (new ButtonActionListener(this,"EliminarArancel"));
		
		
		this.jInternalFrameDetalleFormArancel.jButtonEliminarToolBarArancel.addActionListener (new ButtonActionListener(this,"EliminarToolBarArancel"));
								
		this.jInternalFrameDetalleFormArancel.jMenuItemEliminarArancel.addActionListener (new ButtonActionListener(this,"MenuItemEliminarArancel"));		
		
		
		
		this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.addActionListener (new ButtonActionListener(this,"CancelarArancel"));
		
		
		this.jInternalFrameDetalleFormArancel.jButtonCancelarToolBarArancel.addActionListener (new ButtonActionListener(this,"CancelarToolBarArancel"));
					
		this.jInternalFrameDetalleFormArancel.jMenuItemCancelarArancel.addActionListener (new ButtonActionListener(this,"MenuItemCancelarArancel"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormArancel.jMenuItemDetalleCerrarArancel.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarArancel"));		
		
		
		
		this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosToolBarArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArancel"));
		
		
		
		this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosToolBarArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArancel"));
		
		
		
		this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioArancel"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonidArancelBusqueda.addActionListener(new ButtonActionListener(this,"idArancelBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelUpdate.addActionListener(new ButtonActionListener(this,"id_empresaArancelUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtoncodigoArancelBusqueda.addActionListener(new ButtonActionListener(this,"codigoArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonnombreArancelBusqueda.addActionListener(new ButtonActionListener(this,"nombreArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonporcentajeArancelBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonobservacionArancelBusqueda.addActionListener(new ButtonActionListener(this,"observacionArancelBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesArancel"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameArancel"));
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarArancel"));
		}
		
		this.jTableDatosArancel.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarArancel"));
		
		this.jTableDatosArancel.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarArancel"));
		
		this.jButtonNuevoArancel.addActionListener(new ButtonActionListener(this,"NuevoArancel"));
		
		this.jButtonDuplicarArancel.addActionListener(new ButtonActionListener(this,"DuplicarArancel"));
		
		this.jButtonCopiarArancel.addActionListener(new ButtonActionListener(this,"CopiarArancel"));
		
		this.jButtonVerFormArancel.addActionListener(new ButtonActionListener(this,"VerFormArancel"));
		
		
		this.jButtonNuevoToolBarArancel.addActionListener(new ButtonActionListener(this,"NuevoToolBarArancel"));
			
		this.jButtonDuplicarToolBarArancel.addActionListener(new ButtonActionListener(this,"DuplicarToolBarArancel"));
			
		this.jMenuItemNuevoArancel.addActionListener (new ButtonActionListener(this,"MenuItemNuevoArancel"));
			
		this.jMenuItemDuplicarArancel.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarArancel"));		
		
		
		this.jButtonNuevoRelacionesArancel.addActionListener (new ButtonActionListener(this,"NuevoRelacionesArancel"));
		
		
		this.jButtonNuevoRelacionesToolBarArancel.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarArancel"));
			
		this.jMenuItemNuevoRelacionesArancel.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesArancel"));		
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonModificarArancel.addActionListener(new ButtonActionListener(this,"ModificarArancel"));
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonModificarToolBarArancel.addActionListener(new ButtonActionListener(this,"ModificarToolBarArancel"));
			
			this.jInternalFrameDetalleFormArancel.jMenuItemModificarArancel.addActionListener(new ButtonActionListener(this,"MenuItemModificarArancel"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormArancel.jButtonActualizarArancel.addActionListener (new ButtonActionListener(this,"ActualizarArancel"));
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonActualizarToolBarArancel.addActionListener(new ButtonActionListener(this,"ActualizarToolBarArancel"));
				
			this.jInternalFrameDetalleFormArancel.jMenuItemActualizarArancel.addActionListener (new ButtonActionListener(this,"MenuItemActualizarArancel"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonEliminarArancel.addActionListener (new ButtonActionListener(this,"EliminarArancel"));
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonEliminarToolBarArancel.addActionListener (new ButtonActionListener(this,"EliminarToolBarArancel"));
						
			this.jInternalFrameDetalleFormArancel.jMenuItemEliminarArancel.addActionListener (new ButtonActionListener(this,"MenuItemEliminarArancel"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonCancelarArancel.addActionListener (new ButtonActionListener(this,"CancelarArancel"));
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonCancelarToolBarArancel.addActionListener (new ButtonActionListener(this,"CancelarToolBarArancel"));
			
			this.jInternalFrameDetalleFormArancel.jMenuItemCancelarArancel.addActionListener (new ButtonActionListener(this,"MenuItemCancelarArancel"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarArancel.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarArancel"));		
		
		
		this.jButtonCerrarArancel.addActionListener (new ButtonActionListener(this,"CerrarArancel"));
		
		
		this.jButtonCerrarToolBarArancel.addActionListener (new ButtonActionListener(this,"CerrarToolBarArancel"));
			
		this.jMenuItemCerrarArancel.addActionListener (new ButtonActionListener(this,"MenuItemCerrarArancel"));
			
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jMenuItemDetalleCerrarArancel.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarArancel"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosArancel"));
		}
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosToolBarArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArancel"));
		}
		
		this.jButtonCopiarToolBarArancel.addActionListener (new ButtonActionListener(this,"CopiarToolBarArancel"));
			
		this.jButtonVerFormToolBarArancel.addActionListener (new ButtonActionListener(this,"VerFormToolBarArancel"));
		
		this.jMenuItemGuardarCambiosArancel.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosArancel"));
			
		this.jMenuItemCopiarArancel.addActionListener (new ButtonActionListener(this,"MenuItemCopiarArancel"));		
		
		this.jMenuItemVerFormArancel.addActionListener (new ButtonActionListener(this,"MenuItemVerFormArancel"));		
		
		
		this.jButtonGuardarCambiosTablaArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaArancel"));
		
		
		this.jButtonGuardarCambiosTablaToolBarArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarArancel"));
			
		this.jMenuItemGuardarCambiosTablaArancel.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaArancel"));		
		
		
		
		this.jButtonRecargarInformacionArancel.addActionListener (new ButtonActionListener(this,"RecargarInformacionArancel"));
					
		this.jButtonRecargarInformacionToolBarArancel.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarArancel"));
		
		this.jMenuItemRecargarInformacionArancel.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionArancel"));		
		
		
		
		this.jButtonAnterioresArancel.addActionListener (new ButtonActionListener(this,"AnterioresArancel"));
		
		
		this.jButtonAnterioresToolBarArancel.addActionListener (new ButtonActionListener(this,"AnterioresToolBarArancel"));
		
		this.jMenuItemAnterioresArancel.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresArancel"));		
		
		
		this.jButtonSiguientesArancel.addActionListener (new ButtonActionListener(this,"SiguientesArancel"));
		
		
		this.jButtonSiguientesToolBarArancel.addActionListener (new ButtonActionListener(this,"SiguientesToolBarArancel"));
			
		this.jMenuItemSiguientesArancel.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesArancel"));
			
		this.jMenuItemAbrirOrderByArancel.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByArancel"));
			
		this.jMenuItemMostrarOcultarArancel.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarArancel"));
			
		this.jMenuItemDetalleAbrirOrderByArancel.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByArancel"));
			
		this.jMenuItemDetalleMostarOcultarArancel.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarArancel"));		
		
		
		this.jButtonNuevoGuardarCambiosArancel.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosArancel"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarArancel.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarArancel"));
			
		this.jMenuItemNuevoGuardarCambiosArancel.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosArancel"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosArancel.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosArancel"));

		this.jCheckBoxSeleccionadosArancel.addItemListener(new CheckBoxItemListener(this,"SeleccionadosArancel"));
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioArancel"));
		}
		
		
		this.jComboBoxTiposRelacionesArancel.addActionListener (new ButtonActionListener(this,"TiposRelacionesArancel"));
			
		this.jComboBoxTiposAccionesArancel.addActionListener (new ButtonActionListener(this,"TiposAccionesArancel"));
					
		this.jComboBoxTiposSeleccionarArancel.addActionListener (new ButtonActionListener(this,"TiposSeleccionarArancel"));
			
		this.jTextFieldValorCampoGeneralArancel.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralArancel"));		
		
		
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonidArancelBusqueda.addActionListener(new ButtonActionListener(this,"idArancelBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelUpdate.addActionListener(new ButtonActionListener(this,"id_empresaArancelUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtoncodigoArancelBusqueda.addActionListener(new ButtonActionListener(this,"codigoArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonnombreArancelBusqueda.addActionListener(new ButtonActionListener(this,"nombreArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonporcentajeArancelBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonobservacionArancelBusqueda.addActionListener(new ButtonActionListener(this,"observacionArancelBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoArancel.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoArancel"));

			this.jButtonBusquedaPorNombreArancel.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreArancel"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoArancel!=null) {
				this.jInternalFrameReporteDinamicoArancel.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArancel"));
				this.jInternalFrameReporteDinamicoArancel.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArancel"));
				this.jInternalFrameReporteDinamicoArancel.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArancel"));
			}
			
			//this.jButtonCerrarReporteDinamicoArancel.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArancel"));				
			//this.jButtonGenerarReporteDinamicoArancel.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArancel"));
			//this.jButtonGenerarExcelReporteDinamicoArancel.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArancel"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionArancel!=null) {
				this.jInternalFrameImportacionArancel.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionArancel"));
				this.jInternalFrameImportacionArancel.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionArancel"));
				this.jInternalFrameImportacionArancel.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionArancel"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByArancel.addActionListener (new ButtonActionListener(this,"AbrirOrderByArancel"));
			
			this.jButtonAbrirOrderByToolBarArancel.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarArancel"));			
			
			if(this.jInternalFrameOrderByArancel!=null) {
				this.jInternalFrameOrderByArancel.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByArancel"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormArancel!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArancel.jTabbedPaneRelacionesArancel.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesArancel"));
		
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
            		closingInternalFrameArancel();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormArancel.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormArancel = (JInternalFrameBase)event.getSource();
	            	
	            ArancelBeanSwingJInternalFrame jInternalFrameParent=(ArancelBeanSwingJInternalFrame)jInternalFrameDetalleFormArancel.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarArancelActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosArancel.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosArancelListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosArancel.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosArancel.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoArancel";
		inputMap = this.jButtonNuevoArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoArancelActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoArancelActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesArancel";
		inputMap = this.jButtonNuevoRelacionesArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoArancelActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarArancel";
		inputMap = this.jButtonModificarArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarArancel";
		inputMap = this.jButtonActualizarArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarArancel";
		inputMap = this.jButtonEliminarArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarArancel";
		inputMap = this.jButtonCancelarArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarArancel";
		inputMap = this.jButtonCerrarArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosArancel";
		inputMap = this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormArancel.jButtonGuardarCambiosArancel.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosArancelActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosArancel.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosArancelItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesArancel.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesArancelActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarArancel.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarArancelActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralArancel.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralArancelActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonidArancelBusqueda.addActionListener(new ButtonActionListener(this,"idArancelBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelUpdate.addActionListener(new ButtonActionListener(this,"id_empresaArancelUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonid_empresaArancelBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtoncodigoArancelBusqueda.addActionListener(new ButtonActionListener(this,"codigoArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonnombreArancelBusqueda.addActionListener(new ButtonActionListener(this,"nombreArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonporcentajeArancelBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeArancelBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArancel.jButtonobservacionArancelBusqueda.addActionListener(new ButtonActionListener(this,"observacionArancelBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoArancel.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoArancel"));

		this.jButtonBusquedaPorNombreArancel.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreArancel"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionArancel.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionArancelActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarArancelActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarArancel.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosArancel(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Arancel arancelAux:this.arancelLogic.getArancels()) {
					arancelAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Arancel arancelAux:arancels) {
					arancelAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosArancelItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingArancel(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Arancel arancelAux:this.arancelLogic.getArancels()) {
						arancelAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Arancel arancelAux:arancels) {
						arancelAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Arancel arancelAux:this.arancelLogic.getArancels()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Arancel arancelAux:arancels) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaArancel(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosArancel.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosArancel.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosArancel,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosArancelItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingArancel(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosArancel.getSelectedRows();
			
			Arancel arancelLocal=new Arancel();
			
			//this.seleccionarTodosArancel(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					arancelLocal =(Arancel) this.arancelLogic.getArancels().toArray()[this.jTableDatosArancel.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					arancelLocal =(Arancel) this.arancels.toArray()[this.jTableDatosArancel.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				arancelLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Arancel arancelAux:this.arancelLogic.getArancels()) {
						arancelAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Arancel arancelAux:arancels) {
						arancelAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaArancel(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosArancel.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosArancel.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosArancel,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualArancelItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarArancelParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralArancelActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingArancel(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralArancel.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Arancel arancelAux:this.arancelLogic.getArancels()) {
				
						if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							arancelAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							arancelAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							arancelAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							arancelAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Arancel arancelAux:arancels) {
					
						if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							arancelAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							arancelAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							arancelAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							arancelAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaArancel(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesArancelActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingArancel(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioArancel=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesArancel.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteArancel) {				
					conSplash=true;//false;										
					
					//this.startProcessArancel(conSplash);
				
					this.generarReporteArancelsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoArancelsSeleccionados();
				//this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoArancelsSeleccionados(false);
				//this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoArancelsSeleccionados(true);
				//this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessArancel();
				
				this.exportarArancelsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionArancels();
				//this.importarArancels();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessArancel();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelArancelsSeleccionados();
				//this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Arancel", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessArancel();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoArancel)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyArancel(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
				}	
			} 			
			else if(ArancelBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteArancel) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessArancel(conSplash);
					
						//this.actualizarParametrosGeneralArancel();
						
						this.generarReporteProcesoAccionArancelsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ArancelBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ArancelES SELECCIONADOS?", "MANTENIMIENTO DE Arancel", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessArancel();
				
						this.actualizarParametrosGeneralArancel();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.arancelReturnGeneral=arancelLogic.procesarAccionArancelsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.arancelLogic.getArancels(),this.arancelParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarArancelReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralArancel();
					
					ArancelBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarArancelReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesArancel.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormArancel.jComboBoxTiposAccionesFormularioArancel.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessArancel(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesArancelActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessArancel();
			
			if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
			Arancel arancel=new Arancel();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingArancel(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesArancel.getSelectedItem();
			
			
			
			
			arancelsSeleccionados=this.getArancelsSeleccionados(true);
			//this.sTipoAccion;
			
			if(arancelsSeleccionados.size()==1) {
				for(Arancel arancelAux:arancelsSeleccionados) {
					arancel=arancelAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,arancel);
				}
				else if(this.sTipoRelacion.equals("Detalle Pedido Compra")) {
					jButtonDetallePedidoCompraImporActionPerformed(null,rowIndex,true,false,arancel);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessArancel();
			
      		//this.finishProcessArancel(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarArancelReturnGeneral() throws Exception {
		if(this.arancelReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.arancelReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.arancelReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.arancelReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.arancelReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.arancelReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingArancel(false);
		}
		
		if(this.arancelReturnGeneral.getConRetornoLista() || this.arancelReturnGeneral.getConRetornoObjeto()) {
			if(this.arancelReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.arancelLogic.setArancels(this.arancelReturnGeneral.getArancels());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.arancelReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.arancelLogic.setArancel(this.arancelReturnGeneral.getArancel());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingArancel(false);
		}
	}
	
	public void actualizarParametrosGeneralArancel() throws Exception {
		
		
	}
	
	public ArrayList<Arancel> getArancelsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioArancel) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Arancel arancelAux:arancelLogic.getArancels()) {
					if(arancelAux.getIsSelected()) {
						arancelsSeleccionados.add(arancelAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Arancel arancelAux:this.arancels) {
					if(arancelAux.getIsSelected()) {
						arancelsSeleccionados.add(arancelAux);				
					}
				}
			}
			
			if(arancelsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						arancelsSeleccionados.addAll(this.arancelLogic.getArancels());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						arancelsSeleccionados.addAll(this.arancels);				
					}
				}
			}
		} else {
			arancelsSeleccionados.add(this.arancel);
		}
		
		return arancelsSeleccionados;
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
	
	public void generarReporteArancelsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalArancelsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoArancelsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoArancelsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoArancelsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesArancelsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Arancel",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteArancels("Todos",arancelsSeleccionados);
		
	}	
	
	public void generarReporteNormalArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteArancels("Todos",arancelsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionArancelsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteArancels("Todos",arancelsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		
		this.abrirInicializarFrameReporteDinamicoArancel();
		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoArancel();
		
		
		//this.generarReporteArancels("Todos",arancelsSeleccionados ,arancelImplementable,arancelImplementableHome);
	}
	
	public void mostrarImportacionArancels() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionArancel();
		
		this.abrirFrameImportacionArancel();		
		
			
		//this.generarReporteArancels("Todos",arancelsSeleccionados ,arancelImplementable,arancelImplementableHome);
	}
	
	public void importarArancels() throws Exception {		
	
	}
	
	public void exportarArancelsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelArancelsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoArancelsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlArancelsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Arancel",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarArancel(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Arancel arancelAux:arancelsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarArancel(arancelAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//arancelAux.setsDetalleGeneralEntityReporte(arancelAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarArancel(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ArancelConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarArancel(Arancel arancel,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=arancel.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=arancel.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Arancels");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelArancel(row);				
				iRow++;
			}				
			
			for(Arancel arancelAux:arancelsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelArancel(arancelAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlArancelsSeleccionados() throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();		
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"arancel.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("arancels");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("arancel");
			//elementRoot.appendChild(element);
		
			for(Arancel arancelAux:arancelsSeleccionados) {
				element = document.createElement("arancel");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlArancel(arancelAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.arancelSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Arancel",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelArancel(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ArancelConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelArancel(Arancel arancel,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(arancel.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlArancel(Arancel arancel,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ArancelConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(arancel.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ArancelConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(arancel.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ArancelConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(arancel.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(ArancelConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(arancel.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ArancelConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(arancel.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje = document.createElement(ArancelConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(arancel.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementobservacion = document.createElement(ArancelConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(arancel.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoArancelsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Arancel> arancelsSeleccionados=new ArrayList<Arancel>();
		
		arancelsSeleccionados=this.getArancelsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoArancel(arancelsSeleccionados);
		
		this.generarReporteArancels("Todos",arancelsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoArancel(ArrayList<Arancel> arancelsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Arancel arancelAux:arancelsSeleccionados) {
				arancelAux.setsDetalleGeneralEntityReporte(arancelAux.toString());
			
				if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					arancelAux.setsDescripcionGeneralEntityReporte1(arancelAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					arancelAux.setsDescripcionGeneralEntityReporte1(arancelAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					arancelAux.setsDescripcionGeneralEntityReporte1(arancelAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ArancelConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					arancelAux.setsDescripcionGeneralEntityReporte1(arancelAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ArancelConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesArancel(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoArancel=true;
				this.isVisibilidadCeldaNuevoRelacionesArancel=true;
				this.isVisibilidadCeldaGuardarCambiosArancel=true;
			}
			
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=true;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=true;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=true;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=true;
			this.isVisibilidadCeldaEliminarArancel=true;
			this.isVisibilidadCeldaCancelarArancel=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=true;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=true;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=false;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoArancel=true;
			this.isVisibilidadCeldaNuevoRelacionesArancel=true;
			this.isVisibilidadCeldaGuardarCambiosArancel=true;
			this.isVisibilidadCeldaModificarArancel=false;
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=true;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=false;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
			this.isVisibilidadCeldaModificarArancel=true;
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
			this.isVisibilidadCeldaCancelarArancel=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArancel=false;
				} else {
					this.isVisibilidadCeldaGuardarArancel=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ArancelJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoArancel=true;
			this.isVisibilidadCeldaNuevoRelacionesArancel=true;
			this.isVisibilidadCeldaGuardarCambiosArancel=true;
		} else {
			this.actualizarEstadoPanelsArancel(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarArancel=false;
			//this.isVisibilidadCeldaVerFormArancel=false;
			this.isVisibilidadCeldaDuplicarArancel=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!arancelSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
		} else {
			this.isVisibilidadCeldaNuevoArancel=false;
			this.isVisibilidadCeldaGuardarCambiosArancel=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(arancelSessionBean.getEsGuardarRelacionado()) {
			if(!arancelSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesArancel=false;												
			}
			
			this.jButtonCerrarArancel.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesArancel=false;
		}
		
		if(!this.permiteMantenimiento(this.arancel)) {
			this.isVisibilidadCeldaActualizarArancel=false;
			this.isVisibilidadCeldaEliminarArancel=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesArancel() {
		this.isVisibilidadCeldaNuevoArancel=false;
		this.isVisibilidadCeldaGuardarCambiosArancel=false;
	}
	
	public void actualizarEstadoPanelsArancel(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(true);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(false);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(false);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(false);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(true);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(true);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionArancel!=null) {
				this.jScrollPanelDatosEdicionArancel.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArancel!=null) {
				this.jScrollPanelDatosArancel.setVisible(true);
			}
			
			if(this.jPanelPaginacionArancel!=null) {
				this.jPanelPaginacionArancel.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.arancelSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasArancel!=null) {
					this.jTabbedPaneBusquedasArancel.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.arancelSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArancel!=null) {
				this.jTabbedPaneBusquedasArancel.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesArancel!=null) {
				this.jPanelParametrosReportesArancel.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasArancel.remove(jPanelBusquedaPorCodigoArancel);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasArancel.remove(jPanelBusquedaPorNombreArancel);}
		}
		
	}
	
	

	public String registrarSesionArancelParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.arancelSessionBean==null) {
				this.arancelSessionBean=new ArancelSessionBean();
			}

			if(this.jInternalFrameDetalleFormArancel.productoSessionBean==null) {
				this.jInternalFrameDetalleFormArancel.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormArancel.productoSessionBean.setsPathNavegacionActual(arancelSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormArancel.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormArancel.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormArancel.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormArancel.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ArancelConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormArancel.productoSessionBean.setisBusquedaDesdeForeignKeySesionArancel(true);
			this.jInternalFrameDetalleFormArancel.productoSessionBean.setlidArancelActual(this.idArancelActual);

			arancelSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyArancel(true);
			arancelSessionBean.setlIdArancelActualForeignKey(this.idArancelActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionArancelParaDetallePedidoCompraImpors() throws Exception {
		Boolean isPaginaPopupDetallePedidoCompraImpor=false;

		try {

			if(this.arancelSessionBean==null) {
				this.arancelSessionBean=new ArancelSessionBean();
			}

			if(this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean==null) {
				this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
			}

			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setsPathNavegacionActual(arancelSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetallePedidoCompraImpor=this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetallePedidoCompraImpor(true);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetallePedidoCompraImpor(ArancelConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionArancel(true);
			this.jInternalFrameDetalleFormArancel.detallepedidocompraimporSessionBean.setlidArancelActual(this.idArancelActual);

			arancelSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyArancel(true);
			arancelSessionBean.setlIdArancelActualForeignKey(this.idArancelActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ArancelSessionBean arancelSessionBean=new ArancelSessionBean();
		
		if(this.arancelSessionBean==null) {
			this.arancelSessionBean=new ArancelSessionBean();
		}
		
		this.arancelSessionBean.setsUltimaBusquedaArancel(this.getsAccionBusqueda());
		this.arancelSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.arancelSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			arancelSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			arancelSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			arancelSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ArancelSessionBean arancelSessionBean=new ArancelSessionBean();
		
		if(this.arancelSessionBean==null) {
			this.arancelSessionBean=new ArancelSessionBean();
		}
		
		if(this.arancelSessionBean.getsUltimaBusquedaArancel()!=null&&!this.arancelSessionBean.getsUltimaBusquedaArancel().equals("")) {
			this.setsAccionBusqueda(arancelSessionBean.getsUltimaBusquedaArancel());
			this.setiNumeroPaginacion(arancelSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(arancelSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(arancelSessionBean.getcodigo());
				arancelSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(arancelSessionBean.getnombre());
				arancelSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(arancelSessionBean.getid_empresa());
				arancelSessionBean.setid_empresa(-1L);
			}
		}
		
		this.arancelSessionBean.setsUltimaBusquedaArancel("");
		this.arancelSessionBean.setiNumeroPaginacion(ArancelConstantesFunciones.INUMEROPAGINACION);
		this.arancelSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaArancel(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioArancel() {
		this.updateBorderResaltarBusquedasFormularioArancel();
		this.updateVisibilidadBusquedasFormularioArancel();
		this.updateHabilitarBusquedasFormularioArancel();
	}
	
	public void updateBorderResaltarBusquedasFormularioArancel() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasArancel.getComponents().length>0) {
	

		if(this.arancelConstantesFunciones.resaltarBusquedaPorCodigoArancel!=null) {
			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorCodigoArancel);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
				jPanel.setBorder(this.arancelConstantesFunciones.resaltarBusquedaPorCodigoArancel);
			}
		}

		if(this.arancelConstantesFunciones.resaltarBusquedaPorNombreArancel!=null) {
			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorNombreArancel);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
				jPanel.setBorder(this.arancelConstantesFunciones.resaltarBusquedaPorNombreArancel);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioArancel() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasArancel.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorCodigoArancel);
			jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.arancelConstantesFunciones.mostrarBusquedaPorCodigoArancel);
			if(!this.arancelConstantesFunciones.mostrarBusquedaPorCodigoArancel && index>-1) {
				this.jTabbedPaneBusquedasArancel.remove(index);
			}

			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorNombreArancel);
			jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.arancelConstantesFunciones.mostrarBusquedaPorNombreArancel);
			if(!this.arancelConstantesFunciones.mostrarBusquedaPorNombreArancel && index>-1) {
				this.jTabbedPaneBusquedasArancel.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioArancel() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasArancel.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorCodigoArancel);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.arancelConstantesFunciones.activarBusquedaPorCodigoArancel);
				this.jTabbedPaneBusquedasArancel.setEnabledAt(index,this.arancelConstantesFunciones.activarBusquedaPorCodigoArancel);
			}

			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorNombreArancel);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.arancelConstantesFunciones.activarBusquedaPorNombreArancel);
				this.jTabbedPaneBusquedasArancel.setEnabledAt(index,this.arancelConstantesFunciones.activarBusquedaPorNombreArancel);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaArancel(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorCodigoArancel);

			this.jTabbedPaneBusquedasArancel.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);

			this.arancelConstantesFunciones.setResaltarBusquedaPorCodigoArancel(resaltar);

			jPanel.setBorder(this.arancelConstantesFunciones.resaltarBusquedaPorCodigoArancel);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasArancel.indexOfComponent(this.jPanelBusquedaPorNombreArancel);

			this.jTabbedPaneBusquedasArancel.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArancel.getComponent(index);

			this.arancelConstantesFunciones.setResaltarBusquedaPorNombreArancel(resaltar);

			jPanel.setBorder(this.arancelConstantesFunciones.resaltarBusquedaPorNombreArancel);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarArancel.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioArancel() throws Exception {

		if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioArancel();
		this.updateVisibilidadResaltarControlesFormularioArancel();
		this.updateHabilitarResaltarControlesFormularioArancel();
		
	}
	
	public void updateBorderResaltarControlesFormularioArancel() throws Exception {
		if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.arancelConstantesFunciones.resaltaridArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jLabelidArancel.setBorder(this.arancelConstantesFunciones.resaltaridArancel);}
		if(this.arancelConstantesFunciones.resaltarid_empresaArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setBorder(this.arancelConstantesFunciones.resaltarid_empresaArancel);}
		if(this.arancelConstantesFunciones.resaltarcodigoArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setBorder(this.arancelConstantesFunciones.resaltarcodigoArancel);}
		if(this.arancelConstantesFunciones.resaltarnombreArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setBorder(this.arancelConstantesFunciones.resaltarnombreArancel);}
		if(this.arancelConstantesFunciones.resaltarporcentajeArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setBorder(this.arancelConstantesFunciones.resaltarporcentajeArancel);}
		if(this.arancelConstantesFunciones.resaltarobservacionArancel!=null && this.jInternalFrameDetalleFormArancel!=null) {this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setBorder(this.arancelConstantesFunciones.resaltarobservacionArancel);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioArancel() throws Exception {		
		if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
	
		//this.jInternalFrameDetalleFormArancel.jLabelidArancel.setVisible(this.arancelConstantesFunciones.mostraridArancel);
		this.jInternalFrameDetalleFormArancel.jPanelidArancel.setVisible(this.arancelConstantesFunciones.mostraridArancel);
		//this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setVisible(this.arancelConstantesFunciones.mostrarid_empresaArancel);
		this.jInternalFrameDetalleFormArancel.jPanelid_empresaArancel.setVisible(this.arancelConstantesFunciones.mostrarid_empresaArancel);
		//this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setVisible(this.arancelConstantesFunciones.mostrarcodigoArancel);
		this.jInternalFrameDetalleFormArancel.jPanelcodigoArancel.setVisible(this.arancelConstantesFunciones.mostrarcodigoArancel);
		//this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setVisible(this.arancelConstantesFunciones.mostrarnombreArancel);
		this.jInternalFrameDetalleFormArancel.jPanelnombreArancel.setVisible(this.arancelConstantesFunciones.mostrarnombreArancel);
		//this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setVisible(this.arancelConstantesFunciones.mostrarporcentajeArancel);
		this.jInternalFrameDetalleFormArancel.jPanelporcentajeArancel.setVisible(this.arancelConstantesFunciones.mostrarporcentajeArancel);
		//this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setVisible(this.arancelConstantesFunciones.mostrarobservacionArancel);
		this.jInternalFrameDetalleFormArancel.jPanelobservacionArancel.setVisible(this.arancelConstantesFunciones.mostrarobservacionArancel);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioArancel() throws Exception {
		if(this.jInternalFrameDetalleFormArancel==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormArancel!=null) {
	
		this.jInternalFrameDetalleFormArancel.jLabelidArancel.setEnabled(this.arancelConstantesFunciones.activaridArancel);
		this.jInternalFrameDetalleFormArancel.jComboBoxid_empresaArancel.setEnabled(this.arancelConstantesFunciones.activarid_empresaArancel);
		this.jInternalFrameDetalleFormArancel.jTextFieldcodigoArancel.setEnabled(this.arancelConstantesFunciones.activarcodigoArancel);
		this.jInternalFrameDetalleFormArancel.jTextAreanombreArancel.setEnabled(this.arancelConstantesFunciones.activarnombreArancel);
		this.jInternalFrameDetalleFormArancel.jTextFieldporcentajeArancel.setEnabled(this.arancelConstantesFunciones.activarporcentajeArancel);
		this.jInternalFrameDetalleFormArancel.jTextAreaobservacionArancel.setEnabled(this.arancelConstantesFunciones.activarobservacionArancel);
		}
	}
	
		
}