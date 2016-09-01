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

import com.bydan.erp.inventario.util.NovedadSeguimientoConstantesFunciones;
import com.bydan.erp.inventario.util.NovedadSeguimientoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.NovedadSeguimientoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.NovedadSeguimientoBean;
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
public class NovedadSeguimientoBeanSwingJInternalFrame extends NovedadSeguimientoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NovedadSeguimientoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NovedadSeguimiento> novedadseguimientoValidator = new ClassValidator<NovedadSeguimiento>(NovedadSeguimiento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NovedadSeguimiento novedadseguimiento;	
	public NovedadSeguimiento novedadseguimientoAux;
	public NovedadSeguimiento novedadseguimientoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NovedadSeguimiento novedadseguimientoTotales;
	public Long idNovedadSeguimientoActual;
	public Long iIdNuevoNovedadSeguimiento=0L;
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

	public String sFinalQueryComboDetalleMovimientoInventario="";

	public List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey;

	public List<DetalleMovimientoInventario> getdetallemovimientoinventariosForeignKey() {
		return detallemovimientoinventariosForeignKey;
	}

	public void setdetallemovimientoinventariosForeignKey(List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey) {
		this.detallemovimientoinventariosForeignKey = detallemovimientoinventariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleMovimientoInventario detallemovimientoinventarioForeignKey;

	public DetalleMovimientoInventario getdetallemovimientoinventarioForeignKey() {
		return detallemovimientoinventarioForeignKey;
	}

	public void setdetallemovimientoinventarioForeignKey(DetalleMovimientoInventario detallemovimientoinventarioForeignKey) {
		this.detallemovimientoinventarioForeignKey = detallemovimientoinventarioForeignKey;
	}

	public String sFinalQueryComboNovedadProducto="";

	public List<NovedadProducto> novedadproductosForeignKey;

	public List<NovedadProducto> getnovedadproductosForeignKey() {
		return novedadproductosForeignKey;
	}

	public void setnovedadproductosForeignKey(List<NovedadProducto> novedadproductosForeignKey) {
		this.novedadproductosForeignKey = novedadproductosForeignKey;
	}

	//OBJETO FK ACTUAL
	public NovedadProducto novedadproductoForeignKey;

	public NovedadProducto getnovedadproductoForeignKey() {
		return novedadproductoForeignKey;
	}

	public void setnovedadproductoForeignKey(NovedadProducto novedadproductoForeignKey) {
		this.novedadproductoForeignKey = novedadproductoForeignKey;
	}

	public String sFinalQueryComboEstadoNovedadSeguimiento="";

	public List<EstadoNovedadSeguimiento> estadonovedadseguimientosForeignKey;

	public List<EstadoNovedadSeguimiento> getestadonovedadseguimientosForeignKey() {
		return estadonovedadseguimientosForeignKey;
	}

	public void setestadonovedadseguimientosForeignKey(List<EstadoNovedadSeguimiento> estadonovedadseguimientosForeignKey) {
		this.estadonovedadseguimientosForeignKey = estadonovedadseguimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoNovedadSeguimiento estadonovedadseguimientoForeignKey;

	public EstadoNovedadSeguimiento getestadonovedadseguimientoForeignKey() {
		return estadonovedadseguimientoForeignKey;
	}

	public void setestadonovedadseguimientoForeignKey(EstadoNovedadSeguimiento estadonovedadseguimientoForeignKey) {
		this.estadonovedadseguimientoForeignKey = estadonovedadseguimientoForeignKey;
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
	
	public Boolean isPermisoTodoNovedadSeguimiento;
	public Boolean isPermisoNuevoNovedadSeguimiento;
	public Boolean isPermisoActualizarNovedadSeguimiento;
	public Boolean isPermisoActualizarOriginalNovedadSeguimiento;
	public Boolean isPermisoEliminarNovedadSeguimiento;
	public Boolean isPermisoGuardarCambiosNovedadSeguimiento;
	public Boolean isPermisoConsultaNovedadSeguimiento;
	public Boolean isPermisoBusquedaNovedadSeguimiento;
	public Boolean isPermisoReporteNovedadSeguimiento;
	public Boolean isPermisoPaginacionMedioNovedadSeguimiento;
	public Boolean isPermisoPaginacionAltoNovedadSeguimiento;
	public Boolean isPermisoPaginacionTodoNovedadSeguimiento;
	public Boolean isPermisoCopiarNovedadSeguimiento;
	public Boolean isPermisoVerFormNovedadSeguimiento;
	public Boolean isPermisoDuplicarNovedadSeguimiento;
	public Boolean isPermisoOrdenNovedadSeguimiento;
	
	
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
	
	public NovedadSeguimientoParameterReturnGeneral novedadseguimientoReturnGeneral;
	public NovedadSeguimientoParameterReturnGeneral novedadseguimientoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNovedadSeguimiento=false;
	public Boolean esParaAccionDesdeFormularioNovedadSeguimiento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NovedadSeguimientoSessionBeanAdditional novedadseguimientoSessionBeanAdditional=null;
	
	public NovedadSeguimientoSessionBeanAdditional getNovedadSeguimientoSessionBeanAdditional() {
		return this.novedadseguimientoSessionBeanAdditional;
	}
	
	public void setNovedadSeguimientoSessionBeanAdditional(NovedadSeguimientoSessionBeanAdditional novedadseguimientoSessionBeanAdditional) {
		try {
			this.novedadseguimientoSessionBeanAdditional=novedadseguimientoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NovedadSeguimientoBeanSwingJInternalFrameAdditional novedadseguimientoBeanSwingJInternalFrameAdditional=null;
	//public class NovedadSeguimientoBeanSwingJInternalFrame
	
	public NovedadSeguimientoBeanSwingJInternalFrameAdditional getNovedadSeguimientoBeanSwingJInternalFrameAdditional() {
		return this.novedadseguimientoBeanSwingJInternalFrameAdditional;
	}
	
	public void setNovedadSeguimientoBeanSwingJInternalFrameAdditional(NovedadSeguimientoBeanSwingJInternalFrameAdditional novedadseguimientoBeanSwingJInternalFrameAdditional) {
		try {
			this.novedadseguimientoBeanSwingJInternalFrameAdditional=novedadseguimientoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NovedadSeguimientoLogic novedadseguimientoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NovedadSeguimiento novedadseguimientoBean;
	public NovedadSeguimientoConstantesFunciones novedadseguimientoConstantesFunciones;
	//public NovedadSeguimientoParameterReturnGeneral novedadseguimientoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic;
	public NovedadProductoLogic novedadproductoLogic;
	public EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic;
	
	//PARAMETROS
	
	
	//public List<NovedadSeguimiento> novedadseguimientos;	
	//public List<NovedadSeguimiento> novedadseguimientosEliminados;
	//public List<NovedadSeguimiento> novedadseguimientosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaDuplicarNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaCopiarNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaVerFormNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaOrdenNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaModificarNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaActualizarNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaEliminarNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaCancelarNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaGuardarNovedadSeguimiento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleMovimientoInventario=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadFK_IdNovedadProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoNovedadSeguimiento() {
		return this.iIdNuevoNovedadSeguimiento;
	}

	public void setiIdNuevoNovedadSeguimiento(Long iIdNuevoNovedadSeguimiento) {
		this.iIdNuevoNovedadSeguimiento = iIdNuevoNovedadSeguimiento;
	}
	
	public Long getidNovedadSeguimientoActual() {
		return this.idNovedadSeguimientoActual;
	}

	public void setidNovedadSeguimientoActual(Long idNovedadSeguimientoActual) {
		this.idNovedadSeguimientoActual = idNovedadSeguimientoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NovedadSeguimiento getnovedadseguimiento() {
		return this.novedadseguimiento;
	}

	public void setnovedadseguimiento(NovedadSeguimiento novedadseguimiento) {
		this.novedadseguimiento = novedadseguimiento;
	}
	
	public NovedadSeguimiento getnovedadseguimientoAux() {
		return this.novedadseguimientoAux;
	}

	public void setnovedadseguimientoAux(NovedadSeguimiento novedadseguimientoAux) {
		this.novedadseguimientoAux = novedadseguimientoAux;
	}				
	
	public NovedadSeguimiento getnovedadseguimientoAnterior() {
		return this.novedadseguimientoAnterior;
	}

	public void setnovedadseguimientoAnterior(NovedadSeguimiento novedadseguimientoAnterior) {
		this.novedadseguimientoAnterior = novedadseguimientoAnterior;
	}	
	
	public NovedadSeguimiento getnovedadseguimientoTotales() {
		return this.novedadseguimientoTotales;
	}

	public void setnovedadseguimientoTotales(NovedadSeguimiento novedadseguimientoTotales) {
		this.novedadseguimientoTotales = novedadseguimientoTotales;
	}	
	
	public NovedadSeguimiento getnovedadseguimientoBean() {
		return this.novedadseguimientoBean;
	}

	public void setnovedadseguimientoBean(NovedadSeguimiento novedadseguimientoBean) {
		this.novedadseguimientoBean = novedadseguimientoBean;
	}	
	
	public NovedadSeguimientoParameterReturnGeneral getnovedadseguimientoReturnGeneral() {
		return this.novedadseguimientoReturnGeneral;
	}

	public void setnovedadseguimientoReturnGeneral(NovedadSeguimientoParameterReturnGeneral novedadseguimientoReturnGeneral) {
		this.novedadseguimientoReturnGeneral = novedadseguimientoReturnGeneral;
	}	
	
	
	public Long id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario=-1L;

	public Long getid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario() {
		return this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario;
	}

	public void setid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario(Long id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario) {
		this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario = id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento=-1L;

	public Long getid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento() {
		return this.id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento;
	}

	public void setid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento(Long id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento) {
		this.id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento = id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento;
	}

	public Long id_novedad_productoFK_IdNovedadProducto=-1L;

	public Long getid_novedad_productoFK_IdNovedadProducto() {
		return this.id_novedad_productoFK_IdNovedadProducto;
	}

	public void setid_novedad_productoFK_IdNovedadProducto(Long id_novedad_productoFK_IdNovedadProducto) {
		this.id_novedad_productoFK_IdNovedadProducto = id_novedad_productoFK_IdNovedadProducto;
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
	
	
	public NovedadSeguimientoLogic getNovedadSeguimientoLogic()	{		
		return novedadseguimientoLogic;
	}

	public void setNovedadSeguimientoLogic(NovedadSeguimientoLogic novedadseguimientoLogic) {
		this.novedadseguimientoLogic = novedadseguimientoLogic;
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
	
	public Boolean getIsEsNuevoNovedadSeguimiento() {
		return isEsNuevoNovedadSeguimiento;
	}

	public void setIsEsNuevoNovedadSeguimiento(Boolean isEsNuevoNovedadSeguimiento) {
		this.isEsNuevoNovedadSeguimiento = isEsNuevoNovedadSeguimiento;
	}

	public Boolean getEsParaAccionDesdeFormularioNovedadSeguimiento() {
		return esParaAccionDesdeFormularioNovedadSeguimiento;
	}
	
	public void setEsParaAccionDesdeFormularioNovedadSeguimiento(Boolean esParaAccionDesdeFormularioNovedadSeguimiento) {
		this.esParaAccionDesdeFormularioNovedadSeguimiento = esParaAccionDesdeFormularioNovedadSeguimiento;
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

			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(novedadseguimientoSessionBean.getlidEmpresaActual());
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

			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(novedadseguimientoSessionBean.getlidSucursalActual());
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

	public void cargarCombosDetalleMovimientoInventariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic();

			//detallemovimientoinventarioLogic.getDetalleMovimientoInventarioDataAccess().setIsForForeingKeyData(true);

			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallemovimientoinventarioLogic.getDetalleMovimientoInventarioDataAccess().setIsForForeingKeyData(true);

					detallemovimientoinventarioLogic.getTodosDetalleMovimientoInventariosWithConnection(sFinalQuery,new Pagination());

					this.detallemovimientoinventariosForeignKey=detallemovimientoinventarioLogic.getDetalleMovimientoInventarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleMovimientoInventario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemovimientoinventarioLogic.getEntityWithConnection(novedadseguimientoSessionBean.getlidDetalleMovimientoInventarioActual());
					this.detallemovimientoinventariosForeignKey.add(detallemovimientoinventarioLogic.getDetalleMovimientoInventario());
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

	public void cargarCombosNovedadProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.novedadproductosForeignKey=new ArrayList<NovedadProducto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NovedadProductoLogic novedadproductoLogic=new NovedadProductoLogic();

			//novedadproductoLogic.getNovedadProductoDataAccess().setIsForForeingKeyData(true);

			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionNovedadProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//novedadproductoLogic.getNovedadProductoDataAccess().setIsForForeingKeyData(true);

					novedadproductoLogic.getTodosNovedadProductosWithConnection(sFinalQuery,new Pagination());

					this.novedadproductosForeignKey=novedadproductoLogic.getNovedadProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNovedadProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLogic.getEntityWithConnection(novedadseguimientoSessionBean.getlidNovedadProductoActual());
					this.novedadproductosForeignKey.add(novedadproductoLogic.getNovedadProducto());
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

	public void cargarCombosEstadoNovedadSeguimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadonovedadseguimientosForeignKey=new ArrayList<EstadoNovedadSeguimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic=new EstadoNovedadSeguimientoLogic();

			//estadonovedadseguimientoLogic.getEstadoNovedadSeguimientoDataAccess().setIsForForeingKeyData(true);

			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadonovedadseguimientoLogic.getEstadoNovedadSeguimientoDataAccess().setIsForForeingKeyData(true);

					estadonovedadseguimientoLogic.getTodosEstadoNovedadSeguimientosWithConnection(sFinalQuery,new Pagination());

					this.estadonovedadseguimientosForeignKey=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoNovedadSeguimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadseguimientoLogic.getEntityWithConnection(novedadseguimientoSessionBean.getlidEstadoNovedadSeguimientoActual());
					this.estadonovedadseguimientosForeignKey.add(estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento());
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

					if(this.novedadseguimiento!=null) {
						this.novedadseguimiento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNovedadSeguimiento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNovedadSeguimientoGenerico)throws Exception
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
				jComboBoxid_empresaNovedadSeguimientoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNovedadSeguimientoGenerico!=null && jComboBoxid_empresaNovedadSeguimientoGenerico.getItemCount()>0) {
					jComboBoxid_empresaNovedadSeguimientoGenerico.setSelectedIndex(0);
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

					if(this.novedadseguimiento!=null) {
						this.novedadseguimiento.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalNovedadSeguimiento.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalNovedadSeguimientoGenerico)throws Exception
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
				jComboBoxid_sucursalNovedadSeguimientoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalNovedadSeguimientoGenerico!=null && jComboBoxid_sucursalNovedadSeguimientoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalNovedadSeguimientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleMovimientoInventarioForeignKey(Long idDetalleMovimientoInventarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detallemovimientoinventarioTemp!=null) {

					if(this.novedadseguimiento!=null) {
						this.novedadseguimiento.setDetalleMovimientoInventario(detallemovimientoinventarioTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventarioTemp);
					}
				} else {
					//jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventarioTemp);
					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleMovimientoInventario") || sFormularioTipoBusqueda.equals("Todos")){
					if(detallemovimientoinventarioTemp!=null && jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento!=null) {
						jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventarioTemp);
					} else {
						if(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento!=null) {
							//jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventarioTemp);
							if(jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.getItemCount()>0) {
								jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setSelectedIndex(0);
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

	public String getActualDetalleMovimientoInventarioForeignKeyDescripcion(Long idDetalleMovimientoInventarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}


			sDescripcion=DetalleMovimientoInventarioConstantesFunciones.getDetalleMovimientoInventarioDescripcion(detallemovimientoinventarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleMovimientoInventarioForeignKeyGenerico(Long idDetalleMovimientoInventarioSeleccionado,JComboBox jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioTemp=null;

			for(DetalleMovimientoInventario detallemovimientoinventarioAux:detallemovimientoinventariosForeignKey) {
				if(detallemovimientoinventarioAux.getId()!=null && detallemovimientoinventarioAux.getId().equals(idDetalleMovimientoInventarioSeleccionado)) {
					detallemovimientoinventarioTemp=detallemovimientoinventarioAux;
					break;
				}
			}

			if(detallemovimientoinventarioTemp!=null) {
				jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico.setSelectedItem(detallemovimientoinventarioTemp);
			} else {
				if(jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico!=null && jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNovedadProductoForeignKey(Long idNovedadProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NovedadProducto  novedadproductoTemp=null;

			for(NovedadProducto novedadproductoAux:novedadproductosForeignKey) {
				if(novedadproductoAux.getId()!=null && novedadproductoAux.getId().equals(idNovedadProductoSeleccionado)) {
					novedadproductoTemp=novedadproductoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(novedadproductoTemp!=null) {

					if(this.novedadseguimiento!=null) {
						this.novedadseguimiento.setNovedadProducto(novedadproductoTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedItem(novedadproductoTemp);
					}
				} else {
					//jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedItem(novedadproductoTemp);
					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdNovedadProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(novedadproductoTemp!=null && jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento!=null) {
						jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setSelectedItem(novedadproductoTemp);
					} else {
						if(jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento!=null) {
							//jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setSelectedItem(novedadproductoTemp);
							if(jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.getItemCount()>0) {
								jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setSelectedIndex(0);
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

	public String getActualNovedadProductoForeignKeyDescripcion(Long idNovedadProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NovedadProducto  novedadproductoTemp=null;

			for(NovedadProducto novedadproductoAux:novedadproductosForeignKey) {
				if(novedadproductoAux.getId()!=null && novedadproductoAux.getId().equals(idNovedadProductoSeleccionado)) {
					novedadproductoTemp=novedadproductoAux;
					break;
				}
			}


			sDescripcion=NovedadProductoConstantesFunciones.getNovedadProductoDescripcion(novedadproductoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNovedadProductoForeignKeyGenerico(Long idNovedadProductoSeleccionado,JComboBox jComboBoxid_novedad_productoNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			NovedadProducto  novedadproductoTemp=null;

			for(NovedadProducto novedadproductoAux:novedadproductosForeignKey) {
				if(novedadproductoAux.getId()!=null && novedadproductoAux.getId().equals(idNovedadProductoSeleccionado)) {
					novedadproductoTemp=novedadproductoAux;
					break;
				}
			}

			if(novedadproductoTemp!=null) {
				jComboBoxid_novedad_productoNovedadSeguimientoGenerico.setSelectedItem(novedadproductoTemp);
			} else {
				if(jComboBoxid_novedad_productoNovedadSeguimientoGenerico!=null && jComboBoxid_novedad_productoNovedadSeguimientoGenerico.getItemCount()>0) {
					jComboBoxid_novedad_productoNovedadSeguimientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoNovedadSeguimientoForeignKey(Long idEstadoNovedadSeguimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoNovedadSeguimiento  estadonovedadseguimientoTemp=null;

			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosForeignKey) {
				if(estadonovedadseguimientoAux.getId()!=null && estadonovedadseguimientoAux.getId().equals(idEstadoNovedadSeguimientoSeleccionado)) {
					estadonovedadseguimientoTemp=estadonovedadseguimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadonovedadseguimientoTemp!=null) {

					if(this.novedadseguimiento!=null) {
						this.novedadseguimiento.setEstadoNovedadSeguimiento(estadonovedadseguimientoTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimientoTemp);
					}
				} else {
					//jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimientoTemp);
					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoNovedadSeguimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadonovedadseguimientoTemp!=null && jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento!=null) {
						jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimientoTemp);
					} else {
						if(jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento!=null) {
							//jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimientoTemp);
							if(jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.getItemCount()>0) {
								jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setSelectedIndex(0);
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

	public String getActualEstadoNovedadSeguimientoForeignKeyDescripcion(Long idEstadoNovedadSeguimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoNovedadSeguimiento  estadonovedadseguimientoTemp=null;

			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosForeignKey) {
				if(estadonovedadseguimientoAux.getId()!=null && estadonovedadseguimientoAux.getId().equals(idEstadoNovedadSeguimientoSeleccionado)) {
					estadonovedadseguimientoTemp=estadonovedadseguimientoAux;
					break;
				}
			}


			sDescripcion=EstadoNovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoDescripcion(estadonovedadseguimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoNovedadSeguimientoForeignKeyGenerico(Long idEstadoNovedadSeguimientoSeleccionado,JComboBox jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			EstadoNovedadSeguimiento  estadonovedadseguimientoTemp=null;

			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosForeignKey) {
				if(estadonovedadseguimientoAux.getId()!=null && estadonovedadseguimientoAux.getId().equals(idEstadoNovedadSeguimientoSeleccionado)) {
					estadonovedadseguimientoTemp=estadonovedadseguimientoAux;
					break;
				}
			}

			if(estadonovedadseguimientoTemp!=null) {
				jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico.setSelectedItem(estadonovedadseguimientoTemp);
			} else {
				if(jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico!=null && jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico.getItemCount()>0) {
					jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NovedadSeguimiento novedadseguimiento,JComboBox jComboBoxid_empresaNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNovedadSeguimientoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNovedadSeguimientoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				novedadseguimiento.setid_empresa(empresaAux.getId());
				novedadseguimiento.setempresa_descripcion(NovedadSeguimientoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				novedadseguimiento.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(NovedadSeguimiento novedadseguimiento,JComboBox jComboBoxid_sucursalNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalNovedadSeguimientoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalNovedadSeguimientoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				novedadseguimiento.setid_sucursal(sucursalAux.getId());
				novedadseguimiento.setsucursal_descripcion(NovedadSeguimientoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				novedadseguimiento.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleMovimientoInventarioForeignKey(NovedadSeguimiento novedadseguimiento,JComboBox jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			DetalleMovimientoInventario  detallemovimientoinventarioAux=new DetalleMovimientoInventario();

			if(jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico==null) {
				detallemovimientoinventarioAux=(DetalleMovimientoInventario)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getSelectedItem();
			} else {
				detallemovimientoinventarioAux=(DetalleMovimientoInventario)jComboBoxid_detalle_movimiento_inventarioNovedadSeguimientoGenerico.getSelectedItem();
			}

			if(detallemovimientoinventarioAux!=null && detallemovimientoinventarioAux.getId()!=null) {
				novedadseguimiento.setid_detalle_movimiento_inventario(detallemovimientoinventarioAux.getId());
				novedadseguimiento.setdetallemovimientoinventario_descripcion(NovedadSeguimientoConstantesFunciones.getDetalleMovimientoInventarioDescripcion(detallemovimientoinventarioAux));
				novedadseguimiento.setDetalleMovimientoInventario(detallemovimientoinventarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNovedadProductoForeignKey(NovedadSeguimiento novedadseguimiento,JComboBox jComboBoxid_novedad_productoNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			NovedadProducto  novedadproductoAux=new NovedadProducto();

			if(jComboBoxid_novedad_productoNovedadSeguimientoGenerico==null) {
				novedadproductoAux=(NovedadProducto)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.getSelectedItem();
			} else {
				novedadproductoAux=(NovedadProducto)jComboBoxid_novedad_productoNovedadSeguimientoGenerico.getSelectedItem();
			}

			if(novedadproductoAux!=null && novedadproductoAux.getId()!=null) {
				novedadseguimiento.setid_novedad_producto(novedadproductoAux.getId());
				novedadseguimiento.setnovedadproducto_descripcion(NovedadSeguimientoConstantesFunciones.getNovedadProductoDescripcion(novedadproductoAux));
				novedadseguimiento.setNovedadProducto(novedadproductoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoNovedadSeguimientoForeignKey(NovedadSeguimiento novedadseguimiento,JComboBox jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico)throws Exception
	{
		try
		{
			EstadoNovedadSeguimiento  estadonovedadseguimientoAux=new EstadoNovedadSeguimiento();

			if(jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico==null) {
				estadonovedadseguimientoAux=(EstadoNovedadSeguimiento)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getSelectedItem();
			} else {
				estadonovedadseguimientoAux=(EstadoNovedadSeguimiento)jComboBoxid_estado_novedad_seguimientoNovedadSeguimientoGenerico.getSelectedItem();
			}

			if(estadonovedadseguimientoAux!=null && estadonovedadseguimientoAux.getId()!=null) {
				novedadseguimiento.setid_estado_novedad_seguimiento(estadonovedadseguimientoAux.getId());
				novedadseguimiento.setestadonovedadseguimiento_descripcion(NovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoDescripcion(estadonovedadseguimientoAux));
				novedadseguimiento.setEstadoNovedadSeguimiento(estadonovedadseguimientoAux);			}
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

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
					}

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
					}

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleMovimientoInventariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleMovimientoInventario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.removeAllItems();

							for(DetalleMovimientoInventario detallemovimientoinventario:this.detallemovimientoinventariosForeignKey) {
								this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.addItem(detallemovimientoinventario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
					}

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleMovimientoInventario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.removeAllItems();

							for(DetalleMovimientoInventario detallemovimientoinventario:this.detallemovimientoinventariosForeignKey) {
								this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.addItem(detallemovimientoinventario);
							}
						}

						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNovedadProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNovedadProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.removeAllItems();

							for(NovedadProducto novedadproducto:this.novedadproductosForeignKey) {
								this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.addItem(novedadproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
					}

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdNovedadProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.removeAllItems();

							for(NovedadProducto novedadproducto:this.novedadproductosForeignKey) {
								this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.addItem(novedadproducto);
							}
						}

						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoNovedadSeguimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoNovedadSeguimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.removeAllItems();

							for(EstadoNovedadSeguimiento estadonovedadseguimiento:this.estadonovedadseguimientosForeignKey) {
								this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.addItem(estadonovedadseguimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { 
					}

					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoNovedadSeguimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.removeAllItems();

							for(EstadoNovedadSeguimiento estadonovedadseguimiento:this.estadonovedadseguimientosForeignKey) {
								this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.addItem(estadonovedadseguimiento);
							}
						}

						if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleMovimientoInventarioForeignKey(DetalleMovimientoInventario detallemovimientoinventario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventario);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setSelectedItem(detallemovimientoinventario);
						} else {
							this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameNovedadProductoForeignKey(NovedadProducto novedadproducto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedItem(novedadproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setSelectedItem(novedadproducto);
						} else {
							this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoNovedadSeguimientoForeignKey(EstadoNovedadSeguimiento estadonovedadseguimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setSelectedItem(estadonovedadseguimiento);
						} else {
							this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesNovedadSeguimiento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NovedadSeguimientoConstantesFunciones.refrescarForeignKeysDescripcionesNovedadSeguimiento(this.novedadseguimientoLogic.getNovedadSeguimientos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NovedadSeguimientoConstantesFunciones.refrescarForeignKeysDescripcionesNovedadSeguimiento(this.novedadseguimientos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleMovimientoInventario.class));
		classes.add(new Classe(NovedadProducto.class));
		classes.add(new Classe(EstadoNovedadSeguimiento.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//novedadseguimientoLogic.setNovedadSeguimientos(this.novedadseguimientos);
			novedadseguimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NovedadSeguimientoParameterReturnGeneral getNovedadSeguimientoParameterGeneral() {
		return this.novedadseguimientoParameterGeneral;
	}
	
	public void setNovedadSeguimientoParameterGeneral(NovedadSeguimientoParameterReturnGeneral novedadseguimientoParameterGeneral) {
		this.novedadseguimientoParameterGeneral = novedadseguimientoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNovedadSeguimiento() {
		return isPermisoTodoNovedadSeguimiento;
	}

	public void setIsPermisoTodoNovedadSeguimiento(Boolean isPermisoTodoNovedadSeguimiento) {
		this.isPermisoTodoNovedadSeguimiento = isPermisoTodoNovedadSeguimiento;
	}

	public Boolean getIsPermisoNuevoNovedadSeguimiento() {
		return isPermisoNuevoNovedadSeguimiento;
	}

	public void setIsPermisoNuevoNovedadSeguimiento(Boolean isPermisoNuevoNovedadSeguimiento) {
		this.isPermisoNuevoNovedadSeguimiento = isPermisoNuevoNovedadSeguimiento;
	}

	public Boolean getIsPermisoActualizarNovedadSeguimiento() {
		return isPermisoActualizarNovedadSeguimiento;
	}

	public void setIsPermisoActualizarNovedadSeguimiento(Boolean isPermisoActualizarNovedadSeguimiento) {
		this.isPermisoActualizarNovedadSeguimiento = isPermisoActualizarNovedadSeguimiento;
	}

	public Boolean getIsPermisoEliminarNovedadSeguimiento() {
		return isPermisoEliminarNovedadSeguimiento;
	}

	public void setIsPermisoEliminarNovedadSeguimiento(Boolean isPermisoEliminarNovedadSeguimiento) {
		this.isPermisoEliminarNovedadSeguimiento = isPermisoEliminarNovedadSeguimiento;
	}

	public Boolean getIsPermisoGuardarCambiosNovedadSeguimiento() {
		return isPermisoGuardarCambiosNovedadSeguimiento;
	}

	public void setIsPermisoGuardarCambiosNovedadSeguimiento(Boolean isPermisoGuardarCambiosNovedadSeguimiento) {
		this.isPermisoGuardarCambiosNovedadSeguimiento = isPermisoGuardarCambiosNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoConsultaNovedadSeguimiento() {
		return isPermisoConsultaNovedadSeguimiento;
	}

	public void setIsPermisoConsultaNovedadSeguimiento(Boolean isPermisoConsultaNovedadSeguimiento) {
		this.isPermisoConsultaNovedadSeguimiento = isPermisoConsultaNovedadSeguimiento;
	}

	public Boolean getIsPermisoBusquedaNovedadSeguimiento() {
		return isPermisoBusquedaNovedadSeguimiento;
	}

	public void setIsPermisoBusquedaNovedadSeguimiento(Boolean isPermisoBusquedaNovedadSeguimiento) {
		this.isPermisoBusquedaNovedadSeguimiento = isPermisoBusquedaNovedadSeguimiento;
	}

	public Boolean getIsPermisoReporteNovedadSeguimiento() {
		return isPermisoReporteNovedadSeguimiento;
	}

	public void setIsPermisoReporteNovedadSeguimiento(Boolean isPermisoReporteNovedadSeguimiento) {
		this.isPermisoReporteNovedadSeguimiento = isPermisoReporteNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionMedioNovedadSeguimiento() {
		return isPermisoPaginacionMedioNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionMedioNovedadSeguimiento(Boolean isPermisoPaginacionMedioNovedadSeguimiento) {
		this.isPermisoPaginacionMedioNovedadSeguimiento = isPermisoPaginacionMedioNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionTodoNovedadSeguimiento() {
		return isPermisoPaginacionTodoNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionTodoNovedadSeguimiento(Boolean isPermisoPaginacionTodoNovedadSeguimiento) {
		this.isPermisoPaginacionTodoNovedadSeguimiento = isPermisoPaginacionTodoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionAltoNovedadSeguimiento() {
		return isPermisoPaginacionAltoNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionAltoNovedadSeguimiento(Boolean isPermisoPaginacionAltoNovedadSeguimiento) {
		this.isPermisoPaginacionAltoNovedadSeguimiento = isPermisoPaginacionAltoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoCopiarNovedadSeguimiento() {
		return isPermisoCopiarNovedadSeguimiento;
	}

	public void setIsPermisoCopiarNovedadSeguimiento(Boolean isPermisoCopiarNovedadSeguimiento) {
		this.isPermisoCopiarNovedadSeguimiento = isPermisoCopiarNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoVerFormNovedadSeguimiento() {
		return isPermisoVerFormNovedadSeguimiento;
	}

	public void setIsPermisoVerFormNovedadSeguimiento(Boolean isPermisoVerFormNovedadSeguimiento) {
		this.isPermisoVerFormNovedadSeguimiento = isPermisoVerFormNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoDuplicarNovedadSeguimiento() {
		return isPermisoDuplicarNovedadSeguimiento;
	}

	public void setIsPermisoDuplicarNovedadSeguimiento(Boolean isPermisoDuplicarNovedadSeguimiento) {
		this.isPermisoDuplicarNovedadSeguimiento = isPermisoDuplicarNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoOrdenNovedadSeguimiento() {
		return isPermisoOrdenNovedadSeguimiento;
	}

	public void setIsPermisoOrdenNovedadSeguimiento(Boolean isPermisoOrdenNovedadSeguimiento) {
		this.isPermisoOrdenNovedadSeguimiento = isPermisoOrdenNovedadSeguimiento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNovedadSeguimiento() {
		return isVisibilidadCeldaNuevoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaNuevoNovedadSeguimiento(Boolean isVisibilidadCeldaNuevoNovedadSeguimiento) {
		this.isVisibilidadCeldaNuevoNovedadSeguimiento = isVisibilidadCeldaNuevoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNovedadSeguimiento() {
		return isVisibilidadCeldaDuplicarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaDuplicarNovedadSeguimiento(Boolean isVisibilidadCeldaDuplicarNovedadSeguimiento) {
		this.isVisibilidadCeldaDuplicarNovedadSeguimiento = isVisibilidadCeldaDuplicarNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNovedadSeguimiento() {
		return isVisibilidadCeldaCopiarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaCopiarNovedadSeguimiento(Boolean isVisibilidadCeldaCopiarNovedadSeguimiento) {
		this.isVisibilidadCeldaCopiarNovedadSeguimiento = isVisibilidadCeldaCopiarNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNovedadSeguimiento() {
		return isVisibilidadCeldaVerFormNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaVerFormNovedadSeguimiento(Boolean isVisibilidadCeldaVerFormNovedadSeguimiento) {
		this.isVisibilidadCeldaVerFormNovedadSeguimiento = isVisibilidadCeldaVerFormNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNovedadSeguimiento() {
		return isVisibilidadCeldaOrdenNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaOrdenNovedadSeguimiento(Boolean isVisibilidadCeldaOrdenNovedadSeguimiento) {
		this.isVisibilidadCeldaOrdenNovedadSeguimiento = isVisibilidadCeldaOrdenNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNovedadSeguimiento() {
		return isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNovedadSeguimiento(Boolean isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento) {
		this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento = isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNovedadSeguimiento() {
		return isVisibilidadCeldaModificarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaModificarNovedadSeguimiento(Boolean isVisibilidadCeldaModificarNovedadSeguimiento) {
		this.isVisibilidadCeldaModificarNovedadSeguimiento = isVisibilidadCeldaModificarNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNovedadSeguimiento() {
		return isVisibilidadCeldaActualizarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaActualizarNovedadSeguimiento(Boolean isVisibilidadCeldaActualizarNovedadSeguimiento) {
		this.isVisibilidadCeldaActualizarNovedadSeguimiento = isVisibilidadCeldaActualizarNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaEliminarNovedadSeguimiento() {
		return isVisibilidadCeldaEliminarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaEliminarNovedadSeguimiento(Boolean isVisibilidadCeldaEliminarNovedadSeguimiento) {
		this.isVisibilidadCeldaEliminarNovedadSeguimiento = isVisibilidadCeldaEliminarNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaCancelarNovedadSeguimiento() {
		return isVisibilidadCeldaCancelarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaCancelarNovedadSeguimiento(Boolean isVisibilidadCeldaCancelarNovedadSeguimiento) {
		this.isVisibilidadCeldaCancelarNovedadSeguimiento = isVisibilidadCeldaCancelarNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaGuardarNovedadSeguimiento() {
		return isVisibilidadCeldaGuardarNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaGuardarNovedadSeguimiento(Boolean isVisibilidadCeldaGuardarNovedadSeguimiento) {
		this.isVisibilidadCeldaGuardarNovedadSeguimiento = isVisibilidadCeldaGuardarNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNovedadSeguimiento() {
		return isVisibilidadCeldaGuardarCambiosNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNovedadSeguimiento(Boolean isVisibilidadCeldaGuardarCambiosNovedadSeguimiento) {
		this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento = isVisibilidadCeldaGuardarCambiosNovedadSeguimiento;
	}
		
	public NovedadSeguimientoSessionBean getnovedadseguimientoSessionBean() {
		return this.novedadseguimientoSessionBean;
	}
	
	public void setnovedadseguimientoSessionBean(NovedadSeguimientoSessionBean novedadseguimientoSessionBean) {
		this.novedadseguimientoSessionBean=novedadseguimientoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleMovimientoInventario() {
		return this.isVisibilidadFK_IdDetalleMovimientoInventario;
	}

	public void setisVisibilidadFK_IdDetalleMovimientoInventario(Boolean isVisibilidadFK_IdDetalleMovimientoInventario) {
		this.isVisibilidadFK_IdDetalleMovimientoInventario=isVisibilidadFK_IdDetalleMovimientoInventario;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoNovedadSeguimiento() {
		return this.isVisibilidadFK_IdEstadoNovedadSeguimiento;
	}

	public void setisVisibilidadFK_IdEstadoNovedadSeguimiento(Boolean isVisibilidadFK_IdEstadoNovedadSeguimiento) {
		this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isVisibilidadFK_IdEstadoNovedadSeguimiento;
	}

	public Boolean getisVisibilidadFK_IdNovedadProducto() {
		return this.isVisibilidadFK_IdNovedadProducto;
	}

	public void setisVisibilidadFK_IdNovedadProducto(Boolean isVisibilidadFK_IdNovedadProducto) {
		this.isVisibilidadFK_IdNovedadProducto=isVisibilidadFK_IdNovedadProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(NovedadSeguimiento novedadseguimiento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(novedadseguimiento,null);
				this.setActualParaGuardarSucursalForeignKey(novedadseguimiento,null);
				this.setActualParaGuardarDetalleMovimientoInventarioForeignKey(novedadseguimiento,null);
				this.setActualParaGuardarNovedadProductoForeignKey(novedadseguimiento,null);
				this.setActualParaGuardarEstadoNovedadSeguimientoForeignKey(novedadseguimiento,null);
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
	
	public void bugActualizarReferenciaActual(NovedadSeguimiento novedadseguimiento,NovedadSeguimiento novedadseguimientoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNovedadSeguimiento(novedadseguimiento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		novedadseguimientoAux.setId(novedadseguimiento.getId());
		novedadseguimientoAux.setVersionRow(novedadseguimiento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNovedadSeguimiento();
		
			int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = novedadseguimientoValidator.getInvalidValues(this.novedadseguimiento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			novedadseguimientoLogic.setDatosCliente(datosCliente);
			novedadseguimientoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				novedadseguimientoAux=new  NovedadSeguimiento();
				
				novedadseguimientoAux.setIsNew(true);
				novedadseguimientoAux.setIsChanged(true);
				
				novedadseguimientoAux.setNovedadSeguimientoOriginal(this.novedadseguimiento);
				
				novedadseguimientoAux.setId(this.novedadseguimiento.getId());	
				novedadseguimientoAux.setVersionRow(this.novedadseguimiento.getVersionRow());	
				novedadseguimientoAux.setid_empresa(this.novedadseguimiento.getid_empresa());	
				novedadseguimientoAux.setid_sucursal(this.novedadseguimiento.getid_sucursal());	
				novedadseguimientoAux.setid_detalle_movimiento_inventario(this.novedadseguimiento.getid_detalle_movimiento_inventario());	
				novedadseguimientoAux.setid_novedad_producto(this.novedadseguimiento.getid_novedad_producto());	
				novedadseguimientoAux.setnumero_comprobante(this.novedadseguimiento.getnumero_comprobante());	
				novedadseguimientoAux.setfecha_novedad(this.novedadseguimiento.getfecha_novedad());	
				novedadseguimientoAux.setfecha_seguimiento(this.novedadseguimiento.getfecha_seguimiento());	
				novedadseguimientoAux.setdescripcion(this.novedadseguimiento.getdescripcion());	
				novedadseguimientoAux.setid_estado_novedad_seguimiento(this.novedadseguimiento.getid_estado_novedad_seguimiento());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadseguimientoAux,novedadseguimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.saveNovedadSeguimientos();//WithConnection
						//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);
					
					this.refrescarForeignKeysDescripcionesNovedadSeguimiento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadseguimientoLogic.saveNovedadSeguimientoRelaciones(novedadseguimientoAux);//WithConnection
								//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadseguimientoAux,novedadseguimientos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				novedadseguimientoAux=new  NovedadSeguimiento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado() 
					|| (this.novedadseguimientoSessionBean.getEsGuardarRelacionado() && this.novedadseguimiento.getId()>=0)) {
						
					novedadseguimientoAux.setIsNew(false);
				}
				
				novedadseguimientoAux.setIsDeleted(false);
			
				novedadseguimientoAux.setId(this.novedadseguimiento.getId());	
				novedadseguimientoAux.setVersionRow(this.novedadseguimiento.getVersionRow());	
				novedadseguimientoAux.setid_empresa(this.novedadseguimiento.getid_empresa());	
				novedadseguimientoAux.setid_sucursal(this.novedadseguimiento.getid_sucursal());	
				novedadseguimientoAux.setid_detalle_movimiento_inventario(this.novedadseguimiento.getid_detalle_movimiento_inventario());	
				novedadseguimientoAux.setid_novedad_producto(this.novedadseguimiento.getid_novedad_producto());	
				novedadseguimientoAux.setnumero_comprobante(this.novedadseguimiento.getnumero_comprobante());	
				novedadseguimientoAux.setfecha_novedad(this.novedadseguimiento.getfecha_novedad());	
				novedadseguimientoAux.setfecha_seguimiento(this.novedadseguimiento.getfecha_seguimiento());	
				novedadseguimientoAux.setdescripcion(this.novedadseguimiento.getdescripcion());	
				novedadseguimientoAux.setid_estado_novedad_seguimiento(this.novedadseguimiento.getid_estado_novedad_seguimiento());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadseguimientoAux,novedadseguimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.saveNovedadSeguimientos();//WithConnection
						//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);
					
					this.refrescarForeignKeysDescripcionesNovedadSeguimiento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadseguimientoLogic.saveNovedadSeguimientoRelaciones(novedadseguimientoAux);//WithConnection
								//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadseguimientoAux,novedadseguimientos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadseguimiento,novedadseguimientoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				novedadseguimientoAux=new  NovedadSeguimiento();
				
				novedadseguimientoAux.setIsNew(false);
				novedadseguimientoAux.setIsChanged(false);
				
				novedadseguimientoAux.setIsDeleted(true);
				
				novedadseguimientoAux.setId(this.novedadseguimiento.getId());	
				novedadseguimientoAux.setVersionRow(this.novedadseguimiento.getVersionRow());	
				novedadseguimientoAux.setid_empresa(this.novedadseguimiento.getid_empresa());	
				novedadseguimientoAux.setid_sucursal(this.novedadseguimiento.getid_sucursal());	
				novedadseguimientoAux.setid_detalle_movimiento_inventario(this.novedadseguimiento.getid_detalle_movimiento_inventario());	
				novedadseguimientoAux.setid_novedad_producto(this.novedadseguimiento.getid_novedad_producto());	
				novedadseguimientoAux.setnumero_comprobante(this.novedadseguimiento.getnumero_comprobante());	
				novedadseguimientoAux.setfecha_novedad(this.novedadseguimiento.getfecha_novedad());	
				novedadseguimientoAux.setfecha_seguimiento(this.novedadseguimiento.getfecha_seguimiento());	
				novedadseguimientoAux.setdescripcion(this.novedadseguimiento.getdescripcion());	
				novedadseguimientoAux.setid_estado_novedad_seguimiento(this.novedadseguimiento.getid_estado_novedad_seguimiento());	
				
				if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.novedadseguimientoAux.getId()>=0) {	
						this.novedadseguimientosEliminados.add(novedadseguimientoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadseguimientoAux,novedadseguimientos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.saveNovedadSeguimientos();//WithConnection
						//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadseguimientoLogic.saveNovedadSeguimientoRelaciones(novedadseguimientoAux);//WithConnection
								//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
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
							if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(novedadseguimientoAux,novedadseguimientoLogic.getNovedadSeguimientos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(novedadseguimientoAux,novedadseguimientos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNovedadSeguimientos().addAll(this.novedadseguimientosEliminados);
					
					novedadseguimientoLogic.saveNovedadSeguimientos();//WithConnection
					//novedadseguimientoLogic.getSetVersionRowNovedadSeguimientos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNovedadSeguimiento();
				
				this.novedadseguimientosEliminados= new ArrayList<NovedadSeguimiento>();		
			}
			
			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Novedad Seguimiento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.novedadseguimiento=novedadseguimientoAux;
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
      		//this.finishProcessNovedadSeguimiento();
      	}
		
	}	
	
	public void actualizarRelaciones(NovedadSeguimiento novedadseguimientoLocal) throws Exception {
		
		if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NovedadSeguimiento novedadseguimientoLocal) throws Exception {	
		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				novedadseguimientoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				novedadseguimientoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleMovimientoInventarioDetalleFormJInternalFrame.class)) {
				DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrameLocal=(DetalleMovimientoInventarioBeanSwingJInternalFrame) ((DetalleMovimientoInventarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallemovimientoinventarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrameLocal.getdetallemovimientoinventario(),true);
				detallemovimientoinventarioBeanSwingJInternalFrameLocal.actualizarLista(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario,this.detallemovimientoinventariosForeignKey);

				detallemovimientoinventarioBeanSwingJInternalFrameLocal.actualizarRelaciones(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario);

				novedadseguimientoLocal.setDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario);

				this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
				this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Formulario");
				this.setActualDetalleMovimientoInventarioForeignKey(detallemovimientoinventarioBeanSwingJInternalFrameLocal.detallemovimientoinventario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NovedadProductoDetalleFormJInternalFrame.class)) {
				NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrameLocal=(NovedadProductoBeanSwingJInternalFrame) ((NovedadProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				novedadproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNovedadProducto(novedadproductoBeanSwingJInternalFrameLocal.getnovedadproducto(),true);
				novedadproductoBeanSwingJInternalFrameLocal.actualizarLista(novedadproductoBeanSwingJInternalFrameLocal.novedadproducto,this.novedadproductosForeignKey);

				novedadproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(novedadproductoBeanSwingJInternalFrameLocal.novedadproducto);

				novedadseguimientoLocal.setNovedadProducto(novedadproductoBeanSwingJInternalFrameLocal.novedadproducto);

				this.addItemDefectoCombosForeignKeyNovedadProducto();
				this.cargarCombosFrameNovedadProductosForeignKey("Formulario");
				this.setActualNovedadProductoForeignKey(novedadproductoBeanSwingJInternalFrameLocal.novedadproducto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoNovedadSeguimientoDetalleFormJInternalFrame.class)) {
				EstadoNovedadSeguimientoBeanSwingJInternalFrame estadonovedadseguimientoBeanSwingJInternalFrameLocal=(EstadoNovedadSeguimientoBeanSwingJInternalFrame) ((EstadoNovedadSeguimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadonovedadseguimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoNovedadSeguimiento(estadonovedadseguimientoBeanSwingJInternalFrameLocal.getestadonovedadseguimiento(),true);
				estadonovedadseguimientoBeanSwingJInternalFrameLocal.actualizarLista(estadonovedadseguimientoBeanSwingJInternalFrameLocal.estadonovedadseguimiento,this.estadonovedadseguimientosForeignKey);

				estadonovedadseguimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadonovedadseguimientoBeanSwingJInternalFrameLocal.estadonovedadseguimiento);

				novedadseguimientoLocal.setEstadoNovedadSeguimiento(estadonovedadseguimientoBeanSwingJInternalFrameLocal.estadonovedadseguimiento);

				this.addItemDefectoCombosForeignKeyEstadoNovedadSeguimiento();
				this.cargarCombosFrameEstadoNovedadSeguimientosForeignKey("Formulario");
				this.setActualEstadoNovedadSeguimientoForeignKey(estadonovedadseguimientoBeanSwingJInternalFrameLocal.estadonovedadseguimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNovedadSeguimientoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = novedadseguimientoValidator.getInvalidValues(this.novedadseguimiento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NovedadSeguimiento novedadseguimiento,List<NovedadSeguimiento> novedadseguimientos) throws Exception {
		try	{		
			NovedadSeguimientoConstantesFunciones.actualizarLista(novedadseguimiento,novedadseguimientos,this.novedadseguimientoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NovedadSeguimiento novedadseguimiento,List<NovedadSeguimiento> novedadseguimientos) throws Exception {
		try	{			
			NovedadSeguimientoConstantesFunciones.actualizarSelectedLista(novedadseguimiento,novedadseguimientos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NovedadSeguimiento> novedadseguimientosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				novedadseguimientosLocal=this.novedadseguimientoLogic.getNovedadSeguimientos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				novedadseguimientosLocal=this.novedadseguimientos;
			}
			//ARCHITECTURE
		
			for(NovedadSeguimiento novedadseguimientoLocal:novedadseguimientosLocal) {
				if(this.permiteMantenimiento(novedadseguimientoLocal) && novedadseguimientoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NovedadSeguimientoConstantesFunciones.getNovedadSeguimientoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_empresaNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_sucursalNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.IDDETALLEMOVIMIENTOINVENTARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.IDNOVEDADPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_novedad_productoNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelnumero_comprobanteNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.FECHANOVEDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_novedadNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.FECHASEGUIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_seguimientoNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabeldescripcionNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadSeguimientoConstantesFunciones.IDESTADONOVEDADSEGUIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_estado_novedad_seguimientoNovedadSeguimiento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_empresaNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_sucursalNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_novedad_productoNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelnumero_comprobanteNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_novedadNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_seguimientoNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabeldescripcionNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelid_estado_novedad_seguimientoNovedadSeguimiento,"");
		
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
		this.iIdNuevoNovedadSeguimiento--;	
		
		
		this.novedadseguimientoAux=new NovedadSeguimiento();
		
		this.novedadseguimientoAux.setId(this.iIdNuevoNovedadSeguimiento);
		this.novedadseguimientoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadseguimientoLogic.getNovedadSeguimientos().add(this.novedadseguimientoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.novedadseguimientos.add(this.novedadseguimientoAux);
		}
		//ARCHITECTURE
		
		this.novedadseguimiento=this.novedadseguimientoAux;
		
		if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimiento);
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadSeguimiento(this.novedadseguimiento);
		}
				
		//this.setDefaultControlesNovedadSeguimiento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNovedadSeguimiento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNovedadSeguimiento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadSeguimiento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadSeguimiento(this.novedadseguimientoBean,this.novedadseguimiento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
			classes=NovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.novedadseguimientoReturnGeneral=novedadseguimientoLogic.procesarEventosNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadseguimientoLogic.getNovedadSeguimientos(),this.novedadseguimiento,this.novedadseguimientoParameterGeneral,this.isEsNuevoNovedadSeguimiento,classes);//this.novedadseguimientoLogic.getNovedadSeguimiento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNovedadSeguimiento(this.novedadseguimientoReturnGeneral,this.novedadseguimientoBean,false);
		
		if(this.novedadseguimientoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento());
		}
		
		if(this.novedadseguimientoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento(),classes);//this.novedadseguimientoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNovedadSeguimiento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNovedadSeguimiento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.RecargarFormNovedadSeguimiento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNovedadSeguimiento(false);
						
			if(novedadseguimientoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadSeguimiento();
			}
			
			this.actualizarVisualTableDatosNovedadSeguimiento();
			
			this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoNovedadSeguimiento(), this.getIndiceNuevoNovedadSeguimiento());
			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
						
			this.actualizarEstadoCeldasBotonesNovedadSeguimiento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNovedadSeguimiento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarnumero_comprobanteNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarfecha_novedadNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarfecha_seguimientoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activardescripcionNovedadSeguimiento);	
		//
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarid_empresaNovedadSeguimiento);//
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarid_sucursalNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarid_detalle_movimiento_inventarioNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarid_novedad_productoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setEnabled(isHabilitar && this.novedadseguimientoConstantesFunciones.activarid_estado_novedad_seguimientoNovedadSeguimiento);
	};
	
	public void setDefaultControlesNovedadSeguimiento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNovedadSeguimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.novedadseguimientoSessionBean.setConGuardarRelaciones(true);			
			this.novedadseguimientoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.setVisible(true);
			
					
		} else {
			//this.novedadseguimientoSessionBean.setConGuardarRelaciones(false);			
			this.novedadseguimientoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNovedadSeguimiento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
				if(novedadseguimientoAux.getId().equals(this.iIdNuevoNovedadSeguimiento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientos) {
				if(novedadseguimientoAux.getId().equals(this.iIdNuevoNovedadSeguimiento)) {
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
	
	public int getIndiceActualNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
				if(novedadseguimientoAux.getId().equals(novedadseguimiento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientos) {
				if(novedadseguimientoAux.getId().equals(novedadseguimiento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNovedadSeguimiento(NovedadSeguimiento novedadseguimientoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
				if(novedadseguimientoAux.getNovedadSeguimientoOriginal().getId().equals(novedadseguimientoOriginal.getId())) {
					existe=true;
					novedadseguimientoOriginal.setId(novedadseguimientoAux.getId());
					novedadseguimientoOriginal.setVersionRow(novedadseguimientoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientos) {
				if(novedadseguimientoAux.getNovedadSeguimientoOriginal().getId().equals(novedadseguimientoOriginal.getId())) {
					existe=true;
					novedadseguimientoOriginal.setId(novedadseguimientoAux.getId());
					novedadseguimientoOriginal.setVersionRow(novedadseguimientoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNovedadSeguimiento(Boolean esParaCancelar) throws Exception {
		novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
		novedadseguimientoAux=new NovedadSeguimiento();
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
					if(novedadseguimientoAux.getId()<0) {
						novedadseguimientosAux.add(novedadseguimientoAux);
					}		
				}
				this.iIdNuevoNovedadSeguimiento=0L;
				this.novedadseguimientoLogic.getNovedadSeguimientos().removeAll(novedadseguimientosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientos) {
					if(novedadseguimientoAux.getId()<0) {
						novedadseguimientosAux.add(novedadseguimientoAux);
					}		
				}
				this.iIdNuevoNovedadSeguimiento=0L;
				this.novedadseguimientos.removeAll(novedadseguimientosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNovedadSeguimiento 
					&& this.novedadseguimientoLogic.getNovedadSeguimientos().size()>0
					) {
					novedadseguimientoAux=this.novedadseguimientoLogic.getNovedadSeguimientos().get(this.novedadseguimientoLogic.getNovedadSeguimientos().size() - 1);
				
					if(novedadseguimientoAux.getId()<0) {
						this.novedadseguimientoLogic.getNovedadSeguimientos().remove(novedadseguimientoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNovedadSeguimiento && this.novedadseguimientos.size()>0) {
					novedadseguimientoAux=this.novedadseguimientos.get(this.novedadseguimientos.size() - 1);
				
					if(novedadseguimientoAux.getId()<0) {
						this.novedadseguimientos.remove(novedadseguimientoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNovedadSeguimiento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(novedadseguimiento.getId()<0) {
				this.novedadseguimientoLogic.getNovedadSeguimientos().remove(this.novedadseguimiento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(novedadseguimiento.getId()<0) {
				this.novedadseguimientos.remove(this.novedadseguimiento);
			}
		}			
	}
	
	public void setEstadosInicialesNovedadSeguimiento(List<NovedadSeguimiento> novedadseguimientosAux) throws Exception {
		NovedadSeguimientoConstantesFunciones.setEstadosInicialesNovedadSeguimiento(novedadseguimientosAux);
	}
	
	public void setEstadosInicialesNovedadSeguimiento(NovedadSeguimiento novedadseguimientoAux) throws Exception {
		NovedadSeguimientoConstantesFunciones.setEstadosInicialesNovedadSeguimiento(novedadseguimientoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNovedadSeguimientoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNovedadSeguimientoActual()) {
				if(!this.isEsNuevoNovedadSeguimiento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNovedadSeguimiento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNovedadSeguimientoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Novedad Seguimiento ?", "MANTENIMIENTO DE Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NovedadSeguimiento novedadseguimiento) throws Exception {
		NovedadSeguimientoConstantesFunciones.seleccionarAsignar(this.novedadseguimiento,novedadseguimiento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNovedadSeguimiento=this.isPermisoActualizarOriginalNovedadSeguimiento;
			
			
			this.seleccionarAsignar(novedadseguimiento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadSeguimientoConstantesFunciones.quitarEspaciosNovedadSeguimiento(this.novedadseguimiento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.novedadseguimientoSessionBean.setsFuncionBusquedaRapida(this.novedadseguimientoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNovedadSeguimiento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNovedadSeguimiento(esParaCancelar);				
				this.cancelarNuevoNovedadSeguimiento(esParaCancelar);								
			}
			
			this.novedadseguimiento=new NovedadSeguimiento();
			
			this.inicializarNovedadSeguimiento();
			
			this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNovedadSeguimiento() throws Exception {
		try {
			NovedadSeguimientoConstantesFunciones.inicializarNovedadSeguimiento(this.novedadseguimiento);
			
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
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.novedadseguimientoLogic.getNovedadSeguimientos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNovedadSeguimientos(String sAccionBusqueda,List<NovedadSeguimiento> novedadseguimientosParaReportes) throws Exception {
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
					sPathReporteFinal="NovedadSeguimiento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NovedadSeguimientoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NovedadSeguimientoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NovedadSeguimiento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Novedad Seguimientoes");		
		parameters.put("busquedapor", NovedadSeguimientoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNovedadSeguimiento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNovedadSeguimiento=new JRBeanArrayDataSource(NovedadSeguimientoJInternalFrame.TraerNovedadSeguimientoBeans(novedadseguimientosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNovedadSeguimiento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NovedadSeguimientoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NovedadSeguimientoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NovedadSeguimientoBean.TraerNovedadSeguimientoBeans(novedadseguimientosParaReportes).toArray()));
							
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
				this.generarExcelReporteNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNovedadSeguimientoActionPerformed(null);
					//this.generarExcelReporteNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,novedadseguimientosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadSeguimiento> novedadseguimientosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadSeguimientos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadSeguimiento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NovedadSeguimiento novedadseguimiento : novedadseguimientosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NovedadSeguimientoConstantesFunciones.generarExcelReporteDataNovedadSeguimiento("NORMAL",row,workbook,novedadseguimiento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNovedadSeguimiento(String sTipo,Row row,Workbook workbook) {
		
		NovedadSeguimientoConstantesFunciones.generarExcelReporteHeaderNovedadSeguimiento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadSeguimiento> novedadseguimientosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadSeguimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NovedadSeguimiento novedadseguimiento : novedadseguimientosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NovedadSeguimientoConstantesFunciones.getNovedadSeguimientoDescripcion(novedadseguimiento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getdetallemovimientoinventario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getnovedadproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getfecha_novedad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getfecha_seguimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadseguimiento.getestadonovedadseguimiento_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadSeguimiento> novedadseguimientosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NovedadSeguimiento> novedadseguimientosRespaldo=null;
		
		classes=NovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.novedadseguimientoLogic.setDatosCliente(this.datosCliente);
		this.novedadseguimientoLogic.setDatosDeep(this.datosDeep);
		this.novedadseguimientoLogic.setIsConDeep(true);
		
		novedadseguimientosRespaldo=this.novedadseguimientoLogic.getNovedadSeguimientos();
		
		this.novedadseguimientoLogic.setNovedadSeguimientos(novedadseguimientosParaReportes);	
		this.novedadseguimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		novedadseguimientosParaReportes=this.novedadseguimientoLogic.getNovedadSeguimientos();
		this.novedadseguimientoLogic.setNovedadSeguimientos(novedadseguimientosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadSeguimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadSeguimiento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NovedadSeguimiento novedadseguimiento : novedadseguimientosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNovedadSeguimiento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NovedadSeguimientoConstantesFunciones.generarExcelReporteDataNovedadSeguimiento("NORMAL",row,workbook,novedadseguimiento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NovedadSeguimientoConstantesFunciones.getNovedadSeguimientoDescripcion(novedadseguimiento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNovedadSeguimiento() throws Exception {		
		this.startProcessNovedadSeguimiento(true);
	}
	
	public void startProcessNovedadSeguimiento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNovedadSeguimiento ,this.jPanelParametrosReportesNovedadSeguimiento, this.jScrollPanelDatosNovedadSeguimiento,this.jPanelPaginacionNovedadSeguimiento, this.jScrollPanelDatosEdicionNovedadSeguimiento, this.jPanelAccionesNovedadSeguimiento,this.jPanelAccionesFormularioNovedadSeguimiento,this.jmenuBarNovedadSeguimiento,this.jmenuBarDetalleNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadSeguimiento=this.jTabbedPaneBusquedasNovedadSeguimiento; 
		
		final JPanel jPanelParametrosReportesNovedadSeguimiento=this.jPanelParametrosReportesNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosNovedadSeguimiento=this.jScrollPanelDatosNovedadSeguimiento;
		final JTable jTableDatosNovedadSeguimiento=this.jTableDatosNovedadSeguimiento;		
		final JPanel jPanelPaginacionNovedadSeguimiento=this.jPanelPaginacionNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEdicionNovedadSeguimiento=this.jScrollPanelDatosEdicionNovedadSeguimiento;
		final JPanel jPanelAccionesNovedadSeguimiento=this.jPanelAccionesNovedadSeguimiento;
		
		JPanel jPanelCamposAuxiliarNovedadSeguimiento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNovedadSeguimiento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			jPanelCamposAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelCamposNovedadSeguimiento;
			jPanelAccionesFormularioAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelAccionesFormularioNovedadSeguimiento;
		}
		
		final JPanel jPanelCamposNovedadSeguimiento=jPanelCamposAuxiliarNovedadSeguimiento;
		final JPanel jPanelAccionesFormularioNovedadSeguimiento=jPanelAccionesFormularioAuxiliarNovedadSeguimiento;
		
		
		final JMenuBar jmenuBarNovedadSeguimiento=this.jmenuBarNovedadSeguimiento;
		final JToolBar jTtoolBarNovedadSeguimiento=this.jTtoolBarNovedadSeguimiento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNovedadSeguimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadSeguimiento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			jmenuBarDetalleAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jmenuBarDetalleNovedadSeguimiento;
			jTtoolBarDetalleAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jTtoolBarDetalleNovedadSeguimiento;
		}
		
		final JMenuBar jmenuBarDetalleNovedadSeguimiento=jmenuBarDetalleAuxiliarNovedadSeguimiento;
		final JToolBar jTtoolBarDetalleNovedadSeguimiento=jTtoolBarDetalleAuxiliarNovedadSeguimiento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadSeguimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadSeguimiento;
			processRunnable.jTableDatos=jTableDatosNovedadSeguimiento;
			processRunnable.jPanelCampos=jPanelCamposNovedadSeguimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadSeguimiento;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadSeguimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadSeguimiento;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadSeguimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadSeguimiento;
			processRunnable.jTtoolBar=jTtoolBarNovedadSeguimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadSeguimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadSeguimiento ,jPanelParametrosReportesNovedadSeguimiento,jTableDatosNovedadSeguimiento, /*jScrollPanelDatosNovedadSeguimiento,*/jPanelCamposNovedadSeguimiento,jPanelPaginacionNovedadSeguimiento, /*jScrollPanelDatosEdicionNovedadSeguimiento,*/ jPanelAccionesNovedadSeguimiento,jPanelAccionesFormularioNovedadSeguimiento,jmenuBarNovedadSeguimiento,jmenuBarDetalleNovedadSeguimiento,jTtoolBarNovedadSeguimiento,jTtoolBarDetalleNovedadSeguimiento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadSeguimiento ,jPanelParametrosReportesNovedadSeguimiento, jScrollPanelDatosNovedadSeguimiento,jPanelPaginacionNovedadSeguimiento, jScrollPanelDatosEdicionNovedadSeguimiento, jPanelAccionesNovedadSeguimiento,jPanelAccionesFormularioNovedadSeguimiento,jmenuBarNovedadSeguimiento,jmenuBarDetalleNovedadSeguimiento,jTtoolBarNovedadSeguimiento,jTtoolBarDetalleNovedadSeguimiento);
						
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
	
	public void finishProcessNovedadSeguimiento() {// throws Exception 
		this.finishProcessNovedadSeguimiento(true);
	}
	
	public void finishProcessNovedadSeguimiento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNovedadSeguimiento ,this.jPanelParametrosReportesNovedadSeguimiento, this.jScrollPanelDatosNovedadSeguimiento,this.jPanelPaginacionNovedadSeguimiento, this.jScrollPanelDatosEdicionNovedadSeguimiento, this.jPanelAccionesNovedadSeguimiento,this.jPanelAccionesFormularioNovedadSeguimiento,this.jmenuBarNovedadSeguimiento,this.jmenuBarDetalleNovedadSeguimiento,this.jTtoolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadSeguimiento=this.jTabbedPaneBusquedasNovedadSeguimiento; 
		
		final JPanel jPanelParametrosReportesNovedadSeguimiento=this.jPanelParametrosReportesNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosNovedadSeguimiento=this.jScrollPanelDatosNovedadSeguimiento;
		final JTable jTableDatosNovedadSeguimiento=this.jTableDatosNovedadSeguimiento;		
		final JPanel jPanelPaginacionNovedadSeguimiento=this.jPanelPaginacionNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEdicionNovedadSeguimiento=this.jScrollPanelDatosEdicionNovedadSeguimiento;
		final JPanel jPanelAccionesNovedadSeguimiento=this.jPanelAccionesNovedadSeguimiento;
		
		JPanel jPanelCamposAuxiliarNovedadSeguimiento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNovedadSeguimiento=new JPanel();
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			jPanelCamposAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelCamposNovedadSeguimiento;
			jPanelAccionesFormularioAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelAccionesFormularioNovedadSeguimiento;
		}
		
		final JPanel jPanelCamposNovedadSeguimiento=jPanelCamposAuxiliarNovedadSeguimiento;
		final JPanel jPanelAccionesFormularioNovedadSeguimiento=jPanelAccionesFormularioAuxiliarNovedadSeguimiento;
		
		
		final JMenuBar jmenuBarNovedadSeguimiento=this.jmenuBarNovedadSeguimiento;		
		final JToolBar jTtoolBarNovedadSeguimiento=this.jTtoolBarNovedadSeguimiento;
				
		JMenuBar jmenuBarDetalleAuxiliarNovedadSeguimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadSeguimiento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			jmenuBarDetalleAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jmenuBarDetalleNovedadSeguimiento;
			jTtoolBarDetalleAuxiliarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jTtoolBarDetalleNovedadSeguimiento;		
		}
		
		final JMenuBar jmenuBarDetalleNovedadSeguimiento=jmenuBarDetalleAuxiliarNovedadSeguimiento;
		final JToolBar jTtoolBarDetalleNovedadSeguimiento=jTtoolBarDetalleAuxiliarNovedadSeguimiento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadSeguimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadSeguimiento;
			processRunnable.jTableDatos=jTableDatosNovedadSeguimiento;
			processRunnable.jPanelCampos=jPanelCamposNovedadSeguimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadSeguimiento;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadSeguimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadSeguimiento;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadSeguimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadSeguimiento;
			processRunnable.jTtoolBar=jTtoolBarNovedadSeguimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadSeguimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNovedadSeguimiento ,jPanelParametrosReportesNovedadSeguimiento, jTableDatosNovedadSeguimiento,/*jScrollPanelDatosNovedadSeguimiento,*/jPanelCamposNovedadSeguimiento,jPanelPaginacionNovedadSeguimiento, /*jScrollPanelDatosEdicionNovedadSeguimiento,*/ jPanelAccionesNovedadSeguimiento,jPanelAccionesFormularioNovedadSeguimiento,jmenuBarNovedadSeguimiento,jmenuBarDetalleNovedadSeguimiento,jTtoolBarNovedadSeguimiento,jTtoolBarDetalleNovedadSeguimiento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNovedadSeguimiento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNovedadSeguimiento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNovedadSeguimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNovedadSeguimiento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNovedadSeguimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNovedadSeguimiento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.novedadseguimientoConstantesFunciones.getsFinalQueryNovedadSeguimiento();
		String  finalQueryPaginacionTodos=this.novedadseguimientoConstantesFunciones.getsFinalQueryNovedadSeguimiento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesNoNovedadSeguimiento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesNovedadSeguimiento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NovedadSeguimientoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.novedadseguimientosEliminados= new ArrayList<NovedadSeguimiento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNovedadSeguimiento();
		
				///*NovedadSeguimientoSessionBean*/this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			
			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
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
					this.iNumeroPaginacion=NovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NovedadSeguimientoConstantesFunciones.getClassesForeignKeysOfNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/novedadseguimiento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			novedadseguimientosAux= new ArrayList<NovedadSeguimiento>();
			
				
			novedadseguimientoLogic.setDatosCliente(this.datosCliente);
			novedadseguimientoLogic.setDatosDeep(this.datosDeep);
			novedadseguimientoLogic.setIsConDeep(true);
			
			
			novedadseguimientoLogic.getNovedadSeguimientoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					novedadseguimientoLogic.getTodosNovedadSeguimientos(finalQueryGlobal,pagination);
					
					//novedadseguimientoLogic.getTodosNovedadSeguimientosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(novedadseguimientoLogic.getNovedadSeguimientos()==null|| novedadseguimientoLogic.getNovedadSeguimientos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadseguimientosAux= new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux= new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadseguimientoLogic.getTodosNovedadSeguimientos(finalQueryGlobal+"",this.pagination);												
							
							//novedadseguimientoLogic.getTodosNovedadSeguimientosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNovedadSeguimientos("Todos",novedadseguimientoLogic.getNovedadSeguimientos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());					
							novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNovedadSeguimiento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNovedadSeguimiento=this.idActual;
				
				} else if(this.idNovedadSeguimientoActual!=null && this.idNovedadSeguimientoActual!=0L) {
					idNovedadSeguimiento=idNovedadSeguimientoActual;
				}
				
					
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndicePorId(idNovedadSeguimiento);
				
				this.novedadseguimientos=new ArrayList<NovedadSeguimiento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					novedadseguimientoLogic.getEntity(idNovedadSeguimiento);
					
					//novedadseguimientoLogic.getEntityWithConnection(idNovedadSeguimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
					novedadseguimientoLogic.getNovedadSeguimientos().add(novedadseguimientoLogic.getNovedadSeguimiento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimientos=new ArrayList<NovedadSeguimiento>();
					this.novedadseguimientos.add(novedadseguimiento);
				}
				
				if(novedadseguimientoLogic.getNovedadSeguimiento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDetalleMovimientoInventario")) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadseguimientoLogic.getNovedadSeguimientosFK_IdDetalleMovimientoInventario(finalQueryGlobal,pagination,id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos()==null||novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadseguimientos==null|| novedadseguimientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
						novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadseguimientoLogic.getNovedadSeguimientosFK_IdDetalleMovimientoInventario(finalQueryGlobal,pagination,id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdDetalleMovimientoInventario(id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadSeguimientos("FK_IdDetalleMovimientoInventario",novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadSeguimientos("FK_IdDetalleMovimientoInventario",novedadseguimientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
						novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadseguimientoLogic.getNovedadSeguimientosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos()==null||novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadseguimientos==null|| novedadseguimientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
						novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadseguimientoLogic.getNovedadSeguimientosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadSeguimientos("FK_IdEmpresa",novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadSeguimientos("FK_IdEmpresa",novedadseguimientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
						novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoNovedadSeguimiento")) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadSeguimiento(id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadseguimientoLogic.getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento(finalQueryGlobal,pagination,id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadSeguimiento(id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadSeguimiento(id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos()==null||novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadseguimientos==null|| novedadseguimientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
						novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadseguimientoLogic.getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento(finalQueryGlobal,pagination,id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadSeguimiento(id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadSeguimiento(id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadSeguimientos("FK_IdEstadoNovedadSeguimiento",novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadSeguimientos("FK_IdEstadoNovedadSeguimiento",novedadseguimientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
						novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdNovedadProducto")) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdNovedadProducto(id_novedad_productoFK_IdNovedadProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadseguimientoLogic.getNovedadSeguimientosFK_IdNovedadProducto(finalQueryGlobal,pagination,id_novedad_productoFK_IdNovedadProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdNovedadProducto(id_novedad_productoFK_IdNovedadProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdNovedadProducto(id_novedad_productoFK_IdNovedadProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos()==null||novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadseguimientos==null|| novedadseguimientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
						novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadseguimientoLogic.getNovedadSeguimientosFK_IdNovedadProducto(finalQueryGlobal,pagination,id_novedad_productoFK_IdNovedadProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdNovedadProducto(id_novedad_productoFK_IdNovedadProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdNovedadProducto(id_novedad_productoFK_IdNovedadProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadSeguimientos("FK_IdNovedadProducto",novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadSeguimientos("FK_IdNovedadProducto",novedadseguimientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
						novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadseguimientoLogic.getNovedadSeguimientosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos()==null||novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadseguimientos==null|| novedadseguimientos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
						novedadseguimientosAux.addAll(novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientosAux=new ArrayList<NovedadSeguimiento>();
							novedadseguimientosAux.addAll(novedadseguimientos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadseguimientoLogic.getNovedadSeguimientosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadSeguimientoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadSeguimientos("FK_IdSucursal",novedadseguimientoLogic.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadSeguimientos("FK_IdSucursal",novedadseguimientos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
						novedadseguimientoLogic.getNovedadSeguimientos().addAll(novedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientos=new ArrayList<NovedadSeguimiento>();
							novedadseguimientos.addAll(novedadseguimientosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNovedadSeguimiento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNovedadSeguimiento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadseguimientoLogic.getNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadseguimientos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadseguimientoLogic.getNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadseguimientos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NovedadSeguimiento novedadseguimiento) {
		Boolean permite=true;
		
		if(this.novedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NovedadSeguimientoConstantesFunciones.getOrderByListaNovedadSeguimiento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NovedadSeguimientoConstantesFunciones.getOrderByListaNovedadSeguimiento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadSeguimiento novedadseguimiento:novedadseguimientoLogic.getNovedadSeguimientos()) {
				if(novedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					novedadseguimientoTotales=novedadseguimiento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadSeguimiento novedadseguimiento:this.novedadseguimientos) {
				if(novedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					novedadseguimientoTotales=novedadseguimiento;
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
			this.novedadseguimientoAux=new NovedadSeguimiento();
			this.novedadseguimientoAux.setsType(Constantes2.S_TOTALES);
			this.novedadseguimientoAux.setIsNew(false);
			this.novedadseguimientoAux.setIsChanged(false);
			this.novedadseguimientoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NovedadSeguimientoConstantesFunciones.TotalizarValoresFilaNovedadSeguimiento(this.novedadseguimientoLogic.getNovedadSeguimientos(),this.novedadseguimientoAux);
				
				this.novedadseguimientoLogic.getNovedadSeguimientos().add(this.novedadseguimientoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NovedadSeguimientoConstantesFunciones.TotalizarValoresFilaNovedadSeguimiento(this.novedadseguimientos,this.novedadseguimientoAux);
				
				this.novedadseguimientos.add(this.novedadseguimientoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		novedadseguimientoTotales=new NovedadSeguimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadseguimientoLogic.getNovedadSeguimientos().remove(novedadseguimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadseguimientos.remove(novedadseguimientoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		novedadseguimientoTotales=new NovedadSeguimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadSeguimiento novedadseguimiento:novedadseguimientoLogic.getNovedadSeguimientos()) {
				if(novedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					novedadseguimientoTotales=novedadseguimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadSeguimientoConstantesFunciones.TotalizarValoresFilaNovedadSeguimiento(this.novedadseguimientoLogic.getNovedadSeguimientos(),novedadseguimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadSeguimiento novedadseguimiento:this.novedadseguimientos) {
				if(novedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					novedadseguimientoTotales=novedadseguimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadSeguimientoConstantesFunciones.TotalizarValoresFilaNovedadSeguimiento(this.novedadseguimientos,novedadseguimientoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNovedadSeguimientosFK_IdDetalleMovimientoInventario()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleMovimientoInventario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadSeguimientosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoNovedadSeguimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadSeguimientosFK_IdNovedadProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdNovedadProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadSeguimientosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNovedadSeguimientosFK_IdDetalleMovimientoInventario(String sFinalQuery,Long id_detalle_movimiento_inventario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.getNovedadSeguimientosFK_IdDetalleMovimientoInventario(sFinalQuery,this.pagination,id_detalle_movimiento_inventario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadSeguimientosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.getNovedadSeguimientosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento(String sFinalQuery,Long id_estado_novedad_seguimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento(sFinalQuery,this.pagination,id_estado_novedad_seguimiento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadSeguimientosFK_IdNovedadProducto(String sFinalQuery,Long id_novedad_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.getNovedadSeguimientosFK_IdNovedadProducto(sFinalQuery,this.pagination,id_novedad_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadSeguimientosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLogic.getNovedadSeguimientosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosNovedadSeguimiento() {
		this.isPermisoTodoNovedadSeguimiento=false;
		this.isPermisoNuevoNovedadSeguimiento=false;
		this.isPermisoActualizarNovedadSeguimiento=false;
		this.isPermisoActualizarOriginalNovedadSeguimiento=false;
		this.isPermisoEliminarNovedadSeguimiento=false;
		this.isPermisoGuardarCambiosNovedadSeguimiento=false;
		this.isPermisoConsultaNovedadSeguimiento=false;
		this.isPermisoBusquedaNovedadSeguimiento=false;
		this.isPermisoReporteNovedadSeguimiento=false;		
		this.isPermisoOrdenNovedadSeguimiento=false;		
		this.isPermisoPaginacionMedioNovedadSeguimiento=false;		
		this.isPermisoPaginacionAltoNovedadSeguimiento=false;
		this.isPermisoPaginacionTodoNovedadSeguimiento=false;
		this.isPermisoCopiarNovedadSeguimiento=false;		
		this.isPermisoVerFormNovedadSeguimiento=false;		
		this.isPermisoDuplicarNovedadSeguimiento=false;		
		this.isPermisoOrdenNovedadSeguimiento=false;		
	}
	
	public void setPermisosUsuarioNovedadSeguimiento(Boolean isPermiso) {
		this.isPermisoTodoNovedadSeguimiento=isPermiso;
		this.isPermisoNuevoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarOriginalNovedadSeguimiento=isPermiso;
		this.isPermisoEliminarNovedadSeguimiento=isPermiso;
		this.isPermisoGuardarCambiosNovedadSeguimiento=isPermiso;
		this.isPermisoConsultaNovedadSeguimiento=isPermiso;
		this.isPermisoBusquedaNovedadSeguimiento=isPermiso;
		this.isPermisoReporteNovedadSeguimiento=isPermiso;
		this.isPermisoOrdenNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionMedioNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionAltoNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionTodoNovedadSeguimiento=isPermiso;		
		this.isPermisoCopiarNovedadSeguimiento=isPermiso;		
		this.isPermisoVerFormNovedadSeguimiento=isPermiso;		
		this.isPermisoDuplicarNovedadSeguimiento=isPermiso;
		this.isPermisoOrdenNovedadSeguimiento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNovedadSeguimiento(Boolean isPermiso) {
		//this.isPermisoTodoNovedadSeguimiento=isPermiso;
		this.isPermisoNuevoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarOriginalNovedadSeguimiento=isPermiso;
		this.isPermisoEliminarNovedadSeguimiento=isPermiso;
		this.isPermisoGuardarCambiosNovedadSeguimiento=isPermiso;
		//this.isPermisoConsultaNovedadSeguimiento=isPermiso;
		//this.isPermisoBusquedaNovedadSeguimiento=isPermiso;
		//this.isPermisoReporteNovedadSeguimiento=isPermiso;
		//this.isPermisoOrdenNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionMedioNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionAltoNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionTodoNovedadSeguimiento=isPermiso;		
		//this.isPermisoCopiarNovedadSeguimiento=isPermiso;		
		//this.isPermisoDuplicarNovedadSeguimiento=isPermiso;
		//this.isPermisoOrdenNovedadSeguimiento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNovedadSeguimientoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNovedadSeguimientoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNovedadSeguimientoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNovedadSeguimientoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNovedadSeguimientoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNovedadSeguimiento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NovedadSeguimientoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNovedadSeguimiento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNovedadSeguimiento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNovedadSeguimiento=this.isPermisoActualizarNovedadSeguimiento;
			this.isPermisoEliminarNovedadSeguimiento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNovedadSeguimiento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNovedadSeguimiento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNovedadSeguimiento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNovedadSeguimiento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNovedadSeguimiento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadSeguimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNovedadSeguimiento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNovedadSeguimiento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNovedadSeguimiento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadSeguimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNovedadSeguimiento.setToolTipText(this.jTableDatosNovedadSeguimiento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNovedadSeguimiento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNovedadSeguimiento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNovedadSeguimiento() throws Exception {
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
	public void inicializarCombosForeignKeyNovedadSeguimientoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detallemovimientoinventariosForeignKey=new ArrayList();
				this.novedadproductosForeignKey=new ArrayList();
				this.estadonovedadseguimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNovedadSeguimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NovedadSeguimientoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNovedadSeguimientoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleMovimientoInventarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNovedadProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoNovedadSeguimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleMovimientoInventarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detallemovimientoinventariosForeignKey==null||this.detallemovimientoinventariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesDetalleMovimientoInventario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleMovimientoInventarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleMovimientoInventarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNovedadProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.novedadproductosForeignKey==null||this.novedadproductosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NovedadProductoConstantesFunciones.getArrayColumnasGlobalesNovedadProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NovedadProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NovedadProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosNovedadProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoNovedadSeguimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadonovedadseguimientosForeignKey==null||this.estadonovedadseguimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoNovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadSeguimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoNovedadSeguimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoNovedadSeguimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoNovedadSeguimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyNovedadSeguimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NovedadSeguimientoParameterReturnGeneral novedadseguimientoReturnGeneral=new NovedadSeguimientoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.novedadseguimientoConstantesFunciones.cargarid_empresaNovedadSeguimiento)
					 || (this.esRecargarFks && this.novedadseguimientoConstantesFunciones.cargarid_empresaNovedadSeguimiento)) {

					if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+novedadseguimientoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.novedadseguimientoConstantesFunciones.cargarid_sucursalNovedadSeguimiento)
					 || (this.esRecargarFks && this.novedadseguimientoConstantesFunciones.cargarid_sucursalNovedadSeguimiento)) {

					if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+novedadseguimientoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleMovimientoInventario="";

				if(((this.detallemovimientoinventariosForeignKey==null||this.detallemovimientoinventariosForeignKey.size()<=0) && this.novedadseguimientoConstantesFunciones.cargarid_detalle_movimiento_inventarioNovedadSeguimiento)
					 || (this.esRecargarFks && this.novedadseguimientoConstantesFunciones.cargarid_detalle_movimiento_inventarioNovedadSeguimiento)) {

					if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleMovimientoInventarioConstantesFunciones.getArrayColumnasGlobalesDetalleMovimientoInventario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleMovimientoInventario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleMovimientoInventarioConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleMovimientoInventario=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleMovimientoInventario, "");
						finalQueryGlobalDetalleMovimientoInventario+=DetalleMovimientoInventarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleMovimientoInventario=" WHERE " + ConstantesSql.ID + "="+novedadseguimientoSessionBean.getlidDetalleMovimientoInventarioActual();
					}
				} else {
					finalQueryGlobalDetalleMovimientoInventario="NONE";
				}


				String finalQueryGlobalNovedadProducto="";

				if(((this.novedadproductosForeignKey==null||this.novedadproductosForeignKey.size()<=0) && this.novedadseguimientoConstantesFunciones.cargarid_novedad_productoNovedadSeguimiento)
					 || (this.esRecargarFks && this.novedadseguimientoConstantesFunciones.cargarid_novedad_productoNovedadSeguimiento)) {

					if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionNovedadProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=NovedadProductoConstantesFunciones.getArrayColumnasGlobalesNovedadProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNovedadProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NovedadProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalNovedadProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalNovedadProducto, "");
						finalQueryGlobalNovedadProducto+=NovedadProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosNovedadProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNovedadProducto=" WHERE " + ConstantesSql.ID + "="+novedadseguimientoSessionBean.getlidNovedadProductoActual();
					}
				} else {
					finalQueryGlobalNovedadProducto="NONE";
				}


				String finalQueryGlobalEstadoNovedadSeguimiento="";

				if(((this.estadonovedadseguimientosForeignKey==null||this.estadonovedadseguimientosForeignKey.size()<=0) && this.novedadseguimientoConstantesFunciones.cargarid_estado_novedad_seguimientoNovedadSeguimiento)
					 || (this.esRecargarFks && this.novedadseguimientoConstantesFunciones.cargarid_estado_novedad_seguimientoNovedadSeguimiento)) {

					if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoNovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadSeguimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoNovedadSeguimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoNovedadSeguimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoNovedadSeguimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoNovedadSeguimiento, "");
						finalQueryGlobalEstadoNovedadSeguimiento+=EstadoNovedadSeguimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoNovedadSeguimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoNovedadSeguimiento=" WHERE " + ConstantesSql.ID + "="+novedadseguimientoSessionBean.getlidEstadoNovedadSeguimientoActual();
					}
				} else {
					finalQueryGlobalEstadoNovedadSeguimiento="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				novedadseguimientoReturnGeneral=novedadseguimientoLogic.cargarCombosLoteForeignKeyNovedadSeguimiento(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleMovimientoInventario,finalQueryGlobalNovedadProducto,finalQueryGlobalEstadoNovedadSeguimiento);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=novedadseguimientoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=novedadseguimientoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleMovimientoInventario.equals("NONE")) {
				this.detallemovimientoinventariosForeignKey=novedadseguimientoReturnGeneral.getdetallemovimientoinventariosForeignKey();
			}

			if(!finalQueryGlobalNovedadProducto.equals("NONE")) {
				this.novedadproductosForeignKey=novedadseguimientoReturnGeneral.getnovedadproductosForeignKey();
			}

			if(!finalQueryGlobalEstadoNovedadSeguimiento.equals("NONE")) {
				this.estadonovedadseguimientosForeignKey=novedadseguimientoReturnGeneral.getestadonovedadseguimientosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNovedadSeguimiento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
			this.addItemDefectoCombosForeignKeyNovedadProducto();
			this.addItemDefectoCombosForeignKeyEstadoNovedadSeguimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.novedadseguimientoSessionBean==null) {
				this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyDetalleMovimientoInventario()throws Exception {
		try {

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario()) {
				DetalleMovimientoInventario detallemovimientoinventario=new DetalleMovimientoInventario();
				DetalleMovimientoInventarioConstantesFunciones.setDetalleMovimientoInventarioDescripcion(detallemovimientoinventario,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallemovimientoinventario.setId(null);

				if(!DetalleMovimientoInventarioConstantesFunciones.ExisteEnLista(this.detallemovimientoinventariosForeignKey,detallemovimientoinventario,true)) {

					this.detallemovimientoinventariosForeignKey.add(0,detallemovimientoinventario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyNovedadProducto()throws Exception {
		try {

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionNovedadProducto()) {
				NovedadProducto novedadproducto=new NovedadProducto();
				NovedadProductoConstantesFunciones.setNovedadProductoDescripcion(novedadproducto,Constantes.SMENSAJE_ESCOJA_OPCION);
				novedadproducto.setId(null);

				if(!NovedadProductoConstantesFunciones.ExisteEnLista(this.novedadproductosForeignKey,novedadproducto,true)) {

					this.novedadproductosForeignKey.add(0,novedadproducto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {
		try {

			if(!this.novedadseguimientoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadSeguimiento()) {
				EstadoNovedadSeguimiento estadonovedadseguimiento=new EstadoNovedadSeguimiento();
				EstadoNovedadSeguimientoConstantesFunciones.setEstadoNovedadSeguimientoDescripcion(estadonovedadseguimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadonovedadseguimiento.setId(null);

				if(!EstadoNovedadSeguimientoConstantesFunciones.ExisteEnLista(this.estadonovedadseguimientosForeignKey,estadonovedadseguimiento,true)) {

					this.estadonovedadseguimientosForeignKey.add(0,estadonovedadseguimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNovedadSeguimiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNovedadSeguimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNovedadSeguimiento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.novedadseguimiento.setfecha_novedad(this.parametroGeneralUsuario.getfecha_sistema());
				this.novedadseguimiento.setfecha_seguimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadSeguimiento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNovedadSeguimiento(NovedadSeguimiento novedadseguimiento)throws Exception {	
		try {
			
			this.setActualDetalleMovimientoInventarioForeignKey(novedadseguimiento.getid_detalle_movimiento_inventario(),false,"Formulario");
			this.setActualNovedadProductoForeignKey(novedadseguimiento.getid_novedad_producto(),false,"Formulario");
			this.setActualEstadoNovedadSeguimientoForeignKey(novedadseguimiento.getid_estado_novedad_seguimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNovedadSeguimiento()throws Exception {	
		try {
			
			this.setActualDetalleMovimientoInventarioForeignKey(this.novedadseguimientoConstantesFunciones.getid_detalle_movimiento_inventario(),false,"Formulario");
			this.setActualNovedadProductoForeignKey(this.novedadseguimientoConstantesFunciones.getid_novedad_producto(),false,"Formulario");
			this.setActualEstadoNovedadSeguimientoForeignKey(this.novedadseguimientoConstantesFunciones.getid_estado_novedad_seguimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadSeguimiento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNovedadSeguimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNovedadSeguimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNovedadSeguimiento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNovedadSeguimiento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Todos");
			this.cargarCombosFrameNovedadProductosForeignKey("Todos");
			this.cargarCombosFrameEstadoNovedadSeguimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNovedadSeguimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleMovimientoInventariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNovedadProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoNovedadSeguimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNovedadSeguimiento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public NovedadSeguimientoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NovedadSeguimientoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NovedadSeguimientoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean(); 
		this.novedadseguimientoConstantesFunciones=new NovedadSeguimientoConstantesFunciones(); 
		this.novedadseguimientoBean=new NovedadSeguimiento();//(this.novedadseguimientoConstantesFunciones); 		
		this.novedadseguimientoReturnGeneral=new NovedadSeguimientoParameterReturnGeneral(); 
		
		this.novedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNovedadSeguimiento(true);
			
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
			
			this.novedadseguimientoConstantesFunciones=new NovedadSeguimientoConstantesFunciones(); 
			this.novedadseguimientoBean=new NovedadSeguimiento();//this.novedadseguimientoConstantesFunciones); 			
			this.novedadseguimientoReturnGeneral=new NovedadSeguimientoParameterReturnGeneral(); 
		
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Seguimiento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.novedadseguimiento=new NovedadSeguimiento();
			this.novedadseguimientos = new ArrayList<NovedadSeguimiento>();
			this.novedadseguimientosAux = new ArrayList<NovedadSeguimiento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic=new NovedadSeguimientoLogic();
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.novedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.novedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNovedadSeguimiento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadSeguimiento);	
					}
					
					if(this.jInternalFrameImportacionNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadSeguimiento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNovedadSeguimiento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadSeguimiento);
				this.jInternalFrameDetalleFormNovedadSeguimiento.setVisible(false);
				this.jInternalFrameDetalleFormNovedadSeguimiento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadSeguimiento);
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.setVisible(false);
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNovedadSeguimiento);
					this.jInternalFrameImportacionNovedadSeguimiento.setVisible(false);
					this.jInternalFrameImportacionNovedadSeguimiento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNovedadSeguimiento);
					this.jInternalFrameOrderByNovedadSeguimiento.setVisible(false);
					this.jInternalFrameOrderByNovedadSeguimiento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNovedadSeguimientoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.novedadseguimientoReturnGeneral=new NovedadSeguimientoParameterReturnGeneral();
			
			this.novedadseguimientoParameterGeneral=new NovedadSeguimientoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.novedadseguimientoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadSeguimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadseguimientoSessionBean.getEsGuardarRelacionado(),this.novedadseguimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadSeguimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadseguimientoSessionBean.getEsGuardarRelacionado(),this.novedadseguimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaDuplicarNovedadSeguimiento=true;
			this.isVisibilidadCeldaCopiarNovedadSeguimiento=true;
			this.isVisibilidadCeldaVerFormNovedadSeguimiento=true;
			this.isVisibilidadCeldaOrdenNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			
			
			this.isVisibilidadFK_IdDetalleMovimientoInventario=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=true;
			this.isVisibilidadFK_IdNovedadProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNovedadSeguimiento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNovedadSeguimiento(false);
			
			this.setPermisosUsuarioNovedadSeguimiento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado() 
				|| (this.novedadseguimientoSessionBean.getEsGuardarRelacionado() && this.novedadseguimientoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNovedadSeguimientoClasesRelacionadas();
			}
			
			if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNovedadSeguimientoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNovedadSeguimiento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNovedadSeguimiento();
			}
			
			if(!this.isPermisoBusquedaNovedadSeguimiento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNovedadSeguimiento,this.isPermisoPaginacionMedioNovedadSeguimiento,this.isPermisoPaginacionTodoNovedadSeguimiento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NovedadSeguimientoConstantesFunciones.getTiposSeleccionarNovedadSeguimiento());
				
				this.tiposColumnasSelect=NovedadSeguimientoConstantesFunciones.getTiposSeleccionarNovedadSeguimiento(true);
				
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
			//if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNovedadSeguimiento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNovedadSeguimiento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNovedadSeguimiento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadSeguimiento() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic();
			this.novedadproductoLogic=new NovedadProductoLogic();
			this.estadonovedadseguimientoLogic=new EstadoNovedadSeguimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				novedadseguimientoImplementable= (NovedadSeguimientoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadSeguimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				novedadseguimientoImplementableHome= (NovedadSeguimientoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadSeguimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.novedadseguimientos= new ArrayList<NovedadSeguimiento>();
			this.novedadseguimientosEliminados= new ArrayList<NovedadSeguimiento>();
						
			this.isEsNuevoNovedadSeguimiento=false;
			this.esParaAccionDesdeFormularioNovedadSeguimiento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>() ;
			this.novedadproductosForeignKey=new ArrayList<NovedadProducto>() ;
			this.estadonovedadseguimientosForeignKey=new ArrayList<EstadoNovedadSeguimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNovedadSeguimiento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNovedadSeguimiento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNovedadSeguimiento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNovedadSeguimiento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNovedadSeguimiento();
			}
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNovedadSeguimiento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNovedadSeguimiento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNovedadSeguimiento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNovedadSeguimiento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NovedadSeguimiento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNovedadSeguimiento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNovedadSeguimiento")) {
				iIndex=this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNovedadSeguimiento();	
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
	
	public void cargarCombosForeignKeyNovedadSeguimiento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNovedadSeguimiento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNovedadSeguimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNovedadSeguimientoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNovedadSeguimiento();
		
		this.cargarCombosFrameForeignKeyNovedadSeguimiento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNovedadSeguimiento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNovedadSeguimiento();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleMovimientoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleMovimientoInventarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
				this.cargarCombosFrameDetalleMovimientoInventariosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleMovimientoInventario(this.detallemovimientoinventariosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNovedadProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNovedadProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNovedadProducto();
				this.cargarCombosFrameNovedadProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNovedadProducto(this.novedadproductosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoNovedadSeguimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoNovedadSeguimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoNovedadSeguimiento();
				this.cargarCombosFrameEstadoNovedadSeguimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoNovedadSeguimiento(this.estadonovedadseguimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoNovedadSeguimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			
			if(jTableDatosNovedadSeguimiento.getRowCount()>=1) {
				jTableDatosNovedadSeguimiento.removeRowSelectionInterval(0, jTableDatosNovedadSeguimiento.getRowCount()-1);						
			}
			
			this.isEsNuevoNovedadSeguimiento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNovedadSeguimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNovedadSeguimiento(true);			
			//this.novedadseguimiento=new NovedadSeguimiento();
			//this.novedadseguimiento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadSeguimiento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento() ;
			
			if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadSeguimiento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.novedadseguimiento);	
			this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);				
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NovedadSeguimiento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNovedadSeguimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNovedadSeguimiento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNovedadSeguimiento.getSelectedRows().length;			
			}
			
			novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNovedadSeguimiento--;			
				//NovedadSeguimiento novedadseguimientoAux= new NovedadSeguimiento();			
				//novedadseguimientoAux.setId(this.iIdNuevoNovedadSeguimiento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NovedadSeguimiento novedadseguimientoOrigen=new NovedadSeguimiento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NovedadSeguimiento novedadseguimientoOrigen : novedadseguimientosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							novedadseguimientoOrigen =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadseguimientoOrigen =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNovedadSeguimiento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.novedadseguimiento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNovedadSeguimiento(novedadseguimientoOrigen,this.novedadseguimiento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadseguimientoLogic.getNovedadSeguimientos().add(this.novedadseguimientoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadseguimientos.add(this.novedadseguimientoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
				
				this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoNovedadSeguimiento(), this.getIndiceNuevoNovedadSeguimiento());
				
				int iLastRow =  this.jTableDatosNovedadSeguimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadSeguimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadSeguimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();									
		
			NovedadSeguimiento novedadseguimientoOrigen=new NovedadSeguimiento();
			NovedadSeguimiento novedadseguimientoDestino=new NovedadSeguimiento();
				
			novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNovedadSeguimiento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || novedadseguimientosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNovedadSeguimiento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoOrigen =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadseguimientoOrigen =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadseguimientoDestino =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadseguimientoDestino =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				novedadseguimientoOrigen =novedadseguimientosSeleccionados.get(0);
				novedadseguimientoDestino =novedadseguimientosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNovedadSeguimiento(novedadseguimientoOrigen,novedadseguimientoDestino,true,false);
				
				novedadseguimientoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadseguimientoDestino,novedadseguimientoLogic.getNovedadSeguimientos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadseguimientoDestino,novedadseguimientos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
				
				//this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoNovedadSeguimiento(), this.getIndiceNuevoNovedadSeguimiento());
				
				int iLastRow =  this.jTableDatosNovedadSeguimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadSeguimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadSeguimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNovedadSeguimiento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNovedadSeguimiento.setVisible(!isVisible);
			this.jPanelPaginacionNovedadSeguimiento.setVisible(!isVisible);
			this.jPanelAccionesNovedadSeguimiento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNovedadSeguimiento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNovedadSeguimiento();
			
			this.abrirFrameOrderByNovedadSeguimiento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNovedadSeguimiento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadSeguimiento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNovedadSeguimiento.isMaximum()) {
					this.jInternalFrameDetalleFormNovedadSeguimiento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNovedadSeguimiento.setSize(this.jInternalFrameDetalleFormNovedadSeguimiento.iWidthFormulario,this.jInternalFrameDetalleFormNovedadSeguimiento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNovedadSeguimiento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNovedadSeguimiento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNovedadSeguimiento.isMaximum()) {
						this.jInternalFrameDetalleFormNovedadSeguimiento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNovedadSeguimiento.jContentPaneDetalleNovedadSeguimiento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNovedadSeguimiento.jContentPaneDetalleNovedadSeguimiento.getWidth(),NovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNovedadSeguimiento.jContentPaneDetalleNovedadSeguimiento.getWidth(),NovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNovedadSeguimiento.jContentPaneDetalleNovedadSeguimiento.getWidth(),NovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameDetalleFormNovedadSeguimiento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNovedadSeguimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNovedadSeguimiento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadSeguimiento,false,this);
				} else {
					this.jInternalFrameOrderByNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadSeguimiento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNovedadSeguimiento);
				this.jInternalFrameOrderByNovedadSeguimiento.setVisible(false);
				this.jInternalFrameOrderByNovedadSeguimiento.setSelected(false);
				
				this.jInternalFrameOrderByNovedadSeguimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadSeguimiento"));
				
				this.inicializarActualizarBindingTablaOrderByNovedadSeguimiento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNovedadSeguimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNovedadSeguimiento==null) {
				
				this.jInternalFrameImportacionNovedadSeguimiento=new ImportacionJInternalFrame(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadSeguimiento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNovedadSeguimiento);
				this.jInternalFrameImportacionNovedadSeguimiento.setVisible(false);
				this.jInternalFrameImportacionNovedadSeguimiento.setSelected(false);


				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadSeguimiento"));
				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadSeguimiento"));
				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadSeguimiento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNovedadSeguimiento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNovedadSeguimiento==null) {
				this.jInternalFrameReporteDinamicoNovedadSeguimiento=new ReporteDinamicoJInternalFrame(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadSeguimiento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadSeguimiento);
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.setVisible(false);
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadSeguimiento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadSeguimiento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNovedadSeguimiento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadSeguimiento);
			
	       	this.jInternalFrameDetalleFormNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameDetalleFormNovedadSeguimiento.setSelected(false);
			
			//this.jInternalFrameDetalleFormNovedadSeguimiento.dispose();
			//this.jInternalFrameDetalleFormNovedadSeguimiento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNovedadSeguimiento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameReporteDinamicoNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNovedadSeguimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameImportacionNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNovedadSeguimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameOrderByNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNovedadSeguimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameOrderByNovedadSeguimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNovedadSeguimiento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameReporteDinamicoNovedadSeguimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNovedadSeguimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameImportacionNovedadSeguimiento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNovedadSeguimiento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNovedadSeguimiento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNovedadSeguimiento(true);
			//this.isEsNuevoNovedadSeguimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadSeguimiento(false) ;
			
			if(novedadseguimientoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadSeguimiento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNovedadSeguimientoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNovedadSeguimiento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNovedadSeguimiento(true);
			//this.isEsNuevoNovedadSeguimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.novedadseguimiento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNovedadSeguimiento(false) ;
			
			if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadSeguimiento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleMovimientoInventario(List<DetalleMovimientoInventario> detallemovimientoinventariosForeignKey)throws Exception{
		TableColumn tableColumnDetalleMovimientoInventario=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO));
		TableCellEditor tableCellEditorDetalleMovimientoInventario =tableColumnDetalleMovimientoInventario.getCellEditor();

		DetalleMovimientoInventarioTableCell detallemovimientoinventarioTableCellFk=(DetalleMovimientoInventarioTableCell)tableCellEditorDetalleMovimientoInventario;

		if(detallemovimientoinventarioTableCellFk!=null) {
			detallemovimientoinventarioTableCellFk.setdetallemovimientoinventariosForeignKey(detallemovimientoinventariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadSeguimiento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallemovimientoinventarioTableCellFk.setRowActual(intSelectedRow);
			//detallemovimientoinventarioTableCellFk.setdetallemovimientoinventariosForeignKeyActual(detallemovimientoinventariosForeignKey);
		//}


		if(detallemovimientoinventarioTableCellFk!=null) {
			detallemovimientoinventarioTableCellFk.RecargarDetalleMovimientoInventariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNovedadProducto(List<NovedadProducto> novedadproductosForeignKey)throws Exception{
		TableColumn tableColumnNovedadProducto=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO));
		TableCellEditor tableCellEditorNovedadProducto =tableColumnNovedadProducto.getCellEditor();

		NovedadProductoTableCell novedadproductoTableCellFk=(NovedadProductoTableCell)tableCellEditorNovedadProducto;

		if(novedadproductoTableCellFk!=null) {
			novedadproductoTableCellFk.setnovedadproductosForeignKey(novedadproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadSeguimiento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//novedadproductoTableCellFk.setRowActual(intSelectedRow);
			//novedadproductoTableCellFk.setnovedadproductosForeignKeyActual(novedadproductosForeignKey);
		//}


		if(novedadproductoTableCellFk!=null) {
			novedadproductoTableCellFk.RecargarNovedadProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoNovedadSeguimiento(List<EstadoNovedadSeguimiento> estadonovedadseguimientosForeignKey)throws Exception{
		TableColumn tableColumnEstadoNovedadSeguimiento=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO));
		TableCellEditor tableCellEditorEstadoNovedadSeguimiento =tableColumnEstadoNovedadSeguimiento.getCellEditor();

		EstadoNovedadSeguimientoTableCell estadonovedadseguimientoTableCellFk=(EstadoNovedadSeguimientoTableCell)tableCellEditorEstadoNovedadSeguimiento;

		if(estadonovedadseguimientoTableCellFk!=null) {
			estadonovedadseguimientoTableCellFk.setestadonovedadseguimientosForeignKey(estadonovedadseguimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadSeguimiento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadonovedadseguimientoTableCellFk.setRowActual(intSelectedRow);
			//estadonovedadseguimientoTableCellFk.setestadonovedadseguimientosForeignKeyActual(estadonovedadseguimientosForeignKey);
		//}


		if(estadonovedadseguimientoTableCellFk!=null) {
			estadonovedadseguimientoTableCellFk.RecargarEstadoNovedadSeguimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNovedadSeguimiento(false);
			
			//if(!this.isEsNuevoNovedadSeguimiento) {								
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				
			}
			
			if(this.permiteMantenimiento(this.novedadseguimiento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNovedadSeguimiento=true;
					this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
					this.isEsNuevoNovedadSeguimiento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNovedadSeguimiento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNovedadSeguimiento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadSeguimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(false);
				
				this.habilitarDeshabilitarControlesNovedadSeguimiento(false);
			
												
				
				if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNovedadSeguimiento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNovedadSeguimientoActionPerformed(evt,novedadseguimientoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNovedadSeguimiento(this.novedadseguimiento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,novedadseguimientoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.novedadseguimiento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				this.novedadseguimiento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				this.novedadseguimiento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.novedadseguimiento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NovedadSeguimientoModel) this.jTableDatosNovedadSeguimiento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNovedadSeguimiento=true;
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
				this.isEsNuevoNovedadSeguimiento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadSeguimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(false);
				
				this.habilitarDeshabilitarControlesNovedadSeguimiento(false);
				
				
				
				if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNovedadSeguimiento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNovedadSeguimiento.getRowCount()>=1) {
				jTableDatosNovedadSeguimiento.removeRowSelectionInterval(0, jTableDatosNovedadSeguimiento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNovedadSeguimiento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadSeguimiento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(false) ;
			
			this.isEsNuevoNovedadSeguimiento=false;
			
			if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNovedadSeguimiento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNovedadSeguimiento(false);
				
				//SI ES MANUAL
				if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNovedadSeguimiento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNovedadSeguimiento--;			
			//NovedadSeguimiento novedadseguimientoAux= new NovedadSeguimiento();			
			//novedadseguimientoAux.setId(this.iIdNuevoNovedadSeguimiento);
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNovedadSeguimiento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
			
			this.novedadseguimiento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.novedadseguimientoLogic.getNovedadSeguimientos().add(this.novedadseguimientoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.novedadseguimientos.add(this.novedadseguimientoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			
			this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoNovedadSeguimiento(), this.getIndiceNuevoNovedadSeguimiento());
			
			int iLastRow =  this.jTableDatosNovedadSeguimiento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNovedadSeguimiento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNovedadSeguimiento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadSeguimiento();
			}
			
			//this.abrirFrameTreeNovedadSeguimiento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Novedad SeguimientoES ?", "MANTENIMIENTO DE Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNovedadSeguimiento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNovedadSeguimiento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.novedadseguimientoReturnGeneral=novedadseguimientoLogic.procesarImportacionNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.novedadseguimientoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNovedadSeguimientoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNovedadSeguimiento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNovedadSeguimiento.setFileImportacion(this.jInternalFrameImportacionNovedadSeguimiento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNovedadSeguimiento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNovedadSeguimiento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNovedadSeguimiento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNovedadSeguimiento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		

		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NovedadSeguimientoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NovedadSeguimientoBaseDesign.jrxml";
			
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
			
			this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleMovimientoInventario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleMovimientoInventario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleMovimientoInventario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleMovimientoInventario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NovedadProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NovedadProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NovedadProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NovedadProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNovedad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNovedad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNovedad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNovedad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSeguimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSeguimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSeguimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSeguimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoNovedadSeguimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoNovedadSeguimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoNovedadSeguimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoNovedadSeguimiento_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					sNombreCampoCategoria="id_detalle_movimiento_inventario";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO:
					sNombreCampoCategoria="id_novedad_producto";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD:
					sNombreCampoCategoria="fecha_novedad";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO:
					sNombreCampoCategoria="fecha_seguimiento";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO:
					sNombreCampoCategoria="id_estado_novedad_seguimiento";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					sNombreCampoCategoriaValor="id_detalle_movimiento_inventario";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO:
					sNombreCampoCategoriaValor="id_novedad_producto";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD:
					sNombreCampoCategoriaValor="fecha_novedad";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO:
					sNombreCampoCategoriaValor="fecha_seguimiento";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO:
					sNombreCampoCategoriaValor="id_estado_novedad_seguimiento";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Movimiento Inventario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_movimiento_inventario");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Novedad Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_novedad_producto");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Novedad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_novedad");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Seguimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_seguimiento");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Novedad Seguimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_novedad_seguimiento");
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
	
	public void jButtonGenerarExcelReporteDinamicoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NovedadSeguimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getdetallemovimientoinventario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getnovedadproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getfecha_novedad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getfecha_seguimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO);
					iRow++;

					for(NovedadSeguimiento novedadseguimiento:novedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadseguimiento.getestadonovedadseguimiento_descripcion());
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
			//	this.getFilaCabeceraExportarExcelNovedadSeguimiento(row);				
			//	iRow++;
			//}				
			
			//for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNovedadSeguimiento(novedadseguimientoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
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
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadSeguimiento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadSeguimiento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadSeguimiento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNovedadSeguimiento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNovedadSeguimiento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNovedadSeguimiento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNovedadSeguimiento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNovedadSeguimiento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNovedadSeguimiento.setMinimumSize(dimensionMinimum);
		this.jTableDatosNovedadSeguimiento.setMaximumSize(dimensionMaximum);
		this.jTableDatosNovedadSeguimiento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNovedadSeguimiento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNovedadSeguimiento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNovedadSeguimiento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNovedadSeguimiento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNovedadSeguimiento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNovedadSeguimiento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadSeguimiento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNovedadSeguimiento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNovedadSeguimiento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNovedadSeguimiento();
		
		this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadSeguimiento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadSeguimiento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadSeguimiento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadSeguimiento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNovedadSeguimiento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNovedadSeguimiento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNovedadSeguimiento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionNuevoNovedadSeguimiento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionSinCerrarNovedadSeguimiento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionSinMensajeNovedadSeguimiento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNovedadSeguimiento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNovedadSeguimiento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNovedadSeguimiento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionNuevoNovedadSeguimiento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionSinCerrarNovedadSeguimiento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNovedadSeguimiento.jCheckBoxPostAccionSinMensajeNovedadSeguimiento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNovedadSeguimiento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNovedadSeguimiento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNovedadSeguimiento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNovedadSeguimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNovedadSeguimiento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNovedadSeguimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNovedadSeguimiento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNovedadSeguimiento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNovedadSeguimiento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNovedadSeguimiento(Boolean esInicializar) throws Exception {
		try	{	
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadSeguimiento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNovedadSeguimiento() throws Exception {
		try	{
			if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadSeguimiento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadSeguimiento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadSeguimiento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNovedadSeguimiento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNovedadSeguimiento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNovedadSeguimiento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNovedadSeguimiento.addItem(reporte);
			}
			
			
			if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNovedadSeguimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNovedadSeguimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNovedadSeguimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNovedadSeguimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNovedadSeguimiento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNovedadSeguimiento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadSeguimiento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadSeguimiento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
				
				if(this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNovedadSeguimiento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.getSelectedItem()!=null){this.id_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario=((DetalleMovimientoInventario)this.jComboBoxid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventarioNovedadSeguimiento.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.getSelectedItem()!=null){this.id_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento=((EstadoNovedadSeguimiento)this.jComboBoxid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.getSelectedItem()).getId();}
		if(this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.getSelectedItem()!=null){this.id_novedad_productoFK_IdNovedadProducto=((NovedadProducto)this.jComboBoxid_novedad_productoFK_IdNovedadProductoNovedadSeguimiento.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNovedadSeguimiento(Boolean esInicializar) throws Exception {				
		if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadSeguimiento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNovedadSeguimiento() throws Exception {
		this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNovedadSeguimiento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNovedadSeguimientoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimientoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNovedadSeguimiento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=novedadseguimientoLogic.getNovedadSeguimientos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=novedadseguimientos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNovedadSeguimiento.setModel(new NovedadSeguimientoModel(this.novedadseguimientoLogic.getNovedadSeguimientos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNovedadSeguimiento.setModel(new NovedadSeguimientoModel(this.novedadseguimientos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNovedadSeguimiento!=null && this.jInternalFrameOrderByNovedadSeguimiento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNovedadSeguimiento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,novedadseguimientoConstantesFunciones.resaltarSeleccionarNovedadSeguimiento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,novedadseguimientoConstantesFunciones.resaltarSeleccionarNovedadSeguimiento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_ID));

		if(this.novedadseguimientoConstantesFunciones.mostraridNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadseguimientoConstantesFunciones.resaltaridNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activaridNovedadSeguimiento,this,true,"idNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadseguimientoConstantesFunciones.resaltaridNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activaridNovedadSeguimiento,this,true,"idNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.novedadseguimientoConstantesFunciones.mostrarid_empresaNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_empresaNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_empresaNovedadSeguimiento));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_empresaNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_empresaNovedadSeguimiento,false,"id_empresaNovedadSeguimiento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.novedadseguimientoConstantesFunciones.mostrarid_sucursalNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_sucursalNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_sucursalNovedadSeguimiento));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_sucursalNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_sucursalNovedadSeguimiento,false,"id_sucursalNovedadSeguimiento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO));

		if(this.novedadseguimientoConstantesFunciones.mostrarid_detalle_movimiento_inventarioNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleMovimientoInventarioTableCell(this.detallemovimientoinventariosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_detalle_movimiento_inventarioNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_detalle_movimiento_inventarioNovedadSeguimiento));
			tableColumn.setCellEditor(new DetalleMovimientoInventarioTableCell(this.detallemovimientoinventariosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_detalle_movimiento_inventarioNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_detalle_movimiento_inventarioNovedadSeguimiento,true,"id_detalle_movimiento_inventarioNovedadSeguimiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO));

		if(this.novedadseguimientoConstantesFunciones.mostrarid_novedad_productoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NovedadProductoTableCell(this.novedadproductosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_novedad_productoNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_novedad_productoNovedadSeguimiento));
			tableColumn.setCellEditor(new NovedadProductoTableCell(this.novedadproductosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_novedad_productoNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_novedad_productoNovedadSeguimiento,true,"id_novedad_productoNovedadSeguimiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.novedadseguimientoConstantesFunciones.mostrarnumero_comprobanteNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadseguimientoConstantesFunciones.resaltarnumero_comprobanteNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarnumero_comprobanteNovedadSeguimiento,this,true,"numero_comprobanteNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadseguimientoConstantesFunciones.resaltarnumero_comprobanteNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarnumero_comprobanteNovedadSeguimiento,this,true,"numero_comprobanteNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD));

		if(this.novedadseguimientoConstantesFunciones.mostrarfecha_novedadNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.novedadseguimientoConstantesFunciones.resaltarfecha_novedadNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarfecha_novedadNovedadSeguimiento,this,true,"fecha_novedadNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.novedadseguimientoConstantesFunciones.resaltarfecha_novedadNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarfecha_novedadNovedadSeguimiento,this,true,"fecha_novedadNovedadSeguimiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO));

		if(this.novedadseguimientoConstantesFunciones.mostrarfecha_seguimientoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.novedadseguimientoConstantesFunciones.resaltarfecha_seguimientoNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarfecha_seguimientoNovedadSeguimiento,this,true,"fecha_seguimientoNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.novedadseguimientoConstantesFunciones.resaltarfecha_seguimientoNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activarfecha_seguimientoNovedadSeguimiento,this,true,"fecha_seguimientoNovedadSeguimiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.novedadseguimientoConstantesFunciones.mostrardescripcionNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadseguimientoConstantesFunciones.resaltardescripcionNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activardescripcionNovedadSeguimiento,this,true,"descripcionNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadseguimientoConstantesFunciones.resaltardescripcionNovedadSeguimiento,this.novedadseguimientoConstantesFunciones.activardescripcionNovedadSeguimiento,this,true,"descripcionNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO));

		if(this.novedadseguimientoConstantesFunciones.mostrarid_estado_novedad_seguimientoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoNovedadSeguimientoTableCell(this.estadonovedadseguimientosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_estado_novedad_seguimientoNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_estado_novedad_seguimientoNovedadSeguimiento));
			tableColumn.setCellEditor(new EstadoNovedadSeguimientoTableCell(this.estadonovedadseguimientosForeignKey,this.novedadseguimientoConstantesFunciones.resaltarid_estado_novedad_seguimientoNovedadSeguimiento,this,this.novedadseguimientoConstantesFunciones.activarid_estado_novedad_seguimientoNovedadSeguimiento,true,"id_estado_novedad_seguimientoNovedadSeguimiento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadSeguimiento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadSeguimiento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.novedadseguimientoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNovedadSeguimiento.addColumn(tableColumn);
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
			
			this.jTableDatosNovedadSeguimiento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNovedadSeguimiento.moveColumn(this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNovedadSeguimiento.moveColumn(this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNovedadSeguimiento.moveColumn(this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNovedadSeguimiento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNovedadSeguimiento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNovedadSeguimiento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNovedadSeguimiento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNovedadSeguimiento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNovedadSeguimiento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNovedadSeguimiento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=novedadseguimientoLogic.getNovedadSeguimientos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=novedadseguimientos.size()-1;
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
		//this.jTableDatosNovedadSeguimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNovedadSeguimiento();
			
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
				
				//this.isEsNuevoNovedadSeguimiento=false;
					
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
				if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadSeguimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadSeguimiento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.novedadseguimiento.getsType().equals("DUPLICADO")
				   || this.novedadseguimiento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNovedadSeguimiento=true;
				
				} else {
					this.isEsNuevoNovedadSeguimiento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					if(this.novedadseguimiento.getId()>=0 && !this.novedadseguimiento.getIsNew()) {						
						this.isEsNuevoNovedadSeguimiento=false;
						
					} else {
						this.isEsNuevoNovedadSeguimiento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNovedadSeguimiento(esRelaciones);						
				
				this.seleccionarNovedadSeguimiento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.novedadseguimiento.getId()<0) {
					this.isEsNuevoNovedadSeguimiento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNovedadSeguimiento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNovedadSeguimiento(evt,rowIndex);
				}	
				
				if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NovedadSeguimiento: " + this.dDif); 
					}
				}								
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNovedadSeguimiento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.novedadseguimiento)) {
					if(this.novedadseguimiento.getId()>0) {
						this.novedadseguimiento.setIsDeleted(true);
						
						this.novedadseguimientosEliminados.add(this.novedadseguimiento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadseguimientoLogic.getNovedadSeguimientos().remove(this.novedadseguimiento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadseguimientos.remove(this.novedadseguimiento);				
					}
					
					
					((NovedadSeguimientoModel) this.jTableDatosNovedadSeguimiento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadSeguimiento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNovedadSeguimiento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNovedadSeguimiento) {
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadSeguimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadSeguimiento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimiento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.novedadseguimientoConstantesFunciones.cargarid_empresaNovedadSeguimiento || this.novedadseguimientoConstantesFunciones.event_dependid_empresaNovedadSeguimiento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.novedadseguimiento.getid_empresa());
									//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(novedadseguimiento.getEmpresa()!=null) {
							this.empresasForeignKey.add(novedadseguimiento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.novedadseguimiento.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.novedadseguimientoConstantesFunciones.cargarid_sucursalNovedadSeguimiento || this.novedadseguimientoConstantesFunciones.event_dependid_sucursalNovedadSeguimiento) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.novedadseguimiento.getid_sucursal());
									//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(novedadseguimiento.getSucursal()!=null) {
							this.sucursalsForeignKey.add(novedadseguimiento.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.novedadseguimiento.getid_sucursal(),false,"Formulario");

					//DetalleMovimientoInventario
					if(!this.novedadseguimientoConstantesFunciones.cargarid_detalle_movimiento_inventarioNovedadSeguimiento || this.novedadseguimientoConstantesFunciones.event_dependid_detalle_movimiento_inventarioNovedadSeguimiento) {
						//this.cargarCombosDetalleMovimientoInventariosForeignKeyLista(" where id="+this.novedadseguimiento.getid_detalle_movimiento_inventario());
									//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
						this.detallemovimientoinventariosForeignKey=new ArrayList<DetalleMovimientoInventario>();

						if(novedadseguimiento.getDetalleMovimientoInventario()!=null) {
							this.detallemovimientoinventariosForeignKey.add(novedadseguimiento.getDetalleMovimientoInventario());
						}

						this.addItemDefectoCombosForeignKeyDetalleMovimientoInventario();
						this.cargarCombosFrameDetalleMovimientoInventariosForeignKey("Todos");
					}
					this.setActualDetalleMovimientoInventarioForeignKey(this.novedadseguimiento.getid_detalle_movimiento_inventario(),false,"Formulario");

					//NovedadProducto
					if(!this.novedadseguimientoConstantesFunciones.cargarid_novedad_productoNovedadSeguimiento || this.novedadseguimientoConstantesFunciones.event_dependid_novedad_productoNovedadSeguimiento) {
						//this.cargarCombosNovedadProductosForeignKeyLista(" where id="+this.novedadseguimiento.getid_novedad_producto());
									//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
						this.novedadproductosForeignKey=new ArrayList<NovedadProducto>();

						if(novedadseguimiento.getNovedadProducto()!=null) {
							this.novedadproductosForeignKey.add(novedadseguimiento.getNovedadProducto());
						}

						this.addItemDefectoCombosForeignKeyNovedadProducto();
						this.cargarCombosFrameNovedadProductosForeignKey("Todos");
					}
					this.setActualNovedadProductoForeignKey(this.novedadseguimiento.getid_novedad_producto(),false,"Formulario");

					//EstadoNovedadSeguimiento
					if(!this.novedadseguimientoConstantesFunciones.cargarid_estado_novedad_seguimientoNovedadSeguimiento || this.novedadseguimientoConstantesFunciones.event_dependid_estado_novedad_seguimientoNovedadSeguimiento) {
						//this.cargarCombosEstadoNovedadSeguimientosForeignKeyLista(" where id="+this.novedadseguimiento.getid_estado_novedad_seguimiento());
									//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
						this.estadonovedadseguimientosForeignKey=new ArrayList<EstadoNovedadSeguimiento>();

						if(novedadseguimiento.getEstadoNovedadSeguimiento()!=null) {
							this.estadonovedadseguimientosForeignKey.add(novedadseguimiento.getEstadoNovedadSeguimiento());
						}

						this.addItemDefectoCombosForeignKeyEstadoNovedadSeguimiento();
						this.cargarCombosFrameEstadoNovedadSeguimientosForeignKey("Todos");
					}
					this.setActualEstadoNovedadSeguimientoForeignKey(this.novedadseguimiento.getid_estado_novedad_seguimiento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNovedadSeguimiento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNovedadSeguimiento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadSeguimiento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadSeguimiento(NovedadSeguimiento novedadseguimiento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNovedadSeguimiento(novedadseguimiento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNovedadSeguimiento(novedadseguimiento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNovedadSeguimiento(novedadseguimiento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNovedadSeguimiento(novedadseguimiento);
	}
	
	public void setVariablesObjetoActualToFormularioNovedadSeguimiento(NovedadSeguimiento novedadseguimiento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setText(novedadseguimiento.getId().toString());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setText(novedadseguimiento.getnumero_comprobante());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setDate(novedadseguimiento.getfecha_novedad());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setDate(novedadseguimiento.getfecha_seguimiento());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setText(novedadseguimiento.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NovedadSeguimiento novedadseguimientoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,novedadseguimientoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NovedadSeguimiento novedadseguimientoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				novedadseguimientoLocal=this.novedadseguimiento;
			} else {
				novedadseguimientoLocal=this.novedadseguimientoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(novedadseguimientoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNovedadSeguimiento(novedadseguimientoLocal,true);
					
					if(novedadseguimientoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(novedadseguimientoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(novedadseguimientoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadSeguimiento(novedadseguimiento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(novedadseguimiento);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadSeguimiento(novedadseguimiento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.getText()==null || this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.getText()=="" || this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.getText()=="Id") {
				this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setText("0");
			}

			if(conColumnasBase) {novedadseguimiento.setId(Long.parseLong(this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadSeguimientoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelIdNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadseguimiento.setnumero_comprobante(this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelnumero_comprobanteNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadseguimiento.setfecha_novedad(this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_novedadNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadseguimiento.setfecha_seguimiento(this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelfecha_seguimientoNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadseguimiento.setdescripcion(this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadSeguimiento.jLabeldescripcionNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadSeguimiento(NovedadSeguimiento novedadseguimientoBean,NovedadSeguimiento novedadseguimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && novedadseguimientoBean.getid_detalle_movimiento_inventario()!=null && !novedadseguimientoBean.getid_detalle_movimiento_inventario().equals(-1L))) {novedadseguimiento.setid_detalle_movimiento_inventario(novedadseguimientoBean.getid_detalle_movimiento_inventario());}
			if(conDefault || (!conDefault && novedadseguimientoBean.getid_novedad_producto()!=null && !novedadseguimientoBean.getid_novedad_producto().equals(-1L))) {novedadseguimiento.setid_novedad_producto(novedadseguimientoBean.getid_novedad_producto());}
			if(conDefault || (!conDefault && novedadseguimientoBean.getid_estado_novedad_seguimiento()!=null && !novedadseguimientoBean.getid_estado_novedad_seguimiento().equals(-1L))) {novedadseguimiento.setid_estado_novedad_seguimiento(novedadseguimientoBean.getid_estado_novedad_seguimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNovedadSeguimiento(NovedadSeguimiento novedadseguimientoOrigen,NovedadSeguimiento novedadseguimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadseguimientoOrigen.getId()!=null && !novedadseguimientoOrigen.getId().equals(0L))) {novedadseguimiento.setId(novedadseguimientoOrigen.getId());}}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getid_detalle_movimiento_inventario()!=null && !novedadseguimientoOrigen.getid_detalle_movimiento_inventario().equals(-1L))) {novedadseguimiento.setid_detalle_movimiento_inventario(novedadseguimientoOrigen.getid_detalle_movimiento_inventario());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getid_novedad_producto()!=null && !novedadseguimientoOrigen.getid_novedad_producto().equals(-1L))) {novedadseguimiento.setid_novedad_producto(novedadseguimientoOrigen.getid_novedad_producto());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getnumero_comprobante()!=null && !novedadseguimientoOrigen.getnumero_comprobante().equals(""))) {novedadseguimiento.setnumero_comprobante(novedadseguimientoOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getfecha_novedad()!=null && !novedadseguimientoOrigen.getfecha_novedad().equals(new Date()))) {novedadseguimiento.setfecha_novedad(novedadseguimientoOrigen.getfecha_novedad());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getfecha_seguimiento()!=null && !novedadseguimientoOrigen.getfecha_seguimiento().equals(new Date()))) {novedadseguimiento.setfecha_seguimiento(novedadseguimientoOrigen.getfecha_seguimiento());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getdescripcion()!=null && !novedadseguimientoOrigen.getdescripcion().equals(""))) {novedadseguimiento.setdescripcion(novedadseguimientoOrigen.getdescripcion());}
			if(conDefault || (!conDefault && novedadseguimientoOrigen.getid_estado_novedad_seguimiento()!=null && !novedadseguimientoOrigen.getid_estado_novedad_seguimiento().equals(-1L))) {novedadseguimiento.setid_estado_novedad_seguimiento(novedadseguimientoOrigen.getid_estado_novedad_seguimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadSeguimiento(NovedadSeguimiento novedadseguimiento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setText(novedadseguimiento.getId().toString());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setText(novedadseguimiento.getnumero_comprobante());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setDate(novedadseguimiento.getfecha_novedad());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setDate(novedadseguimiento.getfecha_seguimiento());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setText(novedadseguimiento.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadSeguimiento(NovedadSeguimientoBean novedadseguimientoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setText(novedadseguimientoBean.getId().toString());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setText(novedadseguimientoBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setDate(novedadseguimientoBean.getfecha_novedad());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setDate(novedadseguimientoBean.getfecha_seguimiento());
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setText(novedadseguimientoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNovedadSeguimiento(NovedadSeguimientoParameterReturnGeneral novedadseguimientoReturnGeneral,NovedadSeguimientoBean novedadseguimientoBean,Boolean conDefault) throws Exception { 
		try {
			NovedadSeguimiento novedadseguimientoLocal=new NovedadSeguimiento();
			
			novedadseguimientoLocal=novedadseguimientoReturnGeneral.getNovedadSeguimiento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadseguimientoLocal.getId()!=null && !novedadseguimientoLocal.getId().equals(0L))) {novedadseguimientoBean.setId(novedadseguimientoLocal.getId());}}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getid_detalle_movimiento_inventario()!=null && !novedadseguimientoLocal.getid_detalle_movimiento_inventario().equals(-1L))) {novedadseguimientoBean.setid_detalle_movimiento_inventario(novedadseguimientoLocal.getid_detalle_movimiento_inventario());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getid_novedad_producto()!=null && !novedadseguimientoLocal.getid_novedad_producto().equals(-1L))) {novedadseguimientoBean.setid_novedad_producto(novedadseguimientoLocal.getid_novedad_producto());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getnumero_comprobante()!=null && !novedadseguimientoLocal.getnumero_comprobante().equals(""))) {novedadseguimientoBean.setnumero_comprobante(novedadseguimientoLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getfecha_novedad()!=null && !novedadseguimientoLocal.getfecha_novedad().equals(new Date()))) {novedadseguimientoBean.setfecha_novedad(novedadseguimientoLocal.getfecha_novedad());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getfecha_seguimiento()!=null && !novedadseguimientoLocal.getfecha_seguimiento().equals(new Date()))) {novedadseguimientoBean.setfecha_seguimiento(novedadseguimientoLocal.getfecha_seguimiento());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getdescripcion()!=null && !novedadseguimientoLocal.getdescripcion().equals(""))) {novedadseguimientoBean.setdescripcion(novedadseguimientoLocal.getdescripcion());}
			if(conDefault || (!conDefault && novedadseguimientoLocal.getid_estado_novedad_seguimiento()!=null && !novedadseguimientoLocal.getid_estado_novedad_seguimiento().equals(-1L))) {novedadseguimientoBean.setid_estado_novedad_seguimiento(novedadseguimientoLocal.getid_estado_novedad_seguimiento());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNovedadSeguimientoGenerico(Long idNovedadSeguimientoSeleccionado,JComboBox jComboBoxNovedadSeguimiento,List<NovedadSeguimiento> novedadseguimientosLocal)throws Exception {
		try {
			NovedadSeguimiento  novedadseguimientoTemp=null;

			for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosLocal) {
				if(novedadseguimientoAux.getId()!=null && novedadseguimientoAux.getId().equals(idNovedadSeguimientoSeleccionado)) {
					novedadseguimientoTemp=novedadseguimientoAux;
					break;
				}
			}

			jComboBoxNovedadSeguimiento.setSelectedItem(novedadseguimientoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNovedadSeguimientoGenerico(JComboBox jComboBoxNovedadSeguimiento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadSeguimiento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNovedadSeguimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadSeguimiento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNovedadSeguimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadseguimiento=(NovedadSeguimiento) novedadseguimientoLogic.getNovedadSeguimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadseguimiento =(NovedadSeguimiento) novedadseguimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!novedadseguimiento.getIsNew() && !novedadseguimiento.getIsChanged() && !novedadseguimiento.getIsDeleted()) {
				sDescripcion=novedadseguimiento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=novedadseguimiento.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!novedadseguimiento.getIsNew() && !novedadseguimiento.getIsChanged() && !novedadseguimiento.getIsDeleted()) {
				sDescripcion=novedadseguimiento.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=novedadseguimiento.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleMovimientoInventario")) {
			//sDescripcion=this.getActualDetalleMovimientoInventarioForeignKeyDescripcion((Long)value);
			if(!novedadseguimiento.getIsNew() && !novedadseguimiento.getIsChanged() && !novedadseguimiento.getIsDeleted()) {
				sDescripcion=novedadseguimiento.getdetallemovimientoinventario_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleMovimientoInventarioForeignKeyDescripcion((Long)value);
				sDescripcion=novedadseguimiento.getdetallemovimientoinventario_descripcion();
			}
		}

		if(sTipo.equals("NovedadProducto")) {
			//sDescripcion=this.getActualNovedadProductoForeignKeyDescripcion((Long)value);
			if(!novedadseguimiento.getIsNew() && !novedadseguimiento.getIsChanged() && !novedadseguimiento.getIsDeleted()) {
				sDescripcion=novedadseguimiento.getnovedadproducto_descripcion();
			} else {
				//sDescripcion=this.getActualNovedadProductoForeignKeyDescripcion((Long)value);
				sDescripcion=novedadseguimiento.getnovedadproducto_descripcion();
			}
		}

		if(sTipo.equals("EstadoNovedadSeguimiento")) {
			//sDescripcion=this.getActualEstadoNovedadSeguimientoForeignKeyDescripcion((Long)value);
			if(!novedadseguimiento.getIsNew() && !novedadseguimiento.getIsChanged() && !novedadseguimiento.getIsDeleted()) {
				sDescripcion=novedadseguimiento.getestadonovedadseguimiento_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoNovedadSeguimientoForeignKeyDescripcion((Long)value);
				sDescripcion=novedadseguimiento.getestadonovedadseguimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NovedadSeguimiento novedadseguimientoRow=new NovedadSeguimiento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadseguimientoRow=(NovedadSeguimiento) novedadseguimientoLogic.getNovedadSeguimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadseguimientoRow=(NovedadSeguimiento) novedadseguimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNovedadSeguimiento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));			
			this.jButtonDuplicarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarNovedadSeguimiento && this.isPermisoDuplicarNovedadSeguimiento));			
			this.jButtonCopiarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarNovedadSeguimiento && this.isPermisoCopiarNovedadSeguimiento));
			this.jButtonVerFormNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormNovedadSeguimiento && this.isPermisoVerFormNovedadSeguimiento));
			
			this.jButtonAbrirOrderByNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));			
			
			this.jButtonNuevoRelacionesNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));			
			this.jButtonNuevoGuardarCambiosNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarNovedadSeguimiento && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarNovedadSeguimiento && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarNovedadSeguimiento && this.isPermisoEliminarNovedadSeguimiento));
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarNovedadSeguimiento);							
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));			
			
			}
						
			this.jButtonGuardarCambiosTablaNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));						
			this.jButtonDuplicarToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarNovedadSeguimiento && this.isPermisoDuplicarNovedadSeguimiento));						
			this.jButtonCopiarToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarNovedadSeguimiento && this.isPermisoCopiarNovedadSeguimiento));			
			this.jButtonVerFormToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormNovedadSeguimiento && this.isPermisoVerFormNovedadSeguimiento));			
			this.jButtonAbrirOrderByToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));
			this.jButtonNuevoRelacionesToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));			
			this.jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));			
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarNovedadSeguimiento && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarNovedadSeguimiento  && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarNovedadSeguimiento && this.isPermisoEliminarNovedadSeguimiento));
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarToolBarNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarNovedadSeguimiento);				
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));			
			this.jMenuItemDuplicarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarNovedadSeguimiento && this.isPermisoDuplicarNovedadSeguimiento));			
			this.jMenuItemCopiarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarNovedadSeguimiento && this.isPermisoCopiarNovedadSeguimiento));			
			this.jMenuItemVerFormNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormNovedadSeguimiento && this.isPermisoVerFormNovedadSeguimiento));			
			this.jMenuItemAbrirOrderByNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));			
			//this.jMenuItemMostrarOcultarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));
			this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));			
			//this.jMenuItemDetalleMostrarOcultarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenNovedadSeguimiento && this.isPermisoOrdenNovedadSeguimiento));			
			this.jMenuItemNuevoRelacionesNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento));			
			this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoNovedadSeguimiento && this.isPermisoNuevoNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));									
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemModificarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarNovedadSeguimiento && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemActualizarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarNovedadSeguimiento && this.isPermisoActualizarNovedadSeguimiento));	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemEliminarNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarNovedadSeguimiento && this.isPermisoEliminarNovedadSeguimiento));
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemCancelarNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarNovedadSeguimiento);				
			}
			
			this.jMenuItemGuardarCambiosNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));						
			this.jMenuItemGuardarCambiosTablaNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=this.jButtonNuevoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaDuplicarNovedadSeguimiento=this.jButtonDuplicarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCopiarNovedadSeguimiento=this.jButtonCopiarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaVerFormNovedadSeguimiento=this.jButtonVerFormNovedadSeguimiento.isVisible();
			
			this.isVisibilidadCeldaOrdenNovedadSeguimiento=this.jButtonAbrirOrderByNovedadSeguimiento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=this.jButtonNuevoRelacionesNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaModificarNovedadSeguimiento=this.jButtonModificarNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=this.jButtonGuardarCambiosTablaNovedadSeguimiento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=this.jButtonNuevoToolBarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=this.jButtonNuevoRelacionesToolBarNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaModificarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarToolBarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarToolBarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarToolBarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarToolBarNovedadSeguimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadSeguimiento=this.jButtonGuardarCambiosToolBarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=this.jMenuItemNuevoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=this.jMenuItemNuevoRelacionesNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaModificarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemModificarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemActualizarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemEliminarNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemCancelarNovedadSeguimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadSeguimiento=this.jMenuItemGuardarCambiosNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=this.jMenuItemGuardarCambiosTablaNovedadSeguimiento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNovedadSeguimiento(Boolean esInicializar) {
		if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
				//if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadSeguimiento();
			}
			
			this.inicializarActualizarBindingBotonesManualNovedadSeguimiento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNovedadSeguimiento() {
		this.jButtonNuevoNovedadSeguimiento.setVisible(this.isPermisoNuevoNovedadSeguimiento);			
		this.jButtonDuplicarNovedadSeguimiento.setVisible(this.isPermisoDuplicarNovedadSeguimiento);			
		this.jButtonCopiarNovedadSeguimiento.setVisible(this.isPermisoCopiarNovedadSeguimiento);			
		this.jButtonVerFormNovedadSeguimiento.setVisible(this.isPermisoVerFormNovedadSeguimiento);			
		
		this.jButtonAbrirOrderByNovedadSeguimiento.setVisible(this.isPermisoOrdenNovedadSeguimiento);					
		
		this.jButtonNuevoRelacionesNovedadSeguimiento.setVisible(this.isPermisoNuevoNovedadSeguimiento);			
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarNovedadSeguimiento.setVisible(this.isPermisoActualizarNovedadSeguimiento);	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.setVisible(this.isPermisoActualizarNovedadSeguimiento);	
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.setVisible(this.isPermisoEliminarNovedadSeguimiento);
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarNovedadSeguimiento);						
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.setVisible(this.isPermisoGuardarCambiosNovedadSeguimiento);							
		}
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.setVisible(this.isPermisoActualizarNovedadSeguimiento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadSeguimiento() {
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarNovedadSeguimiento.setVisible(this.isPermisoActualizarNovedadSeguimiento);	
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.setVisible(this.isPermisoActualizarNovedadSeguimiento);	
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.setVisible(this.isPermisoEliminarNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarNovedadSeguimiento);							
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarNovedadSeguimiento && this.isPermisoGuardarCambiosNovedadSeguimiento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNovedadSeguimiento() {
		if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNovedadSeguimiento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNovedadSeguimiento() {
	}
	
	public void jTableDatosNovedadSeguimientoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNovedadSeguimiento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.novedadseguimiento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNovedadSeguimientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadSeguimiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.novedadseguimientoLogic.getConnexion());

				if(this.novedadseguimiento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.novedadseguimiento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)this.jScrollPanelDatosNovedadSeguimiento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNovedadSeguimiento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.novedadseguimiento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalNovedadSeguimientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadSeguimiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.novedadseguimientoLogic.getConnexion());

				if(this.novedadseguimiento.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.novedadseguimiento.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)this.jScrollPanelDatosNovedadSeguimiento.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderNovedadSeguimiento.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.novedadseguimiento.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallemovimientoinventario=true;

			idTienePermisodetallemovimientoinventario=this.tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(DetalleMovimientoInventarioConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallemovimientoinventario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadSeguimiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.novedadseguimientoLogic.getConnexion());

				if(this.novedadseguimiento.getid_detalle_movimiento_inventario()!=null) {
					this.detallemovimientoinventarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallemovimientoinventarioBeanSwingJInternalFrame.setIdActual(this.novedadseguimiento.getid_detalle_movimiento_inventario());
					this.detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario();
				}

				JInternalFrameBase jinternalFrame =this.detallemovimientoinventarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)this.jScrollPanelDatosNovedadSeguimiento.getBorder();
				TitledBorder titledBorderdetallemovimientoinventario=(TitledBorder)this.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getBorder();

				titledBorderdetallemovimientoinventario.setTitle(titledBorderNovedadSeguimiento.getTitle() + " -> Detalle Movimiento Inventario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getid_detalle_movimiento_inventario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_movimiento_inventario = "+this.novedadseguimiento.getid_detalle_movimiento_inventario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_novedad_productoNovedadSeguimientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonovedadproducto=true;

			idTienePermisonovedadproducto=this.tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(NovedadProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisonovedadproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadSeguimiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);

				this.novedadproductoBeanSwingJInternalFrame=new NovedadProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.novedadproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.novedadproductoBeanSwingJInternalFrame.getNovedadProductoLogic().setConnexion(this.novedadseguimientoLogic.getConnexion());

				if(this.novedadseguimiento.getid_novedad_producto()!=null) {
					this.novedadproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.novedadproductoBeanSwingJInternalFrame.setIdActual(this.novedadseguimiento.getid_novedad_producto());
					this.novedadproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.novedadproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.novedadproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadProducto();
				}

				JInternalFrameBase jinternalFrame =this.novedadproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)this.jScrollPanelDatosNovedadSeguimiento.getBorder();
				TitledBorder titledBordernovedadproducto=(TitledBorder)this.novedadproductoBeanSwingJInternalFrame.jScrollPanelDatosNovedadProducto.getBorder();

				titledBordernovedadproducto.setTitle(titledBorderNovedadSeguimiento.getTitle() + " -> Novedad Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_novedad_productoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getid_novedad_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_novedad_producto = "+this.novedadseguimiento.getid_novedad_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.novedadseguimiento.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_novedadNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getfecha_novedad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_novedad = '"+Funciones2.getStringPostgresDate(this.novedadseguimiento.getfecha_novedad())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_seguimientoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getfecha_seguimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_seguimiento = '"+Funciones2.getStringPostgresDate(this.novedadseguimiento.getfecha_seguimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.novedadseguimiento.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadonovedadseguimiento=true;

			idTienePermisoestadonovedadseguimiento=this.tienePermisosUsuarioEnPaginaWebNovedadSeguimiento(EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadonovedadseguimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadSeguimiento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadSeguimiento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);

				this.estadonovedadseguimientoBeanSwingJInternalFrame=new EstadoNovedadSeguimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadonovedadseguimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadonovedadseguimientoBeanSwingJInternalFrame.getEstadoNovedadSeguimientoLogic().setConnexion(this.novedadseguimientoLogic.getConnexion());

				if(this.novedadseguimiento.getid_estado_novedad_seguimiento()!=null) {
					this.estadonovedadseguimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadonovedadseguimientoBeanSwingJInternalFrame.setIdActual(this.novedadseguimiento.getid_estado_novedad_seguimiento());
					this.estadonovedadseguimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadonovedadseguimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadonovedadseguimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoNovedadSeguimiento();
				}

				JInternalFrameBase jinternalFrame =this.estadonovedadseguimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)this.jScrollPanelDatosNovedadSeguimiento.getBorder();
				TitledBorder titledBorderestadonovedadseguimiento=(TitledBorder)this.estadonovedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosEstadoNovedadSeguimiento.getBorder();

				titledBorderestadonovedadseguimiento.setTitle(titledBorderNovedadSeguimiento.getTitle() + " -> Estado Novedad Seguimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.getnovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadseguimiento==null) {
						this.novedadseguimiento = new NovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);
				}

				if(this.novedadseguimiento.getid_estado_novedad_seguimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_novedad_seguimiento = "+this.novedadseguimiento.getid_estado_novedad_seguimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);

			this.getNovedadSeguimientosFK_IdDetalleMovimientoInventario();

			this.inicializarActualizarBindingNovedadSeguimiento(false);

			//if(NovedadSeguimientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);

			this.getNovedadSeguimientosFK_IdEmpresa();

			this.inicializarActualizarBindingNovedadSeguimiento(false);

			//if(NovedadSeguimientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);

			this.getNovedadSeguimientosFK_IdEstadoNovedadSeguimiento();

			this.inicializarActualizarBindingNovedadSeguimiento(false);

			//if(NovedadSeguimientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNovedadProductoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);

			this.getNovedadSeguimientosFK_IdNovedadProducto();

			this.inicializarActualizarBindingNovedadSeguimiento(false);

			//if(NovedadSeguimientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);

			this.getNovedadSeguimientosFK_IdSucursal();

			this.inicializarActualizarBindingNovedadSeguimiento(false);

			//if(NovedadSeguimientoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNovedadSeguimiento() {
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameDetalleFormNovedadSeguimiento.dispose();
			this.jInternalFrameDetalleFormNovedadSeguimiento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
			this.jInternalFrameReporteDinamicoNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNovedadSeguimiento.dispose();
			this.jInternalFrameReporteDinamicoNovedadSeguimiento=null;
		}
		
		if(this.jInternalFrameImportacionNovedadSeguimiento!=null) {
			this.jInternalFrameImportacionNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameImportacionNovedadSeguimiento.dispose();
			this.jInternalFrameImportacionNovedadSeguimiento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNovedadSeguimiento();
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			
			if(sTipo.equals("NuevoNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNovedadSeguimiento")) {
				jButtonDuplicarNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNovedadSeguimiento")) {
				jButtonCopiarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormNovedadSeguimiento")) {
				jButtonVerFormNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNovedadSeguimiento")) {
				jButtonDuplicarNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNovedadSeguimiento")) {
				jButtonDuplicarNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNovedadSeguimiento")) {
				jButtonModificarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNovedadSeguimiento")) {
				jButtonModificarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNovedadSeguimiento")) {
				jButtonModificarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNovedadSeguimiento")) {
				jButtonActualizarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNovedadSeguimiento")) {
				jButtonActualizarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNovedadSeguimiento")) {
				jButtonActualizarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarNovedadSeguimiento")) {
				jButtonEliminarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNovedadSeguimiento")) {
				jButtonEliminarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNovedadSeguimiento")) {
				jButtonEliminarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarNovedadSeguimiento")) {
				jButtonCancelarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNovedadSeguimiento")) {
				jButtonCancelarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNovedadSeguimiento")) {
				jButtonCancelarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarNovedadSeguimiento")) {
				jButtonCerrarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNovedadSeguimiento")) {
				jButtonCerrarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNovedadSeguimiento")) {
				jButtonCerrarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNovedadSeguimiento")) {
				jButtonMostrarOcultarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNovedadSeguimiento")) {
				jButtonCancelarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNovedadSeguimiento")) {
				jButtonCopiarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNovedadSeguimiento")) {
				jButtonVerFormNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNovedadSeguimiento")) {
				jButtonCopiarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNovedadSeguimiento")) {
				jButtonVerFormNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNovedadSeguimiento")) {
				jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNovedadSeguimiento")) {
				jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNovedadSeguimiento")) {
				jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNovedadSeguimiento")) {
				jButtonAnterioresNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNovedadSeguimiento")) {
				jButtonAnterioresNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNovedadSeguimiento")) {
				jButtonAnterioresNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNovedadSeguimiento")) {
				jButtonSiguientesNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNovedadSeguimiento")) {
				jButtonSiguientesNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNovedadSeguimiento")) {
				jButtonSiguientesNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNovedadSeguimiento") || sTipo.equals("MenuItemDetalleAbrirOrderByNovedadSeguimiento")) {
				jButtonAbrirOrderByNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNovedadSeguimiento") || sTipo.equals("MenuItemDetalleMostrarOcultarNovedadSeguimiento")) {
				jButtonMostrarOcultarNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNovedadSeguimiento")) {
				jButtonCerrarReporteDinamicoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNovedadSeguimiento")) {
				jButtonGenerarReporteDinamicoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNovedadSeguimiento")) {
				
				jButtonGenerarExcelReporteDinamicoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNovedadSeguimiento")) {
				jButtonCerrarImportacionNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNovedadSeguimiento")) {
				
				jButtonGenerarImportacionNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNovedadSeguimiento")) {
				
				jButtonAbrirImportacionNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNovedadSeguimiento")) {
				jComboBoxTiposAccionesNovedadSeguimientoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNovedadSeguimiento")) {
				jComboBoxTiposRelacionesNovedadSeguimientoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNovedadSeguimiento")) {
				jComboBoxTiposAccionesNovedadSeguimientoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNovedadSeguimiento")) {
				
				jComboBoxTiposSeleccionarNovedadSeguimientoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNovedadSeguimiento")) {
				jTextFieldValorCampoGeneralNovedadSeguimientoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNovedadSeguimiento")) {
				jButtonAbrirOrderByNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNovedadSeguimiento")) {
				jButtonAbrirOrderByNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNovedadSeguimiento")) {
				jButtonCerrarOrderByNovedadSeguimientoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadSeguimientoBusqueda")) {
				this.jButtonidNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadSeguimientoUpdate")) {
				this.jButtonid_empresaNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadSeguimientoBusqueda")) {
				this.jButtonid_empresaNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNovedadSeguimientoUpdate")) {
				this.jButtonid_sucursalNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNovedadSeguimientoBusqueda")) {
				this.jButtonid_sucursalNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioNovedadSeguimientoUpdate")) {
				this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda")) {
				this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_novedad_productoNovedadSeguimientoUpdate")) {
				this.jButtonid_novedad_productoNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_novedad_productoNovedadSeguimientoBusqueda")) {
				this.jButtonid_novedad_productoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteNovedadSeguimientoBusqueda")) {
				this.jButtonnumero_comprobanteNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_novedadNovedadSeguimientoBusqueda")) {
				this.jButtonfecha_novedadNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_seguimientoNovedadSeguimientoBusqueda")) {
				this.jButtonfecha_seguimientoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadSeguimientoBusqueda")) {
				this.jButtondescripcionNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_novedad_seguimientoNovedadSeguimientoUpdate")) {
				this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_novedad_seguimientoNovedadSeguimientoBusqueda")) {
				this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdDetalleMovimientoInventarioNovedadSeguimiento")) {
				this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimientoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoNovedadSeguimientoNovedadSeguimiento")) {
				this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimientoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdNovedadProductoNovedadSeguimiento")) {
				this.jButtonFK_IdNovedadProductoNovedadSeguimientoActionPerformed(evt);
			}
			
			;
			
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNovedadSeguimiento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NovedadSeguimiento novedadseguimientoLocal=null;
			
			if(!this.getEsControlTabla()) {
				novedadseguimientoLocal=this.novedadseguimiento;
			} else {
				novedadseguimientoLocal=this.novedadseguimientoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
							
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
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
			
			


			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
								
						
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
								
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
							
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
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
			
			


			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
								
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNovedadSeguimiento")) {
					jCheckBoxSeleccionarTodosNovedadSeguimientoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNovedadSeguimiento")) {
					jCheckBoxSeleccionadosNovedadSeguimientoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNovedadSeguimiento")) {
					
				}
				
				


				
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
												
				
				


				
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
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
			
			


			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadSeguimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadseguimiento);
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
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
				
				


				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadSeguimiento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadseguimientoAnterior =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNovedadSeguimiento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNovedadSeguimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNovedadSeguimiento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.novedadseguimiento =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.novedadseguimiento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNovedadSeguimiento")) {
				
				}
				
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNovedadSeguimiento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNovedadSeguimiento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNovedadSeguimiento")) {
			
			}
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNovedadSeguimiento();
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			if(sTipo.equals("NuevoNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNovedadSeguimiento")) {
				jButtonDuplicarNovedadSeguimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNovedadSeguimiento")) {
				jButtonCopiarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNovedadSeguimiento")) {
				jButtonVerFormNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNovedadSeguimiento")) {
				jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNovedadSeguimiento")) {
				jButtonModificarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNovedadSeguimiento")) {
				jButtonActualizarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNovedadSeguimiento")) {
				jButtonEliminarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNovedadSeguimiento")) {
				jButtonCancelarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNovedadSeguimiento")) {
				jButtonCerrarNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNovedadSeguimiento")) {
				jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNovedadSeguimiento")) {
				jButtonAbrirOrderByNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNovedadSeguimiento")) {
				jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNovedadSeguimiento")) {
				jButtonAnterioresNovedadSeguimientoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNovedadSeguimiento")) {
				jButtonSiguientesNovedadSeguimientoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadSeguimientoBusqueda")) {
				this.jButtonidNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadSeguimientoUpdate")) {
				this.jButtonid_empresaNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadSeguimientoBusqueda")) {
				this.jButtonid_empresaNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNovedadSeguimientoUpdate")) {
				this.jButtonid_sucursalNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNovedadSeguimientoBusqueda")) {
				this.jButtonid_sucursalNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioNovedadSeguimientoUpdate")) {
				this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda")) {
				this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_novedad_productoNovedadSeguimientoUpdate")) {
				this.jButtonid_novedad_productoNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_novedad_productoNovedadSeguimientoBusqueda")) {
				this.jButtonid_novedad_productoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteNovedadSeguimientoBusqueda")) {
				this.jButtonnumero_comprobanteNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_novedadNovedadSeguimientoBusqueda")) {
				this.jButtonfecha_novedadNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_seguimientoNovedadSeguimientoBusqueda")) {
				this.jButtonfecha_seguimientoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadSeguimientoBusqueda")) {
				this.jButtondescripcionNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_novedad_seguimientoNovedadSeguimientoUpdate")) {
				this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_novedad_seguimientoNovedadSeguimientoBusqueda")) {
				this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNovedadSeguimiento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNovedadSeguimiento")) {
				closingInternalFrameNovedadSeguimiento();
				
			} else if(sTipo.equals("jButtonCancelarNovedadSeguimiento")) {
				JInternalFrameBase jInternalFrameDetalleFormNovedadSeguimiento = (JInternalFrameBase)evt.getSource();
	            	
	            NovedadSeguimientoBeanSwingJInternalFrame jInternalFrameParent=(NovedadSeguimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadSeguimiento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNovedadSeguimientoActionPerformed(null);
			}
			
			NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadseguimiento,new Object(),this.novedadseguimientoParameterGeneral,this.novedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNovedadSeguimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNovedadSeguimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNovedadSeguimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.novedadseguimiento)) {
			if(!esControlTabla) {
				if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);			
				}
				
				if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNovedadSeguimiento(this.novedadseguimiento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadseguimientoReturnGeneral=novedadseguimientoLogic.procesarEventosNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadseguimientoLogic.getNovedadSeguimientos(),this.novedadseguimiento,this.novedadseguimientoParameterGeneral,this.isEsNuevoNovedadSeguimiento,classes);//this.novedadseguimientoLogic.getNovedadSeguimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNovedadSeguimiento(this.novedadseguimientoReturnGeneral,this.novedadseguimientoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNovedadSeguimiento(classes,this.novedadseguimientoReturnGeneral,this.novedadseguimientoBean,false);
					}
						
					if(this.novedadseguimientoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento());	
					}
						
					if(this.novedadseguimientoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento(),classes);//this.novedadseguimientoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNovedadSeguimiento(this.novedadseguimiento,classes);//this.novedadseguimientoBean);									
				}
			
				if(NovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNovedadSeguimiento(this.novedadseguimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadSeguimiento(this.novedadseguimiento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.novedadseguimientoAnterior!=null) {
						this.novedadseguimiento=this.novedadseguimientoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadseguimientoReturnGeneral=novedadseguimientoLogic.procesarEventosNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadseguimientoLogic.getNovedadSeguimientos(),this.novedadseguimiento,this.novedadseguimientoParameterGeneral,this.isEsNuevoNovedadSeguimiento,classes);//this.novedadseguimientoLogic.getNovedadSeguimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadseguimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento(),novedadseguimientoLogic.getNovedadSeguimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento(),this.novedadseguimientos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNovedadSeguimiento.repaint();
				
				//((AbstractTableModel) this.jTableDatosNovedadSeguimiento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNovedadSeguimiento();
			}
		}
	}
	
	public void actualizarVisualTableDatosNovedadSeguimiento() throws Exception {
		
		NovedadSeguimientoModel novedadseguimientoModel=(NovedadSeguimientoModel)this.jTableDatosNovedadSeguimiento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadseguimientoModel.novedadseguimientos=this.novedadseguimientoLogic.getNovedadSeguimientos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			novedadseguimientoModel.novedadseguimientos=this.novedadseguimientos;
		}
		
		
		((NovedadSeguimientoModel) this.jTableDatosNovedadSeguimiento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNovedadSeguimiento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnovedadseguimientoAnterior(),this.novedadseguimientoLogic.getNovedadSeguimientos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnovedadseguimientoAnterior(),this.novedadseguimientos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNovedadSeguimiento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
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
										
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadseguimiento,new Object(),generalEntityParameterGeneral,this.novedadseguimientoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NovedadSeguimientoConstantesFunciones.getClassesRelationshipsFromStringsOfNovedadSeguimiento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNovedadSeguimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadseguimiento,new Object(),generalEntityParameterGeneral,this.novedadseguimientoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNovedadSeguimiento(NovedadSeguimientoBean novedadseguimientoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNovedadSeguimiento(ArrayList<Classe> classes,NovedadSeguimientoReturnGeneral novedadseguimientoReturnGeneral,NovedadSeguimientoBean novedadseguimientoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.novedadseguimiento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNovedadSeguimiento = new NovedadSeguimientoDetalleFormJInternalFrame(jDesktopPane,this.novedadseguimientoSessionBean.getConGuardarRelaciones(),this.novedadseguimientoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.setVisible(false);
		this.jInternalFrameDetalleFormNovedadSeguimiento.setSelected(false);						
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.novedadseguimientoLogic=this.novedadseguimientoLogic;
		
		this.cargarCombosFrameForeignKeyNovedadSeguimiento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadSeguimiento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadSeguimiento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNovedadSeguimiento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNovedadSeguimiento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadSeguimiento"));
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarNovedadSeguimiento"));

		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadSeguimiento"));
					
		this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemModificarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ActualizarNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadSeguimiento"));
						
		this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemActualizarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadSeguimiento"));
								
		this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemEliminarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadSeguimiento"));
					
		this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemCancelarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadSeguimiento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemDetalleCerrarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadSeguimiento"));
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadSeguimiento"));
		
		
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadSeguimiento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonidNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_novedadNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_novedadNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_seguimientoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtondescripcionNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadSeguimiento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNovedadSeguimiento"));
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadSeguimiento"));
		}
		
		this.jTableDatosNovedadSeguimiento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNovedadSeguimiento"));
		
		this.jTableDatosNovedadSeguimiento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNovedadSeguimiento"));
		
		this.jButtonNuevoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoNovedadSeguimiento"));
		
		this.jButtonDuplicarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"DuplicarNovedadSeguimiento"));
		
		this.jButtonCopiarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"CopiarNovedadSeguimiento"));
		
		this.jButtonVerFormNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"VerFormNovedadSeguimiento"));
		
		
		this.jButtonNuevoToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoToolBarNovedadSeguimiento"));
			
		this.jButtonDuplicarToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNovedadSeguimiento"));
			
		this.jMenuItemNuevoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNovedadSeguimiento"));
			
		this.jMenuItemDuplicarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNovedadSeguimiento"));		
		
		
		this.jButtonNuevoRelacionesNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNovedadSeguimiento"));
		
		
		this.jButtonNuevoRelacionesToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNovedadSeguimiento"));
			
		this.jMenuItemNuevoRelacionesNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNovedadSeguimiento"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonModificarToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadSeguimiento"));
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemModificarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ActualizarNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonActualizarToolBarNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadSeguimiento"));
				
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemActualizarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonEliminarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadSeguimiento"));
						
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemEliminarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonCancelarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadSeguimiento"));
			
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemCancelarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadSeguimiento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNovedadSeguimiento"));		
		
		
		this.jButtonCerrarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarNovedadSeguimiento"));
		
		
		this.jButtonCerrarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarToolBarNovedadSeguimiento"));
			
		this.jMenuItemCerrarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNovedadSeguimiento"));
			
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jMenuItemDetalleCerrarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadSeguimiento"));
		}
		
		this.jButtonCopiarToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CopiarToolBarNovedadSeguimiento"));
			
		this.jButtonVerFormToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"VerFormToolBarNovedadSeguimiento"));
		
		this.jMenuItemGuardarCambiosNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNovedadSeguimiento"));
			
		this.jMenuItemCopiarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNovedadSeguimiento"));		
		
		this.jMenuItemVerFormNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNovedadSeguimiento"));		
		
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadSeguimiento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNovedadSeguimiento"));
			
		this.jMenuItemGuardarCambiosTablaNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadSeguimiento"));		
		
		
		
		this.jButtonRecargarInformacionNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionNovedadSeguimiento"));
					
		this.jButtonRecargarInformacionToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNovedadSeguimiento"));
		
		this.jMenuItemRecargarInformacionNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNovedadSeguimiento"));		
		
		
		
		this.jButtonAnterioresNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AnterioresNovedadSeguimiento"));
		
		
		this.jButtonAnterioresToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNovedadSeguimiento"));
		
		this.jMenuItemAnterioresNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNovedadSeguimiento"));		
		
		
		this.jButtonSiguientesNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"SiguientesNovedadSeguimiento"));
		
		
		this.jButtonSiguientesToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNovedadSeguimiento"));
			
		this.jMenuItemSiguientesNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNovedadSeguimiento"));
			
		this.jMenuItemAbrirOrderByNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNovedadSeguimiento"));
			
		this.jMenuItemMostrarOcultarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNovedadSeguimiento"));
			
		this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNovedadSeguimiento"));
			
		this.jMenuItemDetalleMostarOcultarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNovedadSeguimiento"));		
		
		
		this.jButtonNuevoGuardarCambiosNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNovedadSeguimiento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNovedadSeguimiento"));
			
		this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNovedadSeguimiento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNovedadSeguimiento"));

		this.jCheckBoxSeleccionadosNovedadSeguimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNovedadSeguimiento"));
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadSeguimiento"));
		}
		
		
		this.jComboBoxTiposRelacionesNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposRelacionesNovedadSeguimiento"));
			
		this.jComboBoxTiposAccionesNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesNovedadSeguimiento"));
					
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNovedadSeguimiento"));
			
		this.jTextFieldValorCampoGeneralNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNovedadSeguimiento"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonidNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_novedadNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_novedadNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_seguimientoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtondescripcionNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdDetalleMovimientoInventarioNovedadSeguimiento"));

			this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdEstadoNovedadSeguimientoNovedadSeguimiento"));

			this.jButtonFK_IdNovedadProductoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdNovedadProductoNovedadSeguimiento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoNovedadSeguimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadSeguimiento"));
			}
			
			//this.jButtonCerrarReporteDinamicoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadSeguimiento"));				
			//this.jButtonGenerarReporteDinamicoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadSeguimiento"));
			//this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadSeguimiento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNovedadSeguimiento!=null) {
				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadSeguimiento"));
				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadSeguimiento"));
				this.jInternalFrameImportacionNovedadSeguimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadSeguimiento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByNovedadSeguimiento"));
			
			this.jButtonAbrirOrderByToolBarNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNovedadSeguimiento"));			
			
			if(this.jInternalFrameOrderByNovedadSeguimiento!=null) {
				this.jInternalFrameOrderByNovedadSeguimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadSeguimiento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadSeguimiento.jTabbedPaneRelacionesNovedadSeguimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadSeguimiento"));
		
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
            		closingInternalFrameNovedadSeguimiento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNovedadSeguimiento = (JInternalFrameBase)event.getSource();
	            	
	            NovedadSeguimientoBeanSwingJInternalFrame jInternalFrameParent=(NovedadSeguimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadSeguimiento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNovedadSeguimientoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNovedadSeguimiento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNovedadSeguimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNovedadSeguimiento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNovedadSeguimiento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNovedadSeguimiento";
		inputMap = this.jButtonNuevoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNovedadSeguimiento";
		inputMap = this.jButtonNuevoRelacionesNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadSeguimientoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNovedadSeguimiento";
		inputMap = this.jButtonModificarNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNovedadSeguimiento";
		inputMap = this.jButtonActualizarNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNovedadSeguimiento";
		inputMap = this.jButtonEliminarNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNovedadSeguimiento";
		inputMap = this.jButtonCancelarNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNovedadSeguimiento";
		inputMap = this.jButtonCerrarNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNovedadSeguimiento";
		inputMap = this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonGuardarCambiosNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNovedadSeguimiento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNovedadSeguimientoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonidNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_empresaNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_sucursalNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_novedad_productoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_novedad_productoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_novedadNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_novedadNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_seguimientoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtondescripcionNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadSeguimientoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadSeguimiento.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_seguimientoNovedadSeguimientoBusqueda"));
		
		
		this.jButtonFK_IdDetalleMovimientoInventarioNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdDetalleMovimientoInventarioNovedadSeguimiento"));

		this.jButtonFK_IdEstadoNovedadSeguimientoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdEstadoNovedadSeguimientoNovedadSeguimiento"));

		this.jButtonFK_IdNovedadProductoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"FK_IdNovedadProductoNovedadSeguimiento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNovedadSeguimiento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNovedadSeguimiento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
					novedadseguimientoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientos) {
					novedadseguimientoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNovedadSeguimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
						novedadseguimientoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientos) {
						novedadseguimientoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadSeguimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadSeguimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNovedadSeguimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNovedadSeguimiento.getSelectedRows();
			
			NovedadSeguimiento novedadseguimientoLocal=new NovedadSeguimiento();
			
			//this.seleccionarTodosNovedadSeguimiento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadseguimientoLocal =(NovedadSeguimiento) this.novedadseguimientoLogic.getNovedadSeguimientos().toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					novedadseguimientoLocal =(NovedadSeguimiento) this.novedadseguimientos.toArray()[this.jTableDatosNovedadSeguimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				novedadseguimientoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
						novedadseguimientoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientos) {
						novedadseguimientoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadSeguimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadSeguimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadSeguimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNovedadSeguimientoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNovedadSeguimientoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNovedadSeguimiento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientoLogic.getNovedadSeguimientos()) {
				
						if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							novedadseguimientoAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD)) {
							existe=true;
							novedadseguimientoAux.setfecha_novedad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO)) {
							existe=true;
							novedadseguimientoAux.setfecha_seguimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadseguimientoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientos) {
					
						if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							novedadseguimientoAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD)) {
							existe=true;
							novedadseguimientoAux.setfecha_novedad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO)) {
							existe=true;
							novedadseguimientoAux.setfecha_seguimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadseguimientoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNovedadSeguimientoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNovedadSeguimiento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNovedadSeguimiento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNovedadSeguimiento) {				
					conSplash=true;//false;										
					
					//this.startProcessNovedadSeguimiento(conSplash);
				
					this.generarReporteNovedadSeguimientosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNovedadSeguimientosSeleccionados();
				//this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadSeguimientosSeleccionados(false);
				//this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadSeguimientosSeleccionados(true);
				//this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadSeguimiento();
				
				this.exportarNovedadSeguimientosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNovedadSeguimientos();
				//this.importarNovedadSeguimientos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadSeguimiento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNovedadSeguimientosSeleccionados();
				//this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNovedadSeguimiento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNovedadSeguimiento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNovedadSeguimiento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
				}	
			} 			
			else if(NovedadSeguimientoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNovedadSeguimiento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNovedadSeguimiento(conSplash);
					
						//this.actualizarParametrosGeneralNovedadSeguimiento();
						
						this.generarReporteProcesoAccionNovedadSeguimientosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NovedadSeguimientoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Novedad SeguimientoES SELECCIONADOS?", "MANTENIMIENTO DE Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNovedadSeguimiento();
				
						this.actualizarParametrosGeneralNovedadSeguimiento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.novedadseguimientoReturnGeneral=novedadseguimientoLogic.procesarAccionNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.novedadseguimientoLogic.getNovedadSeguimientos(),this.novedadseguimientoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNovedadSeguimientoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNovedadSeguimiento();
					
					NovedadSeguimientoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNovedadSeguimientoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadSeguimiento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNovedadSeguimiento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNovedadSeguimiento();
			
			if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
			NovedadSeguimiento novedadseguimiento=new NovedadSeguimiento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNovedadSeguimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNovedadSeguimiento.getSelectedItem();
			
			
			
			
			novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
			//this.sTipoAccion;
			
			if(novedadseguimientosSeleccionados.size()==1) {
				for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
					novedadseguimiento=novedadseguimientoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNovedadSeguimiento();
			
      		//this.finishProcessNovedadSeguimiento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNovedadSeguimientoReturnGeneral() throws Exception {
		if(this.novedadseguimientoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.novedadseguimientoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.novedadseguimientoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.novedadseguimientoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.novedadseguimientoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.novedadseguimientoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNovedadSeguimiento(false);
		}
		
		if(this.novedadseguimientoReturnGeneral.getConRetornoLista() || this.novedadseguimientoReturnGeneral.getConRetornoObjeto()) {
			if(this.novedadseguimientoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadseguimientoLogic.setNovedadSeguimientos(this.novedadseguimientoReturnGeneral.getNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.novedadseguimientoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadseguimientoLogic.setNovedadSeguimiento(this.novedadseguimientoReturnGeneral.getNovedadSeguimiento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNovedadSeguimiento(false);
		}
	}
	
	public void actualizarParametrosGeneralNovedadSeguimiento() throws Exception {
		
		
	}
	
	public ArrayList<NovedadSeguimiento> getNovedadSeguimientosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNovedadSeguimiento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientoLogic.getNovedadSeguimientos()) {
					if(novedadseguimientoAux.getIsSelected()) {
						novedadseguimientosSeleccionados.add(novedadseguimientoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadSeguimiento novedadseguimientoAux:this.novedadseguimientos) {
					if(novedadseguimientoAux.getIsSelected()) {
						novedadseguimientosSeleccionados.add(novedadseguimientoAux);				
					}
				}
			}
			
			if(novedadseguimientosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						novedadseguimientosSeleccionados.addAll(this.novedadseguimientoLogic.getNovedadSeguimientos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						novedadseguimientosSeleccionados.addAll(this.novedadseguimientos);				
					}
				}
			}
		} else {
			novedadseguimientosSeleccionados.add(this.novedadseguimiento);
		}
		
		return novedadseguimientosSeleccionados;
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
	
	public void generarReporteNovedadSeguimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadSeguimientosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadSeguimientosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Novedad Seguimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados);
		
	}	
	
	public void generarReporteNormalNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNovedadSeguimientosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNovedadSeguimiento();
		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNovedadSeguimiento();
		
		
		//this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados ,novedadseguimientoImplementable,novedadseguimientoImplementableHome);
	}
	
	public void mostrarImportacionNovedadSeguimientos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNovedadSeguimiento();
		
		this.abrirFrameImportacionNovedadSeguimiento();		
		
			
		//this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados ,novedadseguimientoImplementable,novedadseguimientoImplementableHome);
	}
	
	public void importarNovedadSeguimientos() throws Exception {		
	
	}
	
	public void exportarNovedadSeguimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNovedadSeguimientosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNovedadSeguimientosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Novedad Seguimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNovedadSeguimiento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNovedadSeguimiento(novedadseguimientoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//novedadseguimientoAux.setsDetalleGeneralEntityReporte(novedadseguimientoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNovedadSeguimiento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=novedadseguimiento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getdetallemovimientoinventario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getnovedadproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getfecha_novedad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getfecha_seguimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadseguimiento.getestadonovedadseguimiento_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NovedadSeguimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNovedadSeguimiento(row);				
				iRow++;
			}				
			
			for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNovedadSeguimiento(novedadseguimientoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();		
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadseguimiento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("novedadseguimientos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("novedadseguimiento");
			//elementRoot.appendChild(element);
		
			for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
				element = document.createElement("novedadseguimiento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNovedadSeguimiento(novedadseguimientoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNovedadSeguimiento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getdetallemovimientoinventario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getnovedadproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getfecha_novedad());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getfecha_seguimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadseguimiento.getestadonovedadseguimiento_descripcion());				
	}
	
	public void setFilaDatosExportarXmlNovedadSeguimiento(NovedadSeguimiento novedadseguimiento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NovedadSeguimientoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(novedadseguimiento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NovedadSeguimientoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(novedadseguimiento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NovedadSeguimientoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(novedadseguimiento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(NovedadSeguimientoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(novedadseguimiento.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetallemovimientoinventario_descripcion = document.createElement(NovedadSeguimientoConstantesFunciones.IDDETALLEMOVIMIENTOINVENTARIO);
		elementdetallemovimientoinventario_descripcion.appendChild(document.createTextNode(novedadseguimiento.getdetallemovimientoinventario_descripcion()));
		element.appendChild(elementdetallemovimientoinventario_descripcion);

		Element elementnovedadproducto_descripcion = document.createElement(NovedadSeguimientoConstantesFunciones.IDNOVEDADPRODUCTO);
		elementnovedadproducto_descripcion.appendChild(document.createTextNode(novedadseguimiento.getnovedadproducto_descripcion()));
		element.appendChild(elementnovedadproducto_descripcion);

		Element elementnumero_comprobante = document.createElement(NovedadSeguimientoConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(novedadseguimiento.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementfecha_novedad = document.createElement(NovedadSeguimientoConstantesFunciones.FECHANOVEDAD);
		elementfecha_novedad.appendChild(document.createTextNode(novedadseguimiento.getfecha_novedad().toString().trim()));
		element.appendChild(elementfecha_novedad);

		Element elementfecha_seguimiento = document.createElement(NovedadSeguimientoConstantesFunciones.FECHASEGUIMIENTO);
		elementfecha_seguimiento.appendChild(document.createTextNode(novedadseguimiento.getfecha_seguimiento().toString().trim()));
		element.appendChild(elementfecha_seguimiento);

		Element elementdescripcion = document.createElement(NovedadSeguimientoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(novedadseguimiento.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementestadonovedadseguimiento_descripcion = document.createElement(NovedadSeguimientoConstantesFunciones.IDESTADONOVEDADSEGUIMIENTO);
		elementestadonovedadseguimiento_descripcion.appendChild(document.createTextNode(novedadseguimiento.getestadonovedadseguimiento_descripcion()));
		element.appendChild(elementestadonovedadseguimiento_descripcion);
	}
	
	public void generarReporteGroupGenericoNovedadSeguimientosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados=new ArrayList<NovedadSeguimiento>();
		
		novedadseguimientosSeleccionados=this.getNovedadSeguimientosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNovedadSeguimiento(novedadseguimientosSeleccionados);
		
		this.generarReporteNovedadSeguimientos("Todos",novedadseguimientosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNovedadSeguimiento(ArrayList<NovedadSeguimiento> novedadseguimientosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NovedadSeguimiento novedadseguimientoAux:novedadseguimientosSeleccionados) {
				novedadseguimientoAux.setsDetalleGeneralEntityReporte(novedadseguimientoAux.toString());
			
				if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getdetallemovimientoinventario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getnovedadproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(novedadseguimientoAux.getfecha_novedad()));
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(novedadseguimientoAux.getfecha_seguimiento()));
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO)) {
					existe=true;
					novedadseguimientoAux.setsDescripcionGeneralEntityReporte1(novedadseguimientoAux.getestadonovedadseguimiento_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNovedadSeguimiento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNovedadSeguimiento=true;
				this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=true;
				this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=true;
			}
			
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=true;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=true;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarNovedadSeguimiento=true;
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadSeguimiento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=true;
		} else {
			this.actualizarEstadoPanelsNovedadSeguimiento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNovedadSeguimiento=false;
			//this.isVisibilidadCeldaVerFormNovedadSeguimiento=false;
			this.isVisibilidadCeldaDuplicarNovedadSeguimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!novedadseguimientoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
		} else {
			this.isVisibilidadCeldaNuevoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadSeguimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			if(!novedadseguimientoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;												
			}
			
			this.jButtonCerrarNovedadSeguimiento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadSeguimiento=false;
		}
		
		if(!this.permiteMantenimiento(this.novedadseguimiento)) {
			this.isVisibilidadCeldaActualizarNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarNovedadSeguimiento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadSeguimiento() {
	}
	
	public void actualizarEstadoPanelsNovedadSeguimiento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionNovedadSeguimiento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadSeguimiento!=null) {
				this.jScrollPanelDatosNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadSeguimiento!=null) {
				this.jPanelPaginacionNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
					this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadSeguimiento!=null) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesNovedadSeguimiento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);}

			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadSeguimiento) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);}

			this.isVisibilidadFK_IdNovedadProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdNovedadProducto) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdNovedadProductoNovedadSeguimiento);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);}

			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadSeguimiento) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);}

			this.isVisibilidadFK_IdNovedadProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdNovedadProducto) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdNovedadProductoNovedadSeguimiento);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleMovimientoInventario(Boolean isParaDetalleMovimientoInventario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleMovimientoInventarioNegation=!isParaDetalleMovimientoInventario;

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaDetalleMovimientoInventario;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);}

			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isParaDetalleMovimientoInventarioNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadSeguimiento) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);}

			this.isVisibilidadFK_IdNovedadProducto=isParaDetalleMovimientoInventarioNegation;
			if(!this.isVisibilidadFK_IdNovedadProducto) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdNovedadProductoNovedadSeguimiento);}
		}
		
	}

	public void setVisibilidadBusquedasParaNovedadProducto(Boolean isParaNovedadProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNovedadProductoNegation=!isParaNovedadProducto;

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaNovedadProductoNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);}

			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isParaNovedadProductoNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadSeguimiento) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);}

			this.isVisibilidadFK_IdNovedadProducto=isParaNovedadProducto;
			if(!this.isVisibilidadFK_IdNovedadProducto) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdNovedadProductoNovedadSeguimiento);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoNovedadSeguimiento(Boolean isParaEstadoNovedadSeguimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoNovedadSeguimientoNegation=!isParaEstadoNovedadSeguimiento;

			this.isVisibilidadFK_IdDetalleMovimientoInventario=isParaEstadoNovedadSeguimientoNegation;
			if(!this.isVisibilidadFK_IdDetalleMovimientoInventario) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);}

			this.isVisibilidadFK_IdEstadoNovedadSeguimiento=isParaEstadoNovedadSeguimiento;
			if(!this.isVisibilidadFK_IdEstadoNovedadSeguimiento) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);}

			this.isVisibilidadFK_IdNovedadProducto=isParaEstadoNovedadSeguimientoNegation;
			if(!this.isVisibilidadFK_IdNovedadProducto) {this.jTabbedPaneBusquedasNovedadSeguimiento.remove(jPanelFK_IdNovedadProductoNovedadSeguimiento);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NovedadSeguimientoSessionBean novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		
		if(this.novedadseguimientoSessionBean==null) {
			this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		}
		
		this.novedadseguimientoSessionBean.setsUltimaBusquedaNovedadSeguimiento(this.getsAccionBusqueda());
		this.novedadseguimientoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.novedadseguimientoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDetalleMovimientoInventario")) {
			novedadseguimientoSessionBean.setid_detalle_movimiento_inventario(this.getid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			novedadseguimientoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoNovedadSeguimiento")) {
			novedadseguimientoSessionBean.setid_estado_novedad_seguimiento(this.getid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdNovedadProducto")) {
			novedadseguimientoSessionBean.setid_novedad_producto(this.getid_novedad_productoFK_IdNovedadProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			novedadseguimientoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NovedadSeguimientoSessionBean novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		
		if(this.novedadseguimientoSessionBean==null) {
			this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		}
		
		if(this.novedadseguimientoSessionBean.getsUltimaBusquedaNovedadSeguimiento()!=null&&!this.novedadseguimientoSessionBean.getsUltimaBusquedaNovedadSeguimiento().equals("")) {
			this.setsAccionBusqueda(novedadseguimientoSessionBean.getsUltimaBusquedaNovedadSeguimiento());
			this.setiNumeroPaginacion(novedadseguimientoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(novedadseguimientoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleMovimientoInventario")) {
				this.setid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario(novedadseguimientoSessionBean.getid_detalle_movimiento_inventario());
				novedadseguimientoSessionBean.setid_detalle_movimiento_inventario(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(novedadseguimientoSessionBean.getid_empresa());
				novedadseguimientoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoNovedadSeguimiento")) {
				this.setid_estado_novedad_seguimientoFK_IdEstadoNovedadSeguimiento(novedadseguimientoSessionBean.getid_estado_novedad_seguimiento());
				novedadseguimientoSessionBean.setid_estado_novedad_seguimiento(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdNovedadProducto")) {
				this.setid_novedad_productoFK_IdNovedadProducto(novedadseguimientoSessionBean.getid_novedad_producto());
				novedadseguimientoSessionBean.setid_novedad_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(novedadseguimientoSessionBean.getid_sucursal());
				novedadseguimientoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.novedadseguimientoSessionBean.setsUltimaBusquedaNovedadSeguimiento("");
		this.novedadseguimientoSessionBean.setiNumeroPaginacion(NovedadSeguimientoConstantesFunciones.INUMEROPAGINACION);
		this.novedadseguimientoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNovedadSeguimiento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNovedadSeguimiento() {
		this.updateBorderResaltarBusquedasFormularioNovedadSeguimiento();
		this.updateVisibilidadBusquedasFormularioNovedadSeguimiento();
		this.updateHabilitarBusquedasFormularioNovedadSeguimiento();
	}
	
	public void updateBorderResaltarBusquedasFormularioNovedadSeguimiento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNovedadSeguimiento.getComponents().length>0) {
	

		if(this.novedadseguimientoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioNovedadSeguimiento!=null) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			}
		}

		if(this.novedadseguimientoConstantesFunciones.resaltarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento!=null) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			}
		}

		if(this.novedadseguimientoConstantesFunciones.resaltarFK_IdNovedadProductoNovedadSeguimiento!=null) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdNovedadProductoNovedadSeguimiento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdNovedadProductoNovedadSeguimiento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNovedadSeguimiento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNovedadSeguimiento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadseguimientoConstantesFunciones.mostrarFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			if(!this.novedadseguimientoConstantesFunciones.mostrarFK_IdDetalleMovimientoInventarioNovedadSeguimiento && index>-1) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadseguimientoConstantesFunciones.mostrarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			if(!this.novedadseguimientoConstantesFunciones.mostrarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento && index>-1) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdNovedadProductoNovedadSeguimiento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadseguimientoConstantesFunciones.mostrarFK_IdNovedadProductoNovedadSeguimiento);
			if(!this.novedadseguimientoConstantesFunciones.mostrarFK_IdNovedadProductoNovedadSeguimiento && index>-1) {
				this.jTabbedPaneBusquedasNovedadSeguimiento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNovedadSeguimiento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNovedadSeguimiento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadseguimientoConstantesFunciones.activarFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
				this.jTabbedPaneBusquedasNovedadSeguimiento.setEnabledAt(index,this.novedadseguimientoConstantesFunciones.activarFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			}

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadseguimientoConstantesFunciones.activarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
				this.jTabbedPaneBusquedasNovedadSeguimiento.setEnabledAt(index,this.novedadseguimientoConstantesFunciones.activarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			}

			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdNovedadProductoNovedadSeguimiento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadseguimientoConstantesFunciones.activarFK_IdNovedadProductoNovedadSeguimiento);
				this.jTabbedPaneBusquedasNovedadSeguimiento.setEnabledAt(index,this.novedadseguimientoConstantesFunciones.activarFK_IdNovedadProductoNovedadSeguimiento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNovedadSeguimiento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDetalleMovimientoInventario")) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdDetalleMovimientoInventarioNovedadSeguimiento);

			this.jTabbedPaneBusquedasNovedadSeguimiento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);

			this.novedadseguimientoConstantesFunciones.setResaltarFK_IdDetalleMovimientoInventarioNovedadSeguimiento(resaltar);

			jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdDetalleMovimientoInventarioNovedadSeguimiento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoNovedadSeguimiento")) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);

			this.jTabbedPaneBusquedasNovedadSeguimiento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);

			this.novedadseguimientoConstantesFunciones.setResaltarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento(resaltar);

			jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdEstadoNovedadSeguimientoNovedadSeguimiento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdNovedadProducto")) {
			index= this.jTabbedPaneBusquedasNovedadSeguimiento.indexOfComponent(this.jPanelFK_IdNovedadProductoNovedadSeguimiento);

			this.jTabbedPaneBusquedasNovedadSeguimiento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadSeguimiento.getComponent(index);

			this.novedadseguimientoConstantesFunciones.setResaltarFK_IdNovedadProductoNovedadSeguimiento(resaltar);

			jPanel.setBorder(this.novedadseguimientoConstantesFunciones.resaltarFK_IdNovedadProductoNovedadSeguimiento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNovedadSeguimiento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNovedadSeguimiento() throws Exception {

		if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNovedadSeguimiento();
		this.updateVisibilidadResaltarControlesFormularioNovedadSeguimiento();
		this.updateHabilitarResaltarControlesFormularioNovedadSeguimiento();
		
	}
	
	public void updateBorderResaltarControlesFormularioNovedadSeguimiento() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.novedadseguimientoConstantesFunciones.resaltaridNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltaridNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarid_empresaNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarid_empresaNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarid_sucursalNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarid_sucursalNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarid_detalle_movimiento_inventarioNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarid_detalle_movimiento_inventarioNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarid_novedad_productoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarid_novedad_productoNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarnumero_comprobanteNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarnumero_comprobanteNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarfecha_novedadNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarfecha_novedadNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarfecha_seguimientoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarfecha_seguimientoNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltardescripcionNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltardescripcionNovedadSeguimiento);}
		if(this.novedadseguimientoConstantesFunciones.resaltarid_estado_novedad_seguimientoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setBorder(this.novedadseguimientoConstantesFunciones.resaltarid_estado_novedad_seguimientoNovedadSeguimiento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNovedadSeguimiento() throws Exception {		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
	
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostraridNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelidNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostraridNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_empresaNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelid_empresaNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_empresaNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_sucursalNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelid_sucursalNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_sucursalNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_detalle_movimiento_inventarioNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_detalle_movimiento_inventarioNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_novedad_productoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelid_novedad_productoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_novedad_productoNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarnumero_comprobanteNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelnumero_comprobanteNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarnumero_comprobanteNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarfecha_novedadNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelfecha_novedadNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarfecha_novedadNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarfecha_seguimientoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelfecha_seguimientoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarfecha_seguimientoNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrardescripcionNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPaneldescripcionNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrardescripcionNovedadSeguimiento);
		//this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_estado_novedad_seguimientoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.setVisible(this.novedadseguimientoConstantesFunciones.mostrarid_estado_novedad_seguimientoNovedadSeguimiento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNovedadSeguimiento() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadSeguimiento!=null) {
	
		this.jInternalFrameDetalleFormNovedadSeguimiento.jLabelidNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activaridNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_empresaNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarid_empresaNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_sucursalNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarid_sucursalNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarid_detalle_movimiento_inventarioNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_novedad_productoNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarid_novedad_productoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jTextFieldnumero_comprobanteNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarnumero_comprobanteNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_novedadNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarfecha_novedadNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jDateChooserfecha_seguimientoNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarfecha_seguimientoNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jTextAreadescripcionNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activardescripcionNovedadSeguimiento);
		this.jInternalFrameDetalleFormNovedadSeguimiento.jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setEnabled(this.novedadseguimientoConstantesFunciones.activarid_estado_novedad_seguimientoNovedadSeguimiento);
		}
	}
	
		
}