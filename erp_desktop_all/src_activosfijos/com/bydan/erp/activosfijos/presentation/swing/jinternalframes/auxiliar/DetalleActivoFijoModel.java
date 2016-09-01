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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.activosfijos.util.DetalleActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.DetalleActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.DetalleActivoFijoParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.DetalleActivoFijoBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.DetalleActivoFijoJInternalFrame;

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.DetalleActivoFijoDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
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



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleActivoFijoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleActivoFijoConstantesFunciones.LABEL_ID
										,DetalleActivoFijoConstantesFunciones.LABEL_IDEMPRESA
										,DetalleActivoFijoConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO
										,DetalleActivoFijoConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO
										,DetalleActivoFijoConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO
										,DetalleActivoFijoConstantesFunciones.LABEL_IDTIPOACTIVOFIJOEMPRESA
										,DetalleActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA
										,DetalleActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO
										,DetalleActivoFijoConstantesFunciones.LABEL_IDCLIENTE
										,DetalleActivoFijoConstantesFunciones.LABEL_IDPARTIDAPRESU
										,DetalleActivoFijoConstantesFunciones.LABEL_CODIGO
										,DetalleActivoFijoConstantesFunciones.LABEL_NOMBRE
										,DetalleActivoFijoConstantesFunciones.LABEL_SERIE
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHACOMPRA
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHAMANTENIMIENTO
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHACORRECCION
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHADEPRECIACION
										,DetalleActivoFijoConstantesFunciones.LABEL_CLAVE
										,DetalleActivoFijoConstantesFunciones.LABEL_MARCA
										,DetalleActivoFijoConstantesFunciones.LABEL_MODELO
										,DetalleActivoFijoConstantesFunciones.LABEL_COLOR
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHA
										,DetalleActivoFijoConstantesFunciones.LABEL_VALORUTIL
										,DetalleActivoFijoConstantesFunciones.LABEL_COSTODECOMPRA
										,DetalleActivoFijoConstantesFunciones.LABEL_VIDAUTIL
										,DetalleActivoFijoConstantesFunciones.LABEL_VALORRESIDUAL
										,DetalleActivoFijoConstantesFunciones.LABEL_CANTIDAD
										,DetalleActivoFijoConstantesFunciones.LABEL_NOMBREPROPIETARIO
										,DetalleActivoFijoConstantesFunciones.LABEL_RESPONSABLE
										,DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO
										,DetalleActivoFijoConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,DetalleActivoFijoConstantesFunciones.LABEL_REFERENCIA
										,DetalleActivoFijoConstantesFunciones.LABEL_VALORCOTIZACION
										,DetalleActivoFijoConstantesFunciones.LABEL_CONPARTES
										,DetalleActivoFijoConstantesFunciones.LABEL_CONGARANTIA
										,DetalleActivoFijoConstantesFunciones.LABEL_CONEXISTENCIA
										,DetalleActivoFijoConstantesFunciones.LABEL_FECHABAJA
										,DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO2
										};
	   
	    public List<DetalleActivoFijo> detalleactivofijos;
	  	 
	    //NO SE UTILIZA
	    public DetalleActivoFijoModel(List<DetalleActivoFijo> detalleactivofijos,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleactivofijos=detalleactivofijos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleactivofijos=new ArrayList<DetalleActivoFijo>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleactivofijos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleactivofijos.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleactivofijos.get(rowIndex).getId();
				case 2: return this.detalleactivofijos.get(rowIndex).getid_empresa();
				case 3: return this.detalleactivofijos.get(rowIndex).getid_sucursal();
				case 4: return this.detalleactivofijos.get(rowIndex).getid_detalle_grupo_activo_fijo();
				case 5: return this.detalleactivofijos.get(rowIndex).getid_sub_grupo_activo_fijo();
				case 6: return this.detalleactivofijos.get(rowIndex).getid_tipo_ramo_activo_fijo();
				case 7: return this.detalleactivofijos.get(rowIndex).getid_tipo_activo_fijo_empresa();
				case 8: return this.detalleactivofijos.get(rowIndex).getid_tipo_depreciacion_empresa();
				case 9: return this.detalleactivofijos.get(rowIndex).getid_estado_activo_fijo();
				case 10: return this.detalleactivofijos.get(rowIndex).getid_cliente();
				case 11: return this.detalleactivofijos.get(rowIndex).getid_partida_presu();
				case 12: return this.detalleactivofijos.get(rowIndex).getcodigo();
				case 13: return this.detalleactivofijos.get(rowIndex).getnombre();
				case 14: return this.detalleactivofijos.get(rowIndex).getserie();
				case 15: return this.detalleactivofijos.get(rowIndex).getfecha_compra();
				case 16: return this.detalleactivofijos.get(rowIndex).getfecha_mantenimiento();
				case 17: return this.detalleactivofijos.get(rowIndex).getfecha_correccion();
				case 18: return this.detalleactivofijos.get(rowIndex).getfecha_depreciacion();
				case 19: return this.detalleactivofijos.get(rowIndex).getclave();
				case 20: return this.detalleactivofijos.get(rowIndex).getmarca();
				case 21: return this.detalleactivofijos.get(rowIndex).getmodelo();
				case 22: return this.detalleactivofijos.get(rowIndex).getcolor();
				case 23: return this.detalleactivofijos.get(rowIndex).getfecha();
				case 24: return this.detalleactivofijos.get(rowIndex).getvalor_util();
				case 25: return this.detalleactivofijos.get(rowIndex).getcosto_de_compra();
				case 26: return this.detalleactivofijos.get(rowIndex).getvida_util();
				case 27: return this.detalleactivofijos.get(rowIndex).getvalor_residual();
				case 28: return this.detalleactivofijos.get(rowIndex).getcantidad();
				case 29: return this.detalleactivofijos.get(rowIndex).getnombre_propietario();
				case 30: return this.detalleactivofijos.get(rowIndex).getresponsable();
				case 31: return this.detalleactivofijos.get(rowIndex).getpath_foto();
				case 32: return this.detalleactivofijos.get(rowIndex).getnumero_comprobante();
				case 33: return this.detalleactivofijos.get(rowIndex).getreferencia();
				case 34: return this.detalleactivofijos.get(rowIndex).getvalor_cotizacion();
				case 35: return this.detalleactivofijos.get(rowIndex).getcon_partes();
				case 36: return this.detalleactivofijos.get(rowIndex).getcon_garantia();
				case 37: return this.detalleactivofijos.get(rowIndex).getcon_existencia();
				case 38: return this.detalleactivofijos.get(rowIndex).getfecha_baja();
				case 39: return this.detalleactivofijos.get(rowIndex).getpath_foto2();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Date.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return Date.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Integer.class;
				case 29: return String.class;
				case 30: return String.class;
				case 31: return String.class;
				case 32: return String.class;
				case 33: return String.class;
				case 34: return Double.class;
				case 35: return Boolean.class;
				case 36: return Boolean.class;
				case 37: return Boolean.class;
				case 38: return Date.class;
				case 39: return String.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleActivoFijo detalleactivofijo = this.detalleactivofijos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=(DetalleActivoFijoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleactivofijo.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleactivofijo.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleactivofijo.setid_empresa((Long) value);detalleactivofijo.setempresa_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleactivofijo.setid_sucursal((Long) value);detalleactivofijo.setsucursal_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleactivofijo.setid_detalle_grupo_activo_fijo((Long) value);detalleactivofijo.setdetallegrupoactivofijo_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleactivofijo.setid_sub_grupo_activo_fijo((Long) value);detalleactivofijo.setsubgrupoactivofijo_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualSubGrupoActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleactivofijo.setid_tipo_ramo_activo_fijo((Long) value);detalleactivofijo.settiporamoactivofijo_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualTipoRamoActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleactivofijo.setid_tipo_activo_fijo_empresa((Long) value);detalleactivofijo.settipoactivofijoempresa_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualTipoActivoFijoEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleactivofijo.setid_tipo_depreciacion_empresa((Long) value);detalleactivofijo.settipodepreciacionempresa_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualTipoDepreciacionEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleactivofijo.setid_estado_activo_fijo((Long) value);detalleactivofijo.setestadoactivofijo_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualEstadoActivoFijoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleactivofijo.setid_cliente((Long) value);detalleactivofijo.setcliente_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleactivofijo.setid_partida_presu((Long) value);detalleactivofijo.setpartidapresu_descripcion(detalleactivofijoBeanSwingJInternalFrame.getActualPartidaPresuForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleactivofijo.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleactivofijo.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleactivofijo.setserie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleactivofijo.setfecha_compra((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleactivofijo.setfecha_mantenimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleactivofijo.setfecha_correccion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleactivofijo.setfecha_depreciacion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleactivofijo.setclave((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleactivofijo.setmarca((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleactivofijo.setmodelo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleactivofijo.setcolor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleactivofijo.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detalleactivofijo.setvalor_util((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detalleactivofijo.setcosto_de_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detalleactivofijo.setvida_util((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detalleactivofijo.setvalor_residual((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detalleactivofijo.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detalleactivofijo.setnombre_propietario((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {detalleactivofijo.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {detalleactivofijo.setpath_foto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {detalleactivofijo.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {detalleactivofijo.setreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {detalleactivofijo.setvalor_cotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {detalleactivofijo.setcon_partes((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {detalleactivofijo.setcon_garantia((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {detalleactivofijo.setcon_existencia((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {detalleactivofijo.setfecha_baja((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {detalleactivofijo.setpath_foto2((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleActivoFijoModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private DetalleActivoFijoDetalleFormJInternalFrame detalleactivofijoJInternalFrame=null;
		
		public DetalleActivoFijoModel(DetalleActivoFijoDetalleFormJInternalFrame detalleactivofijoJInternalFrame) {
			this.detalleactivofijoJInternalFrame=detalleactivofijoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo();
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo())) {
				componentTab=this.detalleactivofijoJInternalFrame.getjButtonEliminarToolBarDetalleActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.getjButtonEliminarToolBarDetalleActivoFijo())) {
				componentTab=this.detalleactivofijoJInternalFrame.getjButtonCancelarToolBarDetalleActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.getjButtonCancelarToolBarDetalleActivoFijo())) {
				componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_empresaDetalleActivoFijo;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreapath_foto2DetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioDetalleActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jButtonEliminarDetalleActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jButtonEliminarDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jButtonActualizarDetalleActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jButtonActualizarDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jButtonCancelarDetalleActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_empresaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_sucursalDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_sucursalDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_estado_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_estado_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_clienteDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_clienteDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_partida_presuDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_partida_presuDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcodigoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcodigoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreanombreDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreanombreDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldserieDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldserieDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_compraDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_compraDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_mantenimientoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_mantenimientoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_correccionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_correccionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_depreciacionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_depreciacionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldclaveDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldclaveDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreamarcaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreamarcaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreamodeloDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreamodeloDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcolorDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcolorDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfechaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfechaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_utilDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_utilDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcosto_de_compraDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcosto_de_compraDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvida_utilDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvida_utilDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_residualDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_residualDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcantidadDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcantidadDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreanombre_propietarioDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreanombre_propietarioDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextArearesponsableDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextArearesponsableDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreapath_fotoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreapath_fotoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldnumero_comprobanteDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldnumero_comprobanteDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreareferenciaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreareferenciaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_cotizacionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_cotizacionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_partesDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_partesDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_garantiaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_garantiaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_existenciaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_existenciaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_bajaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_bajaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreapath_foto2DetalleActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo();
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.getjButtonEliminarToolBarDetalleActivoFijo())) {
				componentTab=this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.getjButtonCancelarToolBarDetalleActivoFijo())) {
				componentTab=this.detalleactivofijoJInternalFrame.getjButtonEliminarToolBarDetalleActivoFijo();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_empresaDetalleActivoFijo)) {
				
				componentTab=this.detalleactivofijoJInternalFrame.getjButtonCancelarToolBarDetalleActivoFijo();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jTextAreapath_foto2DetalleActivoFijo;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jButtonEliminarDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jComboBoxTiposAccionesFormularioDetalleActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jButtonActualizarDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jButtonEliminarDetalleActivoFijo;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jButtonCancelarDetalleActivoFijo)) {
				componentTab=this.detalleactivofijoJInternalFrame.jButtonActualizarDetalleActivoFijo;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_sucursalDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_empresaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_sucursalDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_estado_activo_fijoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_clienteDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_estado_activo_fijoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jComboBoxid_partida_presuDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_clienteDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcodigoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jComboBoxid_partida_presuDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreanombreDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcodigoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldserieDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreanombreDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_compraDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldserieDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_mantenimientoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_compraDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_correccionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_mantenimientoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_depreciacionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_correccionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldclaveDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_depreciacionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreamarcaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldclaveDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreamodeloDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreamarcaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcolorDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreamodeloDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfechaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcolorDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_utilDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfechaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcosto_de_compraDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_utilDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvida_utilDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcosto_de_compraDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_residualDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvida_utilDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldcantidadDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_residualDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreanombre_propietarioDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldcantidadDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextArearesponsableDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreanombre_propietarioDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreapath_fotoDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextArearesponsableDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldnumero_comprobanteDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreapath_fotoDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreareferenciaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldnumero_comprobanteDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextFieldvalor_cotizacionDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextAreareferenciaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_partesDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jTextFieldvalor_cotizacionDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_garantiaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_partesDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jCheckBoxcon_existenciaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_garantiaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jDateChooserfecha_bajaDetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jCheckBoxcon_existenciaDetalleActivoFijo;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleactivofijoJInternalFrame.jTextAreapath_foto2DetalleActivoFijo)) {
			componentTab=this.detalleactivofijoJInternalFrame.jDateChooserfecha_bajaDetalleActivoFijo;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleactivofijoJInternalFrame.getjButtonActualizarToolBarDetalleActivoFijo();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleactivofijoJInternalFrame.getjButtonCancelarToolBarDetalleActivoFijo();
			
			
			return componentTab;		
		}
		
		public DetalleActivoFijoDetalleFormJInternalFrame getdetalleactivofijoJInternalFrame() {
			return this.detalleactivofijoJInternalFrame;
		}
		
		public void setdetalleactivofijoJInternalFrame(DetalleActivoFijoDetalleFormJInternalFrame detalleactivofijoJInternalFrame) {
			this.detalleactivofijoJInternalFrame=detalleactivofijoJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
