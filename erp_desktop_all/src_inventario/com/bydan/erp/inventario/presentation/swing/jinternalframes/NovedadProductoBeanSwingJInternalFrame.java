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

import com.bydan.erp.inventario.util.NovedadProductoConstantesFunciones;
import com.bydan.erp.inventario.util.NovedadProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.NovedadProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.NovedadProductoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class NovedadProductoBeanSwingJInternalFrame extends NovedadProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NovedadProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NovedadProducto> novedadproductoValidator = new ClassValidator<NovedadProducto>(NovedadProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NovedadProducto novedadproducto;	
	public NovedadProducto novedadproductoAux;
	public NovedadProducto novedadproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NovedadProducto novedadproductoTotales;
	public Long idNovedadProductoActual;
	public Long iIdNuevoNovedadProducto=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleFacturaProveedor=false;

	public Boolean getIsTienePermisosDetalleFacturaProveedor() {
		return isTienePermisosDetalleFacturaProveedor;
	}

	public void setIsTienePermisosDetalleFacturaProveedor(Boolean isTienePermisosDetalleFacturaProveedor) {
		this.isTienePermisosDetalleFacturaProveedor= isTienePermisosDetalleFacturaProveedor;
	}


	public Boolean isTienePermisosNovedadSeguimiento=false;

	public Boolean getIsTienePermisosNovedadSeguimiento() {
		return isTienePermisosNovedadSeguimiento;
	}

	public void setIsTienePermisosNovedadSeguimiento(Boolean isTienePermisosNovedadSeguimiento) {
		this.isTienePermisosNovedadSeguimiento= isTienePermisosNovedadSeguimiento;
	}


	public Boolean isTienePermisosDetalleTransferencia=false;

	public Boolean getIsTienePermisosDetalleTransferencia() {
		return isTienePermisosDetalleTransferencia;
	}

	public void setIsTienePermisosDetalleTransferencia(Boolean isTienePermisosDetalleTransferencia) {
		this.isTienePermisosDetalleTransferencia= isTienePermisosDetalleTransferencia;
	}


	public Boolean isTienePermisosDetalleMovimientoInventario=false;

	public Boolean getIsTienePermisosDetalleMovimientoInventario() {
		return isTienePermisosDetalleMovimientoInventario;
	}

	public void setIsTienePermisosDetalleMovimientoInventario(Boolean isTienePermisosDetalleMovimientoInventario) {
		this.isTienePermisosDetalleMovimientoInventario= isTienePermisosDetalleMovimientoInventario;
	}


	public Boolean isTienePermisosDetalleOrdenCompra=false;

	public Boolean getIsTienePermisosDetalleOrdenCompra() {
		return isTienePermisosDetalleOrdenCompra;
	}

	public void setIsTienePermisosDetalleOrdenCompra(Boolean isTienePermisosDetalleOrdenCompra) {
		this.isTienePermisosDetalleOrdenCompra= isTienePermisosDetalleOrdenCompra;
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
	
	public Boolean isPermisoTodoNovedadProducto;
	public Boolean isPermisoNuevoNovedadProducto;
	public Boolean isPermisoActualizarNovedadProducto;
	public Boolean isPermisoActualizarOriginalNovedadProducto;
	public Boolean isPermisoEliminarNovedadProducto;
	public Boolean isPermisoGuardarCambiosNovedadProducto;
	public Boolean isPermisoConsultaNovedadProducto;
	public Boolean isPermisoBusquedaNovedadProducto;
	public Boolean isPermisoReporteNovedadProducto;
	public Boolean isPermisoPaginacionMedioNovedadProducto;
	public Boolean isPermisoPaginacionAltoNovedadProducto;
	public Boolean isPermisoPaginacionTodoNovedadProducto;
	public Boolean isPermisoCopiarNovedadProducto;
	public Boolean isPermisoVerFormNovedadProducto;
	public Boolean isPermisoDuplicarNovedadProducto;
	public Boolean isPermisoOrdenNovedadProducto;
	
	
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
	
	public NovedadProductoParameterReturnGeneral novedadproductoReturnGeneral;
	public NovedadProductoParameterReturnGeneral novedadproductoParameterGeneral;
	
	

	public DetalleFacturaProveedorLogic detallefacturaproveedorLogic=null;

	public DetalleFacturaProveedorLogic getDetalleFacturaProveedorLogic() {
		return detallefacturaproveedorLogic;
	}

	public void setDetalleFacturaProveedorLogic(DetalleFacturaProveedorLogic detallefacturaproveedorLogic) {
		this.detallefacturaproveedorLogic = detallefacturaproveedorLogic;
	}


	public NovedadSeguimientoLogic novedadseguimientoLogic=null;

	public NovedadSeguimientoLogic getNovedadSeguimientoLogic() {
		return novedadseguimientoLogic;
	}

	public void setNovedadSeguimientoLogic(NovedadSeguimientoLogic novedadseguimientoLogic) {
		this.novedadseguimientoLogic = novedadseguimientoLogic;
	}


	public DetalleTransferenciaLogic detalletransferenciaLogic=null;

	public DetalleTransferenciaLogic getDetalleTransferenciaLogic() {
		return detalletransferenciaLogic;
	}

	public void setDetalleTransferenciaLogic(DetalleTransferenciaLogic detalletransferenciaLogic) {
		this.detalletransferenciaLogic = detalletransferenciaLogic;
	}


	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic=null;

	public DetalleMovimientoInventarioLogic getDetalleMovimientoInventarioLogic() {
		return detallemovimientoinventarioLogic;
	}

	public void setDetalleMovimientoInventarioLogic(DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic) {
		this.detallemovimientoinventarioLogic = detallemovimientoinventarioLogic;
	}


	public DetalleOrdenCompraLogic detalleordencompraLogic=null;

	public DetalleOrdenCompraLogic getDetalleOrdenCompraLogic() {
		return detalleordencompraLogic;
	}

	public void setDetalleOrdenCompraLogic(DetalleOrdenCompraLogic detalleordencompraLogic) {
		this.detalleordencompraLogic = detalleordencompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNovedadProducto=false;
	public Boolean esParaAccionDesdeFormularioNovedadProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NovedadProductoSessionBeanAdditional novedadproductoSessionBeanAdditional=null;
	
	public NovedadProductoSessionBeanAdditional getNovedadProductoSessionBeanAdditional() {
		return this.novedadproductoSessionBeanAdditional;
	}
	
	public void setNovedadProductoSessionBeanAdditional(NovedadProductoSessionBeanAdditional novedadproductoSessionBeanAdditional) {
		try {
			this.novedadproductoSessionBeanAdditional=novedadproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NovedadProductoBeanSwingJInternalFrameAdditional novedadproductoBeanSwingJInternalFrameAdditional=null;
	//public class NovedadProductoBeanSwingJInternalFrame
	
	public NovedadProductoBeanSwingJInternalFrameAdditional getNovedadProductoBeanSwingJInternalFrameAdditional() {
		return this.novedadproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setNovedadProductoBeanSwingJInternalFrameAdditional(NovedadProductoBeanSwingJInternalFrameAdditional novedadproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.novedadproductoBeanSwingJInternalFrameAdditional=novedadproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NovedadProductoLogic novedadproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NovedadProducto novedadproductoBean;
	public NovedadProductoConstantesFunciones novedadproductoConstantesFunciones;
	//public NovedadProductoParameterReturnGeneral novedadproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<NovedadProducto> novedadproductos;	
	//public List<NovedadProducto> novedadproductosEliminados;
	//public List<NovedadProducto> novedadproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNovedadProducto=false;
	public Boolean isVisibilidadCeldaDuplicarNovedadProducto=true;
	public Boolean isVisibilidadCeldaCopiarNovedadProducto=true;
	public Boolean isVisibilidadCeldaVerFormNovedadProducto=true;
	public Boolean isVisibilidadCeldaOrdenNovedadProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
	public Boolean isVisibilidadCeldaModificarNovedadProducto=false;
	public Boolean isVisibilidadCeldaActualizarNovedadProducto=false;
	public Boolean isVisibilidadCeldaEliminarNovedadProducto=false;
	public Boolean isVisibilidadCeldaCancelarNovedadProducto=false;
	public Boolean isVisibilidadCeldaGuardarNovedadProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNovedadProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoNovedadProducto() {
		return this.iIdNuevoNovedadProducto;
	}

	public void setiIdNuevoNovedadProducto(Long iIdNuevoNovedadProducto) {
		this.iIdNuevoNovedadProducto = iIdNuevoNovedadProducto;
	}
	
	public Long getidNovedadProductoActual() {
		return this.idNovedadProductoActual;
	}

	public void setidNovedadProductoActual(Long idNovedadProductoActual) {
		this.idNovedadProductoActual = idNovedadProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NovedadProducto getnovedadproducto() {
		return this.novedadproducto;
	}

	public void setnovedadproducto(NovedadProducto novedadproducto) {
		this.novedadproducto = novedadproducto;
	}
	
	public NovedadProducto getnovedadproductoAux() {
		return this.novedadproductoAux;
	}

	public void setnovedadproductoAux(NovedadProducto novedadproductoAux) {
		this.novedadproductoAux = novedadproductoAux;
	}				
	
	public NovedadProducto getnovedadproductoAnterior() {
		return this.novedadproductoAnterior;
	}

	public void setnovedadproductoAnterior(NovedadProducto novedadproductoAnterior) {
		this.novedadproductoAnterior = novedadproductoAnterior;
	}	
	
	public NovedadProducto getnovedadproductoTotales() {
		return this.novedadproductoTotales;
	}

	public void setnovedadproductoTotales(NovedadProducto novedadproductoTotales) {
		this.novedadproductoTotales = novedadproductoTotales;
	}	
	
	public NovedadProducto getnovedadproductoBean() {
		return this.novedadproductoBean;
	}

	public void setnovedadproductoBean(NovedadProducto novedadproductoBean) {
		this.novedadproductoBean = novedadproductoBean;
	}	
	
	public NovedadProductoParameterReturnGeneral getnovedadproductoReturnGeneral() {
		return this.novedadproductoReturnGeneral;
	}

	public void setnovedadproductoReturnGeneral(NovedadProductoParameterReturnGeneral novedadproductoReturnGeneral) {
		this.novedadproductoReturnGeneral = novedadproductoReturnGeneral;
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
	
	
	public NovedadProductoLogic getNovedadProductoLogic()	{		
		return novedadproductoLogic;
	}

	public void setNovedadProductoLogic(NovedadProductoLogic novedadproductoLogic) {
		this.novedadproductoLogic = novedadproductoLogic;
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
	
	public Boolean getIsEsNuevoNovedadProducto() {
		return isEsNuevoNovedadProducto;
	}

	public void setIsEsNuevoNovedadProducto(Boolean isEsNuevoNovedadProducto) {
		this.isEsNuevoNovedadProducto = isEsNuevoNovedadProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioNovedadProducto() {
		return esParaAccionDesdeFormularioNovedadProducto;
	}
	
	public void setEsParaAccionDesdeFormularioNovedadProducto(Boolean esParaAccionDesdeFormularioNovedadProducto) {
		this.esParaAccionDesdeFormularioNovedadProducto = esParaAccionDesdeFormularioNovedadProducto;
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

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(!this.novedadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(novedadproductoSessionBean.getlidEmpresaActual());
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

					if(this.novedadproducto!=null) {
						this.novedadproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
						this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNovedadProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
						if(this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNovedadProductoGenerico)throws Exception
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
				jComboBoxid_empresaNovedadProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNovedadProductoGenerico!=null && jComboBoxid_empresaNovedadProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaNovedadProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NovedadProducto novedadproducto,JComboBox jComboBoxid_empresaNovedadProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNovedadProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNovedadProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				novedadproducto.setid_empresa(empresaAux.getId());
				novedadproducto.setempresa_descripcion(NovedadProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				novedadproducto.setEmpresa(empresaAux);			}
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

					if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadProducto!=null) { 
							this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadProducto!=null) { 
					}

					if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
							this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
							this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesNovedadProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NovedadProductoConstantesFunciones.refrescarForeignKeysDescripcionesNovedadProducto(this.novedadproductoLogic.getNovedadProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NovedadProductoConstantesFunciones.refrescarForeignKeysDescripcionesNovedadProducto(this.novedadproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//novedadproductoLogic.setNovedadProductos(this.novedadproductos);
			novedadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NovedadProductoParameterReturnGeneral getNovedadProductoParameterGeneral() {
		return this.novedadproductoParameterGeneral;
	}
	
	public void setNovedadProductoParameterGeneral(NovedadProductoParameterReturnGeneral novedadproductoParameterGeneral) {
		this.novedadproductoParameterGeneral = novedadproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNovedadProducto() {
		return isPermisoTodoNovedadProducto;
	}

	public void setIsPermisoTodoNovedadProducto(Boolean isPermisoTodoNovedadProducto) {
		this.isPermisoTodoNovedadProducto = isPermisoTodoNovedadProducto;
	}

	public Boolean getIsPermisoNuevoNovedadProducto() {
		return isPermisoNuevoNovedadProducto;
	}

	public void setIsPermisoNuevoNovedadProducto(Boolean isPermisoNuevoNovedadProducto) {
		this.isPermisoNuevoNovedadProducto = isPermisoNuevoNovedadProducto;
	}

	public Boolean getIsPermisoActualizarNovedadProducto() {
		return isPermisoActualizarNovedadProducto;
	}

	public void setIsPermisoActualizarNovedadProducto(Boolean isPermisoActualizarNovedadProducto) {
		this.isPermisoActualizarNovedadProducto = isPermisoActualizarNovedadProducto;
	}

	public Boolean getIsPermisoEliminarNovedadProducto() {
		return isPermisoEliminarNovedadProducto;
	}

	public void setIsPermisoEliminarNovedadProducto(Boolean isPermisoEliminarNovedadProducto) {
		this.isPermisoEliminarNovedadProducto = isPermisoEliminarNovedadProducto;
	}

	public Boolean getIsPermisoGuardarCambiosNovedadProducto() {
		return isPermisoGuardarCambiosNovedadProducto;
	}

	public void setIsPermisoGuardarCambiosNovedadProducto(Boolean isPermisoGuardarCambiosNovedadProducto) {
		this.isPermisoGuardarCambiosNovedadProducto = isPermisoGuardarCambiosNovedadProducto;
	}
	
	public Boolean getIsPermisoConsultaNovedadProducto() {
		return isPermisoConsultaNovedadProducto;
	}

	public void setIsPermisoConsultaNovedadProducto(Boolean isPermisoConsultaNovedadProducto) {
		this.isPermisoConsultaNovedadProducto = isPermisoConsultaNovedadProducto;
	}

	public Boolean getIsPermisoBusquedaNovedadProducto() {
		return isPermisoBusquedaNovedadProducto;
	}

	public void setIsPermisoBusquedaNovedadProducto(Boolean isPermisoBusquedaNovedadProducto) {
		this.isPermisoBusquedaNovedadProducto = isPermisoBusquedaNovedadProducto;
	}

	public Boolean getIsPermisoReporteNovedadProducto() {
		return isPermisoReporteNovedadProducto;
	}

	public void setIsPermisoReporteNovedadProducto(Boolean isPermisoReporteNovedadProducto) {
		this.isPermisoReporteNovedadProducto = isPermisoReporteNovedadProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioNovedadProducto() {
		return isPermisoPaginacionMedioNovedadProducto;
	}

	public void setIsPermisoPaginacionMedioNovedadProducto(Boolean isPermisoPaginacionMedioNovedadProducto) {
		this.isPermisoPaginacionMedioNovedadProducto = isPermisoPaginacionMedioNovedadProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoNovedadProducto() {
		return isPermisoPaginacionTodoNovedadProducto;
	}

	public void setIsPermisoPaginacionTodoNovedadProducto(Boolean isPermisoPaginacionTodoNovedadProducto) {
		this.isPermisoPaginacionTodoNovedadProducto = isPermisoPaginacionTodoNovedadProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoNovedadProducto() {
		return isPermisoPaginacionAltoNovedadProducto;
	}

	public void setIsPermisoPaginacionAltoNovedadProducto(Boolean isPermisoPaginacionAltoNovedadProducto) {
		this.isPermisoPaginacionAltoNovedadProducto = isPermisoPaginacionAltoNovedadProducto;
	}
	
	public Boolean getIsPermisoCopiarNovedadProducto() {
		return isPermisoCopiarNovedadProducto;
	}

	public void setIsPermisoCopiarNovedadProducto(Boolean isPermisoCopiarNovedadProducto) {
		this.isPermisoCopiarNovedadProducto = isPermisoCopiarNovedadProducto;
	}
	
	public Boolean getIsPermisoVerFormNovedadProducto() {
		return isPermisoVerFormNovedadProducto;
	}

	public void setIsPermisoVerFormNovedadProducto(Boolean isPermisoVerFormNovedadProducto) {
		this.isPermisoVerFormNovedadProducto = isPermisoVerFormNovedadProducto;
	}
	
	public Boolean getIsPermisoDuplicarNovedadProducto() {
		return isPermisoDuplicarNovedadProducto;
	}

	public void setIsPermisoDuplicarNovedadProducto(Boolean isPermisoDuplicarNovedadProducto) {
		this.isPermisoDuplicarNovedadProducto = isPermisoDuplicarNovedadProducto;
	}
	
	public Boolean getIsPermisoOrdenNovedadProducto() {
		return isPermisoOrdenNovedadProducto;
	}

	public void setIsPermisoOrdenNovedadProducto(Boolean isPermisoOrdenNovedadProducto) {
		this.isPermisoOrdenNovedadProducto = isPermisoOrdenNovedadProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNovedadProducto() {
		return isVisibilidadCeldaNuevoNovedadProducto;
	}

	public void setIsVisibilidadCeldaNuevoNovedadProducto(Boolean isVisibilidadCeldaNuevoNovedadProducto) {
		this.isVisibilidadCeldaNuevoNovedadProducto = isVisibilidadCeldaNuevoNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNovedadProducto() {
		return isVisibilidadCeldaDuplicarNovedadProducto;
	}

	public void setIsVisibilidadCeldaDuplicarNovedadProducto(Boolean isVisibilidadCeldaDuplicarNovedadProducto) {
		this.isVisibilidadCeldaDuplicarNovedadProducto = isVisibilidadCeldaDuplicarNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNovedadProducto() {
		return isVisibilidadCeldaCopiarNovedadProducto;
	}

	public void setIsVisibilidadCeldaCopiarNovedadProducto(Boolean isVisibilidadCeldaCopiarNovedadProducto) {
		this.isVisibilidadCeldaCopiarNovedadProducto = isVisibilidadCeldaCopiarNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNovedadProducto() {
		return isVisibilidadCeldaVerFormNovedadProducto;
	}

	public void setIsVisibilidadCeldaVerFormNovedadProducto(Boolean isVisibilidadCeldaVerFormNovedadProducto) {
		this.isVisibilidadCeldaVerFormNovedadProducto = isVisibilidadCeldaVerFormNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNovedadProducto() {
		return isVisibilidadCeldaOrdenNovedadProducto;
	}

	public void setIsVisibilidadCeldaOrdenNovedadProducto(Boolean isVisibilidadCeldaOrdenNovedadProducto) {
		this.isVisibilidadCeldaOrdenNovedadProducto = isVisibilidadCeldaOrdenNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNovedadProducto() {
		return isVisibilidadCeldaNuevoRelacionesNovedadProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNovedadProducto(Boolean isVisibilidadCeldaNuevoRelacionesNovedadProducto) {
		this.isVisibilidadCeldaNuevoRelacionesNovedadProducto = isVisibilidadCeldaNuevoRelacionesNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNovedadProducto() {
		return isVisibilidadCeldaModificarNovedadProducto;
	}

	public void setIsVisibilidadCeldaModificarNovedadProducto(Boolean isVisibilidadCeldaModificarNovedadProducto) {
		this.isVisibilidadCeldaModificarNovedadProducto = isVisibilidadCeldaModificarNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNovedadProducto() {
		return isVisibilidadCeldaActualizarNovedadProducto;
	}

	public void setIsVisibilidadCeldaActualizarNovedadProducto(Boolean isVisibilidadCeldaActualizarNovedadProducto) {
		this.isVisibilidadCeldaActualizarNovedadProducto = isVisibilidadCeldaActualizarNovedadProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarNovedadProducto() {
		return isVisibilidadCeldaEliminarNovedadProducto;
	}

	public void setIsVisibilidadCeldaEliminarNovedadProducto(Boolean isVisibilidadCeldaEliminarNovedadProducto) {
		this.isVisibilidadCeldaEliminarNovedadProducto = isVisibilidadCeldaEliminarNovedadProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarNovedadProducto() {
		return isVisibilidadCeldaCancelarNovedadProducto;
	}

	public void setIsVisibilidadCeldaCancelarNovedadProducto(Boolean isVisibilidadCeldaCancelarNovedadProducto) {
		this.isVisibilidadCeldaCancelarNovedadProducto = isVisibilidadCeldaCancelarNovedadProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarNovedadProducto() {
		return isVisibilidadCeldaGuardarNovedadProducto;
	}

	public void setIsVisibilidadCeldaGuardarNovedadProducto(Boolean isVisibilidadCeldaGuardarNovedadProducto) {
		this.isVisibilidadCeldaGuardarNovedadProducto = isVisibilidadCeldaGuardarNovedadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNovedadProducto() {
		return isVisibilidadCeldaGuardarCambiosNovedadProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNovedadProducto(Boolean isVisibilidadCeldaGuardarCambiosNovedadProducto) {
		this.isVisibilidadCeldaGuardarCambiosNovedadProducto = isVisibilidadCeldaGuardarCambiosNovedadProducto;
	}
		
	public NovedadProductoSessionBean getnovedadproductoSessionBean() {
		return this.novedadproductoSessionBean;
	}
	
	public void setnovedadproductoSessionBean(NovedadProductoSessionBean novedadproductoSessionBean) {
		this.novedadproductoSessionBean=novedadproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(NovedadProducto novedadproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(novedadproducto,null);
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
	
	public void bugActualizarReferenciaActual(NovedadProducto novedadproducto,NovedadProducto novedadproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNovedadProducto(novedadproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		novedadproductoAux.setId(novedadproducto.getId());
		novedadproductoAux.setVersionRow(novedadproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNovedadProducto();
		
			int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = novedadproductoValidator.getInvalidValues(this.novedadproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			novedadproductoLogic.setDatosCliente(datosCliente);
			novedadproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				novedadproductoAux=new  NovedadProducto();
				
				novedadproductoAux.setIsNew(true);
				novedadproductoAux.setIsChanged(true);
				
				novedadproductoAux.setNovedadProductoOriginal(this.novedadproducto);
				
				novedadproductoAux.setId(this.novedadproducto.getId());	
				novedadproductoAux.setVersionRow(this.novedadproducto.getVersionRow());	
				novedadproductoAux.setid_empresa(this.novedadproducto.getid_empresa());	
				novedadproductoAux.setcodigo(this.novedadproducto.getcodigo());	
				novedadproductoAux.setnombre(this.novedadproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadproductoAux,novedadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.saveNovedadProductos();//WithConnection
						//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);
					
					this.refrescarForeignKeysDescripcionesNovedadProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos().addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos.addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadproductoLogic.saveNovedadProductoRelaciones(novedadproductoAux,this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors(),this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos(),this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias(),this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios(),this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.setDetalleFacturaProveedors(new ArrayList<DetalleFacturaProveedor>());
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors= new ArrayList<DetalleFacturaProveedor>();
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos= new ArrayList<NovedadSeguimiento>();
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors());

							if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());

							if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadproductoAux,novedadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				novedadproductoAux=new  NovedadProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.novedadproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.novedadproductoSessionBean.getEsGuardarRelacionado() && this.novedadproducto.getId()>=0)) {
						
					novedadproductoAux.setIsNew(false);
				}
				
				novedadproductoAux.setIsDeleted(false);
			
				novedadproductoAux.setId(this.novedadproducto.getId());	
				novedadproductoAux.setVersionRow(this.novedadproducto.getVersionRow());	
				novedadproductoAux.setid_empresa(this.novedadproducto.getid_empresa());	
				novedadproductoAux.setcodigo(this.novedadproducto.getcodigo());	
				novedadproductoAux.setnombre(this.novedadproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadproductoAux,novedadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.saveNovedadProductos();//WithConnection
						//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);
					
					this.refrescarForeignKeysDescripcionesNovedadProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos().addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos.addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadproductoLogic.saveNovedadProductoRelaciones(novedadproductoAux,this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors(),this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos(),this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias(),this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios(),this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.setDetalleFacturaProveedors(new ArrayList<DetalleFacturaProveedor>());
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors= new ArrayList<DetalleFacturaProveedor>();
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos= new ArrayList<NovedadSeguimiento>();
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors());

							if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());

							if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadproductoAux,novedadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadproducto,novedadproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				novedadproductoAux=new  NovedadProducto();
				
				novedadproductoAux.setIsNew(false);
				novedadproductoAux.setIsChanged(false);
				
				novedadproductoAux.setIsDeleted(true);
				
				novedadproductoAux.setId(this.novedadproducto.getId());	
				novedadproductoAux.setVersionRow(this.novedadproducto.getVersionRow());	
				novedadproductoAux.setid_empresa(this.novedadproducto.getid_empresa());	
				novedadproductoAux.setcodigo(this.novedadproducto.getcodigo());	
				novedadproductoAux.setnombre(this.novedadproducto.getnombre());	
				
				if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.novedadproductoAux.getId()>=0) {	
						this.novedadproductosEliminados.add(novedadproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadproductoAux,novedadproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.saveNovedadProductos();//WithConnection
						//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos().addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios().addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras().addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorsEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos.addAll(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciasEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios.addAll(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventariosEliminados);
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras.addAll(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jInternalFrameDetalleFormDetalleMovimientoInventario.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadproductoLogic.saveNovedadProductoRelaciones(novedadproductoAux,this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors(),this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos(),this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias(),this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios(),this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());//WithConnection
								//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.setDetalleFacturaProveedors(new ArrayList<DetalleFacturaProveedor>());
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.setNovedadSeguimientos(new ArrayList<NovedadSeguimiento>());
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(new ArrayList<DetalleTransferencia>());
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(new ArrayList<DetalleMovimientoInventario>());
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(new ArrayList<DetalleOrdenCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors= new ArrayList<DetalleFacturaProveedor>();
							this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos= new ArrayList<NovedadSeguimiento>();
							this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias= new ArrayList<DetalleTransferencia>();
							this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios= new ArrayList<DetalleMovimientoInventario>();
							this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras= new ArrayList<DetalleOrdenCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors());

							if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());

							if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());

							if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.quitarFilaTotales();}
							novedadproductoAux.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(novedadproductoAux,novedadproductoLogic.getNovedadProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(novedadproductoAux,novedadproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNovedadProductos().addAll(this.novedadproductosEliminados);
					
					novedadproductoLogic.saveNovedadProductos();//WithConnection
					//novedadproductoLogic.getSetVersionRowNovedadProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNovedadProducto();
				
				this.novedadproductosEliminados= new ArrayList<NovedadProducto>();		
			}
			
			if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Novedad Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.novedadproducto=novedadproductoAux;
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
      		//this.finishProcessNovedadProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(NovedadProducto novedadproductoLocal) throws Exception {
		
		if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				novedadproductoLocal.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors());
				novedadproductoLocal.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos());
				novedadproductoLocal.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
				novedadproductoLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
				novedadproductoLocal.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
			
			} else {
			
				novedadproductoLocal.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedors);
				novedadproductoLocal.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientos);
				novedadproductoLocal.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferencias);
				novedadproductoLocal.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarios);
				novedadproductoLocal.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NovedadProducto novedadproductoLocal) throws Exception {	
		if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				novedadproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNovedadProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = novedadproductoValidator.getInvalidValues(this.novedadproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NovedadProducto novedadproducto,List<NovedadProducto> novedadproductos) throws Exception {
		try	{		
			NovedadProductoConstantesFunciones.actualizarLista(novedadproducto,novedadproductos,this.novedadproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NovedadProducto novedadproducto,List<NovedadProducto> novedadproductos) throws Exception {
		try	{			
			NovedadProductoConstantesFunciones.actualizarSelectedLista(novedadproducto,novedadproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NovedadProducto> novedadproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				novedadproductosLocal=this.novedadproductoLogic.getNovedadProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				novedadproductosLocal=this.novedadproductos;
			}
			//ARCHITECTURE
		
			for(NovedadProducto novedadproductoLocal:novedadproductosLocal) {
				if(this.permiteMantenimiento(novedadproductoLocal) && novedadproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NovedadProductoConstantesFunciones.getNovedadProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NovedadProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelid_empresaNovedadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelcodigoNovedadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelnombreNovedadProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadProducto.jLabelid_empresaNovedadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadProducto.jLabelcodigoNovedadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadProducto.jLabelnombreNovedadProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleFacturaProveedor")) {
			if(this.novedadproducto==null) {
				this.novedadproducto= new NovedadProducto();
			}

			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNovedadProducto
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.getdetallefacturaproveedor().setNovedadProducto(this.novedadproducto);
			}

			return;
		}
		 else  if(sTipo.equals("NovedadSeguimiento")) {
			if(this.novedadproducto==null) {
				this.novedadproducto= new NovedadProducto();
			}

			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNovedadProducto
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.getnovedadseguimiento().setNovedadProducto(this.novedadproducto);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleTransferencia")) {
			if(this.novedadproducto==null) {
				this.novedadproducto= new NovedadProducto();
			}

			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNovedadProducto
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.getdetalletransferencia().setNovedadProducto(this.novedadproducto);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleMovimientoInventario")) {
			if(this.novedadproducto==null) {
				this.novedadproducto= new NovedadProducto();
			}

			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNovedadProducto
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.getdetallemovimientoinventario().setNovedadProducto(this.novedadproducto);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleOrdenCompra")) {
			if(this.novedadproducto==null) {
				this.novedadproducto= new NovedadProducto();
			}

			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNovedadProducto
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.getdetalleordencompra().setNovedadProducto(this.novedadproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoNovedadProducto--;	
		
		
		this.novedadproductoAux=new NovedadProducto();
		
		this.novedadproductoAux.setId(this.iIdNuevoNovedadProducto);
		this.novedadproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadproductoLogic.getNovedadProductos().add(this.novedadproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.novedadproductos.add(this.novedadproductoAux);
		}
		//ARCHITECTURE
		
		this.novedadproducto=this.novedadproductoAux;
		
		if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNovedadProducto(this.novedadproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadProducto(this.novedadproducto);
		}
				
		//this.setDefaultControlesNovedadProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNovedadProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNovedadProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadProducto(this.novedadproductoBean,this.novedadproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NovedadProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
			classes=NovedadProductoConstantesFunciones.getClassesRelationshipsOfNovedadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.novedadproductoReturnGeneral=novedadproductoLogic.procesarEventosNovedadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadproductoLogic.getNovedadProductos(),this.novedadproducto,this.novedadproductoParameterGeneral,this.isEsNuevoNovedadProducto,classes);//this.novedadproductoLogic.getNovedadProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNovedadProducto(this.novedadproductoReturnGeneral,this.novedadproductoBean,false);
		
		if(this.novedadproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto());
		}
		
		if(this.novedadproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto(),classes);//this.novedadproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNovedadProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNovedadProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadProductoBeanSwingJInternalFrameAdditional.RecargarFormNovedadProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNovedadProducto(false);
						
			if(novedadproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() && DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleFacturaProveedorActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.getEsGuardarRelacionado() && NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadSeguimientoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado() && DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTransferenciaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado() && DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleOrdenCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadProducto();
			}
			
			this.actualizarVisualTableDatosNovedadProducto();
			
			this.jTableDatosNovedadProducto.setRowSelectionInterval(this.getIndiceNuevoNovedadProducto(), this.getIndiceNuevoNovedadProducto());
			
			this.seleccionarFilaTablaNovedadProductoActual();
						
			this.actualizarEstadoCeldasBotonesNovedadProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNovedadProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setEnabled(isHabilitar && this.novedadproductoConstantesFunciones.activarcodigoNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setEnabled(isHabilitar && this.novedadproductoConstantesFunciones.activarnombreNovedadProducto);	
		//
		this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setEnabled(isHabilitar && this.novedadproductoConstantesFunciones.activarid_empresaNovedadProducto);
	};
	
	public void setDefaultControlesNovedadProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNovedadProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.novedadproductoSessionBean.setConGuardarRelaciones(true);			
			this.novedadproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.novedadproductoSessionBean.setConGuardarRelaciones(false);			
			this.novedadproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoNovedadProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
				if(novedadproductoAux.getId().equals(this.iIdNuevoNovedadProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadProducto novedadproductoAux:this.novedadproductos) {
				if(novedadproductoAux.getId().equals(this.iIdNuevoNovedadProducto)) {
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
	
	public int getIndiceActualNovedadProducto(NovedadProducto novedadproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
				if(novedadproductoAux.getId().equals(novedadproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadProducto novedadproductoAux:this.novedadproductos) {
				if(novedadproductoAux.getId().equals(novedadproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNovedadProducto(NovedadProducto novedadproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
				if(novedadproductoAux.getNovedadProductoOriginal().getId().equals(novedadproductoOriginal.getId())) {
					existe=true;
					novedadproductoOriginal.setId(novedadproductoAux.getId());
					novedadproductoOriginal.setVersionRow(novedadproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadProducto novedadproductoAux:this.novedadproductos) {
				if(novedadproductoAux.getNovedadProductoOriginal().getId().equals(novedadproductoOriginal.getId())) {
					existe=true;
					novedadproductoOriginal.setId(novedadproductoAux.getId());
					novedadproductoOriginal.setVersionRow(novedadproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNovedadProducto(Boolean esParaCancelar) throws Exception {
		novedadproductosAux=new ArrayList<NovedadProducto>();
		novedadproductoAux=new NovedadProducto();
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
					if(novedadproductoAux.getId()<0) {
						novedadproductosAux.add(novedadproductoAux);
					}		
				}
				this.iIdNuevoNovedadProducto=0L;
				this.novedadproductoLogic.getNovedadProductos().removeAll(novedadproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadProducto novedadproductoAux:this.novedadproductos) {
					if(novedadproductoAux.getId()<0) {
						novedadproductosAux.add(novedadproductoAux);
					}		
				}
				this.iIdNuevoNovedadProducto=0L;
				this.novedadproductos.removeAll(novedadproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNovedadProducto 
					&& this.novedadproductoLogic.getNovedadProductos().size()>0
					) {
					novedadproductoAux=this.novedadproductoLogic.getNovedadProductos().get(this.novedadproductoLogic.getNovedadProductos().size() - 1);
				
					if(novedadproductoAux.getId()<0) {
						this.novedadproductoLogic.getNovedadProductos().remove(novedadproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNovedadProducto && this.novedadproductos.size()>0) {
					novedadproductoAux=this.novedadproductos.get(this.novedadproductos.size() - 1);
				
					if(novedadproductoAux.getId()<0) {
						this.novedadproductos.remove(novedadproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNovedadProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(novedadproducto.getId()<0) {
				this.novedadproductoLogic.getNovedadProductos().remove(this.novedadproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(novedadproducto.getId()<0) {
				this.novedadproductos.remove(this.novedadproducto);
			}
		}			
	}
	
	public void setEstadosInicialesNovedadProducto(List<NovedadProducto> novedadproductosAux) throws Exception {
		NovedadProductoConstantesFunciones.setEstadosInicialesNovedadProducto(novedadproductosAux);
	}
	
	public void setEstadosInicialesNovedadProducto(NovedadProducto novedadproductoAux) throws Exception {
		NovedadProductoConstantesFunciones.setEstadosInicialesNovedadProducto(novedadproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNovedadProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNovedadProductoActual()) {
				if(!this.isEsNuevoNovedadProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNovedadProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNovedadProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Novedad Producto ?", "MANTENIMIENTO DE Novedad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NovedadProducto novedadproducto) throws Exception {
		NovedadProductoConstantesFunciones.seleccionarAsignar(this.novedadproducto,novedadproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNovedadProducto=this.isPermisoActualizarOriginalNovedadProducto;
			
			
			this.seleccionarAsignar(novedadproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadProductoConstantesFunciones.quitarEspaciosNovedadProducto(this.novedadproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNovedadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.novedadproductoSessionBean.setsFuncionBusquedaRapida(this.novedadproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNovedadProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNovedadProducto(esParaCancelar);				
				this.cancelarNuevoNovedadProducto(esParaCancelar);								
			}
			
			this.novedadproducto=new NovedadProducto();
			
			this.inicializarNovedadProducto();
			
			this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNovedadProducto() throws Exception {
		try {
			NovedadProductoConstantesFunciones.inicializarNovedadProducto(this.novedadproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.novedadproductoLogic.getNovedadProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNovedadProductos(String sAccionBusqueda,List<NovedadProducto> novedadproductosParaReportes) throws Exception {
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
					sPathReporteFinal="NovedadProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NovedadProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NovedadProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NovedadProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Novedad Productoes");		
		parameters.put("busquedapor", NovedadProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleFacturaProveedor.class));
			classes.add(new Classe(NovedadSeguimiento.class));
			classes.add(new Classe(DetalleTransferencia.class));
			classes.add(new Classe(DetalleMovimientoInventario.class));
			classes.add(new Classe(DetalleOrdenCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					NovedadProductoLogic novedadproductoLogicAuxiliar=new NovedadProductoLogic();
					novedadproductoLogicAuxiliar.setDatosCliente(novedadproductoLogic.getDatosCliente());				
					novedadproductoLogicAuxiliar.setNovedadProductos(novedadproductosParaReportes);
					
					novedadproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyNovedadProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					novedadproductosParaReportes=novedadproductoLogicAuxiliar.getNovedadProductos();
					
					//novedadproductoLogic.getNewConnexionToDeep();
					
					//for (NovedadProducto novedadproducto:novedadproductosParaReportes) {
					//	novedadproductoLogic.deepLoad(novedadproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//novedadproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//novedadproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleFacturaProveedor = AuxiliarReportes.class.getResourceAsStream("DetalleFacturaProveedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallefacturaproveedor", reportFileDetalleFacturaProveedor);

			InputStream reportFileNovedadSeguimiento = AuxiliarReportes.class.getResourceAsStream("NovedadSeguimientoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_novedadseguimiento", reportFileNovedadSeguimiento);

			InputStream reportFileDetalleTransferencia = AuxiliarReportes.class.getResourceAsStream("DetalleTransferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalletransferencia", reportFileDetalleTransferencia);

			InputStream reportFileDetalleMovimientoInventario = AuxiliarReportes.class.getResourceAsStream("DetalleMovimientoInventarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallemovimientoinventario", reportFileDetalleMovimientoInventario);

			InputStream reportFileDetalleOrdenCompra = AuxiliarReportes.class.getResourceAsStream("DetalleOrdenCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleordencompra", reportFileDetalleOrdenCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNovedadProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NovedadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NovedadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNovedadProducto=new JRBeanArrayDataSource(NovedadProductoJInternalFrame.TraerNovedadProductoBeans(novedadproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNovedadProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NovedadProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NovedadProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NovedadProductoBean.TraerNovedadProductoBeans(novedadproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNovedadProductoActionPerformed(null);
					//this.generarExcelReporteNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNovedadProductos(sAccionBusqueda,sTipoArchivoReporte,novedadproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNovedadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadProducto> novedadproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NovedadProducto novedadproducto : novedadproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NovedadProductoConstantesFunciones.generarExcelReporteDataNovedadProducto("NORMAL",row,workbook,novedadproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNovedadProducto(String sTipo,Row row,Workbook workbook) {
		
		NovedadProductoConstantesFunciones.generarExcelReporteHeaderNovedadProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNovedadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadProducto> novedadproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NovedadProducto novedadproducto : novedadproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NovedadProductoConstantesFunciones.getNovedadProductoDescripcion(novedadproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNovedadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadProducto> novedadproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NovedadProducto> novedadproductosRespaldo=null;
		
		classes=NovedadProductoConstantesFunciones.getClassesRelationshipsOfNovedadProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.novedadproductoLogic.setDatosCliente(this.datosCliente);
		this.novedadproductoLogic.setDatosDeep(this.datosDeep);
		this.novedadproductoLogic.setIsConDeep(true);
		
		novedadproductosRespaldo=this.novedadproductoLogic.getNovedadProductos();
		
		this.novedadproductoLogic.setNovedadProductos(novedadproductosParaReportes);	
		this.novedadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		novedadproductosParaReportes=this.novedadproductoLogic.getNovedadProductos();
		this.novedadproductoLogic.setNovedadProductos(novedadproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NovedadProducto novedadproducto : novedadproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNovedadProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NovedadProductoConstantesFunciones.generarExcelReporteDataNovedadProducto("NORMAL",row,workbook,novedadproducto,cellStyleDataAux);
		
			
			


				//DetalleFacturaProveedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(novedadproducto.getDetalleFacturaProveedors()!=null && novedadproducto.getDetalleFacturaProveedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleFacturaProveedorConstantesFunciones.generarExcelReporteHeaderDetalleFacturaProveedor("RELACIONADO",row,workbook);
				}

				if(novedadproducto.getDetalleFacturaProveedors()!=null) {
					i2=0;
					for(DetalleFacturaProveedor detallefacturaproveedor : novedadproducto.getDetalleFacturaProveedors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleFacturaProveedorConstantesFunciones.generarExcelReporteDataDetalleFacturaProveedor("RELACIONADO",row,workbook,detallefacturaproveedor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NovedadSeguimiento
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO))) {

				if(novedadproducto.getNovedadSeguimientos()!=null && novedadproducto.getNovedadSeguimientos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NovedadSeguimientoConstantesFunciones.generarExcelReporteHeaderNovedadSeguimiento("RELACIONADO",row,workbook);
				}

				if(novedadproducto.getNovedadSeguimientos()!=null) {
					i2=0;
					for(NovedadSeguimiento novedadseguimiento : novedadproducto.getNovedadSeguimientos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NovedadSeguimientoConstantesFunciones.generarExcelReporteDataNovedadSeguimiento("RELACIONADO",row,workbook,novedadseguimiento,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleTransferencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(novedadproducto.getDetalleTransferencias()!=null && novedadproducto.getDetalleTransferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleTransferenciaConstantesFunciones.generarExcelReporteHeaderDetalleTransferencia("RELACIONADO",row,workbook);
				}

				if(novedadproducto.getDetalleTransferencias()!=null) {
					i2=0;
					for(DetalleTransferencia detalletransferencia : novedadproducto.getDetalleTransferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleTransferenciaConstantesFunciones.generarExcelReporteDataDetalleTransferencia("RELACIONADO",row,workbook,detalletransferencia,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleMovimientoInventario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(novedadproducto.getDetalleMovimientoInventarios()!=null && novedadproducto.getDetalleMovimientoInventarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleMovimientoInventarioConstantesFunciones.generarExcelReporteHeaderDetalleMovimientoInventario("RELACIONADO",row,workbook);
				}

				if(novedadproducto.getDetalleMovimientoInventarios()!=null) {
					i2=0;
					for(DetalleMovimientoInventario detallemovimientoinventario : novedadproducto.getDetalleMovimientoInventarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleMovimientoInventarioConstantesFunciones.generarExcelReporteDataDetalleMovimientoInventario("RELACIONADO",row,workbook,detallemovimientoinventario,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleOrdenCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(novedadproducto.getDetalleOrdenCompras()!=null && novedadproducto.getDetalleOrdenCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleOrdenCompraConstantesFunciones.generarExcelReporteHeaderDetalleOrdenCompra("RELACIONADO",row,workbook);
				}

				if(novedadproducto.getDetalleOrdenCompras()!=null) {
					i2=0;
					for(DetalleOrdenCompra detalleordencompra : novedadproducto.getDetalleOrdenCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleOrdenCompraConstantesFunciones.generarExcelReporteDataDetalleOrdenCompra("RELACIONADO",row,workbook,detalleordencompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(NovedadProductoConstantesFunciones.getNovedadProductoDescripcion(novedadproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNovedadProducto() throws Exception {		
		this.startProcessNovedadProducto(true);
	}
	
	public void startProcessNovedadProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNovedadProducto ,this.jPanelParametrosReportesNovedadProducto, this.jScrollPanelDatosNovedadProducto,this.jPanelPaginacionNovedadProducto, this.jScrollPanelDatosEdicionNovedadProducto, this.jPanelAccionesNovedadProducto,this.jPanelAccionesFormularioNovedadProducto,this.jmenuBarNovedadProducto,this.jmenuBarDetalleNovedadProducto,this.jTtoolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadProducto=this.jTabbedPaneBusquedasNovedadProducto; 
		
		final JPanel jPanelParametrosReportesNovedadProducto=this.jPanelParametrosReportesNovedadProducto;
		//final JScrollPane jScrollPanelDatosNovedadProducto=this.jScrollPanelDatosNovedadProducto;
		final JTable jTableDatosNovedadProducto=this.jTableDatosNovedadProducto;		
		final JPanel jPanelPaginacionNovedadProducto=this.jPanelPaginacionNovedadProducto;
		//final JScrollPane jScrollPanelDatosEdicionNovedadProducto=this.jScrollPanelDatosEdicionNovedadProducto;
		final JPanel jPanelAccionesNovedadProducto=this.jPanelAccionesNovedadProducto;
		
		JPanel jPanelCamposAuxiliarNovedadProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNovedadProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			jPanelCamposAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jPanelCamposNovedadProducto;
			jPanelAccionesFormularioAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jPanelAccionesFormularioNovedadProducto;
		}
		
		final JPanel jPanelCamposNovedadProducto=jPanelCamposAuxiliarNovedadProducto;
		final JPanel jPanelAccionesFormularioNovedadProducto=jPanelAccionesFormularioAuxiliarNovedadProducto;
		
		
		final JMenuBar jmenuBarNovedadProducto=this.jmenuBarNovedadProducto;
		final JToolBar jTtoolBarNovedadProducto=this.jTtoolBarNovedadProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNovedadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			jmenuBarDetalleAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jmenuBarDetalleNovedadProducto;
			jTtoolBarDetalleAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jTtoolBarDetalleNovedadProducto;
		}
		
		final JMenuBar jmenuBarDetalleNovedadProducto=jmenuBarDetalleAuxiliarNovedadProducto;
		final JToolBar jTtoolBarDetalleNovedadProducto=jTtoolBarDetalleAuxiliarNovedadProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadProducto;
			processRunnable.jTableDatos=jTableDatosNovedadProducto;
			processRunnable.jPanelCampos=jPanelCamposNovedadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadProducto;
			processRunnable.jTtoolBar=jTtoolBarNovedadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadProducto ,jPanelParametrosReportesNovedadProducto,jTableDatosNovedadProducto, /*jScrollPanelDatosNovedadProducto,*/jPanelCamposNovedadProducto,jPanelPaginacionNovedadProducto, /*jScrollPanelDatosEdicionNovedadProducto,*/ jPanelAccionesNovedadProducto,jPanelAccionesFormularioNovedadProducto,jmenuBarNovedadProducto,jmenuBarDetalleNovedadProducto,jTtoolBarNovedadProducto,jTtoolBarDetalleNovedadProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadProducto ,jPanelParametrosReportesNovedadProducto, jScrollPanelDatosNovedadProducto,jPanelPaginacionNovedadProducto, jScrollPanelDatosEdicionNovedadProducto, jPanelAccionesNovedadProducto,jPanelAccionesFormularioNovedadProducto,jmenuBarNovedadProducto,jmenuBarDetalleNovedadProducto,jTtoolBarNovedadProducto,jTtoolBarDetalleNovedadProducto);
						
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
	
	public void finishProcessNovedadProducto() {// throws Exception 
		this.finishProcessNovedadProducto(true);
	}
	
	public void finishProcessNovedadProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNovedadProducto ,this.jPanelParametrosReportesNovedadProducto, this.jScrollPanelDatosNovedadProducto,this.jPanelPaginacionNovedadProducto, this.jScrollPanelDatosEdicionNovedadProducto, this.jPanelAccionesNovedadProducto,this.jPanelAccionesFormularioNovedadProducto,this.jmenuBarNovedadProducto,this.jmenuBarDetalleNovedadProducto,this.jTtoolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadProducto=this.jTabbedPaneBusquedasNovedadProducto; 
		
		final JPanel jPanelParametrosReportesNovedadProducto=this.jPanelParametrosReportesNovedadProducto;
		//final JScrollPane jScrollPanelDatosNovedadProducto=this.jScrollPanelDatosNovedadProducto;
		final JTable jTableDatosNovedadProducto=this.jTableDatosNovedadProducto;		
		final JPanel jPanelPaginacionNovedadProducto=this.jPanelPaginacionNovedadProducto;
		//final JScrollPane jScrollPanelDatosEdicionNovedadProducto=this.jScrollPanelDatosEdicionNovedadProducto;
		final JPanel jPanelAccionesNovedadProducto=this.jPanelAccionesNovedadProducto;
		
		JPanel jPanelCamposAuxiliarNovedadProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNovedadProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			jPanelCamposAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jPanelCamposNovedadProducto;
			jPanelAccionesFormularioAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jPanelAccionesFormularioNovedadProducto;
		}
		
		final JPanel jPanelCamposNovedadProducto=jPanelCamposAuxiliarNovedadProducto;
		final JPanel jPanelAccionesFormularioNovedadProducto=jPanelAccionesFormularioAuxiliarNovedadProducto;
		
		
		final JMenuBar jmenuBarNovedadProducto=this.jmenuBarNovedadProducto;		
		final JToolBar jTtoolBarNovedadProducto=this.jTtoolBarNovedadProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarNovedadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			jmenuBarDetalleAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jmenuBarDetalleNovedadProducto;
			jTtoolBarDetalleAuxiliarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jTtoolBarDetalleNovedadProducto;		
		}
		
		final JMenuBar jmenuBarDetalleNovedadProducto=jmenuBarDetalleAuxiliarNovedadProducto;
		final JToolBar jTtoolBarDetalleNovedadProducto=jTtoolBarDetalleAuxiliarNovedadProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadProducto;
			processRunnable.jTableDatos=jTableDatosNovedadProducto;
			processRunnable.jPanelCampos=jPanelCamposNovedadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadProducto;
			processRunnable.jTtoolBar=jTtoolBarNovedadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNovedadProducto ,jPanelParametrosReportesNovedadProducto, jTableDatosNovedadProducto,/*jScrollPanelDatosNovedadProducto,*/jPanelCamposNovedadProducto,jPanelPaginacionNovedadProducto, /*jScrollPanelDatosEdicionNovedadProducto,*/ jPanelAccionesNovedadProducto,jPanelAccionesFormularioNovedadProducto,jmenuBarNovedadProducto,jmenuBarDetalleNovedadProducto,jTtoolBarNovedadProducto,jTtoolBarDetalleNovedadProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNovedadProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNovedadProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNovedadProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNovedadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNovedadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNovedadProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNovedadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNovedadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNovedadProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.novedadproductoConstantesFunciones.getsFinalQueryNovedadProducto();
		String  finalQueryPaginacionTodos=this.novedadproductoConstantesFunciones.getsFinalQueryNovedadProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NovedadProductoConstantesFunciones.getArrayColumnasGlobalesNoNovedadProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NovedadProductoConstantesFunciones.getArrayColumnasGlobalesNovedadProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NovedadProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.novedadproductosEliminados= new ArrayList<NovedadProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNovedadProducto();
		
				///*NovedadProductoSessionBean*/this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			
			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
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
					this.iNumeroPaginacion=NovedadProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NovedadProductoConstantesFunciones.getClassesForeignKeysOfNovedadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/novedadproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			novedadproductosAux= new ArrayList<NovedadProducto>();
			
				
			novedadproductoLogic.setDatosCliente(this.datosCliente);
			novedadproductoLogic.setDatosDeep(this.datosDeep);
			novedadproductoLogic.setIsConDeep(true);
			
			
			novedadproductoLogic.getNovedadProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					novedadproductoLogic.getTodosNovedadProductos(finalQueryGlobal,pagination);
					
					//novedadproductoLogic.getTodosNovedadProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(novedadproductoLogic.getNovedadProductos()==null|| novedadproductoLogic.getNovedadProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadproductosAux= new ArrayList<NovedadProducto>();
							novedadproductosAux.addAll(novedadproductoLogic.getNovedadProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductosAux= new ArrayList<NovedadProducto>();
							novedadproductosAux.addAll(novedadproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadproductoLogic.getTodosNovedadProductos(finalQueryGlobal+"",this.pagination);												
							
							//novedadproductoLogic.getTodosNovedadProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNovedadProductos("Todos",novedadproductoLogic.getNovedadProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadproductoLogic.setNovedadProductos(new ArrayList<NovedadProducto>());					
							novedadproductoLogic.getNovedadProductos().addAll(novedadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductos=new ArrayList<NovedadProducto>();
							novedadproductos.addAll(novedadproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNovedadProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNovedadProducto=this.idActual;
				
				} else if(this.idNovedadProductoActual!=null && this.idNovedadProductoActual!=0L) {
					idNovedadProducto=idNovedadProductoActual;
				}
				
					
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndicePorId(idNovedadProducto);
				
				this.novedadproductos=new ArrayList<NovedadProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					novedadproductoLogic.getEntity(idNovedadProducto);
					
					//novedadproductoLogic.getEntityWithConnection(idNovedadProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLogic.setNovedadProductos(new ArrayList<NovedadProducto>());
					novedadproductoLogic.getNovedadProductos().add(novedadproductoLogic.getNovedadProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadproductos=new ArrayList<NovedadProducto>();
					this.novedadproductos.add(novedadproducto);
				}
				
				if(novedadproductoLogic.getNovedadProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadproductoLogic.getNovedadProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadproductoLogic.getNovedadProductos()==null||novedadproductoLogic.getNovedadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadproductos==null|| novedadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductosAux=new ArrayList<NovedadProducto>();
						novedadproductosAux.addAll(novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductosAux=new ArrayList<NovedadProducto>();
							novedadproductosAux.addAll(novedadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadproductoLogic.getNovedadProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadProductos("BusquedaPorCodigo",novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadProductos("BusquedaPorCodigo",novedadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.setNovedadProductos(new ArrayList<NovedadProducto>());
						novedadproductoLogic.getNovedadProductos().addAll(novedadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductos=new ArrayList<NovedadProducto>();
							novedadproductos.addAll(novedadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadproductoLogic.getNovedadProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadproductoLogic.getNovedadProductos()==null||novedadproductoLogic.getNovedadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadproductos==null|| novedadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductosAux=new ArrayList<NovedadProducto>();
						novedadproductosAux.addAll(novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductosAux=new ArrayList<NovedadProducto>();
							novedadproductosAux.addAll(novedadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadproductoLogic.getNovedadProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadProductos("BusquedaPorNombre",novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadProductos("BusquedaPorNombre",novedadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.setNovedadProductos(new ArrayList<NovedadProducto>());
						novedadproductoLogic.getNovedadProductos().addAll(novedadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductos=new ArrayList<NovedadProducto>();
							novedadproductos.addAll(novedadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadproductoLogic.getNovedadProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadproductoLogic.getNovedadProductos()==null||novedadproductoLogic.getNovedadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadproductos==null|| novedadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductosAux=new ArrayList<NovedadProducto>();
						novedadproductosAux.addAll(novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductosAux=new ArrayList<NovedadProducto>();
							novedadproductosAux.addAll(novedadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadproductoLogic.getNovedadProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadProductos("FK_IdEmpresa",novedadproductoLogic.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadProductos("FK_IdEmpresa",novedadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoLogic.setNovedadProductos(new ArrayList<NovedadProducto>());
						novedadproductoLogic.getNovedadProductos().addAll(novedadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductos=new ArrayList<NovedadProducto>();
							novedadproductos.addAll(novedadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNovedadProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNovedadProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadproductoLogic.getNovedadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadproductoLogic.getNovedadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NovedadProducto novedadproducto) {
		Boolean permite=true;
		
		if(this.novedadproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NovedadProductoConstantesFunciones.getOrderByListaNovedadProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NovedadProductoConstantesFunciones.getOrderByListaNovedadProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadProducto novedadproducto:novedadproductoLogic.getNovedadProductos()) {
				if(novedadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					novedadproductoTotales=novedadproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadProducto novedadproducto:this.novedadproductos) {
				if(novedadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					novedadproductoTotales=novedadproducto;
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
			this.novedadproductoAux=new NovedadProducto();
			this.novedadproductoAux.setsType(Constantes2.S_TOTALES);
			this.novedadproductoAux.setIsNew(false);
			this.novedadproductoAux.setIsChanged(false);
			this.novedadproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NovedadProductoConstantesFunciones.TotalizarValoresFilaNovedadProducto(this.novedadproductoLogic.getNovedadProductos(),this.novedadproductoAux);
				
				this.novedadproductoLogic.getNovedadProductos().add(this.novedadproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NovedadProductoConstantesFunciones.TotalizarValoresFilaNovedadProducto(this.novedadproductos,this.novedadproductoAux);
				
				this.novedadproductos.add(this.novedadproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		novedadproductoTotales=new NovedadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadproductoLogic.getNovedadProductos().remove(novedadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadproductos.remove(novedadproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		novedadproductoTotales=new NovedadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadProducto novedadproducto:novedadproductoLogic.getNovedadProductos()) {
				if(novedadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					novedadproductoTotales=novedadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadProductoConstantesFunciones.TotalizarValoresFilaNovedadProducto(this.novedadproductoLogic.getNovedadProductos(),novedadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadProducto novedadproducto:this.novedadproductos) {
				if(novedadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					novedadproductoTotales=novedadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadProductoConstantesFunciones.TotalizarValoresFilaNovedadProducto(this.novedadproductos,novedadproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNovedadProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNovedadProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLogic.getNovedadProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLogic.getNovedadProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLogic.getNovedadProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosNovedadProducto() {
		this.isPermisoTodoNovedadProducto=false;
		this.isPermisoNuevoNovedadProducto=false;
		this.isPermisoActualizarNovedadProducto=false;
		this.isPermisoActualizarOriginalNovedadProducto=false;
		this.isPermisoEliminarNovedadProducto=false;
		this.isPermisoGuardarCambiosNovedadProducto=false;
		this.isPermisoConsultaNovedadProducto=false;
		this.isPermisoBusquedaNovedadProducto=false;
		this.isPermisoReporteNovedadProducto=false;		
		this.isPermisoOrdenNovedadProducto=false;		
		this.isPermisoPaginacionMedioNovedadProducto=false;		
		this.isPermisoPaginacionAltoNovedadProducto=false;
		this.isPermisoPaginacionTodoNovedadProducto=false;
		this.isPermisoCopiarNovedadProducto=false;		
		this.isPermisoVerFormNovedadProducto=false;		
		this.isPermisoDuplicarNovedadProducto=false;		
		this.isPermisoOrdenNovedadProducto=false;		
	}
	
	public void setPermisosUsuarioNovedadProducto(Boolean isPermiso) {
		this.isPermisoTodoNovedadProducto=isPermiso;
		this.isPermisoNuevoNovedadProducto=isPermiso;
		this.isPermisoActualizarNovedadProducto=isPermiso;
		this.isPermisoActualizarOriginalNovedadProducto=isPermiso;
		this.isPermisoEliminarNovedadProducto=isPermiso;
		this.isPermisoGuardarCambiosNovedadProducto=isPermiso;
		this.isPermisoConsultaNovedadProducto=isPermiso;
		this.isPermisoBusquedaNovedadProducto=isPermiso;
		this.isPermisoReporteNovedadProducto=isPermiso;
		this.isPermisoOrdenNovedadProducto=isPermiso;		
		this.isPermisoPaginacionMedioNovedadProducto=isPermiso;		
		this.isPermisoPaginacionAltoNovedadProducto=isPermiso;		
		this.isPermisoPaginacionTodoNovedadProducto=isPermiso;		
		this.isPermisoCopiarNovedadProducto=isPermiso;		
		this.isPermisoVerFormNovedadProducto=isPermiso;		
		this.isPermisoDuplicarNovedadProducto=isPermiso;
		this.isPermisoOrdenNovedadProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNovedadProducto(Boolean isPermiso) {
		//this.isPermisoTodoNovedadProducto=isPermiso;
		this.isPermisoNuevoNovedadProducto=isPermiso;
		this.isPermisoActualizarNovedadProducto=isPermiso;
		this.isPermisoActualizarOriginalNovedadProducto=isPermiso;
		this.isPermisoEliminarNovedadProducto=isPermiso;
		this.isPermisoGuardarCambiosNovedadProducto=isPermiso;
		//this.isPermisoConsultaNovedadProducto=isPermiso;
		//this.isPermisoBusquedaNovedadProducto=isPermiso;
		//this.isPermisoReporteNovedadProducto=isPermiso;
		//this.isPermisoOrdenNovedadProducto=isPermiso;		
		//this.isPermisoPaginacionMedioNovedadProducto=isPermiso;		
		//this.isPermisoPaginacionAltoNovedadProducto=isPermiso;		
		//this.isPermisoPaginacionTodoNovedadProducto=isPermiso;		
		//this.isPermisoCopiarNovedadProducto=isPermiso;		
		//this.isPermisoDuplicarNovedadProducto=isPermiso;
		//this.isPermisoOrdenNovedadProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNovedadProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleFacturaProveedorConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NovedadSeguimientoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
		if(NovedadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleFacturaProveedor=false;
		this.isTienePermisosDetalleFacturaProveedor=this.verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(this.opcionsRelacionadas,DetalleFacturaProveedorConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNovedadSeguimiento=false;
		this.isTienePermisosNovedadSeguimiento=this.verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(this.opcionsRelacionadas,NovedadSeguimientoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleTransferencia=false;
		this.isTienePermisosDetalleTransferencia=this.verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(this.opcionsRelacionadas,DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleMovimientoInventario=false;
		this.isTienePermisosDetalleMovimientoInventario=this.verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(this.opcionsRelacionadas,DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleOrdenCompra=false;
		this.isTienePermisosDetalleOrdenCompra=this.verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(this.opcionsRelacionadas,DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebNovedadProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNovedadProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleFacturaProveedor=conPermiso;
		this.isTienePermisosNovedadSeguimiento=conPermiso;
		this.isTienePermisosDetalleTransferencia=conPermiso;
		this.isTienePermisosDetalleMovimientoInventario=conPermiso;
		this.isTienePermisosDetalleOrdenCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioNovedadProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNovedadProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNovedadProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleFacturaProveedor && this.jInternalFrameDetalleFormNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.remove(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNovedadSeguimiento && this.jInternalFrameDetalleFormNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.remove(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleTransferencia && this.jInternalFrameDetalleFormNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.remove(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleMovimientoInventario && this.jInternalFrameDetalleFormNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.remove(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleOrdenCompra && this.jInternalFrameDetalleFormNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.remove(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioNovedadProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NovedadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NovedadProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNovedadProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNovedadProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNovedadProducto=this.isPermisoActualizarNovedadProducto;
			this.isPermisoEliminarNovedadProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNovedadProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNovedadProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNovedadProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNovedadProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNovedadProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNovedadProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNovedadProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNovedadProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNovedadProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNovedadProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNovedadProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNovedadProducto.setToolTipText(this.jTableDatosNovedadProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNovedadProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNovedadProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NovedadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NovedadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNovedadProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleFacturaProveedor && this.novedadproductoConstantesFunciones.mostrarDetalleFacturaProveedorNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Factura Proveedor");
			reporte.setsDescripcion("Detalle Factura Proveedor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNovedadSeguimiento && this.novedadproductoConstantesFunciones.mostrarNovedadSeguimientoNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Novedad Seguimiento");
			reporte.setsDescripcion("Novedad Seguimiento");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleTransferencia && this.novedadproductoConstantesFunciones.mostrarDetalleTransferenciaNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Transferencia");
			reporte.setsDescripcion("Detalle Transferencia");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleMovimientoInventario && this.novedadproductoConstantesFunciones.mostrarDetalleMovimientoInventarioNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Movimiento Inventario");
			reporte.setsDescripcion("Detalle Movimiento Inventario");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleOrdenCompra && this.novedadproductoConstantesFunciones.mostrarDetalleOrdenCompraNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Orden Compra");
			reporte.setsDescripcion("Detalle Orden Compra");
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
	public void inicializarCombosForeignKeyNovedadProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNovedadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NovedadProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNovedadProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyNovedadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NovedadProductoParameterReturnGeneral novedadproductoReturnGeneral=new NovedadProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.novedadproductoConstantesFunciones.cargarid_empresaNovedadProducto)
					 || (this.esRecargarFks && this.novedadproductoConstantesFunciones.cargarid_empresaNovedadProducto)) {

					if(!this.novedadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+novedadproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				novedadproductoReturnGeneral=novedadproductoLogic.cargarCombosLoteForeignKeyNovedadProducto(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=novedadproductoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNovedadProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(!this.novedadproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyNovedadProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNovedadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNovedadProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNovedadProducto(NovedadProducto novedadproducto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNovedadProducto(NovedadProducto novedadproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNovedadProducto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNovedadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNovedadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNovedadProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNovedadProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNovedadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNovedadProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public NovedadProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NovedadProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NovedadProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.novedadproductoSessionBean=new NovedadProductoSessionBean(); 
		this.novedadproductoConstantesFunciones=new NovedadProductoConstantesFunciones(); 
		this.novedadproductoBean=new NovedadProducto();//(this.novedadproductoConstantesFunciones); 		
		this.novedadproductoReturnGeneral=new NovedadProductoParameterReturnGeneral(); 
		
		this.novedadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NovedadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NovedadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NovedadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNovedadProducto(true);
			
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
			
			this.novedadproductoConstantesFunciones=new NovedadProductoConstantesFunciones(); 
			this.novedadproductoBean=new NovedadProducto();//this.novedadproductoConstantesFunciones); 			
			this.novedadproductoReturnGeneral=new NovedadProductoParameterReturnGeneral(); 
		
			NovedadProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.novedadproducto=new NovedadProducto();
			this.novedadproductos = new ArrayList<NovedadProducto>();
			this.novedadproductosAux = new ArrayList<NovedadProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic=new NovedadProductoLogic();
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.novedadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.novedadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNovedadProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadProducto);	
					}
					
					if(this.jInternalFrameImportacionNovedadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNovedadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNovedadProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadProducto);
				this.jInternalFrameDetalleFormNovedadProducto.setVisible(false);
				this.jInternalFrameDetalleFormNovedadProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadProducto);
					this.jInternalFrameReporteDinamicoNovedadProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoNovedadProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNovedadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNovedadProducto);
					this.jInternalFrameImportacionNovedadProducto.setVisible(false);
					this.jInternalFrameImportacionNovedadProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNovedadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNovedadProducto);
					this.jInternalFrameOrderByNovedadProducto.setVisible(false);
					this.jInternalFrameOrderByNovedadProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNovedadProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NovedadProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.novedadproductoReturnGeneral=new NovedadProductoParameterReturnGeneral();
			
			this.novedadproductoParameterGeneral=new NovedadProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.novedadproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NovedadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleFacturaProveedorConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NovedadSeguimientoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleTransferenciaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleMovimientoInventarioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleOrdenCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadproductoSessionBean.getEsGuardarRelacionado(),this.novedadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadproductoSessionBean.getEsGuardarRelacionado(),this.novedadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaDuplicarNovedadProducto=true;
			this.isVisibilidadCeldaCopiarNovedadProducto=true;
			this.isVisibilidadCeldaVerFormNovedadProducto=true;
			this.isVisibilidadCeldaOrdenNovedadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=false;
			this.isVisibilidadCeldaGuardarNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNovedadProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNovedadProducto(false);
			
			this.setPermisosUsuarioNovedadProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.novedadproductoSessionBean.getEsGuardarRelacionado() && this.novedadproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNovedadProductoClasesRelacionadas();
			}
			
			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNovedadProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNovedadProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNovedadProducto();
			}
			
			if(!this.isPermisoBusquedaNovedadProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNovedadProducto,this.isPermisoPaginacionMedioNovedadProducto,this.isPermisoPaginacionTodoNovedadProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NovedadProductoConstantesFunciones.getTiposSeleccionarNovedadProducto());
				
				this.tiposColumnasSelect=NovedadProductoConstantesFunciones.getTiposSeleccionarNovedadProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectNovedadProducto();				
				//this.tiposRelacionesSelect=NovedadProductoConstantesFunciones.getTiposRelacionesNovedadProducto(true);
				
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
			//if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNovedadProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNovedadProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNovedadProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadProducto() ;
			
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
			
			
			this.detallefacturaproveedorLogic=new DetalleFacturaProveedorLogic();
			this.novedadseguimientoLogic=new NovedadSeguimientoLogic();
			this.detalletransferenciaLogic=new DetalleTransferenciaLogic();
			this.detallemovimientoinventarioLogic=new DetalleMovimientoInventarioLogic();
			this.detalleordencompraLogic=new DetalleOrdenCompraLogic(); 
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
				novedadproductoImplementable= (NovedadProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				novedadproductoImplementableHome= (NovedadProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.novedadproductos= new ArrayList<NovedadProducto>();
			this.novedadproductosEliminados= new ArrayList<NovedadProducto>();
						
			this.isEsNuevoNovedadProducto=false;
			this.esParaAccionDesdeFormularioNovedadProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNovedadProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNovedadProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NovedadProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NovedadProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNovedadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNovedadProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNovedadProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNovedadProducto();
			}
			
			NovedadProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNovedadProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNovedadProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNovedadProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNovedadProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NovedadProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNovedadProducto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNovedadProducto")) {
				iIndex=this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Factura Proveedores")) {
					if(!DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNovedadProducto();

						this.cargarParteTabPanelRelacionadaDetalleFacturaProveedor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Movimiento Inventarios")) {
					if(!DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNovedadProducto();

						this.cargarParteTabPanelRelacionadaDetalleMovimientoInventario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Orden Compras")) {
					if(!DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNovedadProducto();

						this.cargarParteTabPanelRelacionadaDetalleOrdenCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Transferencias")) {
					if(!DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNovedadProducto();

						this.cargarParteTabPanelRelacionadaDetalleTransferencia(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Novedad Seguimientoes")) {
					if(!NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNovedadProducto();

						this.cargarParteTabPanelRelacionadaNovedadSeguimiento(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNovedadProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleFacturaProveedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNovedadProducto.cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(false,true,iIndex);
		this.jButtonDetalleFacturaProveedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleFacturaProveedor();

		//this.jTabbedPaneRelacionesNovedadProducto.updateUI();
		//this.jTabbedPaneRelacionesNovedadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNovedadProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleMovimientoInventario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNovedadProducto.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(false,true,iIndex);
		this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();

		//this.jTabbedPaneRelacionesNovedadProducto.updateUI();
		//this.jTabbedPaneRelacionesNovedadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNovedadProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleOrdenCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNovedadProducto.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(false,true,iIndex);
		this.jButtonDetalleOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleOrdenCompra();

		//this.jTabbedPaneRelacionesNovedadProducto.updateUI();
		//this.jTabbedPaneRelacionesNovedadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNovedadProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleTransferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNovedadProducto.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(false,true,iIndex);
		this.jButtonDetalleTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleTransferencia();

		//this.jTabbedPaneRelacionesNovedadProducto.updateUI();
		//this.jTabbedPaneRelacionesNovedadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNovedadProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNovedadSeguimiento(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNovedadProducto.cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(false,true,iIndex);
		this.jButtonNovedadSeguimientoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNovedadSeguimiento();

		//this.jTabbedPaneRelacionesNovedadProducto.updateUI();
		//this.jTabbedPaneRelacionesNovedadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNovedadProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleFacturaProveedor")) {
				int row=this.jTableDatosNovedadProducto.getSelectedRow();
				jButtonDetalleFacturaProveedorActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NovedadSeguimiento")) {
				int row=this.jTableDatosNovedadProducto.getSelectedRow();
				jButtonNovedadSeguimientoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleTransferencia")) {
				int row=this.jTableDatosNovedadProducto.getSelectedRow();
				jButtonDetalleTransferenciaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleMovimientoInventario")) {
				int row=this.jTableDatosNovedadProducto.getSelectedRow();
				jButtonDetalleMovimientoInventarioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleOrdenCompra")) {
				int row=this.jTableDatosNovedadProducto.getSelectedRow();
				jButtonDetalleOrdenCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Factura Proveedor")) {

					if(this.isTienePermisosDetalleFacturaProveedor && this.novedadproductoConstantesFunciones.mostrarDetalleFacturaProveedorNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Factura Proveedores"+"("+DetalleFacturaProveedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Factura Proveedores");

						if(novedadproductoConstantesFunciones.resaltarDetalleFacturaProveedorNovedadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(novedadproductoConstantesFunciones.resaltarDetalleFacturaProveedorNovedadProducto);
						}

						jmenuItem.setEnabled(this.novedadproductoConstantesFunciones.activarDetalleFacturaProveedorNovedadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleFacturaProveedor"));

						

						this.jInternalFrameDetalleFormNovedadProducto.jmenuDetalleNovedadProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Novedad Seguimiento")) {

					if(this.isTienePermisosNovedadSeguimiento && this.novedadproductoConstantesFunciones.mostrarNovedadSeguimientoNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Novedad Seguimientoes"+"("+NovedadSeguimientoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Novedad Seguimientoes");

						if(novedadproductoConstantesFunciones.resaltarNovedadSeguimientoNovedadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(novedadproductoConstantesFunciones.resaltarNovedadSeguimientoNovedadProducto);
						}

						jmenuItem.setEnabled(this.novedadproductoConstantesFunciones.activarNovedadSeguimientoNovedadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NovedadSeguimiento"));

						

						this.jInternalFrameDetalleFormNovedadProducto.jmenuDetalleNovedadProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Transferencia")) {

					if(this.isTienePermisosDetalleTransferencia && this.novedadproductoConstantesFunciones.mostrarDetalleTransferenciaNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Transferencias"+"("+DetalleTransferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Transferencias");

						if(novedadproductoConstantesFunciones.resaltarDetalleTransferenciaNovedadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(novedadproductoConstantesFunciones.resaltarDetalleTransferenciaNovedadProducto);
						}

						jmenuItem.setEnabled(this.novedadproductoConstantesFunciones.activarDetalleTransferenciaNovedadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleTransferencia"));

						

						this.jInternalFrameDetalleFormNovedadProducto.jmenuDetalleNovedadProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Movimiento Inventario")) {

					if(this.isTienePermisosDetalleMovimientoInventario && this.novedadproductoConstantesFunciones.mostrarDetalleMovimientoInventarioNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Movimiento Inventarios"+"("+DetalleMovimientoInventarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Movimiento Inventarios");

						if(novedadproductoConstantesFunciones.resaltarDetalleMovimientoInventarioNovedadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(novedadproductoConstantesFunciones.resaltarDetalleMovimientoInventarioNovedadProducto);
						}

						jmenuItem.setEnabled(this.novedadproductoConstantesFunciones.activarDetalleMovimientoInventarioNovedadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleMovimientoInventario"));

						

						this.jInternalFrameDetalleFormNovedadProducto.jmenuDetalleNovedadProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Orden Compra")) {

					if(this.isTienePermisosDetalleOrdenCompra && this.novedadproductoConstantesFunciones.mostrarDetalleOrdenCompraNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Orden Compras"+"("+DetalleOrdenCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Orden Compras");

						if(novedadproductoConstantesFunciones.resaltarDetalleOrdenCompraNovedadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(novedadproductoConstantesFunciones.resaltarDetalleOrdenCompraNovedadProducto);
						}

						jmenuItem.setEnabled(this.novedadproductoConstantesFunciones.activarDetalleOrdenCompraNovedadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleOrdenCompra"));

						

						this.jInternalFrameDetalleFormNovedadProducto.jmenuDetalleNovedadProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyNovedadProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNovedadProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNovedadProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNovedadProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNovedadProducto();
		
		this.cargarCombosFrameForeignKeyNovedadProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNovedadProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNovedadProducto();
		}
	}
	
	
	
	public void jButtonNuevoNovedadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			
			if(jTableDatosNovedadProducto.getRowCount()>=1) {
				jTableDatosNovedadProducto.removeRowSelectionInterval(0, jTableDatosNovedadProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoNovedadProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNovedadProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNovedadProducto(true);			
			//this.novedadproducto=new NovedadProducto();
			//this.novedadproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadProducto() ;
			
			if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.novedadproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);				
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NovedadProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNovedadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNovedadProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNovedadProducto.getSelectedRows().length;			
			}
			
			novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNovedadProducto--;			
				//NovedadProducto novedadproductoAux= new NovedadProducto();			
				//novedadproductoAux.setId(this.iIdNuevoNovedadProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NovedadProducto novedadproductoOrigen=new NovedadProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NovedadProducto novedadproductoOrigen : novedadproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							novedadproductoOrigen =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadproductoOrigen =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNovedadProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.novedadproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNovedadProducto(novedadproductoOrigen,this.novedadproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadproductoLogic.getNovedadProductos().add(this.novedadproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadproductos.add(this.novedadproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNovedadProducto(false);
				
				this.jTableDatosNovedadProducto.setRowSelectionInterval(this.getIndiceNuevoNovedadProducto(), this.getIndiceNuevoNovedadProducto());
				
				int iLastRow =  this.jTableDatosNovedadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();									
		
			NovedadProducto novedadproductoOrigen=new NovedadProducto();
			NovedadProducto novedadproductoDestino=new NovedadProducto();
				
			novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNovedadProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || novedadproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNovedadProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoOrigen =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadproductoOrigen =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadproductoDestino =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadproductoDestino =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				novedadproductoOrigen =novedadproductosSeleccionados.get(0);
				novedadproductoDestino =novedadproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNovedadProducto(novedadproductoOrigen,novedadproductoDestino,true,false);
				
				novedadproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadproductoDestino,novedadproductoLogic.getNovedadProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadproductoDestino,novedadproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNovedadProducto(false);
				
				//this.jTableDatosNovedadProducto.setRowSelectionInterval(this.getIndiceNuevoNovedadProducto(), this.getIndiceNuevoNovedadProducto());
				
				int iLastRow =  this.jTableDatosNovedadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNovedadProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNovedadProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNovedadProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNovedadProducto.setVisible(!isVisible);
			this.jPanelPaginacionNovedadProducto.setVisible(!isVisible);
			this.jPanelAccionesNovedadProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNovedadProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNovedadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNovedadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNovedadProducto();
			
			this.abrirFrameOrderByNovedadProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNovedadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNovedadProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNovedadProducto.isMaximum()) {
					this.jInternalFrameDetalleFormNovedadProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNovedadProducto.setSize(this.jInternalFrameDetalleFormNovedadProducto.iWidthFormulario,this.jInternalFrameDetalleFormNovedadProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNovedadProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNovedadProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNovedadProducto.isMaximum()) {
						this.jInternalFrameDetalleFormNovedadProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),NovedadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),NovedadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),NovedadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleFacturaProveedor();
					}

					if(DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleMovimientoInventario();
					}

					if(DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleOrdenCompra();
					}

					if(DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleTransferencia();
					}

					if(NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNovedadSeguimiento();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNovedadProducto.setVisible(true);
	        this.jInternalFrameDetalleFormNovedadProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNovedadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNovedadProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNovedadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadProducto,false,this);
				} else {
					this.jInternalFrameOrderByNovedadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNovedadProducto);
				this.jInternalFrameOrderByNovedadProducto.setVisible(false);
				this.jInternalFrameOrderByNovedadProducto.setSelected(false);
				
				this.jInternalFrameOrderByNovedadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadProducto"));
				
				this.inicializarActualizarBindingTablaOrderByNovedadProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNovedadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNovedadProducto==null) {
				
				this.jInternalFrameImportacionNovedadProducto=new ImportacionJInternalFrame(NovedadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNovedadProducto);
				this.jInternalFrameImportacionNovedadProducto.setVisible(false);
				this.jInternalFrameImportacionNovedadProducto.setSelected(false);


				this.jInternalFrameImportacionNovedadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadProducto"));
				this.jInternalFrameImportacionNovedadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadProducto"));
				this.jInternalFrameImportacionNovedadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNovedadProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNovedadProducto==null) {
				this.jInternalFrameReporteDinamicoNovedadProducto=new ReporteDinamicoJInternalFrame(NovedadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadProducto);
				this.jInternalFrameReporteDinamicoNovedadProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoNovedadProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadProducto"));
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadProducto"));
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleFacturaProveedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleFacturaProveedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleFacturaProveedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleFacturaProveedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleFacturaProveedor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleMovimientoInventario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleOrdenCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleTransferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNovedadSeguimiento() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosNovedadSeguimiento.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNovedadProducto.jContentPaneDetalleNovedadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosNovedadSeguimiento.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosNovedadSeguimiento.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosNovedadSeguimiento.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleNovedadProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadProducto);
			
	       	this.jInternalFrameDetalleFormNovedadProducto.setVisible(false);
	        this.jInternalFrameDetalleFormNovedadProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormNovedadProducto.dispose();
			//this.jInternalFrameDetalleFormNovedadProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNovedadProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNovedadProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoNovedadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNovedadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNovedadProducto.setVisible(true);
	        this.jInternalFrameImportacionNovedadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNovedadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNovedadProducto.setVisible(true);
	        this.jInternalFrameOrderByNovedadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNovedadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNovedadProducto.setVisible(false);
	        this.jInternalFrameOrderByNovedadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNovedadProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNovedadProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoNovedadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNovedadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNovedadProducto.setVisible(false);
	        this.jInternalFrameImportacionNovedadProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNovedadProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNovedadProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNovedadProducto(true);
			//this.isEsNuevoNovedadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNovedadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadProducto(false) ;
			
			if(novedadproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() && DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleFacturaProveedorActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.getEsGuardarRelacionado() && NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadSeguimientoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado() && DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() && DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMovimientoInventarioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado() && DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleOrdenCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNovedadProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNovedadProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNovedadProducto(true);
			//this.isEsNuevoNovedadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.novedadproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNovedadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNovedadProducto(false) ;
			
			if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNovedadProducto(false);
			
			//if(!this.isEsNuevoNovedadProducto) {								
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				
			}
			
			if(this.permiteMantenimiento(this.novedadproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNovedadProducto=true;
					this.inicializarActualizarBindingTablaNovedadProducto(false);
					this.isEsNuevoNovedadProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNovedadProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNovedadProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadProducto(false);
				
				this.habilitarDeshabilitarControlesNovedadProducto(false);
			
												
				
				if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNovedadProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNovedadProductoActionPerformed(evt,novedadproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNovedadProducto(this.novedadproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNovedadProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,novedadproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.novedadproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				this.novedadproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				this.novedadproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.novedadproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NovedadProductoModel) this.jTableDatosNovedadProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNovedadProducto=true;
				this.inicializarActualizarBindingTablaNovedadProducto(false);
				this.isEsNuevoNovedadProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadProducto(false);
				
				this.habilitarDeshabilitarControlesNovedadProducto(false);
				
				
				
				if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNovedadProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNovedadProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNovedadProducto.getRowCount()>=1) {
				jTableDatosNovedadProducto.removeRowSelectionInterval(0, jTableDatosNovedadProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNovedadProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNovedadProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadProducto(false) ;
			
			this.isEsNuevoNovedadProducto=false;
			
			if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNovedadProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNovedadProducto(false);
				
				//SI ES MANUAL
				if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNovedadProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNovedadProducto--;			
			//NovedadProducto novedadproductoAux= new NovedadProducto();			
			//novedadproductoAux.setId(this.iIdNuevoNovedadProducto);
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNovedadProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
			
			this.novedadproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.novedadproductoLogic.getNovedadProductos().add(this.novedadproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.novedadproductos.add(this.novedadproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNovedadProducto(false);
			
			this.jTableDatosNovedadProducto.setRowSelectionInterval(this.getIndiceNuevoNovedadProducto(), this.getIndiceNuevoNovedadProducto());
			
			int iLastRow =  this.jTableDatosNovedadProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNovedadProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNovedadProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNovedadProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadProducto(false);
			
			//SI ES MANUAL
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadProducto();
			}
			
			//this.abrirFrameTreeNovedadProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Novedad ProductoES ?", "MANTENIMIENTO DE Novedad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNovedadProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNovedadProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.novedadproductoReturnGeneral=novedadproductoLogic.procesarImportacionNovedadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.novedadproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNovedadProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNovedadProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNovedadProducto.setFileImportacion(this.jInternalFrameImportacionNovedadProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNovedadProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNovedadProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNovedadProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNovedadProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		

		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NovedadProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NovedadProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoNovedadProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NovedadProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NovedadProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case NovedadProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NovedadProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NovedadProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case NovedadProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NovedadProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case NovedadProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoNovedadProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NovedadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NovedadProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NovedadProducto novedadproducto:novedadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(NovedadProducto novedadproducto:novedadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(NovedadProducto novedadproducto:novedadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelNovedadProducto(row);				
			//	iRow++;
			//}				
			
			//for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNovedadProducto(novedadproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadProducto(false);
			
			//SI ES MANUAL
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadProducto(false);
			
			//SI ES MANUAL
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNovedadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadProducto(false);
			
			//SI ES MANUAL
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNovedadProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNovedadProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNovedadProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNovedadProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNovedadProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNovedadProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosNovedadProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosNovedadProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNovedadProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNovedadProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNovedadProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNovedadProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNovedadProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNovedadProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNovedadProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNovedadProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNovedadProducto();
		
		this.inicializarActualizarBindingBotonesManualNovedadProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNovedadProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNovedadProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNovedadProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionNuevoNovedadProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionSinCerrarNovedadProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionSinMensajeNovedadProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNovedadProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNovedadProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNovedadProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
				this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionNuevoNovedadProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionSinCerrarNovedadProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNovedadProducto.jCheckBoxPostAccionSinMensajeNovedadProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNovedadProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNovedadProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNovedadProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNovedadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNovedadProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNovedadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNovedadProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNovedadProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNovedadProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNovedadProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNovedadProducto() throws Exception {
		try	{
			if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNovedadProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNovedadProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNovedadProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNovedadProducto.addItem(reporte);
			}
			
			
			if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNovedadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNovedadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNovedadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNovedadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNovedadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNovedadProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNovedadProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
				this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
				this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNovedadProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNovedadProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoNovedadProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreNovedadProducto.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNovedadProducto(Boolean esInicializar) throws Exception {				
		if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNovedadProducto() throws Exception {
		this.inicializarActualizarBindingTablaNovedadProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNovedadProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNovedadProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNovedadProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=novedadproductoLogic.getNovedadProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=novedadproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNovedadProducto.setModel(new NovedadProductoModel(this.novedadproductoLogic.getNovedadProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNovedadProducto.setModel(new NovedadProductoModel(this.novedadproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNovedadProducto!=null && this.jInternalFrameOrderByNovedadProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNovedadProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO,novedadproductoConstantesFunciones.resaltarSeleccionarNovedadProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO,novedadproductoConstantesFunciones.resaltarSeleccionarNovedadProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,NovedadProductoConstantesFunciones.LABEL_ID));

		if(this.novedadproductoConstantesFunciones.mostraridNovedadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadproductoConstantesFunciones.resaltaridNovedadProducto,this.novedadproductoConstantesFunciones.activaridNovedadProducto,this,true,"idNovedadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadproductoConstantesFunciones.resaltaridNovedadProducto,this.novedadproductoConstantesFunciones.activaridNovedadProducto,this,true,"idNovedadProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,NovedadProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.novedadproductoConstantesFunciones.mostrarid_empresaNovedadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.novedadproductoConstantesFunciones.resaltarid_empresaNovedadProducto,this,this.novedadproductoConstantesFunciones.activarid_empresaNovedadProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.novedadproductoConstantesFunciones.resaltarid_empresaNovedadProducto,this,this.novedadproductoConstantesFunciones.activarid_empresaNovedadProducto,false,"id_empresaNovedadProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,NovedadProductoConstantesFunciones.LABEL_CODIGO));

		if(this.novedadproductoConstantesFunciones.mostrarcodigoNovedadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadproductoConstantesFunciones.resaltarcodigoNovedadProducto,this.novedadproductoConstantesFunciones.activarcodigoNovedadProducto,this,true,"codigoNovedadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadproductoConstantesFunciones.resaltarcodigoNovedadProducto,this.novedadproductoConstantesFunciones.activarcodigoNovedadProducto,this,true,"codigoNovedadProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,NovedadProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.novedadproductoConstantesFunciones.mostrarnombreNovedadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadproductoConstantesFunciones.resaltarnombreNovedadProducto,this.novedadproductoConstantesFunciones.activarnombreNovedadProducto,this,true,"nombreNovedadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadproductoConstantesFunciones.resaltarnombreNovedadProducto,this.novedadproductoConstantesFunciones.activarnombreNovedadProducto,this,true,"nombreNovedadProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleFacturaProveedor && this.novedadproductoConstantesFunciones.mostrarDetalleFacturaProveedorNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Factura Proveedores");
				tableColumn.setHeaderValue("Detalle Factura Proveedores");
				tableColumn.setCellRenderer(new DetalleFacturaProveedorTableCell(novedadproductoConstantesFunciones.resaltarDetalleFacturaProveedorNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleFacturaProveedorNovedadProducto));
				tableColumn.setCellEditor(new DetalleFacturaProveedorTableCell(novedadproductoConstantesFunciones.resaltarDetalleFacturaProveedorNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleFacturaProveedorNovedadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNovedadProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosNovedadSeguimiento && this.novedadproductoConstantesFunciones.mostrarNovedadSeguimientoNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Novedad Seguimientoes");
				tableColumn.setHeaderValue("Novedad Seguimientoes");
				tableColumn.setCellRenderer(new NovedadSeguimientoTableCell(novedadproductoConstantesFunciones.resaltarNovedadSeguimientoNovedadProducto,this,this.novedadproductoConstantesFunciones.activarNovedadSeguimientoNovedadProducto));
				tableColumn.setCellEditor(new NovedadSeguimientoTableCell(novedadproductoConstantesFunciones.resaltarNovedadSeguimientoNovedadProducto,this,this.novedadproductoConstantesFunciones.activarNovedadSeguimientoNovedadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNovedadProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleTransferencia && this.novedadproductoConstantesFunciones.mostrarDetalleTransferenciaNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Transferencias");
				tableColumn.setHeaderValue("Detalle Transferencias");
				tableColumn.setCellRenderer(new DetalleTransferenciaTableCell(novedadproductoConstantesFunciones.resaltarDetalleTransferenciaNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleTransferenciaNovedadProducto));
				tableColumn.setCellEditor(new DetalleTransferenciaTableCell(novedadproductoConstantesFunciones.resaltarDetalleTransferenciaNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleTransferenciaNovedadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNovedadProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleMovimientoInventario && this.novedadproductoConstantesFunciones.mostrarDetalleMovimientoInventarioNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Movimiento Inventarios");
				tableColumn.setHeaderValue("Detalle Movimiento Inventarios");
				tableColumn.setCellRenderer(new DetalleMovimientoInventarioTableCell(novedadproductoConstantesFunciones.resaltarDetalleMovimientoInventarioNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleMovimientoInventarioNovedadProducto));
				tableColumn.setCellEditor(new DetalleMovimientoInventarioTableCell(novedadproductoConstantesFunciones.resaltarDetalleMovimientoInventarioNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleMovimientoInventarioNovedadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNovedadProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleOrdenCompra && this.novedadproductoConstantesFunciones.mostrarDetalleOrdenCompraNovedadProducto && !NovedadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Orden Compras");
				tableColumn.setHeaderValue("Detalle Orden Compras");
				tableColumn.setCellRenderer(new DetalleOrdenCompraTableCell(novedadproductoConstantesFunciones.resaltarDetalleOrdenCompraNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleOrdenCompraNovedadProducto));
				tableColumn.setCellEditor(new DetalleOrdenCompraTableCell(novedadproductoConstantesFunciones.resaltarDetalleOrdenCompraNovedadProducto,this,this.novedadproductoConstantesFunciones.activarDetalleOrdenCompraNovedadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNovedadProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.novedadproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNovedadProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.novedadproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosNovedadProducto.addColumn(tableColumn);
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
			
			this.jTableDatosNovedadProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.novedadproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNovedadProducto.moveColumn(this.jTableDatosNovedadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNovedadProducto.moveColumn(this.jTableDatosNovedadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.novedadproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosNovedadProducto.moveColumn(this.jTableDatosNovedadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNovedadProducto.moveColumn(this.jTableDatosNovedadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNovedadProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNovedadProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNovedadProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNovedadProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNovedadProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNovedadProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNovedadProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNovedadProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=novedadproductoLogic.getNovedadProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=novedadproductos.size()-1;
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
		//this.jTableDatosNovedadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNovedadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNovedadProducto();
			
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
				
				//this.isEsNuevoNovedadProducto=false;
					
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
				if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.novedadproducto.getsType().equals("DUPLICADO")
				   || this.novedadproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNovedadProducto=true;
				
				} else {
					this.isEsNuevoNovedadProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.novedadproducto.getId()>=0 && !this.novedadproducto.getIsNew()) {						
						this.isEsNuevoNovedadProducto=false;
						
					} else {
						this.isEsNuevoNovedadProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNovedadProducto(esRelaciones);						
				
				this.seleccionarNovedadProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.novedadproducto.getId()<0) {
					this.isEsNuevoNovedadProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNovedadProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNovedadProducto(evt,rowIndex);
				}	
				
				if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NovedadProducto: " + this.dDif); 
					}
				}								
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNovedadProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.novedadproducto)) {
					if(this.novedadproducto.getId()>0) {
						this.novedadproducto.setIsDeleted(true);
						
						this.novedadproductosEliminados.add(this.novedadproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadproductoLogic.getNovedadProductos().remove(this.novedadproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadproductos.remove(this.novedadproducto);				
					}
					
					
					((NovedadProductoModel) this.jTableDatosNovedadProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNovedadProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNovedadProducto) {
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNovedadProducto(this.novedadproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.novedadproductoConstantesFunciones.cargarid_empresaNovedadProducto || this.novedadproductoConstantesFunciones.event_dependid_empresaNovedadProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.novedadproducto.getid_empresa());
									//this.inicializarActualizarBindingNovedadProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(novedadproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(novedadproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.novedadproducto.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNovedadProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNovedadProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadProducto(NovedadProducto novedadproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNovedadProducto(novedadproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadProducto(NovedadProducto novedadproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNovedadProducto(novedadproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNovedadProducto(novedadproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNovedadProducto(novedadproducto);
	}
	
	public void setVariablesObjetoActualToFormularioNovedadProducto(NovedadProducto novedadproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setText(novedadproducto.getId().toString());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setText(novedadproducto.getcodigo());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setText(novedadproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NovedadProducto novedadproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,novedadproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NovedadProducto novedadproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				novedadproductoLocal=this.novedadproducto;
			} else {
				novedadproductoLocal=this.novedadproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(novedadproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNovedadProducto(novedadproductoLocal,true);
					
					if(novedadproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(novedadproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(novedadproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNovedadProducto(NovedadProducto novedadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadProducto(novedadproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(novedadproducto);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadProducto(NovedadProducto novedadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadProducto(novedadproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadProducto(NovedadProducto novedadproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.getText()==null || this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.getText()=="" || this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setText("0");
			}

			if(conColumnasBase) {novedadproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelIdNovedadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadproducto.setcodigo(this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelcodigoNovedadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadproducto.setnombre(this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadProducto.jLabelnombreNovedadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadProducto(NovedadProducto novedadproductoBean,NovedadProducto novedadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNovedadProducto(NovedadProducto novedadproductoOrigen,NovedadProducto novedadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadproductoOrigen.getId()!=null && !novedadproductoOrigen.getId().equals(0L))) {novedadproducto.setId(novedadproductoOrigen.getId());}}
			if(conDefault || (!conDefault && novedadproductoOrigen.getcodigo()!=null && !novedadproductoOrigen.getcodigo().equals(""))) {novedadproducto.setcodigo(novedadproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && novedadproductoOrigen.getnombre()!=null && !novedadproductoOrigen.getnombre().equals(""))) {novedadproducto.setnombre(novedadproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadProducto(NovedadProducto novedadproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setText(novedadproducto.getId().toString());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setText(novedadproducto.getcodigo());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setText(novedadproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadProducto(NovedadProductoBean novedadproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setText(novedadproductoBean.getId().toString());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setText(novedadproductoBean.getcodigo());
			this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setText(novedadproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNovedadProducto(NovedadProductoParameterReturnGeneral novedadproductoReturnGeneral,NovedadProductoBean novedadproductoBean,Boolean conDefault) throws Exception { 
		try {
			NovedadProducto novedadproductoLocal=new NovedadProducto();
			
			novedadproductoLocal=novedadproductoReturnGeneral.getNovedadProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadproductoLocal.getId()!=null && !novedadproductoLocal.getId().equals(0L))) {novedadproductoBean.setId(novedadproductoLocal.getId());}}
			if(conDefault || (!conDefault && novedadproductoLocal.getcodigo()!=null && !novedadproductoLocal.getcodigo().equals(""))) {novedadproductoBean.setcodigo(novedadproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && novedadproductoLocal.getnombre()!=null && !novedadproductoLocal.getnombre().equals(""))) {novedadproductoBean.setnombre(novedadproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNovedadProductoGenerico(Long idNovedadProductoSeleccionado,JComboBox jComboBoxNovedadProducto,List<NovedadProducto> novedadproductosLocal)throws Exception {
		try {
			NovedadProducto  novedadproductoTemp=null;

			for(NovedadProducto novedadproductoAux:novedadproductosLocal) {
				if(novedadproductoAux.getId()!=null && novedadproductoAux.getId().equals(idNovedadProductoSeleccionado)) {
					novedadproductoTemp=novedadproductoAux;
					break;
				}
			}

			jComboBoxNovedadProducto.setSelectedItem(novedadproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNovedadProductoGenerico(JComboBox jComboBoxNovedadProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNovedadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNovedadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleFacturaProveedor")) {
			jButtonDetalleFacturaProveedorActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NovedadSeguimiento")) {
			jButtonNovedadSeguimientoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleTransferencia")) {
			jButtonDetalleTransferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleMovimientoInventario")) {
			jButtonDetalleMovimientoInventarioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleOrdenCompra")) {
			jButtonDetalleOrdenCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadproducto=(NovedadProducto) novedadproductoLogic.getNovedadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadproducto =(NovedadProducto) novedadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!novedadproducto.getIsNew() && !novedadproducto.getIsChanged() && !novedadproducto.getIsDeleted()) {
				sDescripcion=novedadproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=novedadproducto.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NovedadProducto novedadproductoRow=new NovedadProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadproductoRow=(NovedadProducto) novedadproductoLogic.getNovedadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadproductoRow=(NovedadProducto) novedadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleFacturaProveedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NovedadProducto novedadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto = (NovedadProducto)this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.novedadproducto = (NovedadProducto)this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(novedadproducto!=null) {
						this.novedadproducto = novedadproducto;
					} else {
						this.novedadproducto = new NovedadProducto();
					}
				}

				if(this.isTienePermisosDetalleFacturaProveedor && this.permiteMantenimiento(this.novedadproducto)) {
					DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup=new DetalleFacturaProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallefacturaproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup;
					} else {
						detallefacturaproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame;
					}

					List<NovedadProducto> novedadproductos=new ArrayList<NovedadProducto>();
					novedadproductos.add(this.novedadproducto);
					if(!esRelacionado) {
						//detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setConGuardarRelaciones(false);
						//detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallefacturaproveedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNovedadProducto.cargarDetalleFacturaProveedorBeanSwingJInternalFrame(novedadproductos,this.novedadproducto,detallefacturaproveedorBeanSwingJInternalFrame,/*conInicializar,*/detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.getConGuardarRelaciones(),detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
					detallefacturaproveedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaProveedor("no_relacionado");

						detallefacturaproveedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleFacturaProveedorConstantesFunciones.ITAMANIOFILATABLA + (DetalleFacturaProveedorConstantesFunciones.ITAMANIOFILATABLA/2));

						detallefacturaproveedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
						TitledBorder titledBorderDetalleFacturaProveedor=(TitledBorder)detallefacturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleFacturaProveedor.getBorder();

						titledBorderDetalleFacturaProveedor.setTitle(titledBorderNovedadProducto.getTitle() + " -> Detalle Factura Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallefacturaproveedorBeanSwingJInternalFrame);
						}

						detallefacturaproveedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallefacturaproveedorBeanSwingJInternalFrame);

						detallefacturaproveedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Factura Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNovedadSeguimientoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NovedadProducto novedadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto = (NovedadProducto)this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.novedadproducto = (NovedadProducto)this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(novedadproducto!=null) {
						this.novedadproducto = novedadproducto;
					} else {
						this.novedadproducto = new NovedadProducto();
					}
				}

				if(this.isTienePermisosNovedadSeguimiento && this.permiteMantenimiento(this.novedadproducto)) {
					NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup=new NovedadSeguimientoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						novedadseguimientoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup;
					} else {
						novedadseguimientoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame;
					}

					List<NovedadProducto> novedadproductos=new ArrayList<NovedadProducto>();
					novedadproductos.add(this.novedadproducto);
					if(!esRelacionado) {
						//novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setConGuardarRelaciones(false);
						//novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					novedadseguimientoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNovedadProducto.cargarNovedadSeguimientoBeanSwingJInternalFrame(novedadproductos,this.novedadproducto,novedadseguimientoBeanSwingJInternalFrame,/*conInicializar,*/novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.getConGuardarRelaciones(),novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.getEsGuardarRelacionado());
					novedadseguimientoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadSeguimiento("no_relacionado");

						novedadseguimientoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NovedadSeguimientoConstantesFunciones.ITAMANIOFILATABLA + (NovedadSeguimientoConstantesFunciones.ITAMANIOFILATABLA/2));

						novedadseguimientoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
						TitledBorder titledBorderNovedadSeguimiento=(TitledBorder)novedadseguimientoBeanSwingJInternalFrame.jScrollPanelDatosNovedadSeguimiento.getBorder();

						titledBorderNovedadSeguimiento.setTitle(titledBorderNovedadProducto.getTitle() + " -> Novedad Seguimiento");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,novedadseguimientoBeanSwingJInternalFrame);
						}

						novedadseguimientoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(novedadseguimientoBeanSwingJInternalFrame);

						novedadseguimientoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Novedad Seguimiento",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleTransferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NovedadProducto novedadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto = (NovedadProducto)this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.novedadproducto = (NovedadProducto)this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(novedadproducto!=null) {
						this.novedadproducto = novedadproducto;
					} else {
						this.novedadproducto = new NovedadProducto();
					}
				}

				if(this.isTienePermisosDetalleTransferencia && this.permiteMantenimiento(this.novedadproducto)) {
					DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup=new DetalleTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalletransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup;
					} else {
						detalletransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame;
					}

					List<NovedadProducto> novedadproductos=new ArrayList<NovedadProducto>();
					novedadproductos.add(this.novedadproducto);
					if(!esRelacionado) {
						//detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setConGuardarRelaciones(false);
						//detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalletransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNovedadProducto.cargarDetalleTransferenciaBeanSwingJInternalFrame(novedadproductos,this.novedadproducto,detalletransferenciaBeanSwingJInternalFrame,/*conInicializar,*/detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getConGuardarRelaciones(),detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.getEsGuardarRelacionado());
					detalletransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("no_relacionado");

						detalletransferenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleTransferenciaConstantesFunciones.ITAMANIOFILATABLA + (DetalleTransferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						detalletransferenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
						TitledBorder titledBorderDetalleTransferencia=(TitledBorder)detalletransferenciaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTransferencia.getBorder();

						titledBorderDetalleTransferencia.setTitle(titledBorderNovedadProducto.getTitle() + " -> Detalle Transferencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalletransferenciaBeanSwingJInternalFrame);
						}

						detalletransferenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalletransferenciaBeanSwingJInternalFrame);

						detalletransferenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Transferencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleMovimientoInventarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NovedadProducto novedadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto = (NovedadProducto)this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.novedadproducto = (NovedadProducto)this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(novedadproducto!=null) {
						this.novedadproducto = novedadproducto;
					} else {
						this.novedadproducto = new NovedadProducto();
					}
				}

				if(this.isTienePermisosDetalleMovimientoInventario && this.permiteMantenimiento(this.novedadproducto)) {
					DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup;
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame;
					}

					List<NovedadProducto> novedadproductos=new ArrayList<NovedadProducto>();
					novedadproductos.add(this.novedadproducto);
					if(!esRelacionado) {
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
						//detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNovedadProducto.cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(novedadproductos,this.novedadproducto,detallemovimientoinventarioBeanSwingJInternalFrame,/*conInicializar,*/detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getConGuardarRelaciones(),detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
					detallemovimientoinventarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");

						detallemovimientoinventarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA + (DetalleMovimientoInventarioConstantesFunciones.ITAMANIOFILATABLA/2));

						detallemovimientoinventarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
						TitledBorder titledBorderDetalleMovimientoInventario=(TitledBorder)detallemovimientoinventarioBeanSwingJInternalFrame.jScrollPanelDatosDetalleMovimientoInventario.getBorder();

						titledBorderDetalleMovimientoInventario.setTitle(titledBorderNovedadProducto.getTitle() + " -> Detalle Movimiento Inventario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallemovimientoinventarioBeanSwingJInternalFrame);
						}

						detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallemovimientoinventarioBeanSwingJInternalFrame);

						detallemovimientoinventarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Movimiento Inventario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleOrdenCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NovedadProducto novedadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNovedadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto = (NovedadProducto)this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.novedadproducto = (NovedadProducto)this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(novedadproducto!=null) {
						this.novedadproducto = novedadproducto;
					} else {
						this.novedadproducto = new NovedadProducto();
					}
				}

				if(this.isTienePermisosDetalleOrdenCompra && this.permiteMantenimiento(this.novedadproducto)) {
					DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup=new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup;
					} else {
						detalleordencompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame;
					}

					List<NovedadProducto> novedadproductos=new ArrayList<NovedadProducto>();
					novedadproductos.add(this.novedadproducto);
					if(!esRelacionado) {
						//detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setConGuardarRelaciones(false);
						//detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleordencompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNovedadProducto.cargarDetalleOrdenCompraBeanSwingJInternalFrame(novedadproductos,this.novedadproducto,detalleordencompraBeanSwingJInternalFrame,/*conInicializar,*/detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getConGuardarRelaciones(),detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.getEsGuardarRelacionado());
					detalleordencompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("no_relacionado");

						detalleordencompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA + (DetalleOrdenCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleordencompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
						TitledBorder titledBorderDetalleOrdenCompra=(TitledBorder)detalleordencompraBeanSwingJInternalFrame.jScrollPanelDatosDetalleOrdenCompra.getBorder();

						titledBorderDetalleOrdenCompra.setTitle(titledBorderNovedadProducto.getTitle() + " -> Detalle Orden Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleordencompraBeanSwingJInternalFrame);
						}

						detalleordencompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleordencompraBeanSwingJInternalFrame);

						detalleordencompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Orden Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNovedadProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto));			
			this.jButtonDuplicarNovedadProducto.setVisible((this.isVisibilidadCeldaDuplicarNovedadProducto && this.isPermisoDuplicarNovedadProducto));			
			this.jButtonCopiarNovedadProducto.setVisible((this.isVisibilidadCeldaCopiarNovedadProducto && this.isPermisoCopiarNovedadProducto));
			this.jButtonVerFormNovedadProducto.setVisible((this.isVisibilidadCeldaVerFormNovedadProducto && this.isPermisoVerFormNovedadProducto));
			
			this.jButtonAbrirOrderByNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));			
			
			this.jButtonNuevoRelacionesNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadProducto && this.isPermisoNuevoNovedadProducto));			
			this.jButtonNuevoGuardarCambiosNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarNovedadProducto.setVisible((this.isVisibilidadCeldaModificarNovedadProducto && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.setVisible((this.isVisibilidadCeldaActualizarNovedadProducto && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.setVisible((this.isVisibilidadCeldaEliminarNovedadProducto && this.isPermisoEliminarNovedadProducto));
			this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.setVisible(this.isVisibilidadCeldaCancelarNovedadProducto);							
			this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto));						
			this.jButtonDuplicarToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaDuplicarNovedadProducto && this.isPermisoDuplicarNovedadProducto));						
			this.jButtonCopiarToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaCopiarNovedadProducto && this.isPermisoCopiarNovedadProducto));			
			this.jButtonVerFormToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaVerFormNovedadProducto && this.isPermisoVerFormNovedadProducto));			
			this.jButtonAbrirOrderByToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));
			this.jButtonNuevoRelacionesToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadProducto && this.isPermisoNuevoNovedadProducto));			
			this.jButtonNuevoGuardarCambiosToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));			
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaModificarNovedadProducto && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaActualizarNovedadProducto  && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaEliminarNovedadProducto && this.isPermisoEliminarNovedadProducto));
			this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarToolBarNovedadProducto.setVisible(this.isVisibilidadCeldaCancelarNovedadProducto);				
			this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto));			
			this.jMenuItemDuplicarNovedadProducto.setVisible((this.isVisibilidadCeldaDuplicarNovedadProducto && this.isPermisoDuplicarNovedadProducto));			
			this.jMenuItemCopiarNovedadProducto.setVisible((this.isVisibilidadCeldaCopiarNovedadProducto && this.isPermisoCopiarNovedadProducto));			
			this.jMenuItemVerFormNovedadProducto.setVisible((this.isVisibilidadCeldaVerFormNovedadProducto && this.isPermisoVerFormNovedadProducto));			
			this.jMenuItemAbrirOrderByNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));			
			//this.jMenuItemMostrarOcultarNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));
			this.jMenuItemDetalleAbrirOrderByNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));			
			//this.jMenuItemDetalleMostrarOcultarNovedadProducto.setVisible((this.isVisibilidadCeldaOrdenNovedadProducto && this.isPermisoOrdenNovedadProducto));			
			this.jMenuItemNuevoRelacionesNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadProducto && this.isPermisoNuevoNovedadProducto));			
			this.jMenuItemNuevoGuardarCambiosNovedadProducto.setVisible((this.isVisibilidadCeldaNuevoNovedadProducto && this.isPermisoNuevoNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));									
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemModificarNovedadProducto.setVisible((this.isVisibilidadCeldaModificarNovedadProducto && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemActualizarNovedadProducto.setVisible((this.isVisibilidadCeldaActualizarNovedadProducto && this.isPermisoActualizarNovedadProducto));	
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemEliminarNovedadProducto.setVisible((this.isVisibilidadCeldaEliminarNovedadProducto && this.isPermisoEliminarNovedadProducto));
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemCancelarNovedadProducto.setVisible(this.isVisibilidadCeldaCancelarNovedadProducto);				
			}
			
			this.jMenuItemGuardarCambiosNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));						
			this.jMenuItemGuardarCambiosTablaNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNovedadProducto=this.jButtonNuevoNovedadProducto.isVisible();
			this.isVisibilidadCeldaDuplicarNovedadProducto=this.jButtonDuplicarNovedadProducto.isVisible();
			this.isVisibilidadCeldaCopiarNovedadProducto=this.jButtonCopiarNovedadProducto.isVisible();
			this.isVisibilidadCeldaVerFormNovedadProducto=this.jButtonVerFormNovedadProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenNovedadProducto=this.jButtonAbrirOrderByNovedadProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=this.jButtonNuevoRelacionesNovedadProducto.isVisible();
			this.isVisibilidadCeldaModificarNovedadProducto=this.jButtonModificarNovedadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.isVisibilidadCeldaActualizarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.isVisible();
			this.isVisibilidadCeldaEliminarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.isVisible();
			this.isVisibilidadCeldaCancelarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.isVisible();
			this.isVisibilidadCeldaGuardarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=this.jButtonGuardarCambiosTablaNovedadProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNovedadProducto=this.jButtonNuevoToolBarNovedadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=this.jButtonNuevoRelacionesToolBarNovedadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.isVisibilidadCeldaModificarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarToolBarNovedadProducto.isVisible();
			this.isVisibilidadCeldaActualizarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarToolBarNovedadProducto.isVisible();
			this.isVisibilidadCeldaEliminarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarToolBarNovedadProducto.isVisible();
			this.isVisibilidadCeldaCancelarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarToolBarNovedadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadProducto=this.jButtonGuardarCambiosToolBarNovedadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=this.jButtonGuardarCambiosTablaToolBarNovedadProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNovedadProducto=this.jMenuItemNuevoNovedadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=this.jMenuItemNuevoRelacionesNovedadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.isVisibilidadCeldaModificarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jMenuItemModificarNovedadProducto.isVisible();
			this.isVisibilidadCeldaActualizarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jMenuItemActualizarNovedadProducto.isVisible();
			this.isVisibilidadCeldaEliminarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jMenuItemEliminarNovedadProducto.isVisible();
			this.isVisibilidadCeldaCancelarNovedadProducto=this.jInternalFrameDetalleFormNovedadProducto.jMenuItemCancelarNovedadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadProducto=this.jMenuItemGuardarCambiosNovedadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=this.jMenuItemGuardarCambiosTablaNovedadProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNovedadProducto(Boolean esInicializar) {
		if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualNovedadProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNovedadProducto() {
		this.jButtonNuevoNovedadProducto.setVisible(this.isPermisoNuevoNovedadProducto);			
		this.jButtonDuplicarNovedadProducto.setVisible(this.isPermisoDuplicarNovedadProducto);			
		this.jButtonCopiarNovedadProducto.setVisible(this.isPermisoCopiarNovedadProducto);			
		this.jButtonVerFormNovedadProducto.setVisible(this.isPermisoVerFormNovedadProducto);			
		
		this.jButtonAbrirOrderByNovedadProducto.setVisible(this.isPermisoOrdenNovedadProducto);					
		
		this.jButtonNuevoRelacionesNovedadProducto.setVisible(this.isPermisoNuevoNovedadProducto);			
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarNovedadProducto.setVisible(this.isPermisoActualizarNovedadProducto);	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.setVisible(this.isPermisoActualizarNovedadProducto);	
			this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.setVisible(this.isPermisoEliminarNovedadProducto);
			this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.setVisible(this.isVisibilidadCeldaCancelarNovedadProducto);						
			this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.setVisible(this.isPermisoGuardarCambiosNovedadProducto);							
		}
		
		this.jButtonGuardarCambiosTablaNovedadProducto.setVisible(this.isPermisoActualizarNovedadProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadProducto() {
		this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarNovedadProducto.setVisible(this.isPermisoActualizarNovedadProducto);	
		this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.setVisible(this.isPermisoActualizarNovedadProducto);	
		this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.setVisible(this.isPermisoEliminarNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.setVisible(this.isVisibilidadCeldaCancelarNovedadProducto);							
		this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.setVisible((this.isVisibilidadCeldaGuardarNovedadProducto && this.isPermisoGuardarCambiosNovedadProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNovedadProducto() {
		if(NovedadProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNovedadProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNovedadProducto() {
	}
	
	public void jTableDatosNovedadProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNovedadProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNovedadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.getnovedadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadproducto==null) {
						this.novedadproducto = new NovedadProducto();
					}

					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				}

				if(this.novedadproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.novedadproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNovedadProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNovedadProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadProducto(this.getnovedadproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.novedadproductoLogic.getConnexion());

				if(this.novedadproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.novedadproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadProducto=(TitledBorder)this.jScrollPanelDatosNovedadProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNovedadProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNovedadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.getnovedadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadproducto==null) {
						this.novedadproducto = new NovedadProducto();
					}

					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				}

				if(this.novedadproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.novedadproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoNovedadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.getnovedadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadproducto==null) {
						this.novedadproducto = new NovedadProducto();
					}

					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				}

				if(this.novedadproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.novedadproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreNovedadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.getnovedadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadproducto==null) {
						this.novedadproducto = new NovedadProducto();
					}

					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);
				}

				if(this.novedadproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.novedadproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoNovedadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadProducto(false,false);

			this.getNovedadProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingNovedadProducto(false);

			//if(NovedadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreNovedadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadProducto(false,false);

			this.getNovedadProductosBusquedaPorNombre();

			this.inicializarActualizarBindingNovedadProducto(false);

			//if(NovedadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNovedadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadProducto(false,false);

			this.getNovedadProductosFK_IdEmpresa();

			this.inicializarActualizarBindingNovedadProducto(false);

			//if(NovedadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNovedadProducto() {
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
		

		if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
			this.jInternalFrameDetalleFormNovedadProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormNovedadProducto.dispose();
			this.jInternalFrameDetalleFormNovedadProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
			this.jInternalFrameReporteDinamicoNovedadProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNovedadProducto.dispose();
			this.jInternalFrameReporteDinamicoNovedadProducto=null;
		}
		
		if(this.jInternalFrameImportacionNovedadProducto!=null) {
			this.jInternalFrameImportacionNovedadProducto.setVisible(false);	    			
			this.jInternalFrameImportacionNovedadProducto.dispose();
			this.jInternalFrameImportacionNovedadProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNovedadProducto();
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNovedadProducto")) {
				jButtonDuplicarNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNovedadProducto")) {
				jButtonCopiarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormNovedadProducto")) {
				jButtonVerFormNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNovedadProducto")) {
				jButtonDuplicarNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNovedadProducto")) {
				jButtonDuplicarNovedadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNovedadProducto")) {
				jButtonModificarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNovedadProducto")) {
				jButtonModificarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNovedadProducto")) {
				jButtonModificarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNovedadProducto")) {
				jButtonActualizarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNovedadProducto")) {
				jButtonActualizarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNovedadProducto")) {
				jButtonActualizarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarNovedadProducto")) {
				jButtonEliminarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNovedadProducto")) {
				jButtonEliminarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNovedadProducto")) {
				jButtonEliminarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarNovedadProducto")) {
				jButtonCancelarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNovedadProducto")) {
				jButtonCancelarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNovedadProducto")) {
				jButtonCancelarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarNovedadProducto")) {
				jButtonCerrarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNovedadProducto")) {
				jButtonCerrarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNovedadProducto")) {
				jButtonCerrarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNovedadProducto")) {
				jButtonMostrarOcultarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNovedadProducto")) {
				jButtonCancelarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNovedadProducto")) {
				jButtonCopiarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNovedadProducto")) {
				jButtonVerFormNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNovedadProducto")) {
				jButtonCopiarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNovedadProducto")) {
				jButtonVerFormNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNovedadProducto")) {
				jButtonRecargarInformacionNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNovedadProducto")) {
				jButtonRecargarInformacionNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNovedadProducto")) {
				jButtonRecargarInformacionNovedadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNovedadProducto")) {
				jButtonAnterioresNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNovedadProducto")) {
				jButtonAnterioresNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNovedadProducto")) {
				jButtonAnterioresNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNovedadProducto")) {
				jButtonSiguientesNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNovedadProducto")) {
				jButtonSiguientesNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNovedadProducto")) {
				jButtonSiguientesNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNovedadProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByNovedadProducto")) {
				jButtonAbrirOrderByNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNovedadProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarNovedadProducto")) {
				jButtonMostrarOcultarNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadProducto")) {
				jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNovedadProducto")) {
				jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNovedadProducto")) {
				jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNovedadProducto")) {
				jButtonCerrarReporteDinamicoNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNovedadProducto")) {
				jButtonGenerarReporteDinamicoNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNovedadProducto")) {
				
				jButtonGenerarExcelReporteDinamicoNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNovedadProducto")) {
				jButtonCerrarImportacionNovedadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNovedadProducto")) {
				
				jButtonGenerarImportacionNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNovedadProducto")) {
				
				jButtonAbrirImportacionNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNovedadProducto")) {
				jComboBoxTiposAccionesNovedadProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNovedadProducto")) {
				jComboBoxTiposRelacionesNovedadProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNovedadProducto")) {
				jComboBoxTiposAccionesNovedadProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNovedadProducto")) {
				
				jComboBoxTiposSeleccionarNovedadProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNovedadProducto")) {
				jTextFieldValorCampoGeneralNovedadProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNovedadProducto")) {
				jButtonAbrirOrderByNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNovedadProducto")) {
				jButtonAbrirOrderByNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNovedadProducto")) {
				jButtonCerrarOrderByNovedadProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadProductoBusqueda")) {
				this.jButtonidNovedadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadProductoUpdate")) {
				this.jButtonid_empresaNovedadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadProductoBusqueda")) {
				this.jButtonid_empresaNovedadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoNovedadProductoBusqueda")) {
				this.jButtoncodigoNovedadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNovedadProductoBusqueda")) {
				this.jButtonnombreNovedadProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoNovedadProducto")) {
				this.jButtonBusquedaPorCodigoNovedadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreNovedadProducto")) {
				this.jButtonBusquedaPorNombreNovedadProductoActionPerformed(evt);
			}
			
			;
			
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNovedadProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NovedadProducto novedadproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				novedadproductoLocal=this.novedadproducto;
			} else {
				novedadproductoLocal=this.novedadproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
							
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
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
			
			


			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
								
						
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
								
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
							
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
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
			
			


			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
								
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNovedadProducto")) {
					jCheckBoxSeleccionarTodosNovedadProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNovedadProducto")) {
					jCheckBoxSeleccionadosNovedadProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNovedadProducto")) {
					
				}
				
				


				
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
												
				
				


				
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
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
			
			


			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadproducto);
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
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
				
				


				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadproductoAnterior =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNovedadProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNovedadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNovedadProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.novedadproducto =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.novedadproducto =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.novedadproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNovedadProducto")) {
				
				}
				
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNovedadProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNovedadProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNovedadProducto")) {
			
			}
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNovedadProducto();
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			if(sTipo.equals("NuevoNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNovedadProducto")) {
				jButtonDuplicarNovedadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNovedadProducto")) {
				jButtonCopiarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNovedadProducto")) {
				jButtonVerFormNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNovedadProducto")) {
				jButtonNuevoNovedadProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNovedadProducto")) {
				jButtonModificarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNovedadProducto")) {
				jButtonActualizarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNovedadProducto")) {
				jButtonEliminarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNovedadProducto")) {
				jButtonCancelarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNovedadProducto")) {
				jButtonCerrarNovedadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNovedadProducto")) {
				jButtonGuardarCambiosNovedadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadProducto")) {
				jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNovedadProducto")) {
				jButtonAbrirOrderByNovedadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNovedadProducto")) {
				jButtonRecargarInformacionNovedadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNovedadProducto")) {
				jButtonAnterioresNovedadProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNovedadProducto")) {
				jButtonSiguientesNovedadProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadProductoBusqueda")) {
				this.jButtonidNovedadProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadProductoUpdate")) {
				this.jButtonid_empresaNovedadProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadProductoBusqueda")) {
				this.jButtonid_empresaNovedadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoNovedadProductoBusqueda")) {
				this.jButtoncodigoNovedadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNovedadProductoBusqueda")) {
				this.jButtonnombreNovedadProductoBusquedaActionPerformed(evt);
			}
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNovedadProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNovedadProducto")) {
				closingInternalFrameNovedadProducto();
				
			} else if(sTipo.equals("jButtonCancelarNovedadProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormNovedadProducto = (JInternalFrameBase)evt.getSource();
	            	
	            NovedadProductoBeanSwingJInternalFrame jInternalFrameParent=(NovedadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNovedadProductoActionPerformed(null);
			}
			
			NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadproducto,new Object(),this.novedadproductoParameterGeneral,this.novedadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNovedadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNovedadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNovedadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.novedadproducto)) {
			if(!esControlTabla) {
				if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);			
				}
				
				if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNovedadProducto(this.novedadproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadproductoReturnGeneral=novedadproductoLogic.procesarEventosNovedadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadproductoLogic.getNovedadProductos(),this.novedadproducto,this.novedadproductoParameterGeneral,this.isEsNuevoNovedadProducto,classes);//this.novedadproductoLogic.getNovedadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNovedadProducto(this.novedadproductoReturnGeneral,this.novedadproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNovedadProducto(classes,this.novedadproductoReturnGeneral,this.novedadproductoBean,false);
					}
						
					if(this.novedadproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto());	
					}
						
					if(this.novedadproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto(),classes);//this.novedadproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNovedadProducto(this.novedadproducto,classes);//this.novedadproductoBean);									
				}
			
				if(NovedadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNovedadProducto(this.novedadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadProducto(this.novedadproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.novedadproductoAnterior!=null) {
						this.novedadproducto=this.novedadproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadproductoReturnGeneral=novedadproductoLogic.procesarEventosNovedadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadproductoLogic.getNovedadProductos(),this.novedadproducto,this.novedadproductoParameterGeneral,this.isEsNuevoNovedadProducto,classes);//this.novedadproductoLogic.getNovedadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.novedadproductoReturnGeneral.getNovedadProducto(),novedadproductoLogic.getNovedadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.novedadproductoReturnGeneral.getNovedadProducto(),this.novedadproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNovedadProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosNovedadProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNovedadProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosNovedadProducto() throws Exception {
		
		NovedadProductoModel novedadproductoModel=(NovedadProductoModel)this.jTableDatosNovedadProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadproductoModel.novedadproductos=this.novedadproductoLogic.getNovedadProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			novedadproductoModel.novedadproductos=this.novedadproductos;
		}
		
		
		((NovedadProductoModel) this.jTableDatosNovedadProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNovedadProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnovedadproductoAnterior(),this.novedadproductoLogic.getNovedadProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnovedadproductoAnterior(),this.novedadproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNovedadProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNovedadProducto(NovedadProducto novedadproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFacturaProveedor.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.setDetalleFacturaProveedors(novedadproducto.getDetalleFacturaProveedors());
					this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFacturaProveedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadSeguimiento.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.setNovedadSeguimientos(novedadproducto.getNovedadSeguimientos());
					this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadSeguimiento(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(novedadproducto.getDetalleTransferencias());
					this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(novedadproducto.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(novedadproducto.getDetalleOrdenCompras());
					this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
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
										
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadproducto,new Object(),generalEntityParameterGeneral,this.novedadproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NovedadProductoConstantesFunciones.getClassesRelationshipsOfNovedadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NovedadProductoConstantesFunciones.getClassesRelationshipsFromStringsOfNovedadProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNovedadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NovedadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadproducto,new Object(),generalEntityParameterGeneral,this.novedadproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNovedadProducto(NovedadProductoBean novedadproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFacturaProveedor.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.setDetalleFacturaProveedors(novedadproducto.getDetalleFacturaProveedors());
					this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFacturaProveedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadSeguimiento.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.setNovedadSeguimientos(novedadproducto.getNovedadSeguimientos());
					this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadSeguimiento(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.setDetalleTransferencias(novedadproducto.getDetalleTransferencias());
					this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.setDetalleMovimientoInventarios(novedadproducto.getDetalleMovimientoInventarios());
					this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.setDetalleOrdenCompras(novedadproducto.getDetalleOrdenCompras());
					this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNovedadProducto(ArrayList<Classe> classes,NovedadProductoReturnGeneral novedadproductoReturnGeneral,NovedadProductoBean novedadproductoBean,Boolean conDefault) throws Exception {
		
			this.novedadproductoBean.setDetalleFacturaProveedors(novedadproductoReturnGeneral.getNovedadProducto().getDetalleFacturaProveedors());
			this.novedadproductoBean.setNovedadSeguimientos(novedadproductoReturnGeneral.getNovedadProducto().getNovedadSeguimientos());
			this.novedadproductoBean.setDetalleTransferencias(novedadproductoReturnGeneral.getNovedadProducto().getDetalleTransferencias());
			this.novedadproductoBean.setDetalleMovimientoInventarios(novedadproductoReturnGeneral.getNovedadProducto().getDetalleMovimientoInventarios());
			this.novedadproductoBean.setDetalleOrdenCompras(novedadproductoReturnGeneral.getNovedadProducto().getDetalleOrdenCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNovedadProducto(NovedadProducto novedadproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFacturaProveedor.class)) {
					novedadproducto.setDetalleFacturaProveedors(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorLogic.getDetalleFacturaProveedors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadSeguimiento.class)) {
					novedadproducto.setNovedadSeguimientos(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoLogic.getNovedadSeguimientos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTransferencia.class)) {
					novedadproducto.setDetalleTransferencias(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaLogic.getDetalleTransferencias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMovimientoInventario.class)) {
					novedadproducto.setDetalleMovimientoInventarios(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioLogic.getDetalleMovimientoInventarios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleOrdenCompra.class)) {
					novedadproducto.setDetalleOrdenCompras(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraBeanSwingJInternalFrame.detalleordencompraLogic.getDetalleOrdenCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.novedadproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNovedadProducto = new NovedadProductoDetalleFormJInternalFrame(jDesktopPane,this.novedadproductoSessionBean.getConGuardarRelaciones(),this.novedadproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.setVisible(false);
		this.jInternalFrameDetalleFormNovedadProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormNovedadProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNovedadProducto.novedadproductoLogic=this.novedadproductoLogic;
		
		this.cargarCombosFrameForeignKeyNovedadProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNovedadProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNovedadProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNovedadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadProducto"));
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarNovedadProducto.addActionListener(new ButtonActionListener(this,"ModificarNovedadProducto"));

		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadProducto"));
					
		this.jInternalFrameDetalleFormNovedadProducto.jMenuItemModificarNovedadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.addActionListener (new ButtonActionListener(this,"ActualizarNovedadProducto"));
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadProducto"));
						
		this.jInternalFrameDetalleFormNovedadProducto.jMenuItemActualizarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.addActionListener (new ButtonActionListener(this,"EliminarNovedadProducto"));
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadProducto"));
								
		this.jInternalFrameDetalleFormNovedadProducto.jMenuItemEliminarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.addActionListener (new ButtonActionListener(this,"CancelarNovedadProducto"));
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadProducto"));
					
		this.jInternalFrameDetalleFormNovedadProducto.jMenuItemCancelarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jMenuItemDetalleCerrarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadProducto"));
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadProducto"));
		
		
		
		this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonidNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtoncodigoNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonnombreNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreNovedadProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNovedadProducto"));
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadProducto"));
		}
		
		this.jTableDatosNovedadProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNovedadProducto"));
		
		this.jTableDatosNovedadProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNovedadProducto"));
		
		this.jButtonNuevoNovedadProducto.addActionListener(new ButtonActionListener(this,"NuevoNovedadProducto"));
		
		this.jButtonDuplicarNovedadProducto.addActionListener(new ButtonActionListener(this,"DuplicarNovedadProducto"));
		
		this.jButtonCopiarNovedadProducto.addActionListener(new ButtonActionListener(this,"CopiarNovedadProducto"));
		
		this.jButtonVerFormNovedadProducto.addActionListener(new ButtonActionListener(this,"VerFormNovedadProducto"));
		
		
		this.jButtonNuevoToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarNovedadProducto"));
			
		this.jButtonDuplicarToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNovedadProducto"));
			
		this.jMenuItemNuevoNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNovedadProducto"));
			
		this.jMenuItemDuplicarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNovedadProducto"));		
		
		
		this.jButtonNuevoRelacionesNovedadProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNovedadProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNovedadProducto"));
			
		this.jMenuItemNuevoRelacionesNovedadProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNovedadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarNovedadProducto.addActionListener(new ButtonActionListener(this,"ModificarNovedadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonModificarToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadProducto"));
			
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemModificarNovedadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarNovedadProducto.addActionListener (new ButtonActionListener(this,"ActualizarNovedadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonActualizarToolBarNovedadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadProducto"));
				
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemActualizarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarNovedadProducto.addActionListener (new ButtonActionListener(this,"EliminarNovedadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonEliminarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadProducto"));
						
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemEliminarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarNovedadProducto.addActionListener (new ButtonActionListener(this,"CancelarNovedadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonCancelarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadProducto"));
			
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemCancelarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNovedadProducto"));		
		
		
		this.jButtonCerrarNovedadProducto.addActionListener (new ButtonActionListener(this,"CerrarNovedadProducto"));
		
		
		this.jButtonCerrarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarNovedadProducto"));
			
		this.jMenuItemCerrarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNovedadProducto"));
			
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jMenuItemDetalleCerrarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosNovedadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadProducto"));
		}
		
		this.jButtonCopiarToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarNovedadProducto"));
			
		this.jButtonVerFormToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarNovedadProducto"));
		
		this.jMenuItemGuardarCambiosNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNovedadProducto"));
			
		this.jMenuItemCopiarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNovedadProducto"));		
		
		this.jMenuItemVerFormNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNovedadProducto"));		
		
		
		this.jButtonGuardarCambiosTablaNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNovedadProducto"));
			
		this.jMenuItemGuardarCambiosTablaNovedadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadProducto"));		
		
		
		
		this.jButtonRecargarInformacionNovedadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionNovedadProducto"));
					
		this.jButtonRecargarInformacionToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNovedadProducto"));
		
		this.jMenuItemRecargarInformacionNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNovedadProducto"));		
		
		
		
		this.jButtonAnterioresNovedadProducto.addActionListener (new ButtonActionListener(this,"AnterioresNovedadProducto"));
		
		
		this.jButtonAnterioresToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNovedadProducto"));
		
		this.jMenuItemAnterioresNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNovedadProducto"));		
		
		
		this.jButtonSiguientesNovedadProducto.addActionListener (new ButtonActionListener(this,"SiguientesNovedadProducto"));
		
		
		this.jButtonSiguientesToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNovedadProducto"));
			
		this.jMenuItemSiguientesNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNovedadProducto"));
			
		this.jMenuItemAbrirOrderByNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNovedadProducto"));
			
		this.jMenuItemMostrarOcultarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNovedadProducto"));
			
		this.jMenuItemDetalleAbrirOrderByNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNovedadProducto"));
			
		this.jMenuItemDetalleMostarOcultarNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNovedadProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosNovedadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNovedadProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNovedadProducto"));
			
		this.jMenuItemNuevoGuardarCambiosNovedadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNovedadProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNovedadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNovedadProducto"));

		this.jCheckBoxSeleccionadosNovedadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNovedadProducto"));
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesNovedadProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesNovedadProducto"));
			
		this.jComboBoxTiposAccionesNovedadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesNovedadProducto"));
					
		this.jComboBoxTiposSeleccionarNovedadProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNovedadProducto"));
			
		this.jTextFieldValorCampoGeneralNovedadProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNovedadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonidNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtoncodigoNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonnombreNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreNovedadProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoNovedadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoNovedadProducto"));

			this.jButtonBusquedaPorNombreNovedadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreNovedadProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNovedadProducto!=null) {
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadProducto"));
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadProducto"));
				this.jInternalFrameReporteDinamicoNovedadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoNovedadProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadProducto"));				
			//this.jButtonGenerarReporteDinamicoNovedadProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadProducto"));
			//this.jButtonGenerarExcelReporteDinamicoNovedadProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNovedadProducto!=null) {
				this.jInternalFrameImportacionNovedadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadProducto"));
				this.jInternalFrameImportacionNovedadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadProducto"));
				this.jInternalFrameImportacionNovedadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNovedadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByNovedadProducto"));
			
			this.jButtonAbrirOrderByToolBarNovedadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNovedadProducto"));			
			
			if(this.jInternalFrameOrderByNovedadProducto!=null) {
				this.jInternalFrameOrderByNovedadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadProducto.jTabbedPaneRelacionesNovedadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadProducto"));
		
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
            		closingInternalFrameNovedadProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNovedadProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNovedadProducto = (JInternalFrameBase)event.getSource();
	            	
	            NovedadProductoBeanSwingJInternalFrame jInternalFrameParent=(NovedadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNovedadProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNovedadProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNovedadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNovedadProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNovedadProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNovedadProducto";
		inputMap = this.jButtonNuevoNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNovedadProducto";
		inputMap = this.jButtonNuevoRelacionesNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNovedadProducto";
		inputMap = this.jButtonModificarNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNovedadProducto";
		inputMap = this.jButtonActualizarNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNovedadProducto";
		inputMap = this.jButtonEliminarNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNovedadProducto";
		inputMap = this.jButtonCancelarNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNovedadProducto";
		inputMap = this.jButtonCerrarNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNovedadProducto";
		inputMap = this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNovedadProducto.jButtonGuardarCambiosNovedadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNovedadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNovedadProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNovedadProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNovedadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNovedadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNovedadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNovedadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNovedadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNovedadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonidNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonid_empresaNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtoncodigoNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoNovedadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadProducto.jButtonnombreNovedadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreNovedadProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoNovedadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoNovedadProducto"));

		this.jButtonBusquedaPorNombreNovedadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreNovedadProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNovedadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNovedadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNovedadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNovedadProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNovedadProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
					novedadproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadProducto novedadproductoAux:novedadproductos) {
					novedadproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNovedadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
						novedadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadProducto novedadproductoAux:novedadproductos) {
						novedadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadProducto novedadproductoAux:novedadproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNovedadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNovedadProducto.getSelectedRows();
			
			NovedadProducto novedadproductoLocal=new NovedadProducto();
			
			//this.seleccionarTodosNovedadProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadproductoLocal =(NovedadProducto) this.novedadproductoLogic.getNovedadProductos().toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					novedadproductoLocal =(NovedadProducto) this.novedadproductos.toArray()[this.jTableDatosNovedadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				novedadproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
						novedadproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadProducto novedadproductoAux:novedadproductos) {
						novedadproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNovedadProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNovedadProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNovedadProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNovedadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNovedadProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadProducto novedadproductoAux:this.novedadproductoLogic.getNovedadProductos()) {
				
						if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							novedadproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							novedadproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadProducto novedadproductoAux:novedadproductos) {
					
						if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							novedadproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							novedadproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNovedadProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNovedadProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNovedadProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNovedadProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessNovedadProducto(conSplash);
				
					this.generarReporteNovedadProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNovedadProductosSeleccionados();
				//this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadProducto();
				
				this.exportarNovedadProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNovedadProductos();
				//this.importarNovedadProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNovedadProductosSeleccionados();
				//this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Novedad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNovedadProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNovedadProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNovedadProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(NovedadProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNovedadProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNovedadProducto(conSplash);
					
						//this.actualizarParametrosGeneralNovedadProducto();
						
						this.generarReporteProcesoAccionNovedadProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NovedadProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Novedad ProductoES SELECCIONADOS?", "MANTENIMIENTO DE Novedad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNovedadProducto();
				
						this.actualizarParametrosGeneralNovedadProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.novedadproductoReturnGeneral=novedadproductoLogic.procesarAccionNovedadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.novedadproductoLogic.getNovedadProductos(),this.novedadproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNovedadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNovedadProducto();
					
					NovedadProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNovedadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadProducto.jComboBoxTiposAccionesFormularioNovedadProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNovedadProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNovedadProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNovedadProducto();
			
			if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
			NovedadProducto novedadproducto=new NovedadProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNovedadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNovedadProducto.getSelectedItem();
			
			
			
			
			novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(novedadproductosSeleccionados.size()==1) {
				for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
					novedadproducto=novedadproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Factura Proveedor")) {
					jButtonDetalleFacturaProveedorActionPerformed(null,rowIndex,true,false,novedadproducto);
				}
				else if(this.sTipoRelacion.equals("Novedad Seguimiento")) {
					jButtonNovedadSeguimientoActionPerformed(null,rowIndex,true,false,novedadproducto);
				}
				else if(this.sTipoRelacion.equals("Detalle Transferencia")) {
					jButtonDetalleTransferenciaActionPerformed(null,rowIndex,true,false,novedadproducto);
				}
				else if(this.sTipoRelacion.equals("Detalle Movimiento Inventario")) {
					jButtonDetalleMovimientoInventarioActionPerformed(null,rowIndex,true,false,novedadproducto);
				}
				else if(this.sTipoRelacion.equals("Detalle Orden Compra")) {
					jButtonDetalleOrdenCompraActionPerformed(null,rowIndex,true,false,novedadproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNovedadProducto();
			
      		//this.finishProcessNovedadProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNovedadProductoReturnGeneral() throws Exception {
		if(this.novedadproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.novedadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.novedadproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.novedadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.novedadproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.novedadproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNovedadProducto(false);
		}
		
		if(this.novedadproductoReturnGeneral.getConRetornoLista() || this.novedadproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.novedadproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadproductoLogic.setNovedadProductos(this.novedadproductoReturnGeneral.getNovedadProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.novedadproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadproductoLogic.setNovedadProducto(this.novedadproductoReturnGeneral.getNovedadProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNovedadProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralNovedadProducto() throws Exception {
		
		
	}
	
	public ArrayList<NovedadProducto> getNovedadProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNovedadProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NovedadProducto novedadproductoAux:novedadproductoLogic.getNovedadProductos()) {
					if(novedadproductoAux.getIsSelected()) {
						novedadproductosSeleccionados.add(novedadproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadProducto novedadproductoAux:this.novedadproductos) {
					if(novedadproductoAux.getIsSelected()) {
						novedadproductosSeleccionados.add(novedadproductoAux);				
					}
				}
			}
			
			if(novedadproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						novedadproductosSeleccionados.addAll(this.novedadproductoLogic.getNovedadProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						novedadproductosSeleccionados.addAll(this.novedadproductos);				
					}
				}
			}
		} else {
			novedadproductosSeleccionados.add(this.novedadproducto);
		}
		
		return novedadproductosSeleccionados;
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
	
	public void generarReporteNovedadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNovedadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNovedadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesNovedadProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Novedad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNovedadProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNovedadProducto();
		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNovedadProducto();
		
		
		//this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados ,novedadproductoImplementable,novedadproductoImplementableHome);
	}
	
	public void mostrarImportacionNovedadProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNovedadProducto();
		
		this.abrirFrameImportacionNovedadProducto();		
		
			
		//this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados ,novedadproductoImplementable,novedadproductoImplementableHome);
	}
	
	public void importarNovedadProductos() throws Exception {		
	
	}
	
	public void exportarNovedadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNovedadProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNovedadProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNovedadProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Novedad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNovedadProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNovedadProducto(novedadproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//novedadproductoAux.setsDetalleGeneralEntityReporte(novedadproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNovedadProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NovedadProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNovedadProducto(NovedadProducto novedadproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=novedadproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NovedadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNovedadProducto(row);				
				iRow++;
			}				
			
			for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNovedadProducto(novedadproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNovedadProductosSeleccionados() throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();		
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("novedadproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("novedadproducto");
			//elementRoot.appendChild(element);
		
			for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
				element = document.createElement("novedadproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNovedadProducto(novedadproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNovedadProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNovedadProducto(NovedadProducto novedadproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(novedadproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlNovedadProducto(NovedadProducto novedadproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NovedadProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(novedadproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NovedadProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(novedadproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NovedadProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(novedadproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(NovedadProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(novedadproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(NovedadProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(novedadproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoNovedadProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NovedadProducto> novedadproductosSeleccionados=new ArrayList<NovedadProducto>();
		
		novedadproductosSeleccionados=this.getNovedadProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNovedadProducto(novedadproductosSeleccionados);
		
		this.generarReporteNovedadProductos("Todos",novedadproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNovedadProducto(ArrayList<NovedadProducto> novedadproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NovedadProducto novedadproductoAux:novedadproductosSeleccionados) {
				novedadproductoAux.setsDetalleGeneralEntityReporte(novedadproductoAux.toString());
			
				if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					novedadproductoAux.setsDescripcionGeneralEntityReporte1(novedadproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					novedadproductoAux.setsDescripcionGeneralEntityReporte1(novedadproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(NovedadProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					novedadproductoAux.setsDescripcionGeneralEntityReporte1(novedadproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNovedadProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNovedadProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=true;
				this.isVisibilidadCeldaGuardarCambiosNovedadProducto=true;
			}
			
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=true;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=true;
			this.isVisibilidadCeldaEliminarNovedadProducto=true;
			this.isVisibilidadCeldaCancelarNovedadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=true;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNovedadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=true;
			this.isVisibilidadCeldaModificarNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
			this.isVisibilidadCeldaModificarNovedadProducto=true;
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
			this.isVisibilidadCeldaCancelarNovedadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NovedadProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNovedadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=true;
		} else {
			this.actualizarEstadoPanelsNovedadProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNovedadProducto=false;
			//this.isVisibilidadCeldaVerFormNovedadProducto=false;
			this.isVisibilidadCeldaDuplicarNovedadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!novedadproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoNovedadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(novedadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!novedadproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;												
			}
			
			this.jButtonCerrarNovedadProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.novedadproducto)) {
			this.isVisibilidadCeldaActualizarNovedadProducto=false;
			this.isVisibilidadCeldaEliminarNovedadProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadProducto() {
		this.isVisibilidadCeldaNuevoNovedadProducto=false;
		this.isVisibilidadCeldaGuardarCambiosNovedadProducto=false;
	}
	
	public void actualizarEstadoPanelsNovedadProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNovedadProducto!=null) {
				this.jScrollPanelDatosEdicionNovedadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadProducto!=null) {
				this.jScrollPanelDatosNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadProducto!=null) {
				this.jPanelPaginacionNovedadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
					this.jTabbedPaneBusquedasNovedadProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadProducto!=null) {
				this.jTabbedPaneBusquedasNovedadProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNovedadProducto!=null) {
				this.jPanelParametrosReportesNovedadProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasNovedadProducto.remove(jPanelBusquedaPorCodigoNovedadProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasNovedadProducto.remove(jPanelBusquedaPorNombreNovedadProducto);}
		}
		
	}
	
	

	public String registrarSesionNovedadProductoParaDetalleFacturaProveedores() throws Exception {
		Boolean isPaginaPopupDetalleFacturaProveedor=false;

		try {

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean==null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
			}

			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setsPathNavegacionActual(novedadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleFacturaProveedor=this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleFacturaProveedor(true);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFacturaProveedor(NovedadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
			this.jInternalFrameDetalleFormNovedadProducto.detallefacturaproveedorSessionBean.setlidNovedadProductoActual(this.idNovedadProductoActual);

			novedadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedadProducto(true);
			novedadproductoSessionBean.setlIdNovedadProductoActualForeignKey(this.idNovedadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNovedadProductoParaNovedadSeguimientoes() throws Exception {
		Boolean isPaginaPopupNovedadSeguimiento=false;

		try {

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean==null) {
				this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
			}

			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setsPathNavegacionActual(novedadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNovedadSeguimiento=this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNovedadSeguimiento(true);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadSeguimiento(NovedadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
			this.jInternalFrameDetalleFormNovedadProducto.novedadseguimientoSessionBean.setlidNovedadProductoActual(this.idNovedadProductoActual);

			novedadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedadProducto(true);
			novedadproductoSessionBean.setlIdNovedadProductoActualForeignKey(this.idNovedadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNovedadProductoParaDetalleTransferencias() throws Exception {
		Boolean isPaginaPopupDetalleTransferencia=false;

		try {

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean==null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setsPathNavegacionActual(novedadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleTransferencia=this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleTransferencia(true);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTransferencia(NovedadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
			this.jInternalFrameDetalleFormNovedadProducto.detalletransferenciaSessionBean.setlidNovedadProductoActual(this.idNovedadProductoActual);

			novedadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedadProducto(true);
			novedadproductoSessionBean.setlIdNovedadProductoActualForeignKey(this.idNovedadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNovedadProductoParaDetalleMovimientoInventarios() throws Exception {
		Boolean isPaginaPopupDetalleMovimientoInventario=false;

		try {

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean==null) {
				this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
			}

			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setsPathNavegacionActual(novedadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleMovimientoInventario=this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(true);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMovimientoInventario(NovedadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
			this.jInternalFrameDetalleFormNovedadProducto.detallemovimientoinventarioSessionBean.setlidNovedadProductoActual(this.idNovedadProductoActual);

			novedadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedadProducto(true);
			novedadproductoSessionBean.setlIdNovedadProductoActualForeignKey(this.idNovedadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNovedadProductoParaDetalleOrdenCompras() throws Exception {
		Boolean isPaginaPopupDetalleOrdenCompra=false;

		try {

			if(this.novedadproductoSessionBean==null) {
				this.novedadproductoSessionBean=new NovedadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean==null) {
				this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
			}

			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setsPathNavegacionActual(novedadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleOrdenCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleOrdenCompra=this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleOrdenCompra(true);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleOrdenCompra(NovedadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
			this.jInternalFrameDetalleFormNovedadProducto.detalleordencompraSessionBean.setlidNovedadProductoActual(this.idNovedadProductoActual);

			novedadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedadProducto(true);
			novedadproductoSessionBean.setlIdNovedadProductoActualForeignKey(this.idNovedadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NovedadProductoSessionBean novedadproductoSessionBean=new NovedadProductoSessionBean();
		
		if(this.novedadproductoSessionBean==null) {
			this.novedadproductoSessionBean=new NovedadProductoSessionBean();
		}
		
		this.novedadproductoSessionBean.setsUltimaBusquedaNovedadProducto(this.getsAccionBusqueda());
		this.novedadproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.novedadproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			novedadproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			novedadproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			novedadproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NovedadProductoSessionBean novedadproductoSessionBean=new NovedadProductoSessionBean();
		
		if(this.novedadproductoSessionBean==null) {
			this.novedadproductoSessionBean=new NovedadProductoSessionBean();
		}
		
		if(this.novedadproductoSessionBean.getsUltimaBusquedaNovedadProducto()!=null&&!this.novedadproductoSessionBean.getsUltimaBusquedaNovedadProducto().equals("")) {
			this.setsAccionBusqueda(novedadproductoSessionBean.getsUltimaBusquedaNovedadProducto());
			this.setiNumeroPaginacion(novedadproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(novedadproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(novedadproductoSessionBean.getcodigo());
				novedadproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(novedadproductoSessionBean.getnombre());
				novedadproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(novedadproductoSessionBean.getid_empresa());
				novedadproductoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.novedadproductoSessionBean.setsUltimaBusquedaNovedadProducto("");
		this.novedadproductoSessionBean.setiNumeroPaginacion(NovedadProductoConstantesFunciones.INUMEROPAGINACION);
		this.novedadproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNovedadProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNovedadProducto() {
		this.updateBorderResaltarBusquedasFormularioNovedadProducto();
		this.updateVisibilidadBusquedasFormularioNovedadProducto();
		this.updateHabilitarBusquedasFormularioNovedadProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioNovedadProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNovedadProducto.getComponents().length>0) {
	

		if(this.novedadproductoConstantesFunciones.resaltarBusquedaPorCodigoNovedadProducto!=null) {
			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoNovedadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
				jPanel.setBorder(this.novedadproductoConstantesFunciones.resaltarBusquedaPorCodigoNovedadProducto);
			}
		}

		if(this.novedadproductoConstantesFunciones.resaltarBusquedaPorNombreNovedadProducto!=null) {
			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorNombreNovedadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
				jPanel.setBorder(this.novedadproductoConstantesFunciones.resaltarBusquedaPorNombreNovedadProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNovedadProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNovedadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoNovedadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadproductoConstantesFunciones.mostrarBusquedaPorCodigoNovedadProducto);
			if(!this.novedadproductoConstantesFunciones.mostrarBusquedaPorCodigoNovedadProducto && index>-1) {
				this.jTabbedPaneBusquedasNovedadProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorNombreNovedadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadproductoConstantesFunciones.mostrarBusquedaPorNombreNovedadProducto);
			if(!this.novedadproductoConstantesFunciones.mostrarBusquedaPorNombreNovedadProducto && index>-1) {
				this.jTabbedPaneBusquedasNovedadProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNovedadProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNovedadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoNovedadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadproductoConstantesFunciones.activarBusquedaPorCodigoNovedadProducto);
				this.jTabbedPaneBusquedasNovedadProducto.setEnabledAt(index,this.novedadproductoConstantesFunciones.activarBusquedaPorCodigoNovedadProducto);
			}

			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorNombreNovedadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadproductoConstantesFunciones.activarBusquedaPorNombreNovedadProducto);
				this.jTabbedPaneBusquedasNovedadProducto.setEnabledAt(index,this.novedadproductoConstantesFunciones.activarBusquedaPorNombreNovedadProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNovedadProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoNovedadProducto);

			this.jTabbedPaneBusquedasNovedadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);

			this.novedadproductoConstantesFunciones.setResaltarBusquedaPorCodigoNovedadProducto(resaltar);

			jPanel.setBorder(this.novedadproductoConstantesFunciones.resaltarBusquedaPorCodigoNovedadProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasNovedadProducto.indexOfComponent(this.jPanelBusquedaPorNombreNovedadProducto);

			this.jTabbedPaneBusquedasNovedadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadProducto.getComponent(index);

			this.novedadproductoConstantesFunciones.setResaltarBusquedaPorNombreNovedadProducto(resaltar);

			jPanel.setBorder(this.novedadproductoConstantesFunciones.resaltarBusquedaPorNombreNovedadProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNovedadProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNovedadProducto() throws Exception {

		if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNovedadProducto();
		this.updateVisibilidadResaltarControlesFormularioNovedadProducto();
		this.updateHabilitarResaltarControlesFormularioNovedadProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioNovedadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.novedadproductoConstantesFunciones.resaltaridNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto!=null) {this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setBorder(this.novedadproductoConstantesFunciones.resaltaridNovedadProducto);}
		if(this.novedadproductoConstantesFunciones.resaltarid_empresaNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto!=null) {this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setBorder(this.novedadproductoConstantesFunciones.resaltarid_empresaNovedadProducto);}
		if(this.novedadproductoConstantesFunciones.resaltarcodigoNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto!=null) {this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setBorder(this.novedadproductoConstantesFunciones.resaltarcodigoNovedadProducto);}
		if(this.novedadproductoConstantesFunciones.resaltarnombreNovedadProducto!=null && this.jInternalFrameDetalleFormNovedadProducto!=null) {this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setBorder(this.novedadproductoConstantesFunciones.resaltarnombreNovedadProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNovedadProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
	
		//this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostraridNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jPanelidNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostraridNovedadProducto);
		//this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarid_empresaNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jPanelid_empresaNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarid_empresaNovedadProducto);
		//this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarcodigoNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jPanelcodigoNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarcodigoNovedadProducto);
		//this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarnombreNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jPanelnombreNovedadProducto.setVisible(this.novedadproductoConstantesFunciones.mostrarnombreNovedadProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNovedadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadProducto!=null) {
	
		this.jInternalFrameDetalleFormNovedadProducto.jLabelidNovedadProducto.setEnabled(this.novedadproductoConstantesFunciones.activaridNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jComboBoxid_empresaNovedadProducto.setEnabled(this.novedadproductoConstantesFunciones.activarid_empresaNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jTextFieldcodigoNovedadProducto.setEnabled(this.novedadproductoConstantesFunciones.activarcodigoNovedadProducto);
		this.jInternalFrameDetalleFormNovedadProducto.jTextFieldnombreNovedadProducto.setEnabled(this.novedadproductoConstantesFunciones.activarnombreNovedadProducto);
		}
	}
	
		
}