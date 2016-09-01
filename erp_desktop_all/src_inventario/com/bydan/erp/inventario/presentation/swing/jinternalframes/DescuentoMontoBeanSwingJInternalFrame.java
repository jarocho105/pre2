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

import com.bydan.erp.inventario.util.DescuentoMontoConstantesFunciones;
import com.bydan.erp.inventario.util.DescuentoMontoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DescuentoMontoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DescuentoMontoBean;
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
public class DescuentoMontoBeanSwingJInternalFrame extends DescuentoMontoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DescuentoMontoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DescuentoMonto> descuentomontoValidator = new ClassValidator<DescuentoMonto>(DescuentoMonto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DescuentoMonto descuentomonto;	
	public DescuentoMonto descuentomontoAux;
	public DescuentoMonto descuentomontoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DescuentoMonto descuentomontoTotales;
	public Long idDescuentoMontoActual;
	public Long iIdNuevoDescuentoMonto=0L;
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

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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
	
	public Boolean isPermisoTodoDescuentoMonto;
	public Boolean isPermisoNuevoDescuentoMonto;
	public Boolean isPermisoActualizarDescuentoMonto;
	public Boolean isPermisoActualizarOriginalDescuentoMonto;
	public Boolean isPermisoEliminarDescuentoMonto;
	public Boolean isPermisoGuardarCambiosDescuentoMonto;
	public Boolean isPermisoConsultaDescuentoMonto;
	public Boolean isPermisoBusquedaDescuentoMonto;
	public Boolean isPermisoReporteDescuentoMonto;
	public Boolean isPermisoPaginacionMedioDescuentoMonto;
	public Boolean isPermisoPaginacionAltoDescuentoMonto;
	public Boolean isPermisoPaginacionTodoDescuentoMonto;
	public Boolean isPermisoCopiarDescuentoMonto;
	public Boolean isPermisoVerFormDescuentoMonto;
	public Boolean isPermisoDuplicarDescuentoMonto;
	public Boolean isPermisoOrdenDescuentoMonto;
	
	
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
	
	public DescuentoMontoParameterReturnGeneral descuentomontoReturnGeneral;
	public DescuentoMontoParameterReturnGeneral descuentomontoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDescuentoMonto=false;
	public Boolean esParaAccionDesdeFormularioDescuentoMonto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DescuentoMontoSessionBeanAdditional descuentomontoSessionBeanAdditional=null;
	
	public DescuentoMontoSessionBeanAdditional getDescuentoMontoSessionBeanAdditional() {
		return this.descuentomontoSessionBeanAdditional;
	}
	
	public void setDescuentoMontoSessionBeanAdditional(DescuentoMontoSessionBeanAdditional descuentomontoSessionBeanAdditional) {
		try {
			this.descuentomontoSessionBeanAdditional=descuentomontoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DescuentoMontoBeanSwingJInternalFrameAdditional descuentomontoBeanSwingJInternalFrameAdditional=null;
	//public class DescuentoMontoBeanSwingJInternalFrame
	
	public DescuentoMontoBeanSwingJInternalFrameAdditional getDescuentoMontoBeanSwingJInternalFrameAdditional() {
		return this.descuentomontoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDescuentoMontoBeanSwingJInternalFrameAdditional(DescuentoMontoBeanSwingJInternalFrameAdditional descuentomontoBeanSwingJInternalFrameAdditional) {
		try {
			this.descuentomontoBeanSwingJInternalFrameAdditional=descuentomontoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DescuentoMontoLogic descuentomontoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DescuentoMonto descuentomontoBean;
	public DescuentoMontoConstantesFunciones descuentomontoConstantesFunciones;
	//public DescuentoMontoParameterReturnGeneral descuentomontoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public BodegaLogic bodegaLogic;
	
	//PARAMETROS
	
	
	//public List<DescuentoMonto> descuentomontos;	
	//public List<DescuentoMonto> descuentomontosEliminados;
	//public List<DescuentoMonto> descuentomontosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDescuentoMonto=false;
	public Boolean isVisibilidadCeldaDuplicarDescuentoMonto=true;
	public Boolean isVisibilidadCeldaCopiarDescuentoMonto=true;
	public Boolean isVisibilidadCeldaVerFormDescuentoMonto=true;
	public Boolean isVisibilidadCeldaOrdenDescuentoMonto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
	public Boolean isVisibilidadCeldaModificarDescuentoMonto=false;
	public Boolean isVisibilidadCeldaActualizarDescuentoMonto=false;
	public Boolean isVisibilidadCeldaEliminarDescuentoMonto=false;
	public Boolean isVisibilidadCeldaCancelarDescuentoMonto=false;
	public Boolean isVisibilidadCeldaGuardarDescuentoMonto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDescuentoMonto() {
		return this.iIdNuevoDescuentoMonto;
	}

	public void setiIdNuevoDescuentoMonto(Long iIdNuevoDescuentoMonto) {
		this.iIdNuevoDescuentoMonto = iIdNuevoDescuentoMonto;
	}
	
	public Long getidDescuentoMontoActual() {
		return this.idDescuentoMontoActual;
	}

	public void setidDescuentoMontoActual(Long idDescuentoMontoActual) {
		this.idDescuentoMontoActual = idDescuentoMontoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DescuentoMonto getdescuentomonto() {
		return this.descuentomonto;
	}

	public void setdescuentomonto(DescuentoMonto descuentomonto) {
		this.descuentomonto = descuentomonto;
	}
	
	public DescuentoMonto getdescuentomontoAux() {
		return this.descuentomontoAux;
	}

	public void setdescuentomontoAux(DescuentoMonto descuentomontoAux) {
		this.descuentomontoAux = descuentomontoAux;
	}				
	
	public DescuentoMonto getdescuentomontoAnterior() {
		return this.descuentomontoAnterior;
	}

	public void setdescuentomontoAnterior(DescuentoMonto descuentomontoAnterior) {
		this.descuentomontoAnterior = descuentomontoAnterior;
	}	
	
	public DescuentoMonto getdescuentomontoTotales() {
		return this.descuentomontoTotales;
	}

	public void setdescuentomontoTotales(DescuentoMonto descuentomontoTotales) {
		this.descuentomontoTotales = descuentomontoTotales;
	}	
	
	public DescuentoMonto getdescuentomontoBean() {
		return this.descuentomontoBean;
	}

	public void setdescuentomontoBean(DescuentoMonto descuentomontoBean) {
		this.descuentomontoBean = descuentomontoBean;
	}	
	
	public DescuentoMontoParameterReturnGeneral getdescuentomontoReturnGeneral() {
		return this.descuentomontoReturnGeneral;
	}

	public void setdescuentomontoReturnGeneral(DescuentoMontoParameterReturnGeneral descuentomontoReturnGeneral) {
		this.descuentomontoReturnGeneral = descuentomontoReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DescuentoMontoLogic getDescuentoMontoLogic()	{		
		return descuentomontoLogic;
	}

	public void setDescuentoMontoLogic(DescuentoMontoLogic descuentomontoLogic) {
		this.descuentomontoLogic = descuentomontoLogic;
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
	
	public Boolean getIsEsNuevoDescuentoMonto() {
		return isEsNuevoDescuentoMonto;
	}

	public void setIsEsNuevoDescuentoMonto(Boolean isEsNuevoDescuentoMonto) {
		this.isEsNuevoDescuentoMonto = isEsNuevoDescuentoMonto;
	}

	public Boolean getEsParaAccionDesdeFormularioDescuentoMonto() {
		return esParaAccionDesdeFormularioDescuentoMonto;
	}
	
	public void setEsParaAccionDesdeFormularioDescuentoMonto(Boolean esParaAccionDesdeFormularioDescuentoMonto) {
		this.esParaAccionDesdeFormularioDescuentoMonto = esParaAccionDesdeFormularioDescuentoMonto;
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

			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			}

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(descuentomontoSessionBean.getlidEmpresaActual());
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

			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			}

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(descuentomontoSessionBean.getlidSucursalActual());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			}

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(descuentomontoSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			}

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(descuentomontoSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

					if(this.descuentomonto!=null) {
						this.descuentomonto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDescuentoMonto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDescuentoMontoGenerico)throws Exception
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
				jComboBoxid_empresaDescuentoMontoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDescuentoMontoGenerico!=null && jComboBoxid_empresaDescuentoMontoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDescuentoMontoGenerico.setSelectedIndex(0);
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

					if(this.descuentomonto!=null) {
						this.descuentomonto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDescuentoMonto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDescuentoMontoGenerico)throws Exception
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
				jComboBoxid_sucursalDescuentoMontoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDescuentoMontoGenerico!=null && jComboBoxid_sucursalDescuentoMontoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDescuentoMontoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.descuentomonto!=null) {
						this.descuentomonto.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDescuentoMonto.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioDescuentoMontoGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDescuentoMontoGenerico!=null && jComboBoxid_usuarioDescuentoMontoGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDescuentoMontoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.descuentomonto!=null) {
						this.descuentomonto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDescuentoMonto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
						if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.getItemCount()>0) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDescuentoMonto!=null) {
						jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDescuentoMonto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaDescuentoMontoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDescuentoMontoGenerico!=null && jComboBoxid_bodegaDescuentoMontoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDescuentoMontoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DescuentoMonto descuentomonto,JComboBox jComboBoxid_empresaDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDescuentoMontoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDescuentoMontoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				descuentomonto.setid_empresa(empresaAux.getId());
				descuentomonto.setempresa_descripcion(DescuentoMontoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				descuentomonto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DescuentoMonto descuentomonto,JComboBox jComboBoxid_sucursalDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDescuentoMontoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDescuentoMontoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				descuentomonto.setid_sucursal(sucursalAux.getId());
				descuentomonto.setsucursal_descripcion(DescuentoMontoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				descuentomonto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DescuentoMonto descuentomonto,JComboBox jComboBoxid_usuarioDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDescuentoMontoGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDescuentoMontoGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				descuentomonto.setid_usuario(usuarioAux.getId());
				descuentomonto.setusuario_descripcion(DescuentoMontoConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				descuentomonto.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DescuentoMonto descuentomonto,JComboBox jComboBoxid_bodegaDescuentoMontoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDescuentoMontoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDescuentoMontoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				descuentomonto.setid_bodega(bodegaAux.getId());
				descuentomonto.setbodega_descripcion(DescuentoMontoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				descuentomonto.setBodega(bodegaAux);			}
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

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
					}

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
					}

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
					}

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { 
					}

					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.addItem(bodega);
							}
						}

						if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDescuentoMonto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DescuentoMontoConstantesFunciones.refrescarForeignKeysDescripcionesDescuentoMonto(this.descuentomontoLogic.getDescuentoMontos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DescuentoMontoConstantesFunciones.refrescarForeignKeysDescripcionesDescuentoMonto(this.descuentomontos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Bodega.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//descuentomontoLogic.setDescuentoMontos(this.descuentomontos);
			descuentomontoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DescuentoMontoParameterReturnGeneral getDescuentoMontoParameterGeneral() {
		return this.descuentomontoParameterGeneral;
	}
	
	public void setDescuentoMontoParameterGeneral(DescuentoMontoParameterReturnGeneral descuentomontoParameterGeneral) {
		this.descuentomontoParameterGeneral = descuentomontoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDescuentoMonto() {
		return isPermisoTodoDescuentoMonto;
	}

	public void setIsPermisoTodoDescuentoMonto(Boolean isPermisoTodoDescuentoMonto) {
		this.isPermisoTodoDescuentoMonto = isPermisoTodoDescuentoMonto;
	}

	public Boolean getIsPermisoNuevoDescuentoMonto() {
		return isPermisoNuevoDescuentoMonto;
	}

	public void setIsPermisoNuevoDescuentoMonto(Boolean isPermisoNuevoDescuentoMonto) {
		this.isPermisoNuevoDescuentoMonto = isPermisoNuevoDescuentoMonto;
	}

	public Boolean getIsPermisoActualizarDescuentoMonto() {
		return isPermisoActualizarDescuentoMonto;
	}

	public void setIsPermisoActualizarDescuentoMonto(Boolean isPermisoActualizarDescuentoMonto) {
		this.isPermisoActualizarDescuentoMonto = isPermisoActualizarDescuentoMonto;
	}

	public Boolean getIsPermisoEliminarDescuentoMonto() {
		return isPermisoEliminarDescuentoMonto;
	}

	public void setIsPermisoEliminarDescuentoMonto(Boolean isPermisoEliminarDescuentoMonto) {
		this.isPermisoEliminarDescuentoMonto = isPermisoEliminarDescuentoMonto;
	}

	public Boolean getIsPermisoGuardarCambiosDescuentoMonto() {
		return isPermisoGuardarCambiosDescuentoMonto;
	}

	public void setIsPermisoGuardarCambiosDescuentoMonto(Boolean isPermisoGuardarCambiosDescuentoMonto) {
		this.isPermisoGuardarCambiosDescuentoMonto = isPermisoGuardarCambiosDescuentoMonto;
	}
	
	public Boolean getIsPermisoConsultaDescuentoMonto() {
		return isPermisoConsultaDescuentoMonto;
	}

	public void setIsPermisoConsultaDescuentoMonto(Boolean isPermisoConsultaDescuentoMonto) {
		this.isPermisoConsultaDescuentoMonto = isPermisoConsultaDescuentoMonto;
	}

	public Boolean getIsPermisoBusquedaDescuentoMonto() {
		return isPermisoBusquedaDescuentoMonto;
	}

	public void setIsPermisoBusquedaDescuentoMonto(Boolean isPermisoBusquedaDescuentoMonto) {
		this.isPermisoBusquedaDescuentoMonto = isPermisoBusquedaDescuentoMonto;
	}

	public Boolean getIsPermisoReporteDescuentoMonto() {
		return isPermisoReporteDescuentoMonto;
	}

	public void setIsPermisoReporteDescuentoMonto(Boolean isPermisoReporteDescuentoMonto) {
		this.isPermisoReporteDescuentoMonto = isPermisoReporteDescuentoMonto;
	}
	
	public Boolean getIsPermisoPaginacionMedioDescuentoMonto() {
		return isPermisoPaginacionMedioDescuentoMonto;
	}

	public void setIsPermisoPaginacionMedioDescuentoMonto(Boolean isPermisoPaginacionMedioDescuentoMonto) {
		this.isPermisoPaginacionMedioDescuentoMonto = isPermisoPaginacionMedioDescuentoMonto;
	}
	
	public Boolean getIsPermisoPaginacionTodoDescuentoMonto() {
		return isPermisoPaginacionTodoDescuentoMonto;
	}

	public void setIsPermisoPaginacionTodoDescuentoMonto(Boolean isPermisoPaginacionTodoDescuentoMonto) {
		this.isPermisoPaginacionTodoDescuentoMonto = isPermisoPaginacionTodoDescuentoMonto;
	}
	
	public Boolean getIsPermisoPaginacionAltoDescuentoMonto() {
		return isPermisoPaginacionAltoDescuentoMonto;
	}

	public void setIsPermisoPaginacionAltoDescuentoMonto(Boolean isPermisoPaginacionAltoDescuentoMonto) {
		this.isPermisoPaginacionAltoDescuentoMonto = isPermisoPaginacionAltoDescuentoMonto;
	}
	
	public Boolean getIsPermisoCopiarDescuentoMonto() {
		return isPermisoCopiarDescuentoMonto;
	}

	public void setIsPermisoCopiarDescuentoMonto(Boolean isPermisoCopiarDescuentoMonto) {
		this.isPermisoCopiarDescuentoMonto = isPermisoCopiarDescuentoMonto;
	}
	
	public Boolean getIsPermisoVerFormDescuentoMonto() {
		return isPermisoVerFormDescuentoMonto;
	}

	public void setIsPermisoVerFormDescuentoMonto(Boolean isPermisoVerFormDescuentoMonto) {
		this.isPermisoVerFormDescuentoMonto = isPermisoVerFormDescuentoMonto;
	}
	
	public Boolean getIsPermisoDuplicarDescuentoMonto() {
		return isPermisoDuplicarDescuentoMonto;
	}

	public void setIsPermisoDuplicarDescuentoMonto(Boolean isPermisoDuplicarDescuentoMonto) {
		this.isPermisoDuplicarDescuentoMonto = isPermisoDuplicarDescuentoMonto;
	}
	
	public Boolean getIsPermisoOrdenDescuentoMonto() {
		return isPermisoOrdenDescuentoMonto;
	}

	public void setIsPermisoOrdenDescuentoMonto(Boolean isPermisoOrdenDescuentoMonto) {
		this.isPermisoOrdenDescuentoMonto = isPermisoOrdenDescuentoMonto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDescuentoMonto() {
		return isVisibilidadCeldaNuevoDescuentoMonto;
	}

	public void setIsVisibilidadCeldaNuevoDescuentoMonto(Boolean isVisibilidadCeldaNuevoDescuentoMonto) {
		this.isVisibilidadCeldaNuevoDescuentoMonto = isVisibilidadCeldaNuevoDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDescuentoMonto() {
		return isVisibilidadCeldaDuplicarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaDuplicarDescuentoMonto(Boolean isVisibilidadCeldaDuplicarDescuentoMonto) {
		this.isVisibilidadCeldaDuplicarDescuentoMonto = isVisibilidadCeldaDuplicarDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDescuentoMonto() {
		return isVisibilidadCeldaCopiarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaCopiarDescuentoMonto(Boolean isVisibilidadCeldaCopiarDescuentoMonto) {
		this.isVisibilidadCeldaCopiarDescuentoMonto = isVisibilidadCeldaCopiarDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDescuentoMonto() {
		return isVisibilidadCeldaVerFormDescuentoMonto;
	}

	public void setIsVisibilidadCeldaVerFormDescuentoMonto(Boolean isVisibilidadCeldaVerFormDescuentoMonto) {
		this.isVisibilidadCeldaVerFormDescuentoMonto = isVisibilidadCeldaVerFormDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDescuentoMonto() {
		return isVisibilidadCeldaOrdenDescuentoMonto;
	}

	public void setIsVisibilidadCeldaOrdenDescuentoMonto(Boolean isVisibilidadCeldaOrdenDescuentoMonto) {
		this.isVisibilidadCeldaOrdenDescuentoMonto = isVisibilidadCeldaOrdenDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDescuentoMonto() {
		return isVisibilidadCeldaNuevoRelacionesDescuentoMonto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDescuentoMonto(Boolean isVisibilidadCeldaNuevoRelacionesDescuentoMonto) {
		this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto = isVisibilidadCeldaNuevoRelacionesDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDescuentoMonto() {
		return isVisibilidadCeldaModificarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaModificarDescuentoMonto(Boolean isVisibilidadCeldaModificarDescuentoMonto) {
		this.isVisibilidadCeldaModificarDescuentoMonto = isVisibilidadCeldaModificarDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDescuentoMonto() {
		return isVisibilidadCeldaActualizarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaActualizarDescuentoMonto(Boolean isVisibilidadCeldaActualizarDescuentoMonto) {
		this.isVisibilidadCeldaActualizarDescuentoMonto = isVisibilidadCeldaActualizarDescuentoMonto;
	}

	public Boolean getIsVisibilidadCeldaEliminarDescuentoMonto() {
		return isVisibilidadCeldaEliminarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaEliminarDescuentoMonto(Boolean isVisibilidadCeldaEliminarDescuentoMonto) {
		this.isVisibilidadCeldaEliminarDescuentoMonto = isVisibilidadCeldaEliminarDescuentoMonto;
	}

	public Boolean getIsVisibilidadCeldaCancelarDescuentoMonto() {
		return isVisibilidadCeldaCancelarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaCancelarDescuentoMonto(Boolean isVisibilidadCeldaCancelarDescuentoMonto) {
		this.isVisibilidadCeldaCancelarDescuentoMonto = isVisibilidadCeldaCancelarDescuentoMonto;
	}

	public Boolean getIsVisibilidadCeldaGuardarDescuentoMonto() {
		return isVisibilidadCeldaGuardarDescuentoMonto;
	}

	public void setIsVisibilidadCeldaGuardarDescuentoMonto(Boolean isVisibilidadCeldaGuardarDescuentoMonto) {
		this.isVisibilidadCeldaGuardarDescuentoMonto = isVisibilidadCeldaGuardarDescuentoMonto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDescuentoMonto() {
		return isVisibilidadCeldaGuardarCambiosDescuentoMonto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDescuentoMonto(Boolean isVisibilidadCeldaGuardarCambiosDescuentoMonto) {
		this.isVisibilidadCeldaGuardarCambiosDescuentoMonto = isVisibilidadCeldaGuardarCambiosDescuentoMonto;
	}
		
	public DescuentoMontoSessionBean getdescuentomontoSessionBean() {
		return this.descuentomontoSessionBean;
	}
	
	public void setdescuentomontoSessionBean(DescuentoMontoSessionBean descuentomontoSessionBean) {
		this.descuentomontoSessionBean=descuentomontoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(DescuentoMonto descuentomonto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(descuentomonto,null);
				this.setActualParaGuardarSucursalForeignKey(descuentomonto,null);
				this.setActualParaGuardarUsuarioForeignKey(descuentomonto,null);
				this.setActualParaGuardarBodegaForeignKey(descuentomonto,null);
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
	
	public void bugActualizarReferenciaActual(DescuentoMonto descuentomonto,DescuentoMonto descuentomontoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDescuentoMonto(descuentomonto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		descuentomontoAux.setId(descuentomonto.getId());
		descuentomontoAux.setVersionRow(descuentomonto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDescuentoMonto();
		
			int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = descuentomontoValidator.getInvalidValues(this.descuentomonto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			descuentomontoLogic.setDatosCliente(datosCliente);
			descuentomontoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				descuentomontoAux=new  DescuentoMonto();
				
				descuentomontoAux.setIsNew(true);
				descuentomontoAux.setIsChanged(true);
				
				descuentomontoAux.setDescuentoMontoOriginal(this.descuentomonto);
				
				descuentomontoAux.setId(this.descuentomonto.getId());	
				descuentomontoAux.setVersionRow(this.descuentomonto.getVersionRow());	
				descuentomontoAux.setid_empresa(this.descuentomonto.getid_empresa());	
				descuentomontoAux.setid_sucursal(this.descuentomonto.getid_sucursal());	
				descuentomontoAux.setid_usuario(this.descuentomonto.getid_usuario());	
				descuentomontoAux.setid_bodega(this.descuentomonto.getid_bodega());	
				descuentomontoAux.setdescripcion(this.descuentomonto.getdescripcion());	
				descuentomontoAux.setporcentaje(this.descuentomonto.getporcentaje());	
				descuentomontoAux.setvalor_inicio(this.descuentomonto.getvalor_inicio());	
				descuentomontoAux.setvalor_fin(this.descuentomonto.getvalor_fin());	
				descuentomontoAux.setesta_activo(this.descuentomonto.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentomontoAux,descuentomontos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.saveDescuentoMontos();//WithConnection
						//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);
					
					this.refrescarForeignKeysDescripcionesDescuentoMonto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentomontoLogic.saveDescuentoMontoRelaciones(descuentomontoAux);//WithConnection
								//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(descuentomontoAux,descuentomontos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				descuentomontoAux=new  DescuentoMonto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.descuentomontoSessionBean.getEsGuardarRelacionado() 
					|| (this.descuentomontoSessionBean.getEsGuardarRelacionado() && this.descuentomonto.getId()>=0)) {
						
					descuentomontoAux.setIsNew(false);
				}
				
				descuentomontoAux.setIsDeleted(false);
			
				descuentomontoAux.setId(this.descuentomonto.getId());	
				descuentomontoAux.setVersionRow(this.descuentomonto.getVersionRow());	
				descuentomontoAux.setid_empresa(this.descuentomonto.getid_empresa());	
				descuentomontoAux.setid_sucursal(this.descuentomonto.getid_sucursal());	
				descuentomontoAux.setid_usuario(this.descuentomonto.getid_usuario());	
				descuentomontoAux.setid_bodega(this.descuentomonto.getid_bodega());	
				descuentomontoAux.setdescripcion(this.descuentomonto.getdescripcion());	
				descuentomontoAux.setporcentaje(this.descuentomonto.getporcentaje());	
				descuentomontoAux.setvalor_inicio(this.descuentomonto.getvalor_inicio());	
				descuentomontoAux.setvalor_fin(this.descuentomonto.getvalor_fin());	
				descuentomontoAux.setesta_activo(this.descuentomonto.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentomontoAux,descuentomontos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.saveDescuentoMontos();//WithConnection
						//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);
					
					this.refrescarForeignKeysDescripcionesDescuentoMonto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentomontoLogic.saveDescuentoMontoRelaciones(descuentomontoAux);//WithConnection
								//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(descuentomontoAux,descuentomontos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.descuentomonto,descuentomontoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				descuentomontoAux=new  DescuentoMonto();
				
				descuentomontoAux.setIsNew(false);
				descuentomontoAux.setIsChanged(false);
				
				descuentomontoAux.setIsDeleted(true);
				
				descuentomontoAux.setId(this.descuentomonto.getId());	
				descuentomontoAux.setVersionRow(this.descuentomonto.getVersionRow());	
				descuentomontoAux.setid_empresa(this.descuentomonto.getid_empresa());	
				descuentomontoAux.setid_sucursal(this.descuentomonto.getid_sucursal());	
				descuentomontoAux.setid_usuario(this.descuentomonto.getid_usuario());	
				descuentomontoAux.setid_bodega(this.descuentomonto.getid_bodega());	
				descuentomontoAux.setdescripcion(this.descuentomonto.getdescripcion());	
				descuentomontoAux.setporcentaje(this.descuentomonto.getporcentaje());	
				descuentomontoAux.setvalor_inicio(this.descuentomonto.getvalor_inicio());	
				descuentomontoAux.setvalor_fin(this.descuentomonto.getvalor_fin());	
				descuentomontoAux.setesta_activo(this.descuentomonto.getesta_activo());	
				
				if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.descuentomontoAux.getId()>=0) {	
						this.descuentomontosEliminados.add(descuentomontoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentomontoAux,descuentomontos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.saveDescuentoMontos();//WithConnection
						//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								descuentomontoLogic.saveDescuentoMontoRelaciones(descuentomontoAux);//WithConnection
								//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
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
							if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(descuentomontoAux,descuentomontoLogic.getDescuentoMontos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(descuentomontoAux,descuentomontos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getDescuentoMontos().addAll(this.descuentomontosEliminados);
					
					descuentomontoLogic.saveDescuentoMontos();//WithConnection
					//descuentomontoLogic.getSetVersionRowDescuentoMontos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDescuentoMonto();
				
				this.descuentomontosEliminados= new ArrayList<DescuentoMonto>();		
			}
			
			if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Descuento Monto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.descuentomonto=descuentomontoAux;
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
      		//this.finishProcessDescuentoMonto();
      	}
		
	}	
	
	public void actualizarRelaciones(DescuentoMonto descuentomontoLocal) throws Exception {
		
		if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DescuentoMonto descuentomontoLocal) throws Exception {	
		if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				descuentomontoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				descuentomontoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				descuentomontoLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				descuentomontoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDescuentoMontoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = descuentomontoValidator.getInvalidValues(this.descuentomonto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DescuentoMonto descuentomonto,List<DescuentoMonto> descuentomontos) throws Exception {
		try	{		
			DescuentoMontoConstantesFunciones.actualizarLista(descuentomonto,descuentomontos,this.descuentomontoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DescuentoMonto descuentomonto,List<DescuentoMonto> descuentomontos) throws Exception {
		try	{			
			DescuentoMontoConstantesFunciones.actualizarSelectedLista(descuentomonto,descuentomontos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DescuentoMonto> descuentomontosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				descuentomontosLocal=this.descuentomontoLogic.getDescuentoMontos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				descuentomontosLocal=this.descuentomontos;
			}
			//ARCHITECTURE
		
			for(DescuentoMonto descuentomontoLocal:descuentomontosLocal) {
				if(this.permiteMantenimiento(descuentomontoLocal) && descuentomontoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DescuentoMontoConstantesFunciones.getDescuentoMontoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_empresaDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_sucursalDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_usuarioDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_bodegaDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabeldescripcionDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelporcentajeDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.VALORINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_inicioDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.VALORFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_finDescuentoMonto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DescuentoMontoConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelesta_activoDescuentoMonto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_empresaDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_sucursalDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_usuarioDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelid_bodegaDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabeldescripcionDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelporcentajeDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_inicioDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_finDescuentoMonto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDescuentoMonto.jLabelesta_activoDescuentoMonto,"");
		
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
		this.iIdNuevoDescuentoMonto--;	
		
		
		this.descuentomontoAux=new DescuentoMonto();
		
		this.descuentomontoAux.setId(this.iIdNuevoDescuentoMonto);
		this.descuentomontoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.descuentomontoLogic.getDescuentoMontos().add(this.descuentomontoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.descuentomontos.add(this.descuentomontoAux);
		}
		//ARCHITECTURE
		
		this.descuentomonto=this.descuentomontoAux;
		
		if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDescuentoMonto(this.descuentomonto);
			this.setVariablesObjetoActualToFormularioForeignKeyDescuentoMonto(this.descuentomonto);
		}
				
		//this.setDefaultControlesDescuentoMonto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDescuentoMonto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDescuentoMonto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoMonto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDescuentoMonto(this.descuentomontoBean,this.descuentomonto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DescuentoMontoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
			classes=DescuentoMontoConstantesFunciones.getClassesRelationshipsOfDescuentoMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.descuentomontoReturnGeneral=descuentomontoLogic.procesarEventosDescuentoMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentomontoLogic.getDescuentoMontos(),this.descuentomonto,this.descuentomontoParameterGeneral,this.isEsNuevoDescuentoMonto,classes);//this.descuentomontoLogic.getDescuentoMonto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDescuentoMonto(this.descuentomontoReturnGeneral,this.descuentomontoBean,false);
		
		if(this.descuentomontoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto());
		}
		
		if(this.descuentomontoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto(),classes);//this.descuentomontoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDescuentoMonto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDescuentoMonto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.RecargarFormDescuentoMonto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDescuentoMonto(false);
						
			if(descuentomontoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoMonto();
			}
			
			this.actualizarVisualTableDatosDescuentoMonto();
			
			this.jTableDatosDescuentoMonto.setRowSelectionInterval(this.getIndiceNuevoDescuentoMonto(), this.getIndiceNuevoDescuentoMonto());
			
			this.seleccionarFilaTablaDescuentoMontoActual();
						
			this.actualizarEstadoCeldasBotonesDescuentoMonto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDescuentoMonto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activardescripcionDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarporcentajeDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarvalor_inicioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarvalor_finDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activaresta_activoDescuentoMonto);	
		//
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarid_empresaDescuentoMonto);//
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarid_sucursalDescuentoMonto);//
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarid_usuarioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setEnabled(isHabilitar && this.descuentomontoConstantesFunciones.activarid_bodegaDescuentoMonto);
	};
	
	public void setDefaultControlesDescuentoMonto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDescuentoMonto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.descuentomontoSessionBean.setConGuardarRelaciones(true);			
			this.descuentomontoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.setVisible(true);
			
					
		} else {
			//this.descuentomontoSessionBean.setConGuardarRelaciones(false);			
			this.descuentomontoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDescuentoMonto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
				if(descuentomontoAux.getId().equals(this.iIdNuevoDescuentoMonto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontos) {
				if(descuentomontoAux.getId().equals(this.iIdNuevoDescuentoMonto)) {
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
	
	public int getIndiceActualDescuentoMonto(DescuentoMonto descuentomonto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
				if(descuentomontoAux.getId().equals(descuentomonto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontos) {
				if(descuentomontoAux.getId().equals(descuentomonto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDescuentoMonto(DescuentoMonto descuentomontoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
				if(descuentomontoAux.getDescuentoMontoOriginal().getId().equals(descuentomontoOriginal.getId())) {
					existe=true;
					descuentomontoOriginal.setId(descuentomontoAux.getId());
					descuentomontoOriginal.setVersionRow(descuentomontoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoMonto descuentomontoAux:this.descuentomontos) {
				if(descuentomontoAux.getDescuentoMontoOriginal().getId().equals(descuentomontoOriginal.getId())) {
					existe=true;
					descuentomontoOriginal.setId(descuentomontoAux.getId());
					descuentomontoOriginal.setVersionRow(descuentomontoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDescuentoMonto(Boolean esParaCancelar) throws Exception {
		descuentomontosAux=new ArrayList<DescuentoMonto>();
		descuentomontoAux=new DescuentoMonto();
		
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
					if(descuentomontoAux.getId()<0) {
						descuentomontosAux.add(descuentomontoAux);
					}		
				}
				this.iIdNuevoDescuentoMonto=0L;
				this.descuentomontoLogic.getDescuentoMontos().removeAll(descuentomontosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoMonto descuentomontoAux:this.descuentomontos) {
					if(descuentomontoAux.getId()<0) {
						descuentomontosAux.add(descuentomontoAux);
					}		
				}
				this.iIdNuevoDescuentoMonto=0L;
				this.descuentomontos.removeAll(descuentomontosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDescuentoMonto 
					&& this.descuentomontoLogic.getDescuentoMontos().size()>0
					) {
					descuentomontoAux=this.descuentomontoLogic.getDescuentoMontos().get(this.descuentomontoLogic.getDescuentoMontos().size() - 1);
				
					if(descuentomontoAux.getId()<0) {
						this.descuentomontoLogic.getDescuentoMontos().remove(descuentomontoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDescuentoMonto && this.descuentomontos.size()>0) {
					descuentomontoAux=this.descuentomontos.get(this.descuentomontos.size() - 1);
				
					if(descuentomontoAux.getId()<0) {
						this.descuentomontos.remove(descuentomontoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDescuentoMonto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(descuentomonto.getId()<0) {
				this.descuentomontoLogic.getDescuentoMontos().remove(this.descuentomonto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(descuentomonto.getId()<0) {
				this.descuentomontos.remove(this.descuentomonto);
			}
		}			
	}
	
	public void setEstadosInicialesDescuentoMonto(List<DescuentoMonto> descuentomontosAux) throws Exception {
		DescuentoMontoConstantesFunciones.setEstadosInicialesDescuentoMonto(descuentomontosAux);
	}
	
	public void setEstadosInicialesDescuentoMonto(DescuentoMonto descuentomontoAux) throws Exception {
		DescuentoMontoConstantesFunciones.setEstadosInicialesDescuentoMonto(descuentomontoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDescuentoMontoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDescuentoMontoActual()) {
				if(!this.isEsNuevoDescuentoMonto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDescuentoMonto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDescuentoMontoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Descuento Monto ?", "MANTENIMIENTO DE Descuento Monto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DescuentoMonto descuentomonto) throws Exception {
		DescuentoMontoConstantesFunciones.seleccionarAsignar(this.descuentomonto,descuentomonto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDescuentoMonto=this.isPermisoActualizarOriginalDescuentoMonto;
			
			
			this.seleccionarAsignar(descuentomonto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DescuentoMontoConstantesFunciones.quitarEspaciosDescuentoMonto(this.descuentomonto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDescuentoMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.descuentomontoSessionBean.setsFuncionBusquedaRapida(this.descuentomontoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDescuentoMonto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDescuentoMonto(esParaCancelar);				
				this.cancelarNuevoDescuentoMonto(esParaCancelar);								
			}
			
			this.descuentomonto=new DescuentoMonto();
			
			this.inicializarDescuentoMonto();
			
			this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDescuentoMonto() throws Exception {
		try {
			DescuentoMontoConstantesFunciones.inicializarDescuentoMonto(this.descuentomonto);
			
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
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.descuentomontoLogic.getDescuentoMontos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDescuentoMontos(String sAccionBusqueda,List<DescuentoMonto> descuentomontosParaReportes) throws Exception {
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
					sPathReporteFinal="DescuentoMonto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DescuentoMontoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DescuentoMontoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DescuentoMonto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Descuento Montos");		
		parameters.put("busquedapor", DescuentoMontoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDescuentoMonto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DescuentoMontoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DescuentoMontoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDescuentoMonto=new JRBeanArrayDataSource(DescuentoMontoJInternalFrame.TraerDescuentoMontoBeans(descuentomontosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDescuentoMonto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DescuentoMontoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DescuentoMontoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DescuentoMontoBean.TraerDescuentoMontoBeans(descuentomontosParaReportes).toArray()));
							
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
				this.generarExcelReporteDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDescuentoMontoActionPerformed(null);
					//this.generarExcelReporteDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDescuentoMontos(sAccionBusqueda,sTipoArchivoReporte,descuentomontosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDescuentoMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoMonto> descuentomontosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoMontos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDescuentoMonto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DescuentoMonto descuentomonto : descuentomontosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DescuentoMontoConstantesFunciones.generarExcelReporteDataDescuentoMonto("NORMAL",row,workbook,descuentomonto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDescuentoMonto(String sTipo,Row row,Workbook workbook) {
		
		DescuentoMontoConstantesFunciones.generarExcelReporteHeaderDescuentoMonto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDescuentoMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoMonto> descuentomontosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoMontos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DescuentoMonto descuentomonto : descuentomontosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DescuentoMontoConstantesFunciones.getDescuentoMontoDescripcion(descuentomonto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getvalor_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_VALORFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(descuentomonto.getvalor_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(descuentomonto.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDescuentoMontos(String sAccionBusqueda,String sTipoArchivoReporte,List<DescuentoMonto> descuentomontosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DescuentoMonto> descuentomontosRespaldo=null;
		
		classes=DescuentoMontoConstantesFunciones.getClassesRelationshipsOfDescuentoMonto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.descuentomontoLogic.setDatosCliente(this.datosCliente);
		this.descuentomontoLogic.setDatosDeep(this.datosDeep);
		this.descuentomontoLogic.setIsConDeep(true);
		
		descuentomontosRespaldo=this.descuentomontoLogic.getDescuentoMontos();
		
		this.descuentomontoLogic.setDescuentoMontos(descuentomontosParaReportes);	
		this.descuentomontoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		descuentomontosParaReportes=this.descuentomontoLogic.getDescuentoMontos();
		this.descuentomontoLogic.setDescuentoMontos(descuentomontosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DescuentoMontos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDescuentoMonto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DescuentoMonto descuentomonto : descuentomontosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDescuentoMonto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DescuentoMontoConstantesFunciones.generarExcelReporteDataDescuentoMonto("NORMAL",row,workbook,descuentomonto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DescuentoMontoConstantesFunciones.getDescuentoMontoDescripcion(descuentomonto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoMonto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDescuentoMonto() throws Exception {		
		this.startProcessDescuentoMonto(true);
	}
	
	public void startProcessDescuentoMonto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDescuentoMonto ,this.jPanelParametrosReportesDescuentoMonto, this.jScrollPanelDatosDescuentoMonto,this.jPanelPaginacionDescuentoMonto, this.jScrollPanelDatosEdicionDescuentoMonto, this.jPanelAccionesDescuentoMonto,this.jPanelAccionesFormularioDescuentoMonto,this.jmenuBarDescuentoMonto,this.jmenuBarDetalleDescuentoMonto,this.jTtoolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto);		
		
		final JTabbedPane jTabbedPaneBusquedasDescuentoMonto=this.jTabbedPaneBusquedasDescuentoMonto; 
		
		final JPanel jPanelParametrosReportesDescuentoMonto=this.jPanelParametrosReportesDescuentoMonto;
		//final JScrollPane jScrollPanelDatosDescuentoMonto=this.jScrollPanelDatosDescuentoMonto;
		final JTable jTableDatosDescuentoMonto=this.jTableDatosDescuentoMonto;		
		final JPanel jPanelPaginacionDescuentoMonto=this.jPanelPaginacionDescuentoMonto;
		//final JScrollPane jScrollPanelDatosEdicionDescuentoMonto=this.jScrollPanelDatosEdicionDescuentoMonto;
		final JPanel jPanelAccionesDescuentoMonto=this.jPanelAccionesDescuentoMonto;
		
		JPanel jPanelCamposAuxiliarDescuentoMonto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDescuentoMonto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			jPanelCamposAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jPanelCamposDescuentoMonto;
			jPanelAccionesFormularioAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jPanelAccionesFormularioDescuentoMonto;
		}
		
		final JPanel jPanelCamposDescuentoMonto=jPanelCamposAuxiliarDescuentoMonto;
		final JPanel jPanelAccionesFormularioDescuentoMonto=jPanelAccionesFormularioAuxiliarDescuentoMonto;
		
		
		final JMenuBar jmenuBarDescuentoMonto=this.jmenuBarDescuentoMonto;
		final JToolBar jTtoolBarDescuentoMonto=this.jTtoolBarDescuentoMonto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDescuentoMonto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDescuentoMonto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			jmenuBarDetalleAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jmenuBarDetalleDescuentoMonto;
			jTtoolBarDetalleAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jTtoolBarDetalleDescuentoMonto;
		}
		
		final JMenuBar jmenuBarDetalleDescuentoMonto=jmenuBarDetalleAuxiliarDescuentoMonto;
		final JToolBar jTtoolBarDetalleDescuentoMonto=jTtoolBarDetalleAuxiliarDescuentoMonto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDescuentoMonto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDescuentoMonto;
			processRunnable.jTableDatos=jTableDatosDescuentoMonto;
			processRunnable.jPanelCampos=jPanelCamposDescuentoMonto;
			processRunnable.jPanelPaginacion=jPanelPaginacionDescuentoMonto;
			processRunnable.jPanelAcciones=jPanelAccionesDescuentoMonto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDescuentoMonto;
			
			
			processRunnable.jmenuBar=jmenuBarDescuentoMonto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDescuentoMonto;
			processRunnable.jTtoolBar=jTtoolBarDescuentoMonto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDescuentoMonto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDescuentoMonto ,jPanelParametrosReportesDescuentoMonto,jTableDatosDescuentoMonto, /*jScrollPanelDatosDescuentoMonto,*/jPanelCamposDescuentoMonto,jPanelPaginacionDescuentoMonto, /*jScrollPanelDatosEdicionDescuentoMonto,*/ jPanelAccionesDescuentoMonto,jPanelAccionesFormularioDescuentoMonto,jmenuBarDescuentoMonto,jmenuBarDetalleDescuentoMonto,jTtoolBarDescuentoMonto,jTtoolBarDetalleDescuentoMonto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDescuentoMonto ,jPanelParametrosReportesDescuentoMonto, jScrollPanelDatosDescuentoMonto,jPanelPaginacionDescuentoMonto, jScrollPanelDatosEdicionDescuentoMonto, jPanelAccionesDescuentoMonto,jPanelAccionesFormularioDescuentoMonto,jmenuBarDescuentoMonto,jmenuBarDetalleDescuentoMonto,jTtoolBarDescuentoMonto,jTtoolBarDetalleDescuentoMonto);
						
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
	
	public void finishProcessDescuentoMonto() {// throws Exception 
		this.finishProcessDescuentoMonto(true);
	}
	
	public void finishProcessDescuentoMonto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDescuentoMonto ,this.jPanelParametrosReportesDescuentoMonto, this.jScrollPanelDatosDescuentoMonto,this.jPanelPaginacionDescuentoMonto, this.jScrollPanelDatosEdicionDescuentoMonto, this.jPanelAccionesDescuentoMonto,this.jPanelAccionesFormularioDescuentoMonto,this.jmenuBarDescuentoMonto,this.jmenuBarDetalleDescuentoMonto,this.jTtoolBarDescuentoMonto,this.jTtoolBarDetalleDescuentoMonto);		
		
		final JTabbedPane jTabbedPaneBusquedasDescuentoMonto=this.jTabbedPaneBusquedasDescuentoMonto; 
		
		final JPanel jPanelParametrosReportesDescuentoMonto=this.jPanelParametrosReportesDescuentoMonto;
		//final JScrollPane jScrollPanelDatosDescuentoMonto=this.jScrollPanelDatosDescuentoMonto;
		final JTable jTableDatosDescuentoMonto=this.jTableDatosDescuentoMonto;		
		final JPanel jPanelPaginacionDescuentoMonto=this.jPanelPaginacionDescuentoMonto;
		//final JScrollPane jScrollPanelDatosEdicionDescuentoMonto=this.jScrollPanelDatosEdicionDescuentoMonto;
		final JPanel jPanelAccionesDescuentoMonto=this.jPanelAccionesDescuentoMonto;
		
		JPanel jPanelCamposAuxiliarDescuentoMonto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDescuentoMonto=new JPanel();
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			jPanelCamposAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jPanelCamposDescuentoMonto;
			jPanelAccionesFormularioAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jPanelAccionesFormularioDescuentoMonto;
		}
		
		final JPanel jPanelCamposDescuentoMonto=jPanelCamposAuxiliarDescuentoMonto;
		final JPanel jPanelAccionesFormularioDescuentoMonto=jPanelAccionesFormularioAuxiliarDescuentoMonto;
		
		
		final JMenuBar jmenuBarDescuentoMonto=this.jmenuBarDescuentoMonto;		
		final JToolBar jTtoolBarDescuentoMonto=this.jTtoolBarDescuentoMonto;
				
		JMenuBar jmenuBarDetalleAuxiliarDescuentoMonto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDescuentoMonto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			jmenuBarDetalleAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jmenuBarDetalleDescuentoMonto;
			jTtoolBarDetalleAuxiliarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jTtoolBarDetalleDescuentoMonto;		
		}
		
		final JMenuBar jmenuBarDetalleDescuentoMonto=jmenuBarDetalleAuxiliarDescuentoMonto;
		final JToolBar jTtoolBarDetalleDescuentoMonto=jTtoolBarDetalleAuxiliarDescuentoMonto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDescuentoMonto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDescuentoMonto;
			processRunnable.jTableDatos=jTableDatosDescuentoMonto;
			processRunnable.jPanelCampos=jPanelCamposDescuentoMonto;
			processRunnable.jPanelPaginacion=jPanelPaginacionDescuentoMonto;
			processRunnable.jPanelAcciones=jPanelAccionesDescuentoMonto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDescuentoMonto;
			
			
			processRunnable.jmenuBar=jmenuBarDescuentoMonto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDescuentoMonto;
			processRunnable.jTtoolBar=jTtoolBarDescuentoMonto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDescuentoMonto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDescuentoMonto ,jPanelParametrosReportesDescuentoMonto, jTableDatosDescuentoMonto,/*jScrollPanelDatosDescuentoMonto,*/jPanelCamposDescuentoMonto,jPanelPaginacionDescuentoMonto, /*jScrollPanelDatosEdicionDescuentoMonto,*/ jPanelAccionesDescuentoMonto,jPanelAccionesFormularioDescuentoMonto,jmenuBarDescuentoMonto,jmenuBarDetalleDescuentoMonto,jTtoolBarDescuentoMonto,jTtoolBarDetalleDescuentoMonto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDescuentoMonto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDescuentoMonto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDescuentoMonto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDescuentoMonto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDescuentoMonto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDescuentoMonto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDescuentoMonto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDescuentoMonto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDescuentoMonto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.descuentomontoConstantesFunciones.getsFinalQueryDescuentoMonto();
		String  finalQueryPaginacionTodos=this.descuentomontoConstantesFunciones.getsFinalQueryDescuentoMonto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DescuentoMontoConstantesFunciones.getArrayColumnasGlobalesNoDescuentoMonto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DescuentoMontoConstantesFunciones.getArrayColumnasGlobalesDescuentoMonto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DescuentoMontoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.descuentomontosEliminados= new ArrayList<DescuentoMonto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDescuentoMonto();
		
				///*DescuentoMontoSessionBean*/this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			
			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
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
					this.iNumeroPaginacion=DescuentoMontoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DescuentoMontoConstantesFunciones.getClassesForeignKeysOfDescuentoMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/descuentomonto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			descuentomontosAux= new ArrayList<DescuentoMonto>();
			
				
			descuentomontoLogic.setDatosCliente(this.datosCliente);
			descuentomontoLogic.setDatosDeep(this.datosDeep);
			descuentomontoLogic.setIsConDeep(true);
			
			
			descuentomontoLogic.getDescuentoMontoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					descuentomontoLogic.getTodosDescuentoMontos(finalQueryGlobal,pagination);
					
					//descuentomontoLogic.getTodosDescuentoMontosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(descuentomontoLogic.getDescuentoMontos()==null|| descuentomontoLogic.getDescuentoMontos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentomontosAux= new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontoLogic.getDescuentoMontos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontosAux= new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentomontoLogic.getTodosDescuentoMontos(finalQueryGlobal+"",this.pagination);												
							
							//descuentomontoLogic.getTodosDescuentoMontosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDescuentoMontos("Todos",descuentomontoLogic.getDescuentoMontos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());					
							descuentomontoLogic.getDescuentoMontos().addAll(descuentomontosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontos=new ArrayList<DescuentoMonto>();
							descuentomontos.addAll(descuentomontosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDescuentoMonto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDescuentoMonto=this.idActual;
				
				} else if(this.idDescuentoMontoActual!=null && this.idDescuentoMontoActual!=0L) {
					idDescuentoMonto=idDescuentoMontoActual;
				}
				
					
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndicePorId(idDescuentoMonto);
				
				this.descuentomontos=new ArrayList<DescuentoMonto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					descuentomontoLogic.getEntity(idDescuentoMonto);
					
					//descuentomontoLogic.getEntityWithConnection(idDescuentoMonto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());
					descuentomontoLogic.getDescuentoMontos().add(descuentomontoLogic.getDescuentoMonto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomontos=new ArrayList<DescuentoMonto>();
					this.descuentomontos.add(descuentomonto);
				}
				
				if(descuentomontoLogic.getDescuentoMonto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentomontoLogic.getDescuentoMontosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentomontoLogic.getDescuentoMontos()==null||descuentomontoLogic.getDescuentoMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentomontos==null|| descuentomontos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontosAux=new ArrayList<DescuentoMonto>();
						descuentomontosAux.addAll(descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontosAux=new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentomontoLogic.getDescuentoMontosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoMontos("FK_IdBodega",descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoMontos("FK_IdBodega",descuentomontos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());
						descuentomontoLogic.getDescuentoMontos().addAll(descuentomontosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontos=new ArrayList<DescuentoMonto>();
							descuentomontos.addAll(descuentomontosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentomontoLogic.getDescuentoMontosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentomontoLogic.getDescuentoMontos()==null||descuentomontoLogic.getDescuentoMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentomontos==null|| descuentomontos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontosAux=new ArrayList<DescuentoMonto>();
						descuentomontosAux.addAll(descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontosAux=new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentomontoLogic.getDescuentoMontosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoMontos("FK_IdEmpresa",descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoMontos("FK_IdEmpresa",descuentomontos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());
						descuentomontoLogic.getDescuentoMontos().addAll(descuentomontosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontos=new ArrayList<DescuentoMonto>();
							descuentomontos.addAll(descuentomontosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentomontoLogic.getDescuentoMontosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentomontoLogic.getDescuentoMontos()==null||descuentomontoLogic.getDescuentoMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentomontos==null|| descuentomontos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontosAux=new ArrayList<DescuentoMonto>();
						descuentomontosAux.addAll(descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontosAux=new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentomontoLogic.getDescuentoMontosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoMontos("FK_IdSucursal",descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoMontos("FK_IdSucursal",descuentomontos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());
						descuentomontoLogic.getDescuentoMontos().addAll(descuentomontosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontos=new ArrayList<DescuentoMonto>();
							descuentomontos.addAll(descuentomontosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					descuentomontoLogic.getDescuentoMontosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=descuentomontoLogic.getDescuentoMontos()==null||descuentomontoLogic.getDescuentoMontos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=descuentomontos==null|| descuentomontos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontosAux=new ArrayList<DescuentoMonto>();
						descuentomontosAux.addAll(descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontosAux=new ArrayList<DescuentoMonto>();
							descuentomontosAux.addAll(descuentomontos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							descuentomontoLogic.getDescuentoMontosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DescuentoMontoConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDescuentoMontos("FK_IdUsuario",descuentomontoLogic.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDescuentoMontos("FK_IdUsuario",descuentomontos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoLogic.setDescuentoMontos(new ArrayList<DescuentoMonto>());
						descuentomontoLogic.getDescuentoMontos().addAll(descuentomontosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontos=new ArrayList<DescuentoMonto>();
							descuentomontos.addAll(descuentomontosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDescuentoMonto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDescuentoMonto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=descuentomontoLogic.getDescuentoMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentomontos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=descuentomontoLogic.getDescuentoMontos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentomontos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DescuentoMonto descuentomonto) {
		Boolean permite=true;
		
		if(this.descuentomonto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DescuentoMontoConstantesFunciones.getOrderByListaDescuentoMonto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DescuentoMontoConstantesFunciones.getOrderByListaDescuentoMonto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoMonto descuentomonto:descuentomontoLogic.getDescuentoMontos()) {
				if(descuentomonto.getsType().equals(Constantes2.S_TOTALES)) {
					descuentomontoTotales=descuentomonto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoMonto descuentomonto:this.descuentomontos) {
				if(descuentomonto.getsType().equals(Constantes2.S_TOTALES)) {
					descuentomontoTotales=descuentomonto;
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
			this.descuentomontoAux=new DescuentoMonto();
			this.descuentomontoAux.setsType(Constantes2.S_TOTALES);
			this.descuentomontoAux.setIsNew(false);
			this.descuentomontoAux.setIsChanged(false);
			this.descuentomontoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DescuentoMontoConstantesFunciones.TotalizarValoresFilaDescuentoMonto(this.descuentomontoLogic.getDescuentoMontos(),this.descuentomontoAux);
				
				this.descuentomontoLogic.getDescuentoMontos().add(this.descuentomontoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DescuentoMontoConstantesFunciones.TotalizarValoresFilaDescuentoMonto(this.descuentomontos,this.descuentomontoAux);
				
				this.descuentomontos.add(this.descuentomontoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		descuentomontoTotales=new DescuentoMonto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.descuentomontoLogic.getDescuentoMontos().remove(descuentomontoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.descuentomontos.remove(descuentomontoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		descuentomontoTotales=new DescuentoMonto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DescuentoMonto descuentomonto:descuentomontoLogic.getDescuentoMontos()) {
				if(descuentomonto.getsType().equals(Constantes2.S_TOTALES)) {
					descuentomontoTotales=descuentomonto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DescuentoMontoConstantesFunciones.TotalizarValoresFilaDescuentoMonto(this.descuentomontoLogic.getDescuentoMontos(),descuentomontoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DescuentoMonto descuentomonto:this.descuentomontos) {
				if(descuentomonto.getsType().equals(Constantes2.S_TOTALES)) {
					descuentomontoTotales=descuentomonto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DescuentoMontoConstantesFunciones.TotalizarValoresFilaDescuentoMonto(this.descuentomontos,descuentomontoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDescuentoMontosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoMontosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoMontosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDescuentoMontosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDescuentoMontosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLogic.getDescuentoMontosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoMontosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLogic.getDescuentoMontosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoMontosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLogic.getDescuentoMontosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDescuentoMontosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLogic.getDescuentoMontosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDescuentoMonto() {
		this.isPermisoTodoDescuentoMonto=false;
		this.isPermisoNuevoDescuentoMonto=false;
		this.isPermisoActualizarDescuentoMonto=false;
		this.isPermisoActualizarOriginalDescuentoMonto=false;
		this.isPermisoEliminarDescuentoMonto=false;
		this.isPermisoGuardarCambiosDescuentoMonto=false;
		this.isPermisoConsultaDescuentoMonto=false;
		this.isPermisoBusquedaDescuentoMonto=false;
		this.isPermisoReporteDescuentoMonto=false;		
		this.isPermisoOrdenDescuentoMonto=false;		
		this.isPermisoPaginacionMedioDescuentoMonto=false;		
		this.isPermisoPaginacionAltoDescuentoMonto=false;
		this.isPermisoPaginacionTodoDescuentoMonto=false;
		this.isPermisoCopiarDescuentoMonto=false;		
		this.isPermisoVerFormDescuentoMonto=false;		
		this.isPermisoDuplicarDescuentoMonto=false;		
		this.isPermisoOrdenDescuentoMonto=false;		
	}
	
	public void setPermisosUsuarioDescuentoMonto(Boolean isPermiso) {
		this.isPermisoTodoDescuentoMonto=isPermiso;
		this.isPermisoNuevoDescuentoMonto=isPermiso;
		this.isPermisoActualizarDescuentoMonto=isPermiso;
		this.isPermisoActualizarOriginalDescuentoMonto=isPermiso;
		this.isPermisoEliminarDescuentoMonto=isPermiso;
		this.isPermisoGuardarCambiosDescuentoMonto=isPermiso;
		this.isPermisoConsultaDescuentoMonto=isPermiso;
		this.isPermisoBusquedaDescuentoMonto=isPermiso;
		this.isPermisoReporteDescuentoMonto=isPermiso;
		this.isPermisoOrdenDescuentoMonto=isPermiso;		
		this.isPermisoPaginacionMedioDescuentoMonto=isPermiso;		
		this.isPermisoPaginacionAltoDescuentoMonto=isPermiso;		
		this.isPermisoPaginacionTodoDescuentoMonto=isPermiso;		
		this.isPermisoCopiarDescuentoMonto=isPermiso;		
		this.isPermisoVerFormDescuentoMonto=isPermiso;		
		this.isPermisoDuplicarDescuentoMonto=isPermiso;
		this.isPermisoOrdenDescuentoMonto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDescuentoMonto(Boolean isPermiso) {
		//this.isPermisoTodoDescuentoMonto=isPermiso;
		this.isPermisoNuevoDescuentoMonto=isPermiso;
		this.isPermisoActualizarDescuentoMonto=isPermiso;
		this.isPermisoActualizarOriginalDescuentoMonto=isPermiso;
		this.isPermisoEliminarDescuentoMonto=isPermiso;
		this.isPermisoGuardarCambiosDescuentoMonto=isPermiso;
		//this.isPermisoConsultaDescuentoMonto=isPermiso;
		//this.isPermisoBusquedaDescuentoMonto=isPermiso;
		//this.isPermisoReporteDescuentoMonto=isPermiso;
		//this.isPermisoOrdenDescuentoMonto=isPermiso;		
		//this.isPermisoPaginacionMedioDescuentoMonto=isPermiso;		
		//this.isPermisoPaginacionAltoDescuentoMonto=isPermiso;		
		//this.isPermisoPaginacionTodoDescuentoMonto=isPermiso;		
		//this.isPermisoCopiarDescuentoMonto=isPermiso;		
		//this.isPermisoDuplicarDescuentoMonto=isPermiso;
		//this.isPermisoOrdenDescuentoMonto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDescuentoMontoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DescuentoMontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDescuentoMonto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDescuentoMontoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDescuentoMontoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDescuentoMontoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDescuentoMontoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDescuentoMonto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DescuentoMontoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DescuentoMontoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDescuentoMonto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDescuentoMonto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDescuentoMonto=this.isPermisoActualizarDescuentoMonto;
			this.isPermisoEliminarDescuentoMonto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDescuentoMonto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDescuentoMonto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDescuentoMonto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDescuentoMonto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDescuentoMonto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDescuentoMonto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDescuentoMonto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDescuentoMonto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDescuentoMonto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDescuentoMonto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDescuentoMonto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDescuentoMonto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDescuentoMonto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDescuentoMonto.setToolTipText(this.jTableDatosDescuentoMonto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDescuentoMonto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDescuentoMonto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DescuentoMontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DescuentoMontoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDescuentoMonto() throws Exception {
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
	public void inicializarCombosForeignKeyDescuentoMontoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDescuentoMontoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DescuentoMontoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDescuentoMontoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDescuentoMontoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DescuentoMontoParameterReturnGeneral descuentomontoReturnGeneral=new DescuentoMontoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.descuentomontoConstantesFunciones.cargarid_empresaDescuentoMonto)
					 || (this.esRecargarFks && this.descuentomontoConstantesFunciones.cargarid_empresaDescuentoMonto)) {

					if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+descuentomontoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.descuentomontoConstantesFunciones.cargarid_sucursalDescuentoMonto)
					 || (this.esRecargarFks && this.descuentomontoConstantesFunciones.cargarid_sucursalDescuentoMonto)) {

					if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+descuentomontoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.descuentomontoConstantesFunciones.cargarid_usuarioDescuentoMonto)
					 || (this.esRecargarFks && this.descuentomontoConstantesFunciones.cargarid_usuarioDescuentoMonto)) {

					if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+descuentomontoSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.descuentomontoConstantesFunciones.cargarid_bodegaDescuentoMonto)
					 || (this.esRecargarFks && this.descuentomontoConstantesFunciones.cargarid_bodegaDescuentoMonto)) {

					if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+descuentomontoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				descuentomontoReturnGeneral=descuentomontoLogic.cargarCombosLoteForeignKeyDescuentoMonto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalBodega);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=descuentomontoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=descuentomontoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=descuentomontoReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=descuentomontoReturnGeneral.getbodegasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDescuentoMonto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyBodega();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.descuentomontoSessionBean==null) {
				this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
			}

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.descuentomontoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDescuentoMonto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDescuentoMonto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDescuentoMonto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoMonto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDescuentoMonto(DescuentoMonto descuentomonto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(descuentomonto.getid_bodega(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDescuentoMonto(DescuentoMonto descuentomonto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDescuentoMonto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.descuentomontoConstantesFunciones.getid_bodega(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDescuentoMonto()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDescuentoMonto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDescuentoMonto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDescuentoMonto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDescuentoMonto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDescuentoMonto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDescuentoMonto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.getItemCount()>0) {
				this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DescuentoMontoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DescuentoMontoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DescuentoMontoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.descuentomontoSessionBean=new DescuentoMontoSessionBean(); 
		this.descuentomontoConstantesFunciones=new DescuentoMontoConstantesFunciones(); 
		this.descuentomontoBean=new DescuentoMonto();//(this.descuentomontoConstantesFunciones); 		
		this.descuentomontoReturnGeneral=new DescuentoMontoParameterReturnGeneral(); 
		
		this.descuentomontoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentomontoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DescuentoMontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DescuentoMontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DescuentoMontoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDescuentoMonto(true);
			
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
			
			this.descuentomontoConstantesFunciones=new DescuentoMontoConstantesFunciones(); 
			this.descuentomontoBean=new DescuentoMonto();//this.descuentomontoConstantesFunciones); 			
			this.descuentomontoReturnGeneral=new DescuentoMontoParameterReturnGeneral(); 
		
			DescuentoMontoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Descuento Monto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.descuentomonto=new DescuentoMonto();
			this.descuentomontos = new ArrayList<DescuentoMonto>();
			this.descuentomontosAux = new ArrayList<DescuentoMonto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic=new DescuentoMontoLogic();
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			//this.descuentomontoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.descuentomontoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDescuentoMonto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDescuentoMonto);	
					}
					
					if(this.jInternalFrameImportacionDescuentoMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDescuentoMonto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDescuentoMonto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDescuentoMonto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDescuentoMonto);
				this.jInternalFrameDetalleFormDescuentoMonto.setVisible(false);
				this.jInternalFrameDetalleFormDescuentoMonto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDescuentoMonto);
					this.jInternalFrameReporteDinamicoDescuentoMonto.setVisible(false);
					this.jInternalFrameReporteDinamicoDescuentoMonto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDescuentoMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDescuentoMonto);
					this.jInternalFrameImportacionDescuentoMonto.setVisible(false);
					this.jInternalFrameImportacionDescuentoMonto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDescuentoMonto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDescuentoMonto);
					this.jInternalFrameOrderByDescuentoMonto.setVisible(false);
					this.jInternalFrameOrderByDescuentoMonto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDescuentoMontoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DescuentoMontoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.descuentomontoReturnGeneral=new DescuentoMontoParameterReturnGeneral();
			
			this.descuentomontoParameterGeneral=new DescuentoMontoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.descuentomontoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DescuentoMontoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DescuentoMontoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.descuentomontoSessionBean.getEsGuardarRelacionado(),this.descuentomontoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DescuentoMontoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.descuentomontoSessionBean.getEsGuardarRelacionado(),this.descuentomontoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaDuplicarDescuentoMonto=true;
			this.isVisibilidadCeldaCopiarDescuentoMonto=true;
			this.isVisibilidadCeldaVerFormDescuentoMonto=true;
			this.isVisibilidadCeldaOrdenDescuentoMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDescuentoMonto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDescuentoMonto(false);
			
			this.setPermisosUsuarioDescuentoMonto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado() 
				|| (this.descuentomontoSessionBean.getEsGuardarRelacionado() && this.descuentomontoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDescuentoMontoClasesRelacionadas();
			}
			
			if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDescuentoMontoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDescuentoMonto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDescuentoMonto();
			}
			
			if(!this.isPermisoBusquedaDescuentoMonto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDescuentoMonto,this.isPermisoPaginacionMedioDescuentoMonto,this.isPermisoPaginacionTodoDescuentoMonto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DescuentoMontoConstantesFunciones.getTiposSeleccionarDescuentoMonto());
				
				this.tiposColumnasSelect=DescuentoMontoConstantesFunciones.getTiposSeleccionarDescuentoMonto(true);
				
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
			//if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDescuentoMonto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDescuentoMonto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDescuentoMonto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoMonto() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			this.bodegaLogic=new BodegaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				descuentomontoImplementable= (DescuentoMontoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DescuentoMontoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				descuentomontoImplementableHome= (DescuentoMontoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DescuentoMontoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.descuentomontos= new ArrayList<DescuentoMonto>();
			this.descuentomontosEliminados= new ArrayList<DescuentoMonto>();
						
			this.isEsNuevoDescuentoMonto=false;
			this.esParaAccionDesdeFormularioDescuentoMonto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDescuentoMonto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDescuentoMonto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DescuentoMontoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DescuentoMontoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDescuentoMonto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDescuentoMonto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDescuentoMonto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDescuentoMonto();
			}
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDescuentoMonto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDescuentoMonto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDescuentoMonto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDescuentoMonto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DescuentoMonto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDescuentoMonto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDescuentoMonto")) {
				iIndex=this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDescuentoMonto();	
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
	
	public void cargarCombosForeignKeyDescuentoMonto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDescuentoMonto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDescuentoMonto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDescuentoMontoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDescuentoMonto();
		
		this.cargarCombosFrameForeignKeyDescuentoMonto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDescuentoMonto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDescuentoMonto();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDescuentoMontoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			
			if(jTableDatosDescuentoMonto.getRowCount()>=1) {
				jTableDatosDescuentoMonto.removeRowSelectionInterval(0, jTableDatosDescuentoMonto.getRowCount()-1);						
			}
			
			this.isEsNuevoDescuentoMonto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDescuentoMonto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDescuentoMonto(true);			
			//this.descuentomonto=new DescuentoMonto();
			//this.descuentomonto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoMonto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoMonto() ;
			
			if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoMonto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.descuentomonto);	
			this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);				
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DescuentoMonto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDescuentoMontoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDescuentoMonto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDescuentoMonto.getSelectedRows().length;			
			}
			
			descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDescuentoMonto--;			
				//DescuentoMonto descuentomontoAux= new DescuentoMonto();			
				//descuentomontoAux.setId(this.iIdNuevoDescuentoMonto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DescuentoMonto descuentomontoOrigen=new DescuentoMonto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DescuentoMonto descuentomontoOrigen : descuentomontosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							descuentomontoOrigen =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							descuentomontoOrigen =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDescuentoMonto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.descuentomonto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDescuentoMonto(descuentomontoOrigen,this.descuentomonto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.descuentomontoLogic.getDescuentoMontos().add(this.descuentomontoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.descuentomontos.add(this.descuentomontoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
				
				this.jTableDatosDescuentoMonto.setRowSelectionInterval(this.getIndiceNuevoDescuentoMonto(), this.getIndiceNuevoDescuentoMonto());
				
				int iLastRow =  this.jTableDatosDescuentoMonto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDescuentoMonto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDescuentoMonto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoMonto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();									
		
			DescuentoMonto descuentomontoOrigen=new DescuentoMonto();
			DescuentoMonto descuentomontoDestino=new DescuentoMonto();
				
			descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDescuentoMonto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || descuentomontosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDescuentoMonto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoOrigen =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						descuentomontoOrigen =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						descuentomontoDestino =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						descuentomontoDestino =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				descuentomontoOrigen =descuentomontosSeleccionados.get(0);
				descuentomontoDestino =descuentomontosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDescuentoMonto(descuentomontoOrigen,descuentomontoDestino,true,false);
				
				descuentomontoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(descuentomontoDestino,descuentomontoLogic.getDescuentoMontos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(descuentomontoDestino,descuentomontos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
				
				//this.jTableDatosDescuentoMonto.setRowSelectionInterval(this.getIndiceNuevoDescuentoMonto(), this.getIndiceNuevoDescuentoMonto());
				
				int iLastRow =  this.jTableDatosDescuentoMonto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDescuentoMonto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDescuentoMonto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoMonto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDescuentoMonto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDescuentoMonto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDescuentoMonto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDescuentoMonto.setVisible(!isVisible);
			this.jPanelPaginacionDescuentoMonto.setVisible(!isVisible);
			this.jPanelAccionesDescuentoMonto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDescuentoMonto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDescuentoMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDescuentoMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDescuentoMonto();
			
			this.abrirFrameOrderByDescuentoMonto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDescuentoMonto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDescuentoMonto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDescuentoMonto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDescuentoMonto.isMaximum()) {
					this.jInternalFrameDetalleFormDescuentoMonto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDescuentoMonto.setSize(this.jInternalFrameDetalleFormDescuentoMonto.iWidthFormulario,this.jInternalFrameDetalleFormDescuentoMonto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDescuentoMonto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDescuentoMonto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDescuentoMonto.isMaximum()) {
						this.jInternalFrameDetalleFormDescuentoMonto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDescuentoMonto.jContentPaneDetalleDescuentoMonto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDescuentoMonto.jContentPaneDetalleDescuentoMonto.getWidth(),DescuentoMontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDescuentoMonto.jContentPaneDetalleDescuentoMonto.getWidth(),DescuentoMontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDescuentoMonto.jContentPaneDetalleDescuentoMonto.getWidth(),DescuentoMontoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDescuentoMonto.setVisible(true);
	        this.jInternalFrameDetalleFormDescuentoMonto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDescuentoMonto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDescuentoMonto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDescuentoMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoMonto,false,this);
				} else {
					this.jInternalFrameOrderByDescuentoMonto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoMonto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDescuentoMonto);
				this.jInternalFrameOrderByDescuentoMonto.setVisible(false);
				this.jInternalFrameOrderByDescuentoMonto.setSelected(false);
				
				this.jInternalFrameOrderByDescuentoMonto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDescuentoMonto"));
				
				this.inicializarActualizarBindingTablaOrderByDescuentoMonto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDescuentoMonto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDescuentoMonto==null) {
				
				this.jInternalFrameImportacionDescuentoMonto=new ImportacionJInternalFrame(DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDescuentoMonto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDescuentoMonto);
				this.jInternalFrameImportacionDescuentoMonto.setVisible(false);
				this.jInternalFrameImportacionDescuentoMonto.setSelected(false);


				this.jInternalFrameImportacionDescuentoMonto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDescuentoMonto"));
				this.jInternalFrameImportacionDescuentoMonto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDescuentoMonto"));
				this.jInternalFrameImportacionDescuentoMonto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDescuentoMonto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDescuentoMonto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDescuentoMonto==null) {
				this.jInternalFrameReporteDinamicoDescuentoMonto=new ReporteDinamicoJInternalFrame(DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDescuentoMonto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDescuentoMonto);
				this.jInternalFrameReporteDinamicoDescuentoMonto.setVisible(false);
				this.jInternalFrameReporteDinamicoDescuentoMonto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoMonto"));
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoMonto"));
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoMonto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoMonto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDescuentoMonto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDescuentoMonto);
			
	       	this.jInternalFrameDetalleFormDescuentoMonto.setVisible(false);
	        this.jInternalFrameDetalleFormDescuentoMonto.setSelected(false);
			
			//this.jInternalFrameDetalleFormDescuentoMonto.dispose();
			//this.jInternalFrameDetalleFormDescuentoMonto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDescuentoMonto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDescuentoMonto.setVisible(true);
	        this.jInternalFrameReporteDinamicoDescuentoMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDescuentoMonto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDescuentoMonto.setVisible(true);
	        this.jInternalFrameImportacionDescuentoMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDescuentoMonto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDescuentoMonto.setVisible(true);
	        this.jInternalFrameOrderByDescuentoMonto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDescuentoMonto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDescuentoMonto.setVisible(false);
	        this.jInternalFrameOrderByDescuentoMonto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDescuentoMonto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDescuentoMonto.setVisible(false);
	        this.jInternalFrameReporteDinamicoDescuentoMonto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDescuentoMonto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDescuentoMonto.setVisible(false);
	        this.jInternalFrameImportacionDescuentoMonto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDescuentoMonto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDescuentoMonto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDescuentoMonto(true);
			//this.isEsNuevoDescuentoMonto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDescuentoMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoMonto(false) ;
			
			if(descuentomontoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoMonto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoMonto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDescuentoMontoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDescuentoMonto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDescuentoMonto(true);
			//this.isEsNuevoDescuentoMonto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.descuentomonto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDescuentoMonto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDescuentoMonto(false) ;
			
			if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDescuentoMonto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoMonto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDescuentoMonto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDescuentoMonto(false);
			
			//if(!this.isEsNuevoDescuentoMonto) {								
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				
			}
			
			if(this.permiteMantenimiento(this.descuentomonto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDescuentoMonto=true;
					this.inicializarActualizarBindingTablaDescuentoMonto(false);
					this.isEsNuevoDescuentoMonto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDescuentoMonto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDescuentoMonto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDescuentoMonto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoMonto(false);
				
				this.habilitarDeshabilitarControlesDescuentoMonto(false);
			
												
				
				if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDescuentoMonto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDescuentoMontoActionPerformed(evt,descuentomontoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDescuentoMonto(this.descuentomonto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDescuentoMonto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,descuentomontoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.descuentomonto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				this.descuentomonto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				this.descuentomonto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.descuentomonto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DescuentoMontoModel) this.jTableDatosDescuentoMonto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDescuentoMonto=true;
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
				this.isEsNuevoDescuentoMonto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDescuentoMonto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoMonto(false);
				
				this.habilitarDeshabilitarControlesDescuentoMonto(false);
				
				
				
				if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDescuentoMonto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDescuentoMonto.getRowCount()>=1) {
				jTableDatosDescuentoMonto.removeRowSelectionInterval(0, jTableDatosDescuentoMonto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDescuentoMonto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDescuentoMonto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDescuentoMonto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDescuentoMonto(false) ;
			
			this.isEsNuevoDescuentoMonto=false;
			
			if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDescuentoMonto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDescuentoMonto(false);
				
				//SI ES MANUAL
				if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDescuentoMonto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDescuentoMonto--;			
			//DescuentoMonto descuentomontoAux= new DescuentoMonto();			
			//descuentomontoAux.setId(this.iIdNuevoDescuentoMonto);
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDescuentoMonto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
			
			this.descuentomonto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.descuentomontoLogic.getDescuentoMontos().add(this.descuentomontoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.descuentomontos.add(this.descuentomontoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDescuentoMonto(false);
			
			this.jTableDatosDescuentoMonto.setRowSelectionInterval(this.getIndiceNuevoDescuentoMonto(), this.getIndiceNuevoDescuentoMonto());
			
			int iLastRow =  this.jTableDatosDescuentoMonto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDescuentoMonto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDescuentoMonto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoMonto(false);
			
			//SI ES MANUAL
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoMonto();
			}
			
			//this.abrirFrameTreeDescuentoMonto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Descuento MontoS ?", "MANTENIMIENTO DE Descuento Monto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDescuentoMonto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDescuentoMonto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.descuentomontoReturnGeneral=descuentomontoLogic.procesarImportacionDescuentoMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.descuentomontoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDescuentoMontoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDescuentoMonto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDescuentoMonto.setFileImportacion(this.jInternalFrameImportacionDescuentoMonto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDescuentoMonto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDescuentoMonto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDescuentoMonto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDescuentoMonto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		

		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DescuentoMontoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DescuentoMontoBaseDesign.jrxml";
			
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
			
			this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORINICIO:
					sNombreCampoCategoria="valor_inicio";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORFIN:
					sNombreCampoCategoria="valor_fin";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORINICIO:
					sNombreCampoCategoriaValor="valor_inicio";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORFIN:
					sNombreCampoCategoriaValor="valor_fin";
					break;

				case DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_inicio");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_fin");
					break;

				case DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DescuentoMontos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getvalor_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_VALORFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORFIN);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getvalor_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(DescuentoMonto descuentomonto:descuentomontosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(descuentomonto.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelDescuentoMonto(row);				
			//	iRow++;
			//}				
			
			//for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDescuentoMonto(descuentomontoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
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
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoMonto(false);
			
			//SI ES MANUAL
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDescuentoMonto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoMonto(false);
			
			//SI ES MANUAL
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDescuentoMonto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDescuentoMonto(false);
			
			//SI ES MANUAL
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDescuentoMonto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDescuentoMonto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDescuentoMonto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDescuentoMonto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDescuentoMonto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDescuentoMonto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDescuentoMonto.setMinimumSize(dimensionMinimum);
		this.jTableDatosDescuentoMonto.setMaximumSize(dimensionMaximum);
		this.jTableDatosDescuentoMonto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDescuentoMonto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDescuentoMonto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDescuentoMonto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDescuentoMonto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDescuentoMonto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDescuentoMonto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoMonto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDescuentoMonto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDescuentoMonto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDescuentoMonto();
		
		this.inicializarActualizarBindingBotonesManualDescuentoMonto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDescuentoMonto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoMonto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoMonto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoMonto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDescuentoMonto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDescuentoMonto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDescuentoMonto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionNuevoDescuentoMonto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionSinCerrarDescuentoMonto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionSinMensajeDescuentoMonto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDescuentoMonto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDescuentoMonto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDescuentoMonto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
				this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionNuevoDescuentoMonto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionSinCerrarDescuentoMonto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxPostAccionSinMensajeDescuentoMonto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDescuentoMonto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDescuentoMonto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDescuentoMonto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDescuentoMonto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDescuentoMonto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDescuentoMonto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDescuentoMonto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDescuentoMonto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDescuentoMonto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDescuentoMonto(Boolean esInicializar) throws Exception {
		try	{	
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDescuentoMonto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDescuentoMonto() throws Exception {
		try	{
			if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDescuentoMonto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDescuentoMonto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDescuentoMonto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDescuentoMonto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDescuentoMonto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDescuentoMonto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDescuentoMonto.addItem(reporte);
			}
			
			
			if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDescuentoMonto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDescuentoMonto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDescuentoMonto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDescuentoMonto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDescuentoMonto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDescuentoMonto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDescuentoMonto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoMonto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDescuentoMonto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
				
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DescuentoMontoConstantesFunciones.getTiposSeleccionarDescuentoMonto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DescuentoMontoConstantesFunciones.getTiposSeleccionarDescuentoMonto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DescuentoMontoConstantesFunciones.getTiposSeleccionarDescuentoMonto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDescuentoMonto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDescuentoMonto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDescuentoMonto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDescuentoMonto(Boolean esInicializar) throws Exception {				
		if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDescuentoMonto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDescuentoMonto() throws Exception {
		this.inicializarActualizarBindingTablaDescuentoMonto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDescuentoMonto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDescuentoMontoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMontoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDescuentoMonto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=descuentomontoLogic.getDescuentoMontos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=descuentomontos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDescuentoMonto.setModel(new DescuentoMontoModel(this.descuentomontoLogic.getDescuentoMontos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDescuentoMonto.setModel(new DescuentoMontoModel(this.descuentomontos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDescuentoMonto!=null && this.jInternalFrameOrderByDescuentoMonto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDescuentoMonto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,descuentomontoConstantesFunciones.resaltarSeleccionarDescuentoMonto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DescuentoMontoConstantesFunciones.SCLASSWEBTITULO,descuentomontoConstantesFunciones.resaltarSeleccionarDescuentoMonto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_ID));

		if(this.descuentomontoConstantesFunciones.mostraridDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentomontoConstantesFunciones.resaltaridDescuentoMonto,this.descuentomontoConstantesFunciones.activaridDescuentoMonto,iSizeTabla,this,true,"idDescuentoMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentomontoConstantesFunciones.resaltaridDescuentoMonto,this.descuentomontoConstantesFunciones.activaridDescuentoMonto,this,true,"idDescuentoMonto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.descuentomontoConstantesFunciones.mostrarid_empresaDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.descuentomontoConstantesFunciones.resaltarid_empresaDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_empresaDescuentoMonto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.descuentomontoConstantesFunciones.resaltarid_empresaDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_empresaDescuentoMonto,false,"id_empresaDescuentoMonto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.descuentomontoConstantesFunciones.mostrarid_sucursalDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.descuentomontoConstantesFunciones.resaltarid_sucursalDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_sucursalDescuentoMonto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.descuentomontoConstantesFunciones.resaltarid_sucursalDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_sucursalDescuentoMonto,false,"id_sucursalDescuentoMonto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO));

		if(this.descuentomontoConstantesFunciones.mostrarid_usuarioDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.descuentomontoConstantesFunciones.resaltarid_usuarioDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_usuarioDescuentoMonto,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.descuentomontoConstantesFunciones.resaltarid_usuarioDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_usuarioDescuentoMonto,false,"id_usuarioDescuentoMonto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_IDBODEGA));

		if(this.descuentomontoConstantesFunciones.mostrarid_bodegaDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.descuentomontoConstantesFunciones.resaltarid_bodegaDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_bodegaDescuentoMonto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.descuentomontoConstantesFunciones.resaltarid_bodegaDescuentoMonto,this,this.descuentomontoConstantesFunciones.activarid_bodegaDescuentoMonto,true,"id_bodegaDescuentoMonto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.descuentomontoConstantesFunciones.mostrardescripcionDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.descuentomontoConstantesFunciones.resaltardescripcionDescuentoMonto,this.descuentomontoConstantesFunciones.activardescripcionDescuentoMonto,iSizeTabla,this,true,"descripcionDescuentoMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentomontoConstantesFunciones.resaltardescripcionDescuentoMonto,this.descuentomontoConstantesFunciones.activardescripcionDescuentoMonto,this,true,"descripcionDescuentoMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.descuentomontoConstantesFunciones.mostrarporcentajeDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentomontoConstantesFunciones.resaltarporcentajeDescuentoMonto,this.descuentomontoConstantesFunciones.activarporcentajeDescuentoMonto,iSizeTabla,this,true,"porcentajeDescuentoMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentomontoConstantesFunciones.resaltarporcentajeDescuentoMonto,this.descuentomontoConstantesFunciones.activarporcentajeDescuentoMonto,this,true,"porcentajeDescuentoMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_VALORINICIO));

		if(this.descuentomontoConstantesFunciones.mostrarvalor_inicioDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_VALORINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentomontoConstantesFunciones.resaltarvalor_inicioDescuentoMonto,this.descuentomontoConstantesFunciones.activarvalor_inicioDescuentoMonto,iSizeTabla,this,true,"valor_inicioDescuentoMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentomontoConstantesFunciones.resaltarvalor_inicioDescuentoMonto,this.descuentomontoConstantesFunciones.activarvalor_inicioDescuentoMonto,this,true,"valor_inicioDescuentoMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_VALORFIN));

		if(this.descuentomontoConstantesFunciones.mostrarvalor_finDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_VALORFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.descuentomontoConstantesFunciones.resaltarvalor_finDescuentoMonto,this.descuentomontoConstantesFunciones.activarvalor_finDescuentoMonto,iSizeTabla,this,true,"valor_finDescuentoMonto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.descuentomontoConstantesFunciones.resaltarvalor_finDescuentoMonto,this.descuentomontoConstantesFunciones.activarvalor_finDescuentoMonto,this,true,"valor_finDescuentoMonto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.descuentomontoConstantesFunciones.mostraresta_activoDescuentoMonto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.descuentomontoConstantesFunciones.resaltaresta_activoDescuentoMonto,this.descuentomontoConstantesFunciones.activaresta_activoDescuentoMonto,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.descuentomontoConstantesFunciones.resaltaresta_activoDescuentoMonto,this.descuentomontoConstantesFunciones.activaresta_activoDescuentoMonto,this,true,"esta_activoDescuentoMonto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DescuentoMontoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDescuentoMonto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDescuentoMonto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.descuentomontoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDescuentoMonto.addColumn(tableColumn);
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
			
			this.jTableDatosDescuentoMonto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDescuentoMonto.moveColumn(this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDescuentoMonto.moveColumn(this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDescuentoMonto.moveColumn(this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDescuentoMonto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDescuentoMonto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDescuentoMonto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDescuentoMonto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDescuentoMonto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDescuentoMonto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDescuentoMonto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDescuentoMonto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=descuentomontoLogic.getDescuentoMontos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=descuentomontos.size()-1;
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
		//this.jTableDatosDescuentoMonto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDescuentoMonto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDescuentoMonto();
			
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
				
				//this.isEsNuevoDescuentoMonto=false;
					
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
				if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDescuentoMonto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDescuentoMonto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDescuentoMonto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.descuentomonto.getsType().equals("DUPLICADO")
				   || this.descuentomonto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDescuentoMonto=true;
				
				} else {
					this.isEsNuevoDescuentoMonto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					if(this.descuentomonto.getId()>=0 && !this.descuentomonto.getIsNew()) {						
						this.isEsNuevoDescuentoMonto=false;
						
					} else {
						this.isEsNuevoDescuentoMonto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDescuentoMonto(esRelaciones);						
				
				this.seleccionarDescuentoMonto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.descuentomonto.getId()<0) {
					this.isEsNuevoDescuentoMonto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDescuentoMonto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDescuentoMonto(evt,rowIndex);
				}	
				
				if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DescuentoMonto: " + this.dDif); 
					}
				}								
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDescuentoMonto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.descuentomonto)) {
					if(this.descuentomonto.getId()>0) {
						this.descuentomonto.setIsDeleted(true);
						
						this.descuentomontosEliminados.add(this.descuentomonto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.descuentomontoLogic.getDescuentoMontos().remove(this.descuentomonto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.descuentomontos.remove(this.descuentomonto);				
					}
					
					
					((DescuentoMontoModel) this.jTableDatosDescuentoMonto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDescuentoMonto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDescuentoMonto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDescuentoMonto) {
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDescuentoMonto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDescuentoMonto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDescuentoMonto(this.descuentomonto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.descuentomontoConstantesFunciones.cargarid_empresaDescuentoMonto || this.descuentomontoConstantesFunciones.event_dependid_empresaDescuentoMonto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.descuentomonto.getid_empresa());
									//this.inicializarActualizarBindingDescuentoMonto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(descuentomonto.getEmpresa()!=null) {
							this.empresasForeignKey.add(descuentomonto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.descuentomonto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.descuentomontoConstantesFunciones.cargarid_sucursalDescuentoMonto || this.descuentomontoConstantesFunciones.event_dependid_sucursalDescuentoMonto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.descuentomonto.getid_sucursal());
									//this.inicializarActualizarBindingDescuentoMonto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(descuentomonto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(descuentomonto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.descuentomonto.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.descuentomontoConstantesFunciones.cargarid_usuarioDescuentoMonto || this.descuentomontoConstantesFunciones.event_dependid_usuarioDescuentoMonto) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.descuentomonto.getid_usuario());
									//this.inicializarActualizarBindingDescuentoMonto(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(descuentomonto.getUsuario()!=null) {
							this.usuariosForeignKey.add(descuentomonto.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.descuentomonto.getid_usuario(),false,"Formulario");

					//Bodega
					if(!this.descuentomontoConstantesFunciones.cargarid_bodegaDescuentoMonto || this.descuentomontoConstantesFunciones.event_dependid_bodegaDescuentoMonto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.descuentomonto.getid_bodega());
									//this.inicializarActualizarBindingDescuentoMonto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(descuentomonto.getBodega()!=null) {
							this.bodegasForeignKey.add(descuentomonto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.descuentomonto.getid_bodega(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDescuentoMonto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDescuentoMonto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDescuentoMonto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDescuentoMonto(DescuentoMonto descuentomonto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDescuentoMonto(descuentomonto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDescuentoMonto(DescuentoMonto descuentomonto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDescuentoMonto(descuentomonto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDescuentoMonto(descuentomonto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDescuentoMonto(descuentomonto);
	}
	
	public void setVariablesObjetoActualToFormularioDescuentoMonto(DescuentoMonto descuentomonto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setText(descuentomonto.getId().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setText(descuentomonto.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setText(descuentomonto.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setText(descuentomonto.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setText(descuentomonto.getvalor_fin().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setSelected(descuentomonto.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DescuentoMonto descuentomontoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,descuentomontoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DescuentoMonto descuentomontoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				descuentomontoLocal=this.descuentomonto;
			} else {
				descuentomontoLocal=this.descuentomontoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(descuentomontoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDescuentoMonto(descuentomontoLocal,true);
					
					if(descuentomontoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(descuentomontoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(descuentomontoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDescuentoMonto(DescuentoMonto descuentomonto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDescuentoMonto(descuentomonto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(descuentomonto);
	}
	
	public void setVariablesFormularioToObjetoActualDescuentoMonto(DescuentoMonto descuentomonto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDescuentoMonto(descuentomonto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDescuentoMonto(DescuentoMonto descuentomonto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.getText()==null || this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.getText()=="" || this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.getText()=="Id") {
				this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setText("0");
			}

			if(conColumnasBase) {descuentomonto.setId(Long.parseLong(this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelIdDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentomonto.setdescripcion(this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabeldescripcionDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentomonto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelporcentajeDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentomonto.setvalor_inicio(Double.parseDouble(this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_VALORINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_inicioDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentomonto.setvalor_fin(Double.parseDouble(this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_VALORFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelvalor_finDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			descuentomonto.setesta_activo(this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDescuentoMonto.jLabelesta_activoDescuentoMonto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDescuentoMonto(DescuentoMonto descuentomontoBean,DescuentoMonto descuentomonto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && descuentomontoBean.getid_bodega()!=null && !descuentomontoBean.getid_bodega().equals(-1L))) {descuentomonto.setid_bodega(descuentomontoBean.getid_bodega());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDescuentoMonto(DescuentoMonto descuentomontoOrigen,DescuentoMonto descuentomonto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && descuentomontoOrigen.getId()!=null && !descuentomontoOrigen.getId().equals(0L))) {descuentomonto.setId(descuentomontoOrigen.getId());}}
			if(conDefault || (!conDefault && descuentomontoOrigen.getid_bodega()!=null && !descuentomontoOrigen.getid_bodega().equals(-1L))) {descuentomonto.setid_bodega(descuentomontoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && descuentomontoOrigen.getdescripcion()!=null && !descuentomontoOrigen.getdescripcion().equals(""))) {descuentomonto.setdescripcion(descuentomontoOrigen.getdescripcion());}
			if(conDefault || (!conDefault && descuentomontoOrigen.getporcentaje()!=null && !descuentomontoOrigen.getporcentaje().equals(0.0))) {descuentomonto.setporcentaje(descuentomontoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && descuentomontoOrigen.getvalor_inicio()!=null && !descuentomontoOrigen.getvalor_inicio().equals(0.0))) {descuentomonto.setvalor_inicio(descuentomontoOrigen.getvalor_inicio());}
			if(conDefault || (!conDefault && descuentomontoOrigen.getvalor_fin()!=null && !descuentomontoOrigen.getvalor_fin().equals(0.0))) {descuentomonto.setvalor_fin(descuentomontoOrigen.getvalor_fin());}
			if(conDefault || (!conDefault && descuentomontoOrigen.getesta_activo()!=null && !descuentomontoOrigen.getesta_activo().equals(false))) {descuentomonto.setesta_activo(descuentomontoOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDescuentoMonto(DescuentoMonto descuentomonto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setText(descuentomonto.getId().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setText(descuentomonto.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setText(descuentomonto.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setText(descuentomonto.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setText(descuentomonto.getvalor_fin().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setSelected(descuentomonto.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDescuentoMonto(DescuentoMontoBean descuentomontoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setText(descuentomontoBean.getId().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setText(descuentomontoBean.getdescripcion());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setText(descuentomontoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setText(descuentomontoBean.getvalor_inicio().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setText(descuentomontoBean.getvalor_fin().toString());
			this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setSelected(descuentomontoBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDescuentoMonto(DescuentoMontoParameterReturnGeneral descuentomontoReturnGeneral,DescuentoMontoBean descuentomontoBean,Boolean conDefault) throws Exception { 
		try {
			DescuentoMonto descuentomontoLocal=new DescuentoMonto();
			
			descuentomontoLocal=descuentomontoReturnGeneral.getDescuentoMonto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && descuentomontoLocal.getId()!=null && !descuentomontoLocal.getId().equals(0L))) {descuentomontoBean.setId(descuentomontoLocal.getId());}}
			if(conDefault || (!conDefault && descuentomontoLocal.getid_bodega()!=null && !descuentomontoLocal.getid_bodega().equals(-1L))) {descuentomontoBean.setid_bodega(descuentomontoLocal.getid_bodega());}
			if(conDefault || (!conDefault && descuentomontoLocal.getdescripcion()!=null && !descuentomontoLocal.getdescripcion().equals(""))) {descuentomontoBean.setdescripcion(descuentomontoLocal.getdescripcion());}
			if(conDefault || (!conDefault && descuentomontoLocal.getporcentaje()!=null && !descuentomontoLocal.getporcentaje().equals(0.0))) {descuentomontoBean.setporcentaje(descuentomontoLocal.getporcentaje());}
			if(conDefault || (!conDefault && descuentomontoLocal.getvalor_inicio()!=null && !descuentomontoLocal.getvalor_inicio().equals(0.0))) {descuentomontoBean.setvalor_inicio(descuentomontoLocal.getvalor_inicio());}
			if(conDefault || (!conDefault && descuentomontoLocal.getvalor_fin()!=null && !descuentomontoLocal.getvalor_fin().equals(0.0))) {descuentomontoBean.setvalor_fin(descuentomontoLocal.getvalor_fin());}
			if(conDefault || (!conDefault && descuentomontoLocal.getesta_activo()!=null && !descuentomontoLocal.getesta_activo().equals(false))) {descuentomontoBean.setesta_activo(descuentomontoLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDescuentoMontoGenerico(Long idDescuentoMontoSeleccionado,JComboBox jComboBoxDescuentoMonto,List<DescuentoMonto> descuentomontosLocal)throws Exception {
		try {
			DescuentoMonto  descuentomontoTemp=null;

			for(DescuentoMonto descuentomontoAux:descuentomontosLocal) {
				if(descuentomontoAux.getId()!=null && descuentomontoAux.getId().equals(idDescuentoMontoSeleccionado)) {
					descuentomontoTemp=descuentomontoAux;
					break;
				}
			}

			jComboBoxDescuentoMonto.setSelectedItem(descuentomontoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDescuentoMontoGenerico(JComboBox jComboBoxDescuentoMonto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDescuentoMonto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDescuentoMonto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDescuentoMonto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDescuentoMonto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDescuentoMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDescuentoMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentomonto=(DescuentoMonto) descuentomontoLogic.getDescuentoMontos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			descuentomonto =(DescuentoMonto) descuentomontos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!descuentomonto.getIsNew() && !descuentomonto.getIsChanged() && !descuentomonto.getIsDeleted()) {
				sDescripcion=descuentomonto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=descuentomonto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!descuentomonto.getIsNew() && !descuentomonto.getIsChanged() && !descuentomonto.getIsDeleted()) {
				sDescripcion=descuentomonto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=descuentomonto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!descuentomonto.getIsNew() && !descuentomonto.getIsChanged() && !descuentomonto.getIsDeleted()) {
				sDescripcion=descuentomonto.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=descuentomonto.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!descuentomonto.getIsNew() && !descuentomonto.getIsChanged() && !descuentomonto.getIsDeleted()) {
				sDescripcion=descuentomonto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=descuentomonto.getbodega_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DescuentoMonto descuentomontoRow=new DescuentoMonto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentomontoRow=(DescuentoMonto) descuentomontoLogic.getDescuentoMontos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			descuentomontoRow=(DescuentoMonto) descuentomontos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDescuentoMonto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto));			
			this.jButtonDuplicarDescuentoMonto.setVisible((this.isVisibilidadCeldaDuplicarDescuentoMonto && this.isPermisoDuplicarDescuentoMonto));			
			this.jButtonCopiarDescuentoMonto.setVisible((this.isVisibilidadCeldaCopiarDescuentoMonto && this.isPermisoCopiarDescuentoMonto));
			this.jButtonVerFormDescuentoMonto.setVisible((this.isVisibilidadCeldaVerFormDescuentoMonto && this.isPermisoVerFormDescuentoMonto));
			
			this.jButtonAbrirOrderByDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));			
			
			this.jButtonNuevoRelacionesDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto && this.isPermisoNuevoDescuentoMonto));			
			this.jButtonNuevoGuardarCambiosDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarDescuentoMonto.setVisible((this.isVisibilidadCeldaModificarDescuentoMonto && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.setVisible((this.isVisibilidadCeldaActualizarDescuentoMonto && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.setVisible((this.isVisibilidadCeldaEliminarDescuentoMonto && this.isPermisoEliminarDescuentoMonto));
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.setVisible(this.isVisibilidadCeldaCancelarDescuentoMonto);							
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));			
			
			}
						
			this.jButtonGuardarCambiosTablaDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto));						
			this.jButtonDuplicarToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaDuplicarDescuentoMonto && this.isPermisoDuplicarDescuentoMonto));						
			this.jButtonCopiarToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaCopiarDescuentoMonto && this.isPermisoCopiarDescuentoMonto));			
			this.jButtonVerFormToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaVerFormDescuentoMonto && this.isPermisoVerFormDescuentoMonto));			
			this.jButtonAbrirOrderByToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));
			this.jButtonNuevoRelacionesToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto && this.isPermisoNuevoDescuentoMonto));			
			this.jButtonNuevoGuardarCambiosToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));			
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaModificarDescuentoMonto && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaActualizarDescuentoMonto  && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaEliminarDescuentoMonto && this.isPermisoEliminarDescuentoMonto));
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarToolBarDescuentoMonto.setVisible(this.isVisibilidadCeldaCancelarDescuentoMonto);				
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto));			
			this.jMenuItemDuplicarDescuentoMonto.setVisible((this.isVisibilidadCeldaDuplicarDescuentoMonto && this.isPermisoDuplicarDescuentoMonto));			
			this.jMenuItemCopiarDescuentoMonto.setVisible((this.isVisibilidadCeldaCopiarDescuentoMonto && this.isPermisoCopiarDescuentoMonto));			
			this.jMenuItemVerFormDescuentoMonto.setVisible((this.isVisibilidadCeldaVerFormDescuentoMonto && this.isPermisoVerFormDescuentoMonto));			
			this.jMenuItemAbrirOrderByDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));			
			//this.jMenuItemMostrarOcultarDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));
			this.jMenuItemDetalleAbrirOrderByDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));			
			//this.jMenuItemDetalleMostrarOcultarDescuentoMonto.setVisible((this.isVisibilidadCeldaOrdenDescuentoMonto && this.isPermisoOrdenDescuentoMonto));			
			this.jMenuItemNuevoRelacionesDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto && this.isPermisoNuevoDescuentoMonto));			
			this.jMenuItemNuevoGuardarCambiosDescuentoMonto.setVisible((this.isVisibilidadCeldaNuevoDescuentoMonto && this.isPermisoNuevoDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));									
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemModificarDescuentoMonto.setVisible((this.isVisibilidadCeldaModificarDescuentoMonto && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemActualizarDescuentoMonto.setVisible((this.isVisibilidadCeldaActualizarDescuentoMonto && this.isPermisoActualizarDescuentoMonto));	
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemEliminarDescuentoMonto.setVisible((this.isVisibilidadCeldaEliminarDescuentoMonto && this.isPermisoEliminarDescuentoMonto));
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemCancelarDescuentoMonto.setVisible(this.isVisibilidadCeldaCancelarDescuentoMonto);				
			}
			
			this.jMenuItemGuardarCambiosDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));						
			this.jMenuItemGuardarCambiosTablaDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarCambiosDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDescuentoMonto=this.jButtonNuevoDescuentoMonto.isVisible();
			this.isVisibilidadCeldaDuplicarDescuentoMonto=this.jButtonDuplicarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaCopiarDescuentoMonto=this.jButtonCopiarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaVerFormDescuentoMonto=this.jButtonVerFormDescuentoMonto.isVisible();
			
			this.isVisibilidadCeldaOrdenDescuentoMonto=this.jButtonAbrirOrderByDescuentoMonto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=this.jButtonNuevoRelacionesDescuentoMonto.isVisible();
			this.isVisibilidadCeldaModificarDescuentoMonto=this.jButtonModificarDescuentoMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.isVisibilidadCeldaActualizarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaGuardarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=this.jButtonGuardarCambiosTablaDescuentoMonto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDescuentoMonto=this.jButtonNuevoToolBarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=this.jButtonNuevoRelacionesToolBarDescuentoMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.isVisibilidadCeldaModificarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarToolBarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaActualizarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarToolBarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarToolBarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarToolBarDescuentoMonto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDescuentoMonto=this.jButtonGuardarCambiosToolBarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=this.jButtonGuardarCambiosTablaToolBarDescuentoMonto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDescuentoMonto=this.jMenuItemNuevoDescuentoMonto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=this.jMenuItemNuevoRelacionesDescuentoMonto.isVisible();
			
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.isVisibilidadCeldaModificarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemModificarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaActualizarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemActualizarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaEliminarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemEliminarDescuentoMonto.isVisible();
			this.isVisibilidadCeldaCancelarDescuentoMonto=this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemCancelarDescuentoMonto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDescuentoMonto=this.jMenuItemGuardarCambiosDescuentoMonto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=this.jMenuItemGuardarCambiosTablaDescuentoMonto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDescuentoMonto(Boolean esInicializar) {
		if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
				//if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDescuentoMonto();
			}
			
			this.inicializarActualizarBindingBotonesManualDescuentoMonto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDescuentoMonto() {
		this.jButtonNuevoDescuentoMonto.setVisible(this.isPermisoNuevoDescuentoMonto);			
		this.jButtonDuplicarDescuentoMonto.setVisible(this.isPermisoDuplicarDescuentoMonto);			
		this.jButtonCopiarDescuentoMonto.setVisible(this.isPermisoCopiarDescuentoMonto);			
		this.jButtonVerFormDescuentoMonto.setVisible(this.isPermisoVerFormDescuentoMonto);			
		
		this.jButtonAbrirOrderByDescuentoMonto.setVisible(this.isPermisoOrdenDescuentoMonto);					
		
		this.jButtonNuevoRelacionesDescuentoMonto.setVisible(this.isPermisoNuevoDescuentoMonto);			
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarDescuentoMonto.setVisible(this.isPermisoActualizarDescuentoMonto);	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.setVisible(this.isPermisoActualizarDescuentoMonto);	
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.setVisible(this.isPermisoEliminarDescuentoMonto);
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.setVisible(this.isVisibilidadCeldaCancelarDescuentoMonto);						
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.setVisible(this.isPermisoGuardarCambiosDescuentoMonto);							
		}
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.setVisible(this.isPermisoActualizarDescuentoMonto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDescuentoMonto() {
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarDescuentoMonto.setVisible(this.isPermisoActualizarDescuentoMonto);	
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.setVisible(this.isPermisoActualizarDescuentoMonto);	
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.setVisible(this.isPermisoEliminarDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.setVisible(this.isVisibilidadCeldaCancelarDescuentoMonto);							
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.setVisible((this.isVisibilidadCeldaGuardarDescuentoMonto && this.isPermisoGuardarCambiosDescuentoMonto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDescuentoMonto() {
		if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDescuentoMonto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDescuentoMonto() {
	}
	
	public void jTableDatosDescuentoMontoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDescuentoMonto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.descuentomonto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDescuentoMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDescuentoMonto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.descuentomontoLogic.getConnexion());

				if(this.descuentomonto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.descuentomonto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoMonto=(TitledBorder)this.jScrollPanelDatosDescuentoMonto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDescuentoMonto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.descuentomonto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDescuentoMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDescuentoMonto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.descuentomontoLogic.getConnexion());

				if(this.descuentomonto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.descuentomonto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoMonto=(TitledBorder)this.jScrollPanelDatosDescuentoMonto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDescuentoMonto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.descuentomonto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioDescuentoMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDescuentoMonto(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.descuentomontoLogic.getConnexion());

				if(this.descuentomonto.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.descuentomonto.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoMonto=(TitledBorder)this.jScrollPanelDatosDescuentoMonto.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDescuentoMonto.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.descuentomonto.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDescuentoMontoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDescuentoMonto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDescuentoMonto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDescuentoMonto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.descuentomontoLogic.getConnexion());

				if(this.descuentomonto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.descuentomonto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDescuentoMonto=(TitledBorder)this.jScrollPanelDatosDescuentoMonto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDescuentoMonto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.descuentomonto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.descuentomonto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.descuentomonto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_inicioDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getvalor_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_inicio = "+this.descuentomonto.getvalor_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_finDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getvalor_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_fin = "+this.descuentomonto.getvalor_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoDescuentoMontoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.getdescuentomonto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.descuentomonto==null) {
						this.descuentomonto = new DescuentoMonto();
					}

					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);
				}

				if(this.descuentomonto.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.descuentomonto.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDescuentoMonto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoMonto(false,false);

			this.getDescuentoMontosFK_IdBodega();

			this.inicializarActualizarBindingDescuentoMonto(false);

			//if(DescuentoMontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoMonto(false,false);

			this.getDescuentoMontosFK_IdEmpresa();

			this.inicializarActualizarBindingDescuentoMonto(false);

			//if(DescuentoMontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoMonto(false,false);

			this.getDescuentoMontosFK_IdSucursal();

			this.inicializarActualizarBindingDescuentoMonto(false);

			//if(DescuentoMontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDescuentoMontoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDescuentoMonto(false,false);

			this.getDescuentoMontosFK_IdUsuario();

			this.inicializarActualizarBindingDescuentoMonto(false);

			//if(DescuentoMontoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDescuentoMonto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.descuentomontoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDescuentoMonto() {
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
			this.jInternalFrameDetalleFormDescuentoMonto.setVisible(false);	    			
			this.jInternalFrameDetalleFormDescuentoMonto.dispose();
			this.jInternalFrameDetalleFormDescuentoMonto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
			this.jInternalFrameReporteDinamicoDescuentoMonto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDescuentoMonto.dispose();
			this.jInternalFrameReporteDinamicoDescuentoMonto=null;
		}
		
		if(this.jInternalFrameImportacionDescuentoMonto!=null) {
			this.jInternalFrameImportacionDescuentoMonto.setVisible(false);	    			
			this.jInternalFrameImportacionDescuentoMonto.dispose();
			this.jInternalFrameImportacionDescuentoMonto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDescuentoMonto();
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDescuentoMonto")) {
				jButtonDuplicarDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDescuentoMonto")) {
				jButtonCopiarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDescuentoMonto")) {
				jButtonVerFormDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDescuentoMonto")) {
				jButtonDuplicarDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDescuentoMonto")) {
				jButtonDuplicarDescuentoMontoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDescuentoMonto")) {
				jButtonModificarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDescuentoMonto")) {
				jButtonModificarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDescuentoMonto")) {
				jButtonModificarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDescuentoMonto")) {
				jButtonActualizarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDescuentoMonto")) {
				jButtonActualizarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDescuentoMonto")) {
				jButtonActualizarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDescuentoMonto")) {
				jButtonEliminarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDescuentoMonto")) {
				jButtonEliminarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDescuentoMonto")) {
				jButtonEliminarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDescuentoMonto")) {
				jButtonCancelarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDescuentoMonto")) {
				jButtonCancelarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDescuentoMonto")) {
				jButtonCancelarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDescuentoMonto")) {
				jButtonCerrarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDescuentoMonto")) {
				jButtonCerrarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDescuentoMonto")) {
				jButtonCerrarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDescuentoMonto")) {
				jButtonMostrarOcultarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDescuentoMonto")) {
				jButtonCancelarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDescuentoMonto")) {
				jButtonCopiarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDescuentoMonto")) {
				jButtonVerFormDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDescuentoMonto")) {
				jButtonCopiarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDescuentoMonto")) {
				jButtonVerFormDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDescuentoMonto")) {
				jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDescuentoMonto")) {
				jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDescuentoMonto")) {
				jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDescuentoMonto")) {
				jButtonAnterioresDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDescuentoMonto")) {
				jButtonAnterioresDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDescuentoMonto")) {
				jButtonAnterioresDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDescuentoMonto")) {
				jButtonSiguientesDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDescuentoMonto")) {
				jButtonSiguientesDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDescuentoMonto")) {
				jButtonSiguientesDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDescuentoMonto") || sTipo.equals("MenuItemDetalleAbrirOrderByDescuentoMonto")) {
				jButtonAbrirOrderByDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDescuentoMonto") || sTipo.equals("MenuItemDetalleMostrarOcultarDescuentoMonto")) {
				jButtonMostrarOcultarDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDescuentoMonto")) {
				jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDescuentoMonto")) {
				jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDescuentoMonto")) {
				jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDescuentoMonto")) {
				jButtonCerrarReporteDinamicoDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDescuentoMonto")) {
				jButtonGenerarReporteDinamicoDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDescuentoMonto")) {
				
				jButtonGenerarExcelReporteDinamicoDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDescuentoMonto")) {
				jButtonCerrarImportacionDescuentoMontoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDescuentoMonto")) {
				
				jButtonGenerarImportacionDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDescuentoMonto")) {
				
				jButtonAbrirImportacionDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDescuentoMonto")) {
				jComboBoxTiposAccionesDescuentoMontoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDescuentoMonto")) {
				jComboBoxTiposRelacionesDescuentoMontoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDescuentoMonto")) {
				jComboBoxTiposAccionesDescuentoMontoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDescuentoMonto")) {
				
				jComboBoxTiposSeleccionarDescuentoMontoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDescuentoMonto")) {
				jTextFieldValorCampoGeneralDescuentoMontoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDescuentoMonto")) {
				jButtonAbrirOrderByDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDescuentoMonto")) {
				jButtonAbrirOrderByDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDescuentoMonto")) {
				jButtonCerrarOrderByDescuentoMontoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDescuentoMontoBusqueda")) {
				this.jButtonidDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDescuentoMontoUpdate")) {
				this.jButtonid_empresaDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDescuentoMontoBusqueda")) {
				this.jButtonid_empresaDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDescuentoMontoUpdate")) {
				this.jButtonid_sucursalDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDescuentoMontoBusqueda")) {
				this.jButtonid_sucursalDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDescuentoMontoUpdate")) {
				this.jButtonid_usuarioDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDescuentoMontoBusqueda")) {
				this.jButtonid_usuarioDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDescuentoMontoUpdate")) {
				this.jButtonid_bodegaDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDescuentoMontoBusqueda")) {
				this.jButtonid_bodegaDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDescuentoMontoBusqueda")) {
				this.jButtondescripcionDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDescuentoMontoBusqueda")) {
				this.jButtonporcentajeDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_inicioDescuentoMontoBusqueda")) {
				this.jButtonvalor_inicioDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_finDescuentoMontoBusqueda")) {
				this.jButtonvalor_finDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDescuentoMontoBusqueda")) {
				this.jButtonesta_activoDescuentoMontoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaDescuentoMonto")) {
				this.jButtonFK_IdBodegaDescuentoMontoActionPerformed(evt);
			}
			
			;
			
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDescuentoMonto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DescuentoMonto descuentomontoLocal=null;
			
			if(!this.getEsControlTabla()) {
				descuentomontoLocal=this.descuentomonto;
			} else {
				descuentomontoLocal=this.descuentomontoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
							
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
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
			
			


			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
								
						
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
								
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
							
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
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
			
			


			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
								
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDescuentoMonto")) {
					jCheckBoxSeleccionarTodosDescuentoMontoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDescuentoMonto")) {
					jCheckBoxSeleccionadosDescuentoMontoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDescuentoMonto")) {
					
				}
				
				


				
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
												
				
				


				
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
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
			
			


			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDescuentoMontoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.descuentomonto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.descuentomonto);
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
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
				
				


				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DescuentoMonto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DescuentoMonto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDescuentoMontoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.descuentomontoAnterior =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDescuentoMonto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDescuentoMontoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDescuentoMonto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.descuentomonto =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.descuentomonto =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.descuentomonto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDescuentoMonto")) {
				
				}
				
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDescuentoMonto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDescuentoMonto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDescuentoMonto")) {
			
			}
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDescuentoMonto();
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			if(sTipo.equals("NuevoDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDescuentoMonto")) {
				jButtonDuplicarDescuentoMontoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDescuentoMonto")) {
				jButtonCopiarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDescuentoMonto")) {
				jButtonVerFormDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDescuentoMonto")) {
				jButtonNuevoDescuentoMontoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDescuentoMonto")) {
				jButtonModificarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDescuentoMonto")) {
				jButtonActualizarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDescuentoMonto")) {
				jButtonEliminarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDescuentoMonto")) {
				jButtonCancelarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDescuentoMonto")) {
				jButtonCerrarDescuentoMontoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDescuentoMonto")) {
				jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDescuentoMonto")) {
				jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDescuentoMonto")) {
				jButtonAbrirOrderByDescuentoMontoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDescuentoMonto")) {
				jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDescuentoMonto")) {
				jButtonAnterioresDescuentoMontoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDescuentoMonto")) {
				jButtonSiguientesDescuentoMontoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDescuentoMontoBusqueda")) {
				this.jButtonidDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDescuentoMontoUpdate")) {
				this.jButtonid_empresaDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDescuentoMontoBusqueda")) {
				this.jButtonid_empresaDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDescuentoMontoUpdate")) {
				this.jButtonid_sucursalDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDescuentoMontoBusqueda")) {
				this.jButtonid_sucursalDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDescuentoMontoUpdate")) {
				this.jButtonid_usuarioDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDescuentoMontoBusqueda")) {
				this.jButtonid_usuarioDescuentoMontoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDescuentoMontoUpdate")) {
				this.jButtonid_bodegaDescuentoMontoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDescuentoMontoBusqueda")) {
				this.jButtonid_bodegaDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDescuentoMontoBusqueda")) {
				this.jButtondescripcionDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDescuentoMontoBusqueda")) {
				this.jButtonporcentajeDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_inicioDescuentoMontoBusqueda")) {
				this.jButtonvalor_inicioDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_finDescuentoMontoBusqueda")) {
				this.jButtonvalor_finDescuentoMontoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDescuentoMontoBusqueda")) {
				this.jButtonesta_activoDescuentoMontoBusquedaActionPerformed(evt);
			}
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDescuentoMonto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDescuentoMonto")) {
				closingInternalFrameDescuentoMonto();
				
			} else if(sTipo.equals("jButtonCancelarDescuentoMonto")) {
				JInternalFrameBase jInternalFrameDetalleFormDescuentoMonto = (JInternalFrameBase)evt.getSource();
	            	
	            DescuentoMontoBeanSwingJInternalFrame jInternalFrameParent=(DescuentoMontoBeanSwingJInternalFrame)jInternalFrameDetalleFormDescuentoMonto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDescuentoMontoActionPerformed(null);
			}
			
			DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.descuentomonto,new Object(),this.descuentomontoParameterGeneral,this.descuentomontoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDescuentoMonto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDescuentoMonto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDescuentoMonto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.descuentomonto)) {
			if(!esControlTabla) {
				if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);			
				}
				
				if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDescuentoMonto(this.descuentomonto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.descuentomontoReturnGeneral=descuentomontoLogic.procesarEventosDescuentoMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentomontoLogic.getDescuentoMontos(),this.descuentomonto,this.descuentomontoParameterGeneral,this.isEsNuevoDescuentoMonto,classes);//this.descuentomontoLogic.getDescuentoMonto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDescuentoMonto(this.descuentomontoReturnGeneral,this.descuentomontoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDescuentoMonto(classes,this.descuentomontoReturnGeneral,this.descuentomontoBean,false);
					}
						
					if(this.descuentomontoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto());	
					}
						
					if(this.descuentomontoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto(),classes);//this.descuentomontoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDescuentoMonto(this.descuentomonto,classes);//this.descuentomontoBean);									
				}
			
				if(DescuentoMontoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDescuentoMonto(this.descuentomonto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDescuentoMonto(this.descuentomonto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.descuentomontoAnterior!=null) {
						this.descuentomonto=this.descuentomontoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.descuentomontoReturnGeneral=descuentomontoLogic.procesarEventosDescuentoMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentomontoLogic.getDescuentoMontos(),this.descuentomonto,this.descuentomontoParameterGeneral,this.isEsNuevoDescuentoMonto,classes);//this.descuentomontoLogic.getDescuentoMonto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.descuentomontoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.descuentomontoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.descuentomontoReturnGeneral.getDescuentoMonto(),descuentomontoLogic.getDescuentoMontos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.descuentomontoReturnGeneral.getDescuentoMonto(),this.descuentomontos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDescuentoMonto.repaint();
				
				//((AbstractTableModel) this.jTableDatosDescuentoMonto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDescuentoMonto();
			}
		}
	}
	
	public void actualizarVisualTableDatosDescuentoMonto() throws Exception {
		
		DescuentoMontoModel descuentomontoModel=(DescuentoMontoModel)this.jTableDatosDescuentoMonto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			descuentomontoModel.descuentomontos=this.descuentomontoLogic.getDescuentoMontos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			descuentomontoModel.descuentomontos=this.descuentomontos;
		}
		
		
		((DescuentoMontoModel) this.jTableDatosDescuentoMonto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDescuentoMonto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdescuentomontoAnterior(),this.descuentomontoLogic.getDescuentoMontos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdescuentomontoAnterior(),this.descuentomontos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDescuentoMonto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDescuentoMonto(DescuentoMonto descuentomonto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
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
										
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentomonto,new Object(),generalEntityParameterGeneral,this.descuentomontoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.descuentomontoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DescuentoMontoConstantesFunciones.getClassesRelationshipsOfDescuentoMonto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DescuentoMontoConstantesFunciones.getClassesRelationshipsFromStringsOfDescuentoMonto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDescuentoMonto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DescuentoMontoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.descuentomonto,new Object(),generalEntityParameterGeneral,this.descuentomontoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDescuentoMonto(DescuentoMontoBean descuentomontoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDescuentoMonto(ArrayList<Classe> classes,DescuentoMontoReturnGeneral descuentomontoReturnGeneral,DescuentoMontoBean descuentomontoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDescuentoMonto(DescuentoMonto descuentomonto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.descuentomonto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDescuentoMonto = new DescuentoMontoDetalleFormJInternalFrame(jDesktopPane,this.descuentomontoSessionBean.getConGuardarRelaciones(),this.descuentomontoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.setVisible(false);
		this.jInternalFrameDetalleFormDescuentoMonto.setSelected(false);						
		
		this.jInternalFrameDetalleFormDescuentoMonto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDescuentoMonto.descuentomontoLogic=this.descuentomontoLogic;
		
		this.cargarCombosFrameForeignKeyDescuentoMonto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDescuentoMonto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDescuentoMonto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDescuentoMonto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDescuentoMonto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDescuentoMonto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDescuentoMonto"));
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ModificarDescuentoMonto"));

		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ModificarToolBarDescuentoMonto"));
					
		this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemModificarDescuentoMonto.addActionListener(new ButtonActionListener(this,"MenuItemModificarDescuentoMonto"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.addActionListener (new ButtonActionListener(this,"ActualizarDescuentoMonto"));
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDescuentoMonto"));
						
		this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemActualizarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDescuentoMonto"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.addActionListener (new ButtonActionListener(this,"EliminarDescuentoMonto"));
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"EliminarToolBarDescuentoMonto"));
								
		this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemEliminarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDescuentoMonto"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CancelarDescuentoMonto"));
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CancelarToolBarDescuentoMonto"));
					
		this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemCancelarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDescuentoMonto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemDetalleCerrarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDescuentoMonto"));		
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoMonto"));
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoMonto"));
		
		
		
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDescuentoMonto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonidDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtondescripcionDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonporcentajeDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_inicioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_finDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonesta_activoDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoMontoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDescuentoMonto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDescuentoMonto"));
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDescuentoMonto"));
		}
		
		this.jTableDatosDescuentoMonto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDescuentoMonto"));
		
		this.jTableDatosDescuentoMonto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDescuentoMonto"));
		
		this.jButtonNuevoDescuentoMonto.addActionListener(new ButtonActionListener(this,"NuevoDescuentoMonto"));
		
		this.jButtonDuplicarDescuentoMonto.addActionListener(new ButtonActionListener(this,"DuplicarDescuentoMonto"));
		
		this.jButtonCopiarDescuentoMonto.addActionListener(new ButtonActionListener(this,"CopiarDescuentoMonto"));
		
		this.jButtonVerFormDescuentoMonto.addActionListener(new ButtonActionListener(this,"VerFormDescuentoMonto"));
		
		
		this.jButtonNuevoToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"NuevoToolBarDescuentoMonto"));
			
		this.jButtonDuplicarToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDescuentoMonto"));
			
		this.jMenuItemNuevoDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDescuentoMonto"));
			
		this.jMenuItemDuplicarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDescuentoMonto"));		
		
		
		this.jButtonNuevoRelacionesDescuentoMonto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDescuentoMonto"));
		
		
		this.jButtonNuevoRelacionesToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDescuentoMonto"));
			
		this.jMenuItemNuevoRelacionesDescuentoMonto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDescuentoMonto"));		
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ModificarDescuentoMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonModificarToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ModificarToolBarDescuentoMonto"));
			
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemModificarDescuentoMonto.addActionListener(new ButtonActionListener(this,"MenuItemModificarDescuentoMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarDescuentoMonto.addActionListener (new ButtonActionListener(this,"ActualizarDescuentoMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonActualizarToolBarDescuentoMonto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDescuentoMonto"));
				
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemActualizarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDescuentoMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarDescuentoMonto.addActionListener (new ButtonActionListener(this,"EliminarDescuentoMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonEliminarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"EliminarToolBarDescuentoMonto"));
						
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemEliminarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDescuentoMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CancelarDescuentoMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonCancelarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CancelarToolBarDescuentoMonto"));
			
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemCancelarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDescuentoMonto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDescuentoMonto"));		
		
		
		this.jButtonCerrarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CerrarDescuentoMonto"));
		
		
		this.jButtonCerrarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CerrarToolBarDescuentoMonto"));
			
		this.jMenuItemCerrarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDescuentoMonto"));
			
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jMenuItemDetalleCerrarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDescuentoMonto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosDescuentoMonto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDescuentoMonto"));
		}
		
		this.jButtonCopiarToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"CopiarToolBarDescuentoMonto"));
			
		this.jButtonVerFormToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"VerFormToolBarDescuentoMonto"));
		
		this.jMenuItemGuardarCambiosDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDescuentoMonto"));
			
		this.jMenuItemCopiarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDescuentoMonto"));		
		
		this.jMenuItemVerFormDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDescuentoMonto"));		
		
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDescuentoMonto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDescuentoMonto"));
			
		this.jMenuItemGuardarCambiosTablaDescuentoMonto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDescuentoMonto"));		
		
		
		
		this.jButtonRecargarInformacionDescuentoMonto.addActionListener (new ButtonActionListener(this,"RecargarInformacionDescuentoMonto"));
					
		this.jButtonRecargarInformacionToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDescuentoMonto"));
		
		this.jMenuItemRecargarInformacionDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDescuentoMonto"));		
		
		
		
		this.jButtonAnterioresDescuentoMonto.addActionListener (new ButtonActionListener(this,"AnterioresDescuentoMonto"));
		
		
		this.jButtonAnterioresToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDescuentoMonto"));
		
		this.jMenuItemAnterioresDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDescuentoMonto"));		
		
		
		this.jButtonSiguientesDescuentoMonto.addActionListener (new ButtonActionListener(this,"SiguientesDescuentoMonto"));
		
		
		this.jButtonSiguientesToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDescuentoMonto"));
			
		this.jMenuItemSiguientesDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDescuentoMonto"));
			
		this.jMenuItemAbrirOrderByDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDescuentoMonto"));
			
		this.jMenuItemMostrarOcultarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDescuentoMonto"));
			
		this.jMenuItemDetalleAbrirOrderByDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDescuentoMonto"));
			
		this.jMenuItemDetalleMostarOcultarDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDescuentoMonto"));		
		
		
		this.jButtonNuevoGuardarCambiosDescuentoMonto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDescuentoMonto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDescuentoMonto"));
			
		this.jMenuItemNuevoGuardarCambiosDescuentoMonto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDescuentoMonto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDescuentoMonto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDescuentoMonto"));

		this.jCheckBoxSeleccionadosDescuentoMonto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDescuentoMonto"));
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDescuentoMonto"));
		}
		
		
		this.jComboBoxTiposRelacionesDescuentoMonto.addActionListener (new ButtonActionListener(this,"TiposRelacionesDescuentoMonto"));
			
		this.jComboBoxTiposAccionesDescuentoMonto.addActionListener (new ButtonActionListener(this,"TiposAccionesDescuentoMonto"));
					
		this.jComboBoxTiposSeleccionarDescuentoMonto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDescuentoMonto"));
			
		this.jTextFieldValorCampoGeneralDescuentoMonto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDescuentoMonto"));		
		
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonidDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtondescripcionDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonporcentajeDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_inicioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_finDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonesta_activoDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoMontoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDescuentoMonto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDescuentoMonto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDescuentoMonto!=null) {
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoMonto"));
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoMonto"));
				this.jInternalFrameReporteDinamicoDescuentoMonto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoMonto"));
			}
			
			//this.jButtonCerrarReporteDinamicoDescuentoMonto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDescuentoMonto"));				
			//this.jButtonGenerarReporteDinamicoDescuentoMonto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDescuentoMonto"));
			//this.jButtonGenerarExcelReporteDinamicoDescuentoMonto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDescuentoMonto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDescuentoMonto!=null) {
				this.jInternalFrameImportacionDescuentoMonto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDescuentoMonto"));
				this.jInternalFrameImportacionDescuentoMonto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDescuentoMonto"));
				this.jInternalFrameImportacionDescuentoMonto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDescuentoMonto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDescuentoMonto.addActionListener (new ButtonActionListener(this,"AbrirOrderByDescuentoMonto"));
			
			this.jButtonAbrirOrderByToolBarDescuentoMonto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDescuentoMonto"));			
			
			if(this.jInternalFrameOrderByDescuentoMonto!=null) {
				this.jInternalFrameOrderByDescuentoMonto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDescuentoMonto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDescuentoMonto.jTabbedPaneRelacionesDescuentoMonto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDescuentoMonto"));
		
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
            		closingInternalFrameDescuentoMonto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDescuentoMonto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDescuentoMonto = (JInternalFrameBase)event.getSource();
	            	
	            DescuentoMontoBeanSwingJInternalFrame jInternalFrameParent=(DescuentoMontoBeanSwingJInternalFrame)jInternalFrameDetalleFormDescuentoMonto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDescuentoMontoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDescuentoMonto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDescuentoMontoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDescuentoMonto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDescuentoMonto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDescuentoMonto";
		inputMap = this.jButtonNuevoDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDescuentoMontoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDescuentoMontoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDescuentoMonto";
		inputMap = this.jButtonNuevoRelacionesDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDescuentoMontoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDescuentoMonto";
		inputMap = this.jButtonModificarDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDescuentoMonto";
		inputMap = this.jButtonActualizarDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDescuentoMonto";
		inputMap = this.jButtonEliminarDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDescuentoMonto";
		inputMap = this.jButtonCancelarDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDescuentoMonto";
		inputMap = this.jButtonCerrarDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDescuentoMonto";
		inputMap = this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonGuardarCambiosDescuentoMonto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDescuentoMontoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDescuentoMonto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDescuentoMontoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDescuentoMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDescuentoMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDescuentoMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDescuentoMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDescuentoMonto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDescuentoMontoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonidDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"idDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_empresaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_sucursalDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_usuarioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDescuentoMontoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonid_bodegaDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtondescripcionDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonporcentajeDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_inicioDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_inicioDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonvalor_finDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"valor_finDescuentoMontoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDescuentoMonto.jButtonesta_activoDescuentoMontoBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDescuentoMontoBusqueda"));
		
		
		this.jButtonFK_IdBodegaDescuentoMonto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDescuentoMonto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDescuentoMonto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDescuentoMontoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDescuentoMontoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDescuentoMonto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDescuentoMonto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
					descuentomontoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoMonto descuentomontoAux:descuentomontos) {
					descuentomontoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDescuentoMontoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
						descuentomontoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoMonto descuentomontoAux:descuentomontos) {
						descuentomontoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
					
						if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							descuentomontoAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoMonto descuentomontoAux:descuentomontos) {
						
						if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							descuentomontoAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDescuentoMonto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDescuentoMonto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDescuentoMontoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDescuentoMonto.getSelectedRows();
			
			DescuentoMonto descuentomontoLocal=new DescuentoMonto();
			
			//this.seleccionarTodosDescuentoMonto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					descuentomontoLocal =(DescuentoMonto) this.descuentomontoLogic.getDescuentoMontos().toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					descuentomontoLocal =(DescuentoMonto) this.descuentomontos.toArray()[this.jTableDatosDescuentoMonto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				descuentomontoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
						descuentomontoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DescuentoMonto descuentomontoAux:descuentomontos) {
						descuentomontoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDescuentoMonto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDescuentoMonto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDescuentoMonto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDescuentoMontoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDescuentoMontoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDescuentoMontoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDescuentoMonto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DescuentoMonto descuentomontoAux:this.descuentomontoLogic.getDescuentoMontos()) {
				
						if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							descuentomontoAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							descuentomontoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO)) {
							existe=true;
							descuentomontoAux.setvalor_inicio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_VALORFIN)) {
							existe=true;
							descuentomontoAux.setvalor_fin(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoMonto descuentomontoAux:descuentomontos) {
					
						if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							descuentomontoAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							descuentomontoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO)) {
							existe=true;
							descuentomontoAux.setvalor_inicio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_VALORFIN)) {
							existe=true;
							descuentomontoAux.setvalor_fin(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDescuentoMonto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDescuentoMontoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDescuentoMonto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDescuentoMonto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDescuentoMonto) {				
					conSplash=true;//false;										
					
					//this.startProcessDescuentoMonto(conSplash);
				
					this.generarReporteDescuentoMontosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDescuentoMontosSeleccionados();
				//this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDescuentoMontosSeleccionados(false);
				//this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDescuentoMontosSeleccionados(true);
				//this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDescuentoMonto();
				
				this.exportarDescuentoMontosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDescuentoMontos();
				//this.importarDescuentoMontos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDescuentoMonto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDescuentoMontosSeleccionados();
				//this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Descuento Monto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDescuentoMonto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDescuentoMonto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDescuentoMonto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
				}	
			} 			
			else if(DescuentoMontoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDescuentoMonto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDescuentoMonto(conSplash);
					
						//this.actualizarParametrosGeneralDescuentoMonto();
						
						this.generarReporteProcesoAccionDescuentoMontosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DescuentoMontoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Descuento MontoS SELECCIONADOS?", "MANTENIMIENTO DE Descuento Monto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDescuentoMonto();
				
						this.actualizarParametrosGeneralDescuentoMonto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.descuentomontoReturnGeneral=descuentomontoLogic.procesarAccionDescuentoMontosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.descuentomontoLogic.getDescuentoMontos(),this.descuentomontoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDescuentoMontoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDescuentoMonto();
					
					DescuentoMontoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDescuentoMontoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDescuentoMonto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxTiposAccionesFormularioDescuentoMonto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDescuentoMonto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDescuentoMontoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDescuentoMonto();
			
			if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
			DescuentoMonto descuentomonto=new DescuentoMonto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDescuentoMonto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDescuentoMonto.getSelectedItem();
			
			
			
			
			descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
			//this.sTipoAccion;
			
			if(descuentomontosSeleccionados.size()==1) {
				for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
					descuentomonto=descuentomontoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDescuentoMonto();
			
      		//this.finishProcessDescuentoMonto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDescuentoMontoReturnGeneral() throws Exception {
		if(this.descuentomontoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.descuentomontoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.descuentomontoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.descuentomontoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.descuentomontoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.descuentomontoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDescuentoMonto(false);
		}
		
		if(this.descuentomontoReturnGeneral.getConRetornoLista() || this.descuentomontoReturnGeneral.getConRetornoObjeto()) {
			if(this.descuentomontoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.descuentomontoLogic.setDescuentoMontos(this.descuentomontoReturnGeneral.getDescuentoMontos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.descuentomontoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.descuentomontoLogic.setDescuentoMonto(this.descuentomontoReturnGeneral.getDescuentoMonto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDescuentoMonto(false);
		}
	}
	
	public void actualizarParametrosGeneralDescuentoMonto() throws Exception {
		
		
	}
	
	public ArrayList<DescuentoMonto> getDescuentoMontosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDescuentoMonto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DescuentoMonto descuentomontoAux:descuentomontoLogic.getDescuentoMontos()) {
					if(descuentomontoAux.getIsSelected()) {
						descuentomontosSeleccionados.add(descuentomontoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DescuentoMonto descuentomontoAux:this.descuentomontos) {
					if(descuentomontoAux.getIsSelected()) {
						descuentomontosSeleccionados.add(descuentomontoAux);				
					}
				}
			}
			
			if(descuentomontosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						descuentomontosSeleccionados.addAll(this.descuentomontoLogic.getDescuentoMontos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						descuentomontosSeleccionados.addAll(this.descuentomontos);				
					}
				}
			}
		} else {
			descuentomontosSeleccionados.add(this.descuentomonto);
		}
		
		return descuentomontosSeleccionados;
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
	
	public void generarReporteDescuentoMontosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDescuentoMontosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDescuentoMontosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDescuentoMontosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDescuentoMontosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Descuento Monto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados);
		
	}	
	
	public void generarReporteNormalDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDescuentoMontosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDescuentoMonto();
		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDescuentoMonto();
		
		
		//this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados ,descuentomontoImplementable,descuentomontoImplementableHome);
	}
	
	public void mostrarImportacionDescuentoMontos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDescuentoMonto();
		
		this.abrirFrameImportacionDescuentoMonto();		
		
			
		//this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados ,descuentomontoImplementable,descuentomontoImplementableHome);
	}
	
	public void importarDescuentoMontos() throws Exception {		
	
	}
	
	public void exportarDescuentoMontosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDescuentoMontosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDescuentoMontosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDescuentoMontosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Descuento Monto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDescuentoMonto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDescuentoMonto(descuentomontoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//descuentomontoAux.setsDetalleGeneralEntityReporte(descuentomontoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDescuentoMonto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_VALORINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_VALORFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDescuentoMonto(DescuentoMonto descuentomonto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=descuentomonto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getvalor_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getvalor_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=descuentomonto.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DescuentoMontos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDescuentoMonto(row);				
				iRow++;
			}				
			
			for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDescuentoMonto(descuentomontoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDescuentoMontosSeleccionados() throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();		
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"descuentomonto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("descuentomontos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("descuentomonto");
			//elementRoot.appendChild(element);
		
			for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
				element = document.createElement("descuentomonto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDescuentoMonto(descuentomontoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Descuento Monto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDescuentoMonto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_VALORFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDescuentoMonto(DescuentoMonto descuentomonto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getvalor_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getvalor_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(descuentomonto.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlDescuentoMonto(DescuentoMonto descuentomonto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DescuentoMontoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(descuentomonto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DescuentoMontoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(descuentomonto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DescuentoMontoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(descuentomonto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DescuentoMontoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(descuentomonto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(DescuentoMontoConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(descuentomonto.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementbodega_descripcion = document.createElement(DescuentoMontoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(descuentomonto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementdescripcion = document.createElement(DescuentoMontoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(descuentomonto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementporcentaje = document.createElement(DescuentoMontoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(descuentomonto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor_inicio = document.createElement(DescuentoMontoConstantesFunciones.VALORINICIO);
		elementvalor_inicio.appendChild(document.createTextNode(descuentomonto.getvalor_inicio().toString().trim()));
		element.appendChild(elementvalor_inicio);

		Element elementvalor_fin = document.createElement(DescuentoMontoConstantesFunciones.VALORFIN);
		elementvalor_fin.appendChild(document.createTextNode(descuentomonto.getvalor_fin().toString().trim()));
		element.appendChild(elementvalor_fin);

		Element elementesta_activo = document.createElement(DescuentoMontoConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(descuentomonto.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoDescuentoMontosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DescuentoMonto> descuentomontosSeleccionados=new ArrayList<DescuentoMonto>();
		
		descuentomontosSeleccionados=this.getDescuentoMontosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDescuentoMonto(descuentomontosSeleccionados);
		
		this.generarReporteDescuentoMontos("Todos",descuentomontosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDescuentoMonto(ArrayList<DescuentoMonto> descuentomontosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DescuentoMonto descuentomontoAux:descuentomontosSeleccionados) {
				descuentomontoAux.setsDetalleGeneralEntityReporte(descuentomontoAux.toString());
			
				if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(descuentomontoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(descuentomontoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(descuentomontoAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(descuentomontoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(descuentomontoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(DescuentoMontoConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					descuentomontoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(descuentomontoAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DescuentoMontoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDescuentoMonto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDescuentoMonto=true;
				this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=true;
				this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=true;
			}
			
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=true;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=true;
			this.isVisibilidadCeldaEliminarDescuentoMonto=true;
			this.isVisibilidadCeldaCancelarDescuentoMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=true;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=true;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=true;
			this.isVisibilidadCeldaModificarDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=true;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
			this.isVisibilidadCeldaModificarDescuentoMonto=true;
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
			this.isVisibilidadCeldaCancelarDescuentoMonto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				} else {
					this.isVisibilidadCeldaGuardarDescuentoMonto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DescuentoMontoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDescuentoMonto=true;
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=true;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=true;
		} else {
			this.actualizarEstadoPanelsDescuentoMonto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDescuentoMonto=false;
			//this.isVisibilidadCeldaVerFormDescuentoMonto=false;
			this.isVisibilidadCeldaDuplicarDescuentoMonto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!descuentomontoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
		} else {
			this.isVisibilidadCeldaNuevoDescuentoMonto=false;
			this.isVisibilidadCeldaGuardarCambiosDescuentoMonto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(descuentomontoSessionBean.getEsGuardarRelacionado()) {
			if(!descuentomontoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;												
			}
			
			this.jButtonCerrarDescuentoMonto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDescuentoMonto=false;
		}
		
		if(!this.permiteMantenimiento(this.descuentomonto)) {
			this.isVisibilidadCeldaActualizarDescuentoMonto=false;
			this.isVisibilidadCeldaEliminarDescuentoMonto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDescuentoMonto() {
	}
	
	public void actualizarEstadoPanelsDescuentoMonto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDescuentoMonto!=null) {
				this.jScrollPanelDatosEdicionDescuentoMonto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDescuentoMonto!=null) {
				this.jScrollPanelDatosDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDescuentoMonto!=null) {
				this.jPanelPaginacionDescuentoMonto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
					this.jTabbedPaneBusquedasDescuentoMonto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDescuentoMonto!=null) {
				this.jTabbedPaneBusquedasDescuentoMonto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDescuentoMonto!=null) {
				this.jPanelParametrosReportesDescuentoMonto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoMonto.remove(jPanelFK_IdBodegaDescuentoMonto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoMonto.remove(jPanelFK_IdBodegaDescuentoMonto);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdBodega=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoMonto.remove(jPanelFK_IdBodegaDescuentoMonto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDescuentoMonto.remove(jPanelFK_IdBodegaDescuentoMonto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DescuentoMontoSessionBean descuentomontoSessionBean=new DescuentoMontoSessionBean();
		
		if(this.descuentomontoSessionBean==null) {
			this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		}
		
		this.descuentomontoSessionBean.setsUltimaBusquedaDescuentoMonto(this.getsAccionBusqueda());
		this.descuentomontoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.descuentomontoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			descuentomontoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			descuentomontoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			descuentomontoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			descuentomontoSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DescuentoMontoSessionBean descuentomontoSessionBean=new DescuentoMontoSessionBean();
		
		if(this.descuentomontoSessionBean==null) {
			this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		}
		
		if(this.descuentomontoSessionBean.getsUltimaBusquedaDescuentoMonto()!=null&&!this.descuentomontoSessionBean.getsUltimaBusquedaDescuentoMonto().equals("")) {
			this.setsAccionBusqueda(descuentomontoSessionBean.getsUltimaBusquedaDescuentoMonto());
			this.setiNumeroPaginacion(descuentomontoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(descuentomontoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(descuentomontoSessionBean.getid_bodega());
				descuentomontoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(descuentomontoSessionBean.getid_empresa());
				descuentomontoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(descuentomontoSessionBean.getid_sucursal());
				descuentomontoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(descuentomontoSessionBean.getid_usuario());
				descuentomontoSessionBean.setid_usuario(-1L);
			}
		}
		
		this.descuentomontoSessionBean.setsUltimaBusquedaDescuentoMonto("");
		this.descuentomontoSessionBean.setiNumeroPaginacion(DescuentoMontoConstantesFunciones.INUMEROPAGINACION);
		this.descuentomontoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDescuentoMonto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDescuentoMonto() {
		this.updateBorderResaltarBusquedasFormularioDescuentoMonto();
		this.updateVisibilidadBusquedasFormularioDescuentoMonto();
		this.updateHabilitarBusquedasFormularioDescuentoMonto();
	}
	
	public void updateBorderResaltarBusquedasFormularioDescuentoMonto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDescuentoMonto.getComponents().length>0) {
	

		if(this.descuentomontoConstantesFunciones.resaltarFK_IdBodegaDescuentoMonto!=null) {
			index= this.jTabbedPaneBusquedasDescuentoMonto.indexOfComponent(this.jPanelFK_IdBodegaDescuentoMonto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoMonto.getComponent(index);
				jPanel.setBorder(this.descuentomontoConstantesFunciones.resaltarFK_IdBodegaDescuentoMonto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDescuentoMonto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDescuentoMonto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDescuentoMonto.indexOfComponent(this.jPanelFK_IdBodegaDescuentoMonto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoMonto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.descuentomontoConstantesFunciones.mostrarFK_IdBodegaDescuentoMonto);
			if(!this.descuentomontoConstantesFunciones.mostrarFK_IdBodegaDescuentoMonto && index>-1) {
				this.jTabbedPaneBusquedasDescuentoMonto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDescuentoMonto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDescuentoMonto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDescuentoMonto.indexOfComponent(this.jPanelFK_IdBodegaDescuentoMonto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoMonto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.descuentomontoConstantesFunciones.activarFK_IdBodegaDescuentoMonto);
				this.jTabbedPaneBusquedasDescuentoMonto.setEnabledAt(index,this.descuentomontoConstantesFunciones.activarFK_IdBodegaDescuentoMonto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDescuentoMonto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDescuentoMonto.indexOfComponent(this.jPanelFK_IdBodegaDescuentoMonto);

			this.jTabbedPaneBusquedasDescuentoMonto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDescuentoMonto.getComponent(index);

			this.descuentomontoConstantesFunciones.setResaltarFK_IdBodegaDescuentoMonto(resaltar);

			jPanel.setBorder(this.descuentomontoConstantesFunciones.resaltarFK_IdBodegaDescuentoMonto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDescuentoMonto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDescuentoMonto() throws Exception {

		if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDescuentoMonto();
		this.updateVisibilidadResaltarControlesFormularioDescuentoMonto();
		this.updateHabilitarResaltarControlesFormularioDescuentoMonto();
		
	}
	
	public void updateBorderResaltarControlesFormularioDescuentoMonto() throws Exception {
		if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.descuentomontoConstantesFunciones.resaltaridDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltaridDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarid_empresaDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarid_empresaDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarid_sucursalDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarid_sucursalDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarid_usuarioDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarid_usuarioDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarid_bodegaDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarid_bodegaDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltardescripcionDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltardescripcionDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarporcentajeDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarporcentajeDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarvalor_inicioDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarvalor_inicioDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltarvalor_finDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltarvalor_finDescuentoMonto);}
		if(this.descuentomontoConstantesFunciones.resaltaresta_activoDescuentoMonto!=null && this.jInternalFrameDetalleFormDescuentoMonto!=null) {this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setBorderPainted(true);this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setBorder(this.descuentomontoConstantesFunciones.resaltaresta_activoDescuentoMonto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDescuentoMonto() throws Exception {		
		if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
	
		//this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostraridDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelidDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostraridDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_empresaDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelid_empresaDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_empresaDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_sucursalDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelid_sucursalDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_sucursalDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_usuarioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelid_usuarioDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_usuarioDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_bodegaDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelid_bodegaDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarid_bodegaDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrardescripcionDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPaneldescripcionDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrardescripcionDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarporcentajeDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelporcentajeDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarporcentajeDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarvalor_inicioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelvalor_inicioDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarvalor_inicioDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarvalor_finDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelvalor_finDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostrarvalor_finDescuentoMonto);
		//this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostraresta_activoDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jPanelesta_activoDescuentoMonto.setVisible(this.descuentomontoConstantesFunciones.mostraresta_activoDescuentoMonto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDescuentoMonto() throws Exception {
		if(this.jInternalFrameDetalleFormDescuentoMonto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDescuentoMonto!=null) {
	
		this.jInternalFrameDetalleFormDescuentoMonto.jLabelidDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activaridDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_empresaDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarid_empresaDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_sucursalDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarid_sucursalDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_usuarioDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarid_usuarioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jComboBoxid_bodegaDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarid_bodegaDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextAreadescripcionDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activardescripcionDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldporcentajeDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarporcentajeDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_inicioDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarvalor_inicioDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jTextFieldvalor_finDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activarvalor_finDescuentoMonto);
		this.jInternalFrameDetalleFormDescuentoMonto.jCheckBoxesta_activoDescuentoMonto.setEnabled(this.descuentomontoConstantesFunciones.activaresta_activoDescuentoMonto);
		}
	}
	
		
}